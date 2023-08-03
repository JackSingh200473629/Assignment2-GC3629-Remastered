package com.example.assignment2gc3629remastered;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CompaniesController implements Initializable {

    @FXML
    private TableColumn<Company, String> companyNumberColumn;

    @FXML
    private TableColumn<Company, String> countryColumn;

    @FXML
    private TableColumn<Company, String> emailColumn;

    @FXML
    private TableColumn<Company, Integer> idColumn;

    @FXML
    private TableColumn<Company, String> nameColumn;

    @FXML
    private TableColumn<Company, String> phoneNumberColumn;

    @FXML
    private TableView<Company> tableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ApiResponse apiResponse = ApiUtility.getDataFromApi();
        System.out.println(apiResponse);

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        companyNumberColumn.setCellValueFactory(new PropertyValueFactory<>("companyNumber"));
        phoneNumberColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        countryColumn.setCellValueFactory(new PropertyValueFactory<>("country"));

        tableView.getItems().addAll(apiResponse.getCompanyData());

        tableView.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldCompany, newCompany) -> {
                    if(newCompany != null) {
                        try {
                            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("companies-data-view.fxml"));
                            Scene scene = new Scene(fxmlLoader.load());

                            CompaniesDataController controller = fxmlLoader.getController();
                            controller.displayCompanyDetails(newCompany);

                            Stage stage = (Stage) tableView.getScene().getWindow();
                            stage.setScene(scene);
                            stage.show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );


    }
}