package libraryapp.libraryapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Objects;

public class CreateAccountController {


    @FXML
    private TextField nameF;
    @FXML
    private TextField surnameF;
    @FXML
    private TextField emailF;
    @FXML
    private TextField telF;


    public TextField getName() {
        return nameF;
    }

    public TextField getSurname() {
        return surnameF;
    }

    public TextField getEmail() {
        return emailF;
    }

    public TextField getTel() {
        return telF;
    }

    public void createAccount(ActionEvent event) {
        System.out.println(empty());
    }

    private boolean empty()
    {
        return !getName().getText().isEmpty() && !getSurname().getText().isEmpty() && !getEmail().getText().isEmpty() && !getTel().getText().isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateAccountController that = (CreateAccountController) o;
        return Objects.equals(nameF, that.nameF) && Objects.equals(surnameF, that.surnameF) && Objects.equals(emailF, that.emailF) && Objects.equals(telF, that.telF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameF, surnameF, emailF, telF);
    }



}
