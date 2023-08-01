package com.example.assignment2gc3629remastered;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class CompaniesDataController {
    @FXML
    private  Label lblName;

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

    /*public void displayCompanyDetails(String viewTitle){
        ApiResponse companyDetails = ApiUtility.getDataFromApi(viewTitle);

        lblCountry.setText(Company.getCountry());
        lblCompanyNumber.setText(Company.getCountry());
        lblEmail.setText(Company.getEmail());
        lblPhoneNumber.setText(Company.getPhone());
        lblName.setText(companyDetails.toString());

    }*/
}
