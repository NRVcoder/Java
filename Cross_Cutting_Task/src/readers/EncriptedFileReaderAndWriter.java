package readers;

import java.io.IOException;

import static Encription.WorkWithEncription.Decripted;
import static Parsing.Calculation_Engine.AnotherCalculate;

public class EncriptedFileReaderAndWriter extends FileReader {
    protected String key;
    public EncriptedFileReaderAndWriter(String key, FileReader fileReader) {
        super(fileReader.inputFileName);
        this.key = key;
    }

    @Override
    public void Read(String inputFileName, String outputFileName) throws IOException {
        Decripted(key, inputFileName, outputFileName);
    }
    public void CalculateCipher(String inputFileName, String outputFileName) throws IOException {
        AnotherCalculate(inputFileName, outputFileName);
    }

}
