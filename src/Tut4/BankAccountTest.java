package Tut4;

import java.util.ArrayList;
import java.util.Collections;

public class BankAccountTest
{
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(2000);
        BankAccount ba2 = new BankAccount(5000);
        BankAccount ba3 = new BankAccount(70000);
        BankAccount ba4 = new BankAccount(2000);
        BankAccount ba5 = new BankAccount(3000);
        // put bank accounts into a list
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(ba1);
        list.add(ba2);
        list.add(ba3);
        list.add(ba4);
        list.add(ba5);

        // call the library sort method
        Collections.sort(list);
        // print out the sorted list
        for (BankAccount b : list)
            System.out.println(b.getBalance());


    }

}
