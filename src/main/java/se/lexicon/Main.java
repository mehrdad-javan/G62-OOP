package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    void main() {


        Employee johan = new Employee("Johan", "Developer", Department.IT,        80000, "2023-01-15", "Full-Time");
        Employee sofia = new Employee("Sofia", "Designer",  Department.MARKETING, 60000, "2023-03-01", "Part-Time");

        johan.displayInfo();  // Johan | Developer | IT | 80000.0 | Full-Time contract (started: 2023-01-15)
        sofia.displayInfo();  // Sofia | Designer | MARKETING | 60000.0 | Part-Time contract (started: 2023-03-01)


    }
}
