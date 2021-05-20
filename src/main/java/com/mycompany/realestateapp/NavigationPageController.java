/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.realestateapp;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author guang
 */
public class NavigationPageController {
    
    @FXML
    private void switchToProperties() throws IOException {
        App.setRoot("Properties");
    }
    
    @FXML
    private void switchToTenants() throws IOException {
        App.setRoot("Tenants");
    }
    
    @FXML
    private void switchToLeases() throws IOException {
        App.setRoot("Leases");
    }
    
    @FXML
    private void switchToMaintenance() throws IOException {
        App.setRoot("Maintenance");
    }
    
    @FXML
    private void switchToMortgages() throws IOException {
        App.setRoot("Mortgages");
    }
    
    @FXML
    private void switchToBanks() throws IOException {
        App.setRoot("Banks");
    }
    
}
