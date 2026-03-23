class Student{
    /*
        Class name must be in pascal case (1st letter in caps)
        Class:
            - is a named group of properties & functions
            - is a blueprint to create an object
        This class blueprint is stored in Method area.
    */
    int rollno;
    String name;
    int marks;
    int age=5;

    // ----------- CONSTRUCTOR -------------
    Student(){
        System.out.println("From Contstructor ");
    }

    //parametrised
    Student(int r, String n){
        this.rollno = r;
        this.name = n;
    }

    //constructor overloading
    Student(int r, String n, int m){
        this.rollno = r;
        this.name = n;
        this.marks = m;
    }

    //this is used to indicate the object to its particular parameter, when different constructors are called there exists a confusion
}


public class Oops1 {
    public static void main(String[] args){
        Student s1 = new Student(); //--> object initialization;  Student s1; --> object declaration

        /*
            - here s1 --> reference variable, stores in stack during compile time.
            - new Student() -> create an object in the heap memory, by dynamic allocation during run time
        */

        System.out.println(s1.rollno); // 0 is the output because it's primitive
        System.out.println(s1.name); //  null is the output as it's non-primitive
        System.out.println(s1.age); //prints 5

        /*
            - Object - Instance of a class/real world object created using class, physical entity
                     - Combining Data + Behavior
         */

        // ----------- CONSTRUCTOR -------------
        Student s2 = new Student(); // prints from constructor
        Student s3 = new Student(32,"sanjay");
        System.out.println(s3.name); //prints sanjay;
        Student s4 = new Student ( 32, " vishal" , 70);
        System.out.println(s4.marks);


    }
}
