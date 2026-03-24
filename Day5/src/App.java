class User{
    String name;
    String phone;
    String address;
    String role="user";
    User(){
        System.out.println("By using Super");
    }
    User(String name){
        this.name = name;
        System.out.println("User created");
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("role: "+ role);
    }
}

class Driver extends User{
    String role = "Driver";
    String vehicle;
    Driver(String name,String vehicle){
        super(name);
        this.vehicle = vehicle;
    }
    void displaydriver(){
        super.display();
        System.out.println("vehicle:" + vehicle);
        System.out.println("Driver class role: "+role);
        System.out.println("User class role: "+super.role);
    }

}

/*
class FoodUser extends User{
    String food;
    FoodUser(){
        System.out.println("Food user class");
    }
}

class TravelUser extends User{
    String loc;
    TravelUser(){
        System.out.println("Travel user");
    }
}
 */

/*
    INHERITANCE
        -> child-class / sub-class inherit properties from parent class / super class using "extends" keyword

 */

public class App {
    public static void main(String[] args){
        Driver d1 = new Driver("saai","alto");
        d1.displaydriver();
    }
}
