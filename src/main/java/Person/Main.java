package com.mycompany.person;

public class Main{
    public static void main(String[] args) {
        Student student = new Student("ZyrelJames Umpay Tagarda", 2004, "Bachelor of Science in Information Technology");

        System.out.println("Student Info: " + student);
        System.out.println("Student Major: " + student.getMajor());

        Instructor instructor = new Instructor("Jessa Anlicao Asiniero", 2002, 30000);

        System.out.println("Instructor Info: " + instructor);
        System.out.println("Instructor Salary: " + instructor.getSalary());
    }
}
     