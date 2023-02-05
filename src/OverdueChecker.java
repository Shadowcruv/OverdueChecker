 import java.util.*;

public class OverdueChecker {

    public static void main( String[] args ) {
//Create three LibraryBook objects and output them
        GregorianCalendar dueDate;
        LibraryBook book1, book2, book3, book4;
        dueDate = new GregorianCalendar(2008, Calendar.MARCH, 14);
        book1 = new LibraryBook(dueDate);
        dueDate = new GregorianCalendar(2008, Calendar.FEBRUARY, 13);
        book2 = new LibraryBook(dueDate, 0.75);
        book2.setTitle("Introduction to oop with Java");
        dueDate = new GregorianCalendar(2008, Calendar.JANUARY, 12);
        book3 = new LibraryBook(dueDate, 1.00,100);
        book3.setTitle("Java for Smarties");
        dueDate = new GregorianCalendar(2008, 9, 1);
        book4 = new LibraryBook(dueDate, 1.50, 230.00,
                "Me and My Java");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
    }
}
