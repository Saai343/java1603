class Battery {
    public void powerSupply() {
        System.out.println("Still have 40% power");
    }
}
class Remote1 {
    // Direct
    Battery miniBattery = new Battery(); // has a relationship
    // Using Constructor(OR)  -->  Battery minBattery; minBattery = new Battery();

    public void changeChannel() {
        miniBattery.powerSupply();
        System.out.println("Channel changed");
    }
    public void change_volume(){
        System.out.println("Volume increased");
    }
}

class Tv{
    Remote1 tvRemote;
    Tv(Remote1 tvRemote){
        this.tvRemote = tvRemote;
    }
    public void increaseVolume(){
        tvRemote.change_volume();
    }
}
public class Relationship {
    public static void main(String[] args) {
        Remote1 tvRemote = new Remote1();
        tvRemote.changeChannel();
    }
}

