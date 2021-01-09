package classwork.ioExample.fileExample.fileExample.ioExamples;

import java.io.*;

public class DataIOStream {

    private static final String FILE_PATH = "D:\\lessons\\JavaOnlineOffline20\\src\\classwork\\ioExample\\fileExample" +
            "\\fileExample\\ioExamples\\file\\example.txt";

    public static void main(String[] args) throws IOException {
//        write();
        read();
    }


    public static void write() throws IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH))) {
            out.writeInt(33);
            out.writeInt(66);
            out.writeBoolean(false);
            out.writeUTF("Բարև");
        }
    }

    public static void read() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());
        System.out.println(inputStream.readUTF());

        inputStream.close();
    }
}
