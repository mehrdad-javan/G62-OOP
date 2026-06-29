package se.lexicon;

public class Employee {

    // ── FIELDS ────────────────────────────────────────────────────────
    private String       name;
    private String       role;
    private Department   department;
    private double       salary;
    private WorkContract contract;   // owned by Employee — created internally

    // ── CONSTRUCTORS ──────────────────────────────────────────────────

    // Standard constructor — no contract
    public Employee(String name, String role, Department department, double salary) {
        setName(name);
        setRole(role);
        setDepartment(department);
        setSalary(salary);
    }

    // Extended constructor — creates WorkContract internally (Composition)
    public Employee(String name, String role, Department department, double salary,
                    String startDate, String contractType) {
        setName(name);
        setRole(role);
        setDepartment(department);
        setSalary(salary);
        this.contract = new WorkContract(startDate, contractType);  // created inside Employee
    }

    // ── GETTERS ───────────────────────────────────────────────────────
    public String       getName()       { return name; }
    public String       getRole()       { return role; }
    public Department   getDepartment() { return department; }
    public double       getSalary()     { return salary; }
    public WorkContract getContract()   { return contract; }

    // ── SETTERS ───────────────────────────────────────────────────────
    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be empty.");
        this.name = name;
    }

    public void setRole(String role) {
        if (role == null || role.isBlank())
            throw new IllegalArgumentException("Role cannot be empty.");
        this.role = role;
    }

    public void setDepartment(Department department) {
        if (department == null)
            throw new IllegalArgumentException("Department cannot be null.");
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary < 0)
            throw new IllegalArgumentException("Salary cannot be negative.");
        this.salary = salary;
    }

    // ── BEHAVIOUR METHODS ─────────────────────────────────────────────
    public void raiseSalary(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Raise amount must be positive.");
        this.salary += amount;
        IO.println(getName() + "'s new salary: $" + getSalary());
    }

    public void introduce() {
        IO.println("Hi, I'm " + getName() + ", " + getRole() + " in " + getDepartment() + ".");
    }

    public void work() {
        IO.println(getName() + " is working on their tasks.");
    }

    // Prints summary — includes contract details if present
    public void displayInfo() {
        String info = getName() + " | " + getRole() + " | " + getDepartment() + " | $" + getSalary();
        if (contract != null) info += " | " + contract.getDetails();
        IO.println(info);
    }

    // Association — Laptop is passed in, Employee uses it but does not own it
    public void use(Laptop laptop) {
        IO.println(getName() + " is using " + laptop.getDetails());
    }
}