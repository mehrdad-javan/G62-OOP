package se.lexicon;

import java.time.LocalDate;

public class Developer extends Employee{

    private String programmingLanguage;
    private String specialization;

    public Developer(String name, Department department, double salary, String programmingLanguage, String specialization) {
        // super() calls Employee's constructor — role is hardcoded to "Developer"
        super(name, "Developer", department, salary);
        this.programmingLanguage = programmingLanguage;
        this.specialization      = specialization;
    }

    public String getProgrammingLanguage() { return programmingLanguage; }
    public String getSpecialization()      { return specialization; }

    public void writeCode() {
        IO.println(getName() + " is writing " + programmingLanguage + " code.");
    }

    @Override
    public void introduce() {
        IO.println("Hi, I'm " + getName() + ", a " + specialization
                + " Developer (" + programmingLanguage + ") in " + getDepartment() + ".");
    }

    @Override
    public void onboard(Employee newEmployee) {
        IO.println(getName() + " is doing pair programming with " + newEmployee.getName() + ".");
    }

}
