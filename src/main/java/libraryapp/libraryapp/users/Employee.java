package libraryapp.libraryapp.users;

import java.util.ArrayList;

public class Employee extends User{
    public static ArrayList<Employee> employees = new ArrayList<>();
    private Double solary;


    public Employee(String name, String surname, String email, String tel_nr, String nickname, String password, Double solary) {
        super(name, surname, email, tel_nr, nickname, password);
        this.solary = solary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "solary=" + solary +
                '}';
    }
}
