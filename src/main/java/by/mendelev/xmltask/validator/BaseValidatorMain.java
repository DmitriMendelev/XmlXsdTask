package by.mendelev.xmltask.validator;

import java.io.*;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import by.mendelev.xmltask.handler.GemErrorHandler;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

public class BaseValidatorMain {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String fileName = "data/gems.xml";
        String schemaName = "data/gems.xsd";
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaName);
        try {
            // schema creation
            Schema schema = factory.newSchema(schemaLocation);
            // creating a schema-based validator
            Validator validator = schema.newValidator();
            Source source = new StreamSource(fileName);
            // document check
            validator.setErrorHandler(new GemErrorHandler());
            validator.validate(source);
        } catch (SAXException | IOException e) {
            logger.log(Level.INFO, "{} is not correct, or valid", fileName, e);
        }
    }
}
