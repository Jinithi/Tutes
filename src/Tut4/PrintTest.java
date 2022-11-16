package Tut4;

public class PrintTest {
    public static void main(String[] args) {
        String grades1[] ={"B","A","A","C","B"};
        Student s1 = new Student("Jane",grades1);
        s1.print();

        Letter L1 =new Letter("LETTER ONE");
        L1.print();
    }
}
