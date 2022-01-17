package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormcontroller {
    public AnchorPane LoginA;

    public void btnlogin(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../views/Dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 863, 538);
        Stage stage = (Stage) LoginA.getScene().getWindow();
        stage.setScene(scene);

    }
}
