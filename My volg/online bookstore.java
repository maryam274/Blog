// Create a Main class
/*public class Main {
  int id_book, date_time;
  String address_Del, phone_num;


  // Create a class constructor for the Main class
  public Main() {
    id_book = 1;
    date_time = 2002;
    address_Del = "AL SHROUK";
    phone_num = "01179580587";
    


  }

  public static void main(String[] args) {
    Main mybook = new Main();
    System.out.println( "id_book ="+" "+ mybook.id_book);
    System.out.println("Date_time ="+" "+ mybook.date_time);
    System.out.println("Address_Del ="+" "+ mybook.address_Del);
    System.out.println(" phone_num ="+" "+ mybook.phone_num);
  }
}*/
----------------------------------------------------------------------------------------------------------------------------
/*public class Book

{

 private String author, title;

 private int id;
 
 private static int identification =0;

 public Book()

 {

  title = author = "unknown";

  id = 0;

 }

 public Book(String title)

 {

  this.title = title;

  author = "unknown";

  identification++;

  id = identification;

 }

 public Book (String title, String author)

 {

  this.title = title;

  this.author = author;

  identification++;

  id = identification;

 }

  

 public void setTitle(String title)

 {

  this.title = title;

 }

  
 public void setAuthor(String author)

 {

  this.author = author;

 }

  

 public String getTitle()

 {

  return title;

 }

 public String getAuthor()

 {

  return author;

 }

 public int getId()

 {

  return id;

 }

  

 public boolean equals(Book other)

 {

  boolean enough = true;

  String otherAuthor = other.getAuthor();

  String otherTitle = other.getTitle();

  if(otherAuthor.equals(author) && otherTitle.equals(title))

   enough = true;

  else 

   enough = false;

  return enough;

 }

 public String getInitials ()

 {

  String output = "";

  if (!(author.equals("")) && !

          (author.equals("unknown")) && !(author.equals(null))) {

   output += author.charAt(0);

   output += ". ";

   if (author.indexOf(" ") != -1) {

   output += author.charAt(author.indexOf(" ") + 1);

   output += ". "; }

    
   if (author.indexOf(" ") != -1) {

   output += author.charAt((author.indexOf(" ") 

                         + author.indexOf(" ")) +4 );

   output += ". "; }

  }

  return output;

 }

 public String toString()

 {

  return "Book No: " + id + " entitled \"" 

                + title + "\"" + " written by " + author;

 }

}
view sourceprint?

import java.util.Scanner;

public class BookTest

{

 public static void main (String[] args)

 {

  Book firstBook = new Book();

        Book lastBook = new Book();

Book aBook = new Book();



Scanner scan = new Scanner (System.in);

System.out.println("To end the input " +

"process bypass each question by typing the enter key!");

System.out.print("Type the title of the book: ");

String title = scan.nextLine();

System.out.print("Type the name of the author: ");

String author = scan.nextLine();



aBook = new Book(title, author);


if (!(title.equals("") && author.equals("")))

System.out.println(aBook);

while (!(title.equals("") && author.equals("")))

  {

    if (aBook.getId() == 1)

firstBook = aBook;

    System.out.print("Type the title of the book: ");

    title = scan.nextLine();

    System.out.print("Type the name of the author: ");

    author = scan.nextLine();

    if (!(title.equals("") && author.equals(""))) {  

     aBook = new Book(title, author);

    System.out.print(aBook);

    System.out.println(); }

  }

  lastBook = aBook;

  if (firstBook.equals(lastBook))

   System.out.println("First and last books are the same");

  System.out.println(lastBook.getInitials());


 }

}
*/
--------------------------------------------------------------------------------------------------------------------------------------------------
/*import java.util.*;

class Books {
	public String title;
	public String author;
	public int isbn;
	public double price;
	public double discount;
	public double total;

	public Books() {
	}

	public Books(String title, String author, int isbn, double price,
			double discount, double total) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.discount = discount;
		this.total = total;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	public double getTotal() {
		return total;
	}
}

public class BookStore {
	public static void main(String[] args) throws Exception {
		double amount = 0.0;
		double sum = 0.0;
		int count = 1;
		List list = new ArrayList();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		System.out.println("Book Store");
		System.out.println();
		System.out.println("1. Buy book");
		System.out.println("2. Receipt");
		System.out.println("3. Receive Payment");
		System.out.println("4. Exit");
		boolean quit = false;
		do {
			if (count > 5) {
				System.out
						.println("You cannot buy more than 5 books at a time.");
			}
		System.out.print("Please enter your choice: ");
		menu = scan.nextInt();
		System.out.println();
		switch (menu) {
		case 1:
		count++;
		System.out.println("Book Title: ");
		String booktitle = scan.next();
		System.out.println("Author: ");
		String auth = scan.next();
		System.out.println("ISBN: ");
		int no = scan.nextInt();
		System.out.println("Price: ");
		double p = scan.nextDouble();
		System.out.println("Discount: ");
	        double dis = scan.nextDouble();
		double total = p - (dis * p);
		list.add(new Books(booktitle,auth, no, p,dis, total)); 
                break;
		case 2:
		System.out.println("Title Author ISBN Price 
                Discount Total");
	        for (Books s : list) {
		System.out.println(s.getTitle() + " " + s.getAuthor()  
                + " "	+ s.getIsbn() + " "+ s.getPrice() + " "+ 
                s.getDiscount() + " " +	s.getTotal());
		sum += s.getTotal();
				}
			System.out.println("Total= " + sum);
			break;
			case 3:
			System.out.println("Customer Pays: ");
			amount = scan.nextDouble();
			double balance = amount - sum;
			System.out.println("Balance is: " + balance);
			quit = true;
			case 4:
			quit = true;
			break;
			default:
			System.out.println("Invalid Entry!");
			}
		} while (!quit);
	}
}

*/
------------------------------------------------------------------------------------------------------------------------------------------------------
 /*public class Book {
    // instance variables
    private String title;  // title of book
    private String author; // author of book
    private int year;      // year of publication/date_time
    private String address_Del, phone_num;

    // constructor creates a new book
    public Book(String title, String author, int year, String address_Del, String phone_num) {
        if (year < 0)
            throw new RuntimeException("year of publication negative");
        this.title = title;
        this.author = author;
        this.year = year;
        this.address_Del = address_Del;
        this.phone_num = phone_num;
    }
 
    // returns "[title], [author], [year]"
    public String toString() {
        String result = title + ", " + author + ", " + year;
        return result;
    }
 
    // returns book title
    public String getTitle() {
        return title;
    }
 
    // returns author
    public String getAuthor() {
        return author;
    }
 
    // returns year
    public int getYear() {
        return year;
    }
    public String getaddress_Del () {
      return address_Del;
    }
    public String getphone_num() {
      result phone_num;
    }
 
    // returns true if this book is older than that
    // if same year of publication not older
    public boolean isOlderThan(Book that) {
        return (this.year < that.year);
    }
 
    // instantiates exactly two book objects
    // outputs both
    // calls isOlderThan and prints result
    public static void main(String[] args) {
        Book b1 = new Book("Alice in Wonderland", "Lewis Carroll", 1865);
        Book b2 = new Book("Mary Poppins", "P. J. Travers", 1934);
 
        StdOut.println(b1);
        StdOut.println(b2);
 
        StdOut.println(b1.isOlderThan(b2));
    } 
}*/

/* class Book {
    private int bookId;
    private String details;
    private String title;
  
    public Book(int id, String details, String title)
    {
        bookId = id;
        this.details = details;
        this.title = title;
    }
  
    public int getId()
    {
        return bookId;
    }
  
    public void setId(int id)
    {
        bookId = id;
    }
  
    public String getDetails()
    {
        return details;
    }
  
    public void setDetails(String details)
    {
        this.details = details;
    }
  
    public String getTitle()
    {
        return title;
    }
  
    public void setTitle(String title)
    {
        this.title = title;
    }
}
*/