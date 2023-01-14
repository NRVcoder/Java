package Parsing.XML;

import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

import Interfaces.SaxParserAndWriter_Interface;

import static Parsing.Calculation_Engine.CalculateStr;
import static Parsing.Regex_Calculation_Engine.CalculateS;


public class SaxParserAndWriter implements SaxParserAndWriter_Interface{

    public void Processing(String fileName, final String tegName, final ArrayList<String> news){
        /*ArrayList<String> news = new ArrayList<>();*/
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try{
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler(){
               boolean name = false;
               public void startElement(String uri,
                                         String localName,
                                         String qName,
                                         Attributes attributes)throws SAXParseException{
                   if(qName.equalsIgnoreCase(tegName)){
                       name = true;
                   }

               }
                public void characters(char ch[],
                                       int start,
                                       int length)throws SAXParseException {
                   if(name){
                      /* System.out.println(new String(ch, start, length));*/
                       String s = new String(ch, start, length);
                       news.add(CalculateStr(s));
                      /* System.out.println(news.get(0));*/
                       name = false;
                   }
                }
            };
            saxParser.parse(fileName, handler);

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void Reading(String fileName, final String tegName, final ArrayList<String> news){
        /*ArrayList<String> news = new ArrayList<>();*/
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try{
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler(){
                boolean name = false;
                public void startElement(String uri,
                                         String localName,
                                         String qName,
                                         Attributes attributes)throws SAXParseException{
                    if(qName.equalsIgnoreCase(tegName)){
                        name = true;
                    }

                }
                public void characters(char ch[],
                                       int start,
                                       int length)throws SAXParseException {
                    if(name){
                        /* System.out.println(new String(ch, start, length));*/
                        String s = new String(ch, start, length);
                        news.add(s);
                        /* System.out.println(news.get(0));*/
                        name = false;
                    }
                }
            };
            saxParser.parse(fileName, handler);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Writing(String outputFileName, String tegName, ArrayList<String> a) {
    try{
        XMLOutputFactory output = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = output.
                createXMLStreamWriter(new FileWriter(outputFileName));

        writer.writeStartDocument("1.0");
        writer.writeStartElement("expressions");

        for(int i = 0; i < a.size(); ++i) {
            writer.writeStartElement(tegName + i);
            writer.writeCharacters(a.get(i));
            writer.writeEndElement();
        }

        writer.writeEndDocument();
        writer.flush();
    }catch(XMLStreamException | IOException ex){
        ex.printStackTrace();
        }
    }


}
