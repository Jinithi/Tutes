package Tut4;

public class Letter implements Printable {
    String text;

    Letter (String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Text In Letter : "+text);
    }
}
