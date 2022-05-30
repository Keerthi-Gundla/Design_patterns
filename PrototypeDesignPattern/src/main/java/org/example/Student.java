package org.example;

public class Student implements Prototype {
    private int studId;
    private String name;
    private String dept;
    private double percentage;

    Student(int id,String name,String dept,double percentage){
        studId=id;
        this.name=name;
        this.dept=dept;
        this.percentage=percentage;
    }

    public void showDetails(){
        System.out.println("Stud ID : "+studId+" name : "+name+" dept : "+dept+" percentage : "+percentage);
    }

    @Override
    public Prototype getClone() {
        return new Student(studId,name,dept,percentage);
    }
}
