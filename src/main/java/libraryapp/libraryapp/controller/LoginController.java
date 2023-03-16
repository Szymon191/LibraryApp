package libraryapp.libraryapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import libraryapp.libraryapp.users.Employee;
import libraryapp.libraryapp.users.User;

public class LoginController {

    private String testlogin = "admin";
    private String testpass = "admin";
    @FXML
    private TextField nickname;
    @FXML
    private TextField password;

    public TextField getNickname() {
        return nickname;
    }

    public TextField getPassword() {
        return password;
    }

    public void signInButton(ActionEvent event) {
        //System.out.println(empty());
        if(empty())
        {
            System.out.println(sprawdzenieLoginuIhasla());

        }
    }


    private boolean empty()
    {
        return !getNickname().getText().isEmpty() && !getPassword().getText().isEmpty();
    }

    private boolean sprawdzenieLoginuIhasla()
    {
        for (Employee employee : Employee.employees)
        {
            if(getNickname().getText().equals(employee.getNickname()) && getPassword().getText().equals(employee.getPassword()))
            {
                return true;
            }
        }
        return false;
    }


}
