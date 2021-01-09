package classwork.ioExample;


import java.io.File;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\lessons\\JavaOnlineOffline20" +
                "\\src\\classwork\\folder\\");
//        System.out.println(file.exists());
//        System.out.println(file.isDirectory());
//
//        boolean newFile = file.createNewFile();
//        System.out.println(file.mkdirs());
        File[] list = file.listFiles();
        for (File f : list) {
            System.out.println("Name:" + f.getName());
            System.out.println("length:" + f.length());
            System.out.println("isFile:" + f.isFile());
        }
    }

}
