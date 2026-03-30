/*
Abstraction
    - Hiding Internal implementation and shows only essential features

    - Abstract class (partial abstraction) ---> what child can do not how it do.
                        - here other methods other than abstract methods can be created, like below example. (referred as concrete method)

    -
 */
abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    void device_info(){
        System.out.println("it is a device"); //---> concrete method
    }
}

class Light extends SmartDevice{ //Child classes, all abstract methods should be defined here, or else error.
    @Override
    void turnOn(){
        System.out.println("Light on");
    }
    @Override
    void turnOff(){
        System.out.println("Light off");
    }
}
public class Abstract1 {
    public static void main(String[] args){
        SmartDevice device = new Light(); //object must always be created in child class, because in parent class we would not have defined the method.
        device.turnOn();
        device.device_info(); // Inheritance
    }
}
