package Tut6;

import java.util.Scanner;

public class TwoDimensionalTest {
    public static void main(String[] args) {
        Board board1 = new Board(5);
        board1.print();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row you want to see the max number: ");

        int num = sc.nextInt();

        System.out.println("Max number of row"+num+"is"+board1.findMaxInRow(num));
    }
}
