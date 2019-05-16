package nl.capgemini.diving.io;

import java.io.*;

public class Application {

    private static int i;

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(new File("t.txt"));
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeDouble(25.2343432);
        dataOutputStream.writeInt(45);
        dataOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream(new File("t.txt"));
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        try {
            double d = dataInputStream.readDouble();
            i = dataInputStream.readInt();

            System.out.println(d);
            System.out.println(i);
        } catch (EOFException e) {
        }
        dataInputStream.close();

        /* // to test if a file is present
        File test = new File("test");
        if(!test.exists()) {
            test.createNewFile();
        }
         */
    }
}
