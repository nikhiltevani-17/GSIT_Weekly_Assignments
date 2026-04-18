package weekly_assignment;
//class 1
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

//class 2
class Student extends Person {
    int marks;

    Student(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class Assignment6_10th_April_Q1_this_Inheritance_Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Nikhil", 25, 85);
        s1.display();
    }
}




/*
🔴 Question 1: 
📌 Problem Statement
Create two classes:
Person 
Student (inherits Person) 

🔹 Requirements:
1. Person class:
Instance variables: name, age 
Constructor to initialize values using this keyword 

2. Student class:
Instance variable: marks 
Constructor to initialize: 
name 
age 
marks (use this) 
Method display() to print all details

*/
