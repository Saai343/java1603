package Day21;

/*
Java1 -> WORA (Write Once Read Anywhere) & Basic features
Java5 -> For each loop, generics
Java7 -> Exceptional Handling
Java8 -> lambda, Functional interface, StreamApp
 */


@FunctionalInterface //only in functional interface lambda function can be created. Functional interface has only one method.
interface math{
    int add(int a,int b);
}

@FunctionalInterface
interface Exercise{
    void SayHello();
}

public class LambdaExample {
    public static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args){
        System.out.println(add(3,4));

        math obj=new math(){
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(obj.add(11,22));

        //OR

        math obj1 = (a,b)->a+b;
        System.out.println(obj1.add(112,22));

        //Using Multiple line

        math obj2 = (a,b)->{
            System.out.println("Addition");
            return a+b;
        };
        System.out.println(obj2.add(23,45));

        //------------------------------
        Exercise ex = ()->System.out.println("Hello World");
        ex.SayHello();

    }
}


