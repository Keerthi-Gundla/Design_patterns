package org.example;

public class FactoryCreator {
    public AbstractFactory getFactory(String name){
        if(name.equalsIgnoreCase("university"))
            return new UniversityFactory();
        else if (name.equalsIgnoreCase("department")) {
            return new DepartmentFactory();
        }
        return null;
    }
}
