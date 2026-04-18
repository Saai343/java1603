package Day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.*;

public class DeSerialization {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("Day19/text.txt");
        ObjectInputStream Objstream= new ObjectInputStream(fi);
        while (true) {
            try {
                Student s = (Student) Objstream.readObject();
                System.out.println(s.name + " " + s.mark);
            } catch(Exception e) {
                break;
            }
        }
        fi.close();
        Objstream.close();
    }
}
