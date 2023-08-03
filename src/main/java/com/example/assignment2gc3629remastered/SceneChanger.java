package com.example.assignment2gc3629remastered;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {
    public static void changeScenes(ActionEvent actionEvent, String fxmlFileName, String viewTitle) throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());

        //CompaniesDataController controller = fxmlLoader.getController();
        //controller.displayCompanyDetails(viewTitle);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        Image icon = new Image("https://en.wikipedia.org/wiki/Icon#/media/File:The_Ladder_of_Divine_Ascent_Monastery_of_St_Catherine_Sinai_12th_century.jpg");
        stage.getIcons().add(icon);

        stage.setScene(scene);
        stage.show();
    }
}
