package Tut5;

public class Cell2 {
    int x;
    Cell2(int x) {
        this.x = x;
        System.out.println("Cell2 constructor called");
    }

}
class TinyCell2 extends Cell2 {
    TinyCell2() {
        // missing line goes here
        super(5);
        System.out.println("TinyCell2 constructor called");
    }
}

class Microscopiccell2 extends TinyCell2 {
    Microscopiccell2() {
        System.out.println("MicroscopicCell constructor called");
    }
}

