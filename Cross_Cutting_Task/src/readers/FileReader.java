package readers;

import Interfaces.FileReader_Interface;
public abstract class FileReader implements FileReader_Interface{
    protected String inputFileName;
    public FileReader(String inputFileName) {
       this.inputFileName = inputFileName;
    }
    public String getInputFilename() {
        return inputFileName;
    }

}
