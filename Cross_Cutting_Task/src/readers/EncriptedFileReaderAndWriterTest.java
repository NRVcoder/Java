package readers;

import Encription.WorkWithEncription;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EncriptedFileReaderAndWriterTest {
    String key1 = "parapaparam";
    String key2 = "LabuLabuDabDab!";

    @Test
    void EncriptedFileTest() throws IOException {
        WorkWithEncription w = new WorkWithEncription();
        TxtFileReaderAndWriter t = new TxtFileReaderAndWriter("DecriptedTest.txt");
        String a;
        a =  t.ReadPla(t.getInputFilename());
        w.Encripted(key1, "DecriptedTest.txt","EncriptedTest.txt");



        w.Decripted(key1, "EncriptedTest.txt", "DecriptedTest.txt");
        String b;
        b =  t.ReadPla(t.getInputFilename());


        assertEquals(a, b);
    }

    @Test
    void DoubleEncryptedFileTest() throws IOException {
        WorkWithEncription w = new WorkWithEncription();
        TxtFileReaderAndWriter t = new TxtFileReaderAndWriter("DecriptedTest.txt");
        String a;
        a =  t.ReadPla(t.getInputFilename());
        w.Encripted(key1, "DecriptedTest.txt","EncriptedTest.txt");
        w.Encripted(key2, "EncriptedTest.txt","DecriptedTest.txt");



        w.Decripted(key2, "DecriptedTest.txt", "EncriptedTest.txt");
        w.Decripted(key1, "EncriptedTest.txt","DecriptedTest.txt");
        String b;
        b =  t.ReadPla(t.getInputFilename());


        assertEquals(a, b);
    }


}