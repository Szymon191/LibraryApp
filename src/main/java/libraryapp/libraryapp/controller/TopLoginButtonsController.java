package libraryapp.libraryapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class TopLoginButtonsController {

    private static final String loginView = "/fxml/login_view.fxml";
    private static final String createAccountView = "/fxml/createAccount_view.fxml";


    private MainController mainController;
    @FXML
    public void openLoginPanel(ActionEvent event) {
        mainController.setCenter(loginView);
    }
    @FXML
    public void openCreateAccountPanel(ActionEvent event) {
        mainController.setCenter(createAccountView);
    }

    @FXML
    public void signInButton()
    {

    }

    public MainController getMainController() {
        return mainController;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
