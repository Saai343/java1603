/*
Wrapper Class -> object representation of primitive datatype
ArrayList<int> a = --> wrong, int's object reference i.e. Integer should be used.

Example:
- int Integer
- char Character
etc..

Current initialization:  Integer b = Integer.valueOf(0)
Right side is stored in heap

 */

public class WrapperClass {
    public static Integer test1(String s){
        return Integer.valueOf(s);
        /*
        Autoboxing -> int to Integer
        Unboxing -> Integer to int
        Compiler converts during compilation
         */
    }

    public static void main(String[] args){
        Integer b= Integer.valueOf(33);
        Integer c = Integer.valueOf("123"); //converts string to Integer, return type -> object (integer)
        Integer d = Integer.parseInt("123"); //converts string to int, return type -> int (int)
        int a=c; //Unboxing, converts integer to int
        System.out.println(b+" "+c+" "+d);
        System.out.println(a);

        Integer x1 = 100;
        Integer x2=100;
        System.out.println(x1==x2); //true

        Integer y1 = 200;
        Integer y2 = 200;
        System.out.println(y1==y2); //false
        System.out.println(y1.equals(y2)); //true

        /*
            This is because, Integer has a cache from -128 to 127, between this range the reference is taken the same.
          but for 200 it greater than range so each y1 and y2 has own different reference, since '==' compares reference, it is false.
          therefore .equals is used to comapre values
         */


    }
}
