/*
ABSTRACTION
  ->The process of hiding internal implementation and showing only essential features
  To achieve ABSTRACTION
  ->Abstract class(Partial ABSTRACTION)  What child can do but not how it do
  ->Interface(Complete ABSTRACTION)
Cannot instantiate object for parent class
Abstract method must be override
Concrete method will be inherited automatically

Interface 100% ABSTRACTION always public abstract class method
we can achieve multiple Inheritance only through Interface
  ->one child class with multiple behaviour
  ->no ambiguity(no method body or parent class) for multiple parent override method without conflict

Inheritance-> Is-a relationship
Abstraction-> Has-a relationship

Composition tightly coupled
Aggregation weakly coupled

Difference between coupling & cohesion:
    Coupling -->
        - how much one class depends on another class.
        - two types:
            i. Tight Coupling - completely dependent.
            ii. Weak Coupling - can exist independently

    Cohesion -->
        - how many responsibilities of a class belong together.
        - using various methods(behaviors) in one single class.

    loose coupling + high cohesion ---> give the best efficiency.
 */

abstract class SmartDevice1 {
    abstract void turnOn();
    abstract void turnOff();
    abstract void setLevel();
    void deviceInfo() {
        System.out.println("It is a device");
    }
}
class Light1 extends SmartDevice1 {
    @Override
    void turnOn() {
        System.out.println("Light on");
    }
    @Override
    void turnOff() {
        System.out.println("Light off");
    }
    @Override
    void setLevel() {
        System.out.println("Light is set to warm");
    }
}
interface Remote {
    void change();
}
interface WifiControl {
    void connect();
    void change();
}
class TV implements Remote, WifiControl {
    @Override
    public void change() {
        System.out.println("Change channel");
    }
    @Override
    public void connect() {
        System.out.println("Wifi connected");
    }
}
class Fan extends SmartDevice1 {
    @Override
    void turnOn() {
        System.out.println("Fan on");
    }
    @Override
    void turnOff() {
        System.out.println("Fan off");
    }
    @Override
    void setLevel() {
        System.out.println("Fan speed is set to 3");
    }
}
public class abstract2 {
    public static void main(String[] args) {
        SmartDevice1 d = new Light1(); //Object mut be created only for child class
        Remote r = new TV();
        WifiControl w = new TV();
        d.turnOn();
        d.deviceInfo(); //Methods in parent class can be accessed by the child class
        d.setLevel();
        d = new Fan();
        d.turnOn();
        d.deviceInfo();
        d.setLevel();
        r.change();
        w.connect();
        w.change();
    }
}