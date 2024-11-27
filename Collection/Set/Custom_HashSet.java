import java.util.*;
class Book{
    int id;
    String name, author;
    double price;
    Book(int id, String name, String author, double price){
        this.id= id;
        this.name= name;
        this.author= author;
        this.price= price;
    }

}
public class Custom_HashSet {
    public static void main(String[] args) {
        HashSet<Book> hs= new HashSet<>();
        Book b1= new Book(101, "The Mountain Is You", "ABC", 150);
        Book b2= new Book(110, "The Power Of Now", "XYZ", 220);
        Book b3= new Book(117, "The Power Of Your Subconscious Mind", "DEF", 200);

        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        for(Book b: hs){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.price);
        }
    }
}
