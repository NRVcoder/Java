package FileProgramms;

import java.io.*;
import java.util.Scanner;

public class ReadWriteStream {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {


        File file = new File("out.txt");


        /*FileReader in = new FileReader(file);
        int temp;
        while((temp = in.read()) != -1) {
        System.out.print((char)temp);
        }*/


       /* DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
        DataInputStream in = new DataInputStream(new FileInputStream(file));
        out.writeUTF("Hello123");
        out.writeInt(12353);
        out.close();

        System.out.println(in.readUTF());
        System.out.println(in.readInt());
        in.close();
*/
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        String s = "ABC";
        int[] a = {1, 2, 3};

        out.writeObject(s);
        out.writeObject(a);
        out.close();

        String ss = (String)in.readObject();
        int[] aa = (int[])in.readObject();
        in.close();

        System.out.println(ss);
        for(int i = 0; i < aa.length; ++i){
            System.out.print(aa[i] + " ");
        }



    }
}
