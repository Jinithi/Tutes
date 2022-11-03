package Week1;

public class Student implements Printable {

    private final String name;
    private final String[] grades = new String[5];

    Student(String name, String grades[]) {
        this.name = name;
        int i = 0;
        while (i < 5 && i < grades.length) {
            this.grades[i] = grades[i];
            ++i;
        }
    }

    public void print() {
        System.out.println("name: " + name);
        System.out.print("grades: ");
        for (String s : grades)
            System.out.print(s + " ");
        System.out.println();

    }

}
