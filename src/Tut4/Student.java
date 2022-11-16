package Tut4;

public class Student implements Printable {
    String sname;
    String sgrades[]=new String[5];

    Student(String sname,String sgrades[]){
        this.sname=sname;

        int g =0;
        while(g<5){
            this.sgrades[g]=sgrades[g];
            ++g;
        }
    }
    public void print(){
        System.out.println("Name of the student : "+sname);
        System.out.println("Grades : ");

        for (int x=0; x<5; x+=1)
            System.out.print(sgrades[x] + " ");
        System.out.println();
    }
}
