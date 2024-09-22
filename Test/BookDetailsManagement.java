import java.util.Scanner;
class Book{
    String title, author="Unknown";
    double price;
    Book(String title, String author, double price){
        this.title= title;
        this.author= author;
        this.price= price;
        System.out.println("Title: " + title + ", Author: " + author + " , Price: " + price);
    }
    Book(String title, String author){
        this.title= title;
        this.author= author;
        System.out.println("Title: " + title + ", Author: " + author + " , Price: " + price);
    }
    Book(String title){
        this.title= title;
        this.author= author;
        this.price= price;
        System.out.println("Title: " + title + ", Author: " + author + " , Price: " + price);
    }

}
public class BookDetailsManagement{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Book b1= new Book("Believe in Yourself", "Joseph Murphy", 250);
        Book b2= new Book("The Mountain is You", "Brianna West");
        Book b3= new Book("The Alchemist");
    }
}
