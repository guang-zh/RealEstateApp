/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.realestateapp;

import java.sql.Connection;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.sql.ResultSet;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Scene;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author guang
 */
public class TableController implements Initializable {
    
    @FXML
    private void switchToNavigation() throws IOException {
        App.setRoot("NavigationPage");
    }
    
    @FXML
    private TableView<Condo> table;
    
    @FXML
    private TableColumn<Condo, Integer> col_propertyId;
    
    @FXML
    private TableColumn<Condo, String> col_propertyType;
    
    @FXML
    private TableColumn<Condo, String> col_propertyName;
    
    @FXML
    private TableColumn<Condo, String> col_propertyOwner;
    
    @FXML
    private TableColumn<Condo, String> col_propertyAddress;
    
    @FXML
    private TableColumn<Condo, String> col_propertyButton;
  
    ObservableList<Condo> oblist = FXCollections.observableArrayList();
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
//        try {
//            Connection con = DBConnector.getConnection();
//            ResultSet rs = con.createStatement().executeQuery("select * from realestatedb.properties");
//            
//            while (rs.next()){
//                oblist.add(new Condo(Integer.parseInt(rs.getString("propertyId")), rs.getString("propertyType"),
//                    rs.getString("propertyName"), rs.getString("propertyOwner"), rs.getString("propertyAddress"),
//                    rs.getButton("propertyButton")));
//            } 
//        } catch (SQLException ex){
//                Logger.getLogger(TableController.class.getName()).log(Level.SEVERE, null, ex); 
//                    
//        }
        
        col_propertyId.setCellValueFactory(new PropertyValueFactory<>("propertyId"));
        col_propertyType.setCellValueFactory(new PropertyValueFactory<>("propertyType"));
        col_propertyName.setCellValueFactory(new PropertyValueFactory<>("propertyName"));
        col_propertyOwner.setCellValueFactory(new PropertyValueFactory<>("propertyOwner"));
        col_propertyAddress.setCellValueFactory(new PropertyValueFactory<>("propertyAddress"));
        col_propertyButton.setCellValueFactory(new PropertyValueFactory<>("propertyButton"));
    
        table.setItems(oblist);
    }
    
}
