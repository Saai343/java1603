package Com.Ecommerce.Main;
import Com.Ecommerce.Serivces.OrderService;
import Com.Ecommerce.Models.*;

public class Main {
    public static void main(String[] args){
        User u = new User("Test_user","dubai");
        Product p = new Product("keyboard",800);
        Order o = new Order(u,p,2);
        OrderService OS= new OrderService();
        OS.placeOrder(o);
    }
}
