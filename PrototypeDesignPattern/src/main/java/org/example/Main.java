package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the student Id :");
        int studId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Student name : ");
        String name=sc.nextLine();
        System.out.println("Enter the Student department : ");
        String dept=sc.nextLine();
        System.out.println("Enter the percentage of the student : ");
        double percentage=sc.nextDouble();

        Student stud1=new Student(studId,name,dept,percentage);
        stud1.showDetails();

        Student stud2=(Student) stud1.getClone();
        stud2.showDetails();

    }
}