package Day20;

// Single Threaded - runs step by step, executes one task at a time

public class SingleThread {
    public static void main(String[] args) {
        task1();
        task2();
    }
    static void task1(){
        for(int i=0;i<5;i++){
            System.out.println("From Task 1:"+i);
        }
    }
    static void task2(){
        for(int i=0;i<5;i++){
            System.out.println("From Task 2:"+i);
        }
    }
}
