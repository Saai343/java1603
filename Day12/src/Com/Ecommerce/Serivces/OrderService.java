package Com.Ecommerce.Serivces;
import Com.Ecommerce.Models.Order;

public class OrderService {
    public void placeOrder(Order order){
        System.out.println("User Name:"+order.user.name);
        System.out.println("Product Name:"+order.product.name);
        System.out.println("Quantity:"+order.quantity);
        double total=order.product.price*order.quantity;
        System.out.println("Total Price:"+total);
    }
}