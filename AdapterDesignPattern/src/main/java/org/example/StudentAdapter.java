package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class StudentAdapter extends Student implements StudentResult{

    private final Logger myLogger= Logger.getLogger(StudentAdapter.class.getName());
    Scanner sc=new Scanner(System.in);
    @Override
    public void giveStudentDetails() {

        myLogger.info("Enter Student firstname:");
        String firstName=sc.nextLine();

        myLogger.info("Enter Student LastName:");
        String lastName=sc.nextLine();

        myLogger.info("Enter Student Id:");
        int id=sc.nextInt();

        myLogger.info("Enter marks of 4 subjects");
        int[] marks=new int[4];
        for(int i=0;i<4;i++){
            marks[i]=sc.nextInt();
        }

        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
        setMarks(marks);
    }

    @Override
    public String getStudentResult() {

        double avg=0.0;
        for(int mark:getMarks()){
            avg+=mark;
        }
        avg=avg/4;

        String result="Id : "+getId()+" FirstName: "+getFirstName()+" LastName: "+getLastName();

        if(avg>60)
            return result+" \n Student Passed with "+avg+" Percentage.";

        return result+" \n Student Failed with "+avg+" Percentage.";
    }
}
