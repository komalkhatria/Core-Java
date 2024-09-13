class LibraryMaterial{
    String title, author;
    int publicationYear;
    LibraryMaterial(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}
class Book extends LibraryMaterial{
    String genre;
    int isbn;
    Book(String title, String author, int publicationYear, String genre, int isbn){
        super(title, author, publicationYear);
        this.genre= genre;
        this.isbn= isbn;
    }
    void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("ISBN number of the book: " + isbn + "\n");
    }
}

class Magazine extends LibraryMaterial{
    int issueNumber;
    boolean monthlyPublication;
    Magazine(String title, String author, int publicationYear, int issueNumber, boolean monthlyPublication){
        super(title, author, publicationYear);
        this.issueNumber= issueNumber;
        this.monthlyPublication= monthlyPublication;
    }
    void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Monthly Publication: " + monthlyPublication + "\n");
    }
}


public class Inheritance_LibraryManagement {
    LibraryMaterial[] materials;
    public static void main(String[] args) {
        Book book= new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction", 978074);
        Magazine magazine= new Magazine("National Geographic", "John Doe", 2023, 5, true);
        book.displayDetails();
        magazine.displayDetails();
    }
}
