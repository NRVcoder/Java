import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StaxWriter {
    public static void main(String[] args) throws IOException {
        ArrayList<String> a = new ArrayList<>();
        a.add("24");
        a.add("10");
        String tegName = "EX";
        try{
            XMLOutputFactory output = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = output.
                    createXMLStreamWriter(new FileWriter("output.xml"));

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
