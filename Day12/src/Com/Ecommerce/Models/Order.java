package Com.Ecommerce.Models;

public class Order {
    public User user;
    public Order order;
    public Product product;
    public int quantity;
    public Order(User user,Product product,int quantity){
        this.user = user;
        this.product=product;
        this.quantity=quantity;
    }
}
