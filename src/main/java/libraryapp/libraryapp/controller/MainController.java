package libraryapp.libraryapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import libraryapp.libraryapp.utils.FxmlUtils;

import java.io.IOException;
import java.util.ResourceBundle;

public class MainController {
    private static final String loginView = "/fxml/login_view.fxml";
    @FXML
    private BorderPane borderPane;
    @FXML
    private TopLoginButtonsController topMenuButtonsController;
    @FXML
    private void initialize()
    {
        topMenuButtonsController.setMainController(this);
        setCenter(loginView);
    }

    public void setCenter(String fxmlPath)
    {
        borderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));
    }



}
