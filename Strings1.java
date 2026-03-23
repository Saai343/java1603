/*
Strings:
    - is a type of object with collection of characters
    - always enclosed with double quotes
    - ALWAYS STORED IN 16 BITS

    Initialization of string (two methods):
        1. String literals
            String s= "Java"; --> 's' stored in stack and "java" is stored in heap
            string s1="Java"; --> 's1' is newly stored in stack but points the "java" already stored in the heap.
        2. new String()
            both stack & heap are newly created

    - String is IMMUTABALE, only new object must  be created in order to change.
    - Example:
        String s="Java";
        s.concat("Programming") --> THIS FAILS, but

        String s="java";
        String s1=s.concat("Programming") ---> THIS WORKS, since new object is only being created;

    - StringBuffer - mutable, thread safe, slower
    - StringBuilder - mutable, not thread safe, fast

    Methods:
        - length
        - substring
        - equals
        - split
        - replace
        - isLetter (for characters)
 */

import java.util.*;
public class Strings1 {
    public static void main(String[] Args){
        String s = "Hello World";
        System.out.println(s.length());
        System.out.println(s.substring(2,7));

        //split
        String[] arr=s.split(" ");
        for(String sh:arr) System.out.println(sh);

        //replace
        s=s.replace("Hello","HELLO");
        System.out.println(s);

        //toCharArray
        for(char ch:s.toCharArray()){
            System.out.print(ch+" ");
        }
        System.out.println(" ");

        //CHAR ARRAY TO STRING
        char[] arr1={'a','b','c'};
        String s3 = new String(arr1);
        System.out.println(s3);

        //PROGRAM: to count the number of words
        Scanner sc = new Scanner(System.in);
        String s4=sc.nextLine();
        String[] arr2= s4.split(" ");
        System.out.println(arr2.length);
    }
}
