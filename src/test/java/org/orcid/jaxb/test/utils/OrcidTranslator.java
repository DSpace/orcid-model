package org.orcid.jaxb.test.utils;

import com.fasterxml.jackson.module.jakarta.xmlbind.JakartaXmlBindAnnotationModule;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Optional;

import javax.xml.XMLConstants;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.orcid.jaxb.model.v3.release.notification.permission.NotificationPermission;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;


/**
 * Utility class for serialising/deserialising ORCID records. Provides simple
 * access to parsers for Bean Creation
 * 
 * @author tom
 *
 */
public class OrcidTranslator<T> { 

    private ObjectMapper mapper;
    Unmarshaller unmarshaller;
    Marshaller marshaller;
    Class<?> modelClass;

    public enum InputFormat {
        XML, JSON
    }
    
    public enum SchemaVersion {
        V2_0("record_2.0/record-2.0.xsd", org.orcid.jaxb.model.record_v2.Record.class), 
        V2_1("record_2.1/record-2.1.xsd", org.orcid.jaxb.model.record_v2.Record.class), 
        V3_0("record_3.0/record-3.0.xsd", org.orcid.jaxb.model.v3.release.record.Record.class),
        V3_0_WORK("record_3.0/work-3.0.xsd", org.orcid.jaxb.model.v3.release.record.Work.class),
        V3_0_WORKS("record_3.0/activities-3.0.xsd", org.orcid.jaxb.model.v3.release.record.summary.Works.class),
        V3_0_PEER_REVIEW("record_3.0/peer-review-3.0.xsd", org.orcid.jaxb.model.v3.release.record.PeerReview.class),
        V3_0_FUNDING("record_3.0/funding-3.0.xsd", org.orcid.jaxb.model.v3.release.record.Funding.class),
        V3_0_FUNDINGS("record_3.0/activities-3.0.xsd", org.orcid.jaxb.model.v3.release.record.summary.Fundings.class),
        V3_0_ACTIVITIES("record_3.0/activities-3.0.xsd", org.orcid.jaxb.model.v3.release.record.summary.ActivitiesSummary.class),
        V3_0_NOTIFICATION_PERMISSION("notification_3.0/notification-permission-3.0.xsd", org.orcid.jaxb.model.v3.release.notification.permission.NotificationPermission.class);

        public final String location;
        public final Class<?> modelClass;

        SchemaVersion(String loc, Class<?> clazz) {
            this.location = loc;
            this.modelClass = clazz;
        }
    }
    
    /**
     * @return a new v2.0 OrcidTranslator
     */
    public static OrcidTranslator<org.orcid.jaxb.model.record_v2.Record> v2_0(){
        return new OrcidTranslator<org.orcid.jaxb.model.record_v2.Record>(SchemaVersion.V2_0);
    }
    
    /**
     * @return a new v2.1 OrcidTranslator
     */
    public static OrcidTranslator<org.orcid.jaxb.model.record_v2.Record> v2_1(){
        return new OrcidTranslator<org.orcid.jaxb.model.record_v2.Record>(SchemaVersion.V2_1);
    }
    
    /**
     * @return a new v3.0 OrcidTranslator
     */
    public static OrcidTranslator<org.orcid.jaxb.model.v3.release.record.Record> v3_0(){
        return new OrcidTranslator<org.orcid.jaxb.model.v3.release.record.Record>(SchemaVersion.V3_0);
    }

    public static OrcidTranslator<NotificationPermission> V3_0_NOTIFICATION_PERMISSION() {
        return new OrcidTranslator<NotificationPermission>(SchemaVersion.V3_0_NOTIFICATION_PERMISSION);
    }
    
    /**
     * @return a new v3.0 OrcidTranslator
     */
    public static <X> OrcidTranslator<X> forSchema(SchemaVersion v){
        return new OrcidTranslator<X>(v);
    }

    /**
     * Creates a translator suitable for v2.1 or v2.0 API results. Initialises
     * marshaller and unmarshaler
     * 
     */
    private OrcidTranslator(SchemaVersion location) {
        mapper = new ObjectMapper();
        JakartaXmlBindAnnotationModule module = new JakartaXmlBindAnnotationModule();
        mapper.registerModule(module);
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        modelClass = location.modelClass;
        try {
            JAXBContext context = JAXBContext.newInstance(modelClass);
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            URL url = Resources.getResource(location.location);
            Schema schema = sf.newSchema(url);

            unmarshaller = context.createUnmarshaller();
            unmarshaller.setSchema(schema);

            marshaller = context.createMarshaller();
            marshaller.setSchema(schema);

        } catch (JAXBException | SAXException e) {
            throw new RuntimeException("Unable to create jaxb marshaller/unmarshaller" + e);
        }
    }

    /**
     * Translate one version to another using files on the file system
     * 
     * @param inputFilename
     *            The input file to read.  If missing will read from System.in
     * @param outputFilename
     *            The output file to write to. If missing, will output to
     *            System.out
     * @param inputFormat
     *            The format of the input file.
     * @throws FileNotFoundException
     * @throws IOException
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws JAXBException
     * @throws JsonParseException
     */
    public void translate(Optional<String> inputFilename, Optional<String> outputFilename, InputFormat inputFormat)
            throws FileNotFoundException, IOException, JsonGenerationException, JsonMappingException, JAXBException, JsonParseException {
        
        // Read the file
        Reader r;
        if (inputFilename.isPresent() && !inputFilename.get().isEmpty()) {
            File file = new File(inputFilename.get());
            r = new FileReader(file);
        } else {
            r = new InputStreamReader(System.in);
        }

        // Work out where to write the file
        Writer w;
        if (outputFilename.isPresent() && !outputFilename.get().isEmpty()) {
            File output = new File(outputFilename.get());
            w = new FileWriter(output);
        } else {
            w = new PrintWriter(System.out);
        }

        //Do the translation
        if (inputFormat.equals(InputFormat.XML)) {
            writeJsonRecord(w, readXmlRecord(r));
        } else {
            writeXmlRecord(w, readJsonRecord(r));
        }
    }

    /**
     * Parses the provided JSON into a Record (JAXB Bean)
     * 
     * @param reader
     *            a reader pointing to a source of JSON
     * @return a V2 ORCID record bean
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    public T readJsonRecord(Reader reader) throws JsonParseException, JsonMappingException, IOException {
        return (T) mapper.readValue(reader, modelClass);
    }

    /**
     * Parses the provided XML into a Record (JAXB Bean)
     * 
     * @param reader
     *            a reader pointing to a source of XML
     * @return a V2 ORCID record bean
     * @throws JAXBException
     */
    @SuppressWarnings("unchecked")
    public T readXmlRecord(Reader reader) throws JAXBException {
        return (T) unmarshaller.unmarshal(reader);
    }

    /**
     * Writes the provided Record (JAXB Bean) as JSON using provided writer
     * 
     * @param w
     *            where to write the JSON
     * @param r
     *            the record to read
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     */
    public void writeJsonRecord(Writer w, T r) throws JsonGenerationException, JsonMappingException, IOException {
        mapper.writeValue(w, r);
    }

    /**
     * Writes the provided Record (JAXB Bean) as XML using provided writer
     * 
     * @param w
     *            where to write the XML
     * @param r
     *            the record to read
     * @throws JAXBException
     */
    public void writeXmlRecord(Writer w, T r) throws JAXBException {
        marshaller.marshal(r, w);
    }

    public Object unmarshalFromPath(String path, Class<?> type, String schemaPath) throws SAXException, URISyntaxException {
        try (Reader reader = new InputStreamReader(getClass().getResourceAsStream(path))) {
            Object obj = unmarshal(reader, type, schemaPath);
            Object result = null;
            if (NotificationPermission.class.equals(type)) {
                result = (NotificationPermission) obj;
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException("Error reading notification from classpath", e);
        }
    }

    private Object unmarshal(Reader reader, Class<?> type, String schemaPath) throws SAXException, URISyntaxException {
        try {
            JAXBContext context = JAXBContext.newInstance(type);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            if (schemaPath != null) {
                SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
                Schema schema = sf.newSchema(new File(getClass().getResource(schemaPath).toURI()));
                unmarshaller.setSchema(schema);
            }

            return unmarshaller.unmarshal(reader);
        } catch (JAXBException e) {
            throw new RuntimeException("Unable to unmarshall orcid message" + e);
        }
    }

    public void marshal(Object object, String path) throws JAXBException, SAXException, URISyntaxException {
        JAXBContext context = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = context.createMarshaller();

        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(new File(getClass().getResource(path).toURI()));

        marshaller.setSchema(schema);

        marshaller.marshal(object, new PrintStream(new OutputStream() {
            public void write(int b) {
                //DO NOTHING
            }
        }));
    }
}
