class Character{
    String name;
    Character(String name) {
        this.name = name;
    }
    void attack(){
        System.out.println(name+" Attacked");
    };
}

class Warrior extends Character{
    Warrior(String name){
        super(name);
    }

    void attack(){
        System.out.println(name+" warrior attacked with sword");
    }
}

class Archer extends Character{
    Archer(String name){
        super(name);
    }

    void attack(){
        System.out.println(name+" archer attacked with arrow");
    }
}


class Mage extends Character{
    Mage(String name){
        super(name);
    }

    void attack(){
        System.out.println(name+" mage attacked with magic");
    }
}

public class MiniGame {
    public static void main(String[] args){
        Character c1= new Warrior("Saai");
        c1.attack();
        Character c2= new Archer("Saai");
        c2.attack();
        Character c3= new Mage("Saai");
        c3.attack();
    }
}
