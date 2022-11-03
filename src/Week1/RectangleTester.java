package Week1;

import java.awt.*;

public class RectangleTester {
    public static void main(String[] args) {
            Rectangle r1 = new Rectangle(0,0,100,50);
            Rectangle r2 = new Rectangle(0,0,100,50);
            // Rectangle r2 = new Rectangle(r1);
            r2.grow(10,20);

            //public Rectangle(Rectangle r1);
            System.out.println(r1);
            System.out.println(r2);
            System.out.println(" ");

            //NEW PART

            Rectangle r3 = new Rectangle(0,0,100,50);
            Rectangle r4 = r3;

            r4.grow(10,20);

            //public Rectangle(Rectangle r1);
            System.out.println(r3);
            System.out.println(r4);
        }
    }

