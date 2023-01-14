package readers;

import Archives.Archivator;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ZipFileReaderAndWriterTest {

    @Test
    void readTest() throws IOException {
        TxtFileReaderAndWriter t = new TxtFileReaderAndWriter("Test.txt");
        String a, b, s;
        a =  t.ReadPla(t.getInputFilename());
        Archivator arc = new Archivator();
        s = arc.ZipFileReader("Test.zip");
        b =  t.ReadPla(s);
        assertEquals(a, b);
    }
}