module libraryapp.libraryapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens libraryapp.libraryapp to javafx.fxml;
    exports libraryapp.libraryapp;
    exports libraryapp.libraryapp.controller;
    opens libraryapp.libraryapp.controller to javafx.fxml;


}