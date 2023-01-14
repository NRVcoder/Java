package Archives;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import java.util.ArrayList;

public class Archivator {

    private static String GetNameArchiveFile(String notZipFileName, String fileExtension) {
        String lastIndex = String.valueOf(notZipFileName.lastIndexOf('.'));
        String zipFileName = notZipFileName.substring(0, Integer.parseInt(lastIndex))  + fileExtension;
        return zipFileName;
    }

    public static void ZipFileCreator(String fileName) throws IOException {
        String zipFileName = GetNameArchiveFile(fileName, ".zip");
        ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(zipFileName));
        ZipEntry entry = new ZipEntry(fileName);
        zout.putNextEntry(entry);
        FileInputStream fis = new FileInputStream(fileName);
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        zout.write(buffer);
        zout.close();
    }

    public static void ZipFileReader(String fileName, ArrayList<String> filesNames) throws IOException {
        ZipInputStream zin  = new ZipInputStream(new FileInputStream(fileName));
        ZipEntry entry;
        while((entry = zin.getNextEntry())!= null){
            filesNames.add(entry.getName());
        }
        zin.close();
    }

    public static String ZipFileReader(String fileName) throws IOException {
        ZipInputStream zin  = new ZipInputStream(new FileInputStream(fileName));
        ZipEntry entry;
        String s = null;
        while((entry = zin.getNextEntry())!= null){
            s = (entry.getName());
        }
        zin.close();
        return s;
    }

}
