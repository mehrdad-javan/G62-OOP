package se.lexicon;

public class Employee {

    static int totalEmployees = 0;

    String name;
    String role;
    Department department;
    double salary;


    public Employee() {}

    public Employee(String name, String role, Department department, double salary) {
        this.name       = name;
        this.role       = role;
        this.department = department;
        this.salary     = salary;
        totalEmployees++;
    }

    public Employee(String name) {
        this.name       = name;
    }


    // methods
    void introduce() {
        IO.println("Hi, I'm " + name + ", " + role + " in " + department + ".");
    }

    void work() {
        IO.println(name + " is working on their tasks.");
    }

    void raiseSalary(double amount) {
        salary += amount;
        IO.println(name + "'s new salary: " + salary);
    }


    void displayInfo() {
        IO.println(name + " | " + role + " | " + department + " | " + salary);
    }


    static void printTotalEmployees() {
        IO.println("Total employees hired: " + totalEmployees);
    }
}
