import java.io.FileWriter;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import by.mendelev.xmltask.entity.Country;
import by.mendelev.xmltask.entity.GemName;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXmlDocumentMain {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
                .newInstance();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        // forming a document tree
        Document document = documentBuilder.newDocument();
        String root = "Gems";
        Element rootElement = document.createElement(root);
        document.appendChild(rootElement);

        Element elementName = document.createElement("name");
        String name = GemName.DIAMOND.toString();
        elementName.appendChild(document.createTextNode(name));
        Element elementAuthor = document.createElement("author");
        String author = Country.AUSTRALIA.toString();
        elementAuthor.appendChild(document.createTextNode(author));
        elementAuthor.setAttribute("id", "777");

        rootElement.appendChild(elementName);
        rootElement.appendChild(elementAuthor);

        // write tree to file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        try {
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new FileWriter("data/gems.xml"));
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException | IOException e) {
            e.printStackTrace();
        }

    }
}
