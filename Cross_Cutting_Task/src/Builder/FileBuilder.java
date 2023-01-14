package Builder;
import Interfaces.FileBuilderInterface;
import readers.*;


public class FileBuilder implements FileBuilderInterface {
    protected String inputFileName;
    protected FileReader fileReader;

    public FileBuilder(String inputFileName, String extension) {
        if (extension == "txt") {
            fileReader = new TxtFileReaderAndWriter(inputFileName);
        }
        else if (extension == "xml") {
            fileReader = new XmlFileReaderAndWriter(inputFileName);
        }
        else if (extension == "json") {
            fileReader = new JsonFileReaderAndWriter(inputFileName);
        }
        this.inputFileName = inputFileName;
    }


    public void setEncrypted(String key) {
        fileReader = new EncriptedFileReaderAndWriter(key, fileReader);
    }

}
