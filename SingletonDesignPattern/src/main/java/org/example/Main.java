package org.example;

import patterns.BalanceEnquiry;
import patterns.Deposit;
import patterns.Withdraw;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){

            System.out.println("Enter \n 1.BalanceEnquiry \n 2.withdraw \n 3.deposit \n 4.exit");
            int option=sc.nextInt();
            switch(option) {
                case 1:
                    System.out.println("Account Balance " + new BalanceEnquiry().getBalanceAmount());
                    break;
                case 2:
                    System.out.println("Enter the Amount: ");
                    double amt = sc.nextDouble();
                    new Withdraw().withdrawAmount(amt);
                    break;
                case 3:
                    System.out.println("enter the Amount to be deposited : ");
                    double amount = sc.nextDouble();
                    new Deposit().depositAmount(amount);
                    break;
                case 4:
                    exit(0);
                default:
                    System.out.println("invalid option");
                    break;
            }
        }
    }
}