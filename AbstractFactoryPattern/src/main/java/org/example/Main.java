package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the university : ");
        String universityName=sc.nextLine();
        System.out.println("enter the department");
        String depName=sc.nextLine();

        FactoryCreator creator =new FactoryCreator();

        AbstractFactory factory=creator.getFactory("University");
        University university=factory.getUniversity(universityName);
        System.out.println(university.getAdmissionDate());

        factory=creator.getFactory("Department");
        Department dept=factory.getDepartment(depName);
        System.out.println(dept.getCourseDuration());







    }
}