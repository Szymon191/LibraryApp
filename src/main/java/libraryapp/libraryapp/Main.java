package libraryapp.libraryapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import libraryapp.libraryapp.controller.LoginController;
import libraryapp.libraryapp.users.Customer;
import libraryapp.libraryapp.users.Employee;
import libraryapp.libraryapp.users.User;
import libraryapp.libraryapp.utils.FxmlUtils;

import java.io.IOException;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

public class Main extends Application {
    public static final String borderPaneMainFxml = "/fxml/BorderPaneMain.fxml";
    @Override
    public void start(Stage primaryStage){
        //Locale.setDefault(new Locale("eng"));
        Pane borderPane = FxmlUtils.fxmlLoader(borderPaneMainFxml);
        Scene scene = new Scene(Objects.requireNonNull(borderPane));
        primaryStage.setScene(scene);
        primaryStage.setTitle(FxmlUtils.getResourceBundle().getString("title"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        //Employee.employees.add(new Employee("Szymon","Szymanski","faoinwfa","829317281","admin","admin", (double) 10000.0));
        //Employee employee = new Employee("Szymon","Szymanski","faoinwfa","829317281","admin","admin", (double) 10000.0);
        User user = new Employee("Szymon","Szymanski","faoinwfa","829317281","admin","admin", 10000.0);
        User.users.add(user);
        Employee.employees.add((Employee) user);

        Employee.employees.add(new Employee("afwa","fwaf","fwa","4124124","ad","ad",4212.0));
        System.out.println(Employee.employees.get(0));



        //Customer.customers.add(new Customer("jan","kowalski","faoinw","14125412","cos","cos"));
        //System.out.println(Customer.customers.get(0).toString());
        launch();

    }
}
