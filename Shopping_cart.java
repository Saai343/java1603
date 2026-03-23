import java.util.*;
class Shop{
    int id;
    String name;
    double price;
    int quantity;

    Shop(int i, String n, double p, int q){
        this.id = i;
        this.name = n;
        this.price = p;
        this.quantity = q;
    }

    double GetTotalPrice(){
        return(price * quantity);
    }

    void Display(){
        System.out.println(id + " " + name + " " + price + " " + quantity + " " + GetTotalPrice());
    }
}


public class Shopping_cart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Shop[] arr = new Shop[n];
        for(int i = 0;i<n; i++){
            int id = sc.nextInt();
            String name = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            Shop s = new Shop(id,name,price,quantity);
            arr[i]=s;
        }

        for(int i = 0;i<n;i++){
            arr[i].Display();
        }
    }
}
