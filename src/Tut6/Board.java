
package Tut6;

import java.util.*;

public class Board {
    int ar[][];

    // creates a nxn size board
    public Board(int n) {
        ar = new int[n][n];

        // fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                ar[i][j] = generator.nextInt(101);
    }

    //display the contents of the board
    public void print() {
        for (int[] r : ar) { // for all rows
            for (int c : r) // for every element in current row
                System.out.print(c + " ");
            System.out.println();
        }
    }

    int findMaxInRow (int row){
        int max = 0;

        for(int i=0; i<ar[row].length; i++)
            if(max<ar[row][i])
                max= ar[row][i];
        return max;
    }

    int findMaxInColumn (int column){
        int max = 0;

        for(int row =0; row<ar[0].length; row++)
            if(max<ar[row][column])
                max= ar[row][column];
        return max;
    }
}


