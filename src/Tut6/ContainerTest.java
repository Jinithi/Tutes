package Tut6;

import java.util.ArrayList;
class Book1 {
    public String author;
    public String title;
}


public class ContainerTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3.4);
        list.add(new Integer(4));
        Book myBook = new Book();
        list.add(myBook);

        double d;
       /** d = list.get(0); // Problematic line
        Double d2 = (Integer) list.get(1); // Problematic line
        Book b3 = (Book) list.get(1); // Problematic line
        Book b2 = list.get(2); // Problematic line*/
    }
}
