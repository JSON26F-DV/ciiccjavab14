public class Task11 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book1:\n"+book1.toString());
        System.out.println("Book2:\n"+book2.toString());
        System.out.println("Book3:\n"+book3.toString());
    }
}

class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String title,String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override 
    public String toString(){
        return String.format("Title: \"%s\"\nAuthor: \"%s\"\nYear Published: %d\nPrice: $%.2f\n",
        title,author,yearPublished,price);
    }
}
