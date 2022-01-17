package controller;

import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;

public class Dashboardcontroller {

    public AnchorPane DashboadA;

    public void btnStudent(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../views/Addstudent.fxml");
        Parent load = FXMLLoader.load(resource);
     DashboadA.getChildren().clear();
        DashboadA.getChildren().add(load);
    }

    public void btnCourse(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../views/addCourse.fxml");
        Parent load = FXMLLoader.load(resource);
        DashboadA.getChildren().clear();
        DashboadA.getChildren().add(load);
    }

    public void btnregistation(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../views/RegistationForm.fxml");
        Parent load = FXMLLoader.load(resource);
        DashboadA.getChildren().clear();
        DashboadA.getChildren().add(load);
    }
}

