package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    void main() {
        Employee anna = new Employee("Anna", "Developer", Department.IT,        75000);
        Employee lena = new Employee("Lena", "Designer",  Department.MARKETING, 65000);

        anna.displayInfo();               // Anna | Developer | IT | 75000.0
        lena.displayInfo();               // Lena | Designer | MARKETING | 65000.0

        Employee.printTotalEmployees();   // Total employees hired: 2
    }
}
