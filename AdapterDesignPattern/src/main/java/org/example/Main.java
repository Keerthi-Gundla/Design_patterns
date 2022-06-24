package org.example;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        final Logger myLogger= Logger.getLogger(StudentAdapter.class.getName());

        StudentResult studentResult=new StudentAdapter();
        studentResult.giveStudentDetails();
        String result=studentResult.getStudentResult();

        myLogger.info(result);

    }
}