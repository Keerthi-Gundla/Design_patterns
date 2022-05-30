package org.example;

interface AbstractFactory {
    public University getUniversity(String name);
    public Department getDepartment(String name);
}
