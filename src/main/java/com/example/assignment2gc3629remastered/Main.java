package com.example.assignment2gc3629remastered;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("companies-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Client Companies!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //ApiResponse apiResponse = ApiUtility.getDataFromApi();
        //System.out.println(apiResponse);
        launch();
    }
}