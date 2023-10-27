import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.crypto.dsig.Transform;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLUtils {
    public static void createXML() throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

        Element rootElement = document.createElement("flies");
        document.appendChild(rootElement);

        Element flyElement = document.createElement("fly");
        rootElement.appendChild(flyElement);
        Attr attr = document.createAttribute("id");
        attr.setValue("1");
        flyElement.setAttributeNode(attr);

        Element fromElement = document.createElement("from");
        flyElement.appendChild(fromElement);
        fromElement.appendChild(document.createTextNode("Tbilisi"));
        Element toElement = document.createElement("to");
        toElement.appendChild(document.createTextNode("Stockholm"));
        flyElement.appendChild(toElement);

        Element flyElement2 = document.createElement("fly");
        rootElement.appendChild(flyElement2);
        Attr attr2 = document.createAttribute("id");
        attr2.setValue("2");
        flyElement2.setAttributeNode(attr2);

        Element fromElement2 = document.createElement("from");
        flyElement2.appendChild(fromElement2);
        fromElement2.appendChild(document.createTextNode("Lisbon"));
        Element toElement2 = document.createElement("to");
        toElement2.appendChild(document.createTextNode("Budapest"));
        flyElement2.appendChild(toElement2);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File("C:/Users/user/IdeaProjects/exam/src/a.xml"));

        transformer.transform(domSource, streamResult);
    }
}
