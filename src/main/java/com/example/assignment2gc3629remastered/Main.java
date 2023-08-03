package com.example.assignment2gc3629remastered;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("companies-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Client Companies!");
        Image icon = new Image("https://en.wikipedia.org/wiki/Icon#/media/File:The_Ladder_of_Divine_Ascent_Monastery_of_St_Catherine_Sinai_12th_century.jpg");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //ApiResponse apiResponse = ApiUtility.getDataFromApi();
        //System.out.println(apiResponse);
        launch();
    }
}