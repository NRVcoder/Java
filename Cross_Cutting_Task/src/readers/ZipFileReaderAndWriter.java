package readers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static Archives.Archivator.ZipFileReader;

public class ZipFileReaderAndWriter extends FileReader{
    public ZipFileReaderAndWriter(String inputFilename) {
        super(inputFilename);
    }


    @Override
    public void Read(String inputFileName, String outputFileName) throws IOException {
        String s = null;
        s = ZipFileReader(inputFileName);
        File ofile = new File(outputFileName);
        File ifile = new File(s);
        PrintWriter writer = new PrintWriter(ofile);
        Scanner in = new Scanner(ifile);
        while(in.hasNext()){
            String str = in.next();
            writer.println(str);
        }
        writer.close();
        in.close();
    }
}
