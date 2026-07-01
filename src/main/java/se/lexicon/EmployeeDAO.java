package se.lexicon;

import java.util.List;

public interface EmployeeDAO {

    int MAX_EMPLOYEES = 100;

    void add(Employee employee);   // no body — the implementation decides how

    List<Employee> findAll();                // no body — the implementation decides how

    Employee findByName(String name);  // no body — the implementation decides how

    void remove(Employee employee);// no body — the implementation decides how

    static int getMaxSize() { return MAX_EMPLOYEES; }
}
