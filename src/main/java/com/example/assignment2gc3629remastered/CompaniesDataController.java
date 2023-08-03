package com.example.assignment2gc3629remastered;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class CompaniesDataController {
    @FXML
    private Label lblName;

    @FXML
    private Label lblCompanyNumber;

    @FXML
    private Label lblCountry;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblId;

    @FXML
    private Label lblPhoneNumber;

    @FXML
    void onGoBackButtonClick(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "companies-view.fxml", "Client Companies!");
    }

    public void displayCompanyDetails(Company company){
        lblCountry.setText(company.getCountry());
        lblCompanyNumber.setText(company.getCompanyNumber());
        lblEmail.setText(company.getEmail());
        lblPhoneNumber.setText(company.getPhone());
        lblName.setText(company.getName());
        lblId.setText(String.valueOf(company.getId()));
    }
}
