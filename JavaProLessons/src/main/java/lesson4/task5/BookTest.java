package lesson4.task5;

public class BookTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book("Java", new Author("Gerbert Shildt"));

//        //Book book2 = book1; //2 переменные ссылаются на один и тот же обьект - same область памяти
//        // here we didn't create object book2
//
//        //===========To Clone the book, use interface: ===========
//        Book book2 = (Book)book1.clone(); // -> we need type Book, did it because override method clone() returns type Object, not Book
//        //this is real copy of our book, object of Book - book2 in this case will created "pod kapotom" of method clone()
//
//        System.out.println(book1.getName()); //Java
//        System.out.println(book2.getName()); //Java
//
//        book2.setName("Clean Code"); //changed name of book2 but changed also name of book1
//        System.out.println(book1.getName()); //Clean Code.
//        //так как 2 переменные ссылаются на один и тот же обьект - same область памяти
//        //P.S. If use method clone() - will not changed, will Java
//        System.out.println(book2.getName()); //Clean Code

//        //=================================Minus of method clone():=============================
//        //If we have inside of our book - object Author
//        Book book2 = (Book)book1.clone(); // 2 different objects - books
//        System.out.println(book1.getName());
//        System.out.println(book1.getAuthor().getName());  //Author is an object
//        System.out.println(book2.getName());
//        System.out.println(book2.getAuthor().getName());
//        System.out.println("--------------------");
//        book2.getAuthor().setName("Author 2"); //set name to Author
//        System.out.println(book1.getName());
//        System.out.println(book1.getAuthor().getName());  //Author is an object, so when we changed name book2 - changed book1 also
//        //because same reference to object Author in objects books -> big Minus of method clone()
//        System.out.println(book2.getName());
//        System.out.println(book2.getAuthor().getName());

        //===============For real copy must create Constructor of Author and Book:===============
        //===============VARIANT 1: ==============================
//         public Author(Author author) {
//            this.name = author.getName();
//        }

//        public Book(Book book) {
//            this.name = book.getName();
//            this.author = new Author(book.getAuthor());
//        }

//        Book book2 = new Book(book1);
//        System.out.println(book1.getName());
//        System.out.println(book1.getAuthor().getName());
//        System.out.println(book2.getName());
//        System.out.println(book2.getAuthor().getName());
//        System.out.println("--------------------");
//        book2.getAuthor().setName("Robert Martin");
//        book2.setName("Clean Code");
//        System.out.println(book1.getName()); //did't changed - PERFECT!
//        System.out.println(book1.getAuthor().getName()); //did't changed - PERFECT!
//        System.out.println(book2.getName());  //changed
//        System.out.println(book2.getAuthor().getName()); //changed
//    }


    //==================Variant2:=====================
    // + Add:
//    private Book() {}   //empty private Constructor for further using in method Book clone()

//    public Book clone() {
//        Book book = new Book();   //write method clone, that return book
//        book.setName(this.name);
//        Author author1 = new Author(this.author);
//        book.setAuthor(author1);
//        return book;
//    }
        Book book2 = book1.clone();    //variant 2
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor().getName());
        System.out.println("--------------------");
        book2.getAuthor().setName("Robert Martin");
        book2.setName("Clean Code");
        System.out.println(book1.getName()); //did't changed - PERFECT!
        System.out.println(book1.getAuthor().getName()); //did't changed - PERFECT!
        System.out.println(book2.getName());  //changed
        System.out.println(book2.getAuthor().getName()); //changed
    }


}
