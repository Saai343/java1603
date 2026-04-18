package Day20;
class SampleThread3 extends Thread{
    String name;
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("name" + i);}
    }
    SampleThread3(String name){
        this.name = name;
    }
}
public class ConcurrencyExample{
    public static void main(String[] args) {
        SampleThread3 s1 = new SampleThread3("Task1");
        SampleThread3 s2 = new SampleThread3("Task2");
        s1.start();
        s2.start();

    }
}
