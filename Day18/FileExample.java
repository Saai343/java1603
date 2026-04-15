package Day18;

/*
File Handling
  ->to store data permanently for later
  ->to use the data between different

  Operations
   :open
   :create
   :read
   :write
   :close

  public static void main(String[] args) throws IOException
                    OR
  Try - catch {}
  can be used to handle errors.

 */
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File newFile = new File("Day18/text.txt");
        if(newFile.createNewFile()){
            System.out.println("File Created: "+newFile.getName());
        }
        else{
            System.out.println("Not able to create file");
        }
    }
}
