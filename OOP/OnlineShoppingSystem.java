class Product{
    final int productId;
    String productName;
    double price;
    Product(int productId, String productName, double price){
        this.productId= productId;      //productId IS FINAL, IT CANNOT BE REASSIGNED
        this.productName= productName;
        this.price= price;
    }
    int getProductId() {
        return productId;
    }
    String getProductName() {
        return productName;
    }
    double getPrice() {
        return price;
    }

    void displayProductDetails(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price : $" + price);
        System.out.println();
    }

}

class ShoppingCart{
    double totalPrice;

    //THE METHOD BELOW TAKES PARAMETER OF TYPE Product, i.e. OBJECT OF CLASS PRODUCT
    //AS THIS METHOD IS FINAL, IT CANNOT BE OVERRIDDEN, EVERYTIME IT IS CALLED, THE VALUE OF totalPrice IS ADDED TO IT
    final void calculateTotalPrice(Product product){
        totalPrice+= product.getPrice();
    }
    void displayTotalPrice(){
        System.out.println("Total price of products in cart: $" + totalPrice);
    }
}

class User{
    final String userId;
    String userName;
    User(String userId, String userName){
        this.userId= userId;
        this.userName= userName;
    }
    String getUserId() {
        return userId;
    }
    String getUserName() {
        return userName;
    }
    void displayUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
    }
}

//FINAL CLASS CANNOT BE INHERITED
final class Payment{
    void makePayment(double amount){
        System.out.println("Payment of $" + amount + " is successful!");
    }
}
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Product product1= new Product(101, "Crayons", 210);
        Product product2= new Product(102, "Sketch Pens", 150);
        Product product3= new Product(103, "Art File", 180);

        ShoppingCart cart= new ShoppingCart();
        cart.calculateTotalPrice(product1);
        cart.calculateTotalPrice(product2);
        cart.calculateTotalPrice(product3);

        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        cart.displayTotalPrice();
        User user= new User("U20240812", "Aditya");
        user.displayUserDetails();

        Payment pay= new Payment();
        pay.makePayment(1500);

    }
}
