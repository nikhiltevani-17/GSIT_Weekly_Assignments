package weekly_assignment;

class Employee 
{
	//Instance variables
    int id;
    String name;
    double basicSalary;
    double totalSalary;

    
    //constructor
    Employee(int id, String name, double basicSalary)
    {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    //method 1
    void calculateSalary() 
    {
        double hra = 0.20 * this.basicSalary;
        double bonus = 0.10 * this.basicSalary;
        this.totalSalary = this.basicSalary + hra + bonus;
    }
    //method 2
    void display() 
    {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Total Salary: " + this.totalSalary);
    }
}


	public class Assignment6_10th_April_Q2_Salary_Calculation {
		public static void main(String[] args) {
			Employee emp1 = new Employee(101, "Nikhil", 30000);

			emp1.calculateSalary(); // must call before display
			emp1.display();
    }
}

/*
 Question 2: Salary Calculation using this Keyword
📌 Problem Statement
Design a Java program to manage employee salary details.
Create a class Employee with the following:
->Instance variables: 
id (int) 
name (String) 
basicSalary (double) 

🎯 Required Functionality
1.Create a constructor to initialize all values. 
2.Create a method calculateSalary() to compute: 
HRA = 20% of basicSalary 
Bonus = 10% of basicSalary 
Total Salary = basicSalary + HRA + Bonus 
3.Create a method display() to print: 
id 
name 
basicSalary 
total salary 
Use this keyword properly inside constructor. 	
 */
	
