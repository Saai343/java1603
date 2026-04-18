package Day19;
import java.io.*;

/*
Serialization
    - Converting object into byte streams and storing it in file/database to state of object.
    - Normally,
            Product p = new Product();
            This p (object) is stored in RAM, but after the run-time this allocation in RAM is deleted.
            We serialize to store it permanently.

    - Object -> ByteStreams -> Files.
    - It is platform Independent
    - import java.io.package;

 */
class Student implements Serializable{
    String name ;
    int mark;
    Student(String name,int mark){
        this.name = name;
        this.mark = mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
    CustomObjectOutputStream(OutputStream obj) throws IOException{
        super(obj);
    }
    @Override
    protected void writeStreamHeader(){ //Creates header, no new header will be created only object will be appended.

    }
}
public class Serials {
    public static void main(String[] args) throws IOException {
        //1 Student s = new Student("Saai",100);
        //1 FileOutputStream fo = new FileOutputStream("Day19/text.txt"); //Stores in File
        //1 ObjectOutputStream obj = new ObjectOutputStream(fo);  //Converts to ByteStream
        //1 obj.writeObject(s); //writing on files

        Student s = new Student("Sanjay",10);
        File file = new File("Day19/text.txt");
        FileOutputStream fo = new FileOutputStream(file,true); //Stores in File
        ObjectOutputStream obj;
        if(file.length()==0){
            obj=new ObjectOutputStream(fo); //first time serialization
        }
        else{
            obj = new CustomObjectOutputStream(fo); //appending to the existing file
        }
        obj.writeObject(s); //writing on files
        fo.close();
        obj.close();
    }
}
