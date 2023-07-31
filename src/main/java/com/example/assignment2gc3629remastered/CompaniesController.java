package com.example.assignment2gc3629remastered;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CompaniesController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}