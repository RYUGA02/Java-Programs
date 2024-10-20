//You are tasked with creating a simple hierarchy for a library system. You will have the following classes:
//
//Base Class: Book
//
//A constructor that accepts two parameters: title (String) and author (String).
//An overloaded constructor that accepts an additional parameter: yearPublished (int).
//A method displayInfo() that prints the book's details.
//Subclass: EBook
//
//A constructor that accepts three parameters: title, author, and fileSize (double).
//This constructor should call the superclass constructor to initialize the title and author. Use the super() keyword to invoke the appropriate constructor from Book.
//Implement a method displayInfo() that overrides the method in the Book class to include the file size.
//Subclass: PrintedBook
//
//A constructor that accepts three parameters: title, author, and numberOfPages (int).
//This constructor should also call the superclass constructor. However, you should utilize the constructor that accepts yearPublished (use a default value for this parameter).
//Implement a method displayInfo() that overrides the method in the Book class to include the number of pages.
//Tasks:
//Implement the Book, EBook, and PrintedBook classes as described above.
//Create a test class that instantiates an EBook and a PrintedBook, and calls their displayInfo() methods.
//Describe the output when running the test class.
//Additional Challenges:
//Add validation in the constructors to ensure that the fileSize for EBook is positive and the numberOfPages for PrintedBook is greater than zero.
//Modify the displayInfo() method in both subclasses to call the displayInfo() method of the superclass to avoid code duplication.

class Book{
    String title;
    String author;
    int yearPublished;
    Book(String title , String author){
        this.title = title;
        this.author = author;
    }
    Book(String title , String author ,int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    public void displayInfo(){
        System.out.println("The title of Book is :" +title);
        System.out.println("The author of the Book is :" +author);
        System.out.println("The year in which the Book Published is :" +yearPublished);
    }
}

class EBook extends Book{
    double fileSize;
    EBook(String title, String author, double fileSize){
        super(title,author);
        this.fileSize = fileSize;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The file Size of Book is :" +fileSize);
    }
}

class PrintedBook extends Book{
int numberOfPages;
PrintedBook(String title, String author, int yearPublished, int numberOfPages){
    super( title,  author ,yearPublished);
    this.numberOfPages = numberOfPages;
}
    public void displayInfo(){
      super.displayInfo();
        System.out.println("The number of pages of Book is :" +numberOfPages);
    }

}

public class Main {
    public static void main(String[] args) {

        EBook test = new EBook("Kush Life","Fernando De Silva", 40);
        test.displayInfo();
        PrintedBook test2 = new PrintedBook("Rich Bites The meat and Poor bites bones","kush kumar singh", 2029,350);
        test2.displayInfo();
    }
}