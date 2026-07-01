package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    void main() {


        EmployeeDAO dao = new EmployeeDAOImpl(); // swap the implementation without touching this line

        dao.add(new Manager("Lars", Department.IT, 90000, 5, 12));
        dao.add(new Developer("Sofia", Department.IT, 75000, "Java", "Backend"));
        dao.add(new Developer("Erik", Department.IT, 70000, "Python", "Full Stack"));

        IO.println("-----------------------");
        Employee found = dao.findByName("Lars");
        if (found != null) found.introduce();
        IO.println("-----------------------");

        for (Employee e : dao.findAll()) {
            e.displayInfo();
        }
        IO.println("-----------------------");

        dao.remove(found);

        IO.println("-----------------------");
        for (Employee e : dao.findAll()) {
            e.displayInfo();
        }


    }
}
