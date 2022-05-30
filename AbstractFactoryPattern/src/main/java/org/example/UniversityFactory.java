package org.example;

public class UniversityFactory implements AbstractFactory{

    @Override
    public University getUniversity(String name) {
        if(name.equalsIgnoreCase("Harvard"))
            return new Harvard();
        else if(name.equalsIgnoreCase("NYC"))
            return new NYC();
        return null;
    }

    @Override
    public Department getDepartment(String name) {
        return null;
    }
}
