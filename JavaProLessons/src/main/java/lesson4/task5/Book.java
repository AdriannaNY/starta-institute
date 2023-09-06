package lesson4.task5;

public class Book implements Cloneable{   // use interface for making clone = copy of object
    private String name;
    private Author author; //object of Author

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public Book(Book book) {
        this.name = book.getName();
        this.author = new Author(book.getAuthor());
    }

    private Book() {}   //empty private Constructor for further using in method Book clone()
    public String getName() {
        return name;
    }

       public Book clone() {
        Book book = new Book();   //write method clone, that return book
        book.setName(this.name);
        Author author1 = new Author(this.author);
        book.setAuthor(author1);
        return book;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
