import java.util.ArrayList;

class LockerInfo{
    private int id;
    private boolean isLocked;
    private int pin;
    private String items;

    LockerInfo(int id, int pin){
        this.id = id;
        this.pin = pin;
        isLocked=true;
        System.out.println("Locker created");
    }

    public void unlock(int pin){
        if(this.pin == pin){
            isLocked=false;
            System.out.println("Locker "+ id +" unlocked");
        }
        else System.out.println("Invalid pin");
    }

    public void store_item(String item, int pin){
        if(this.pin == pin) {
            if (!isLocked) {
                items=item;
                System.out.println("Item Added");
            }
            else{
                System.out.println("It is locked");
            }
        }
        else{
            System.out.println("Invalid Pin");
        }
    }
    public void lock(int pin){
        if(this.pin == pin){
            isLocked=true;
            System.out.println("Locker "+ id +" locked");
        }
    }

    public void Retrieve_item(int pin){
        if(this.pin == pin){
            if(!isLocked && items!=null){
                System.out.println(" Items are : "+ items);
                items=null;
            }
            else if(items==null) System.out.println("No items");
            else System.out.println("Locked");
        }
        else System.out.println("Invalid Pin");
    }
}

public class Locker {
    public static void main(String[] args){
        LockerInfo a = new LockerInfo(101,3123);
        a.unlock(3122);
        a.unlock(3123);
        a.Retrieve_item(3123);
        a.store_item("gold",3123);
        a.Retrieve_item(3123);
        a.lock(3123);
    }
}
