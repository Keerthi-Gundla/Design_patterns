package org.example;

public class DepartmentFactory implements AbstractFactory{

    @Override
    public Department getDepartment(String name) {
        if(name.equalsIgnoreCase("ComputerScience"))
            return new ComputerScience();
        else if (name.equalsIgnoreCase("Mechanical")) {
            return new Mechanical();
        }
        return null;
    }

    @Override
    public University getUniversity(String name) {
        return null;
    }
}
