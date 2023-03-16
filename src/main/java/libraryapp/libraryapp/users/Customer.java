package libraryapp.libraryapp.users;

import java.util.ArrayList;

public class Customer extends User{

    public static ArrayList<Customer> customers = new ArrayList<>();
    public Customer(String name, String surname, String email, String tel_nr, String nickname, String password) {
        super(name, surname, email, tel_nr, nickname, password);
    }

}
