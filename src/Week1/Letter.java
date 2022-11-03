package Week1;

public class Letter implements Printable {
    private final String text;

    Letter(String text){
        this.text=text;
    }

    @Override
    public void print() {
        System.out.println("Text : "+text);
    }
}
