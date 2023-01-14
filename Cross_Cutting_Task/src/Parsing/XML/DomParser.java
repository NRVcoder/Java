package Parsing.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.beans.Expression;
import java.io.File;

public class DomParser {
    public void ReadXML(String inputFileName, String tegName){
        DocumentBuilderFactory DBFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dbBuilder = DBFactory.newDocumentBuilder();
            File file = new File(inputFileName);
            Document doc = dbBuilder.parse(file);
            NodeList nodeList = doc.getElementsByTagName(tegName);

            for (int i = 0; i < nodeList.getLength(); ++i) {
                Node node = nodeList.item(i);
                System.out.println(nodeList.item(i));
                System.out.println(node.getNodeName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
