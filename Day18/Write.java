package Day18;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Write {
    public static void main(String[] args){
        try {
            FileWriter writer = new FileWriter("Day18/text.txt");
            writer.write("Written using FileWritter");
            writer.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
