package DesignPatterns.factoryPattern;

import java.util.Scanner;

public class FactoryDesignPattern {
    public static void main(String args[]){
        TeleCom teleCom;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the type of telecom you want to use : ");
        String type=sc.nextLine();

        TeleComFactory factory=new TeleComFactory(type);
        teleCom=factory.getTeleCom();

        System.out.println("Enter the phone number");
        String number=sc.nextLine();
        teleCom.call(number);
    }
}
