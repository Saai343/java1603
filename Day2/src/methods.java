/*
public -method can be accessed from anywhere
private -method can be accessed only within the class
protected -method can be accessed within the package and by subclasses
default -method can be accessed within the package

structure of method
access_modifier return_type method_name(parameters) {
*/

class methods {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        //int sum = add(a, b);
        //System.out.println("Sum: " + sum);
        var s=4;
        printMessage(s);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int square(int num) {
        return mul(num,num);
    }

    public static void printMessage(int n) {
        System.out.println(square(n));
    }
}

//methods call acts like stack, first in last out, when method is called it goes to stack and when method is executed it is removed from stack.
//Static is used in main since we don't need to create an object of the class to call the main method, it can be called directly by the class name.