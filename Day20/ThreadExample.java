package Day20;

/*
Process:
    - Program currently running
    - processor does not share data easily
    - creating process is CPU heavy

Thread:
    - Smallest unit of process that performs task
    - Thread always belongs to task
    - Multiple threads can exist inside one PR.

Thread -----> (extends) ThreadClass -> run()
-------> Implements)
 */
class SampleThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread running using Thread class");
    }
}
class SampleThread2 implements Runnable{
    @Override
    public void run(){//3. running state
        try{
            System.out.println("Thhread running usable  Runnable");
            Thread.sleep(4000); //4.blocked / waiting state
            System.out.println("After 4 seconds");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Thread running using Runnable");
    }
}
public class ThreadExample {
    public static void main (String[] args){
        SampleThread t = new SampleThread();
        t.start();// we should give start() method not run() method.
        Thread th = new Thread(new SampleThread2());//1.new state
        // or SampleThread2 s2 = new SampleThread(); , thread th = new thread(s2).
        th.start();// 2.runnable state
    }

}