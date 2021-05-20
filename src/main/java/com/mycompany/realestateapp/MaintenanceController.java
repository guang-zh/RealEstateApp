/*
 * MaintenancesController class for Maintenances and associated interest rates
 * Link to Properties Table with property_id
 */
package com.mycompany.realestateapp;

import static com.mycompany.realestateapp.DBConnector.getDBconnection;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert.AlertType;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author guang
 */
public class MaintenanceController implements Initializable {
    
    @FXML
    private void switchToNavigation() throws IOException {
        App.setRoot("NavigationPage");
    }
    
    @FXML
    private TextField tfId;
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfCost;
    @FXML
    private TextField tfContractor;
    @FXML
    private TextField tfContractorphone;
    @FXML
    private TextField tfPid;
    
    @FXML
    private TableView<Maintenance> tvMaintenances;
    @FXML
    private TableColumn<Maintenance, Integer> colId;
    @FXML
    private TableColumn<Maintenance, String> colName;
    @FXML
    private TableColumn<Maintenance, Double> colCost;
    @FXML
    private TableColumn<Maintenance, String> colContractor;
    @FXML
    private TableColumn<Maintenance, String> colContractorphone;
    @FXML
    private TableColumn<Maintenance, Integer> colPid;
    
    @FXML
    private Button btnInsert;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;
    
    @FXML
    private Button btnNavigation;
    
    // Initializes the controller class
    private Connection conn;
    private DBConnector dbhandler;
    
     @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException, IOException {        
        
        if(event.getSource() == btnInsert){
            System.out.println("Insert Record");
            insertRecord();
        }else if (event.getSource() == btnUpdate){
            System.out.println("Update Record");
            updateRecord();
        }else if(event.getSource() == btnDelete){
            System.out.println("Delete Record by ID");
            deleteButton();
        }else if (event.getSource() == btnNavigation){
            System.out.println("Return to Navigation Page");
            switchToNavigation();
        }
            
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // Call method to show all properties
            showMaintenances();
        } catch (SQLException ex) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public ObservableList<Maintenance> getMaintenancesList() throws SQLException{
        ObservableList<Maintenance> maintenanceList = FXCollections.observableArrayList();
        conn = DBConnector.getDBconnection();
        String query = "SELECT * FROM maintenance";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Maintenance maintenances;
            while(rs.next()){
                maintenances = new Maintenance(rs.getInt("maintenance_id"), rs.getString("name"), rs.getDouble("cost"), rs.getString("contractor"),rs.getString("contractorphone"), rs.getInt("property_id"));
                maintenanceList.add(maintenances);
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return maintenanceList;
        
    }
    
     public void showMaintenances() throws SQLException{
        conn = DBConnector.getDBconnection();

        ObservableList<Maintenance> list = getMaintenancesList();
        
        colId.setCellValueFactory(new PropertyValueFactory<Maintenance, Integer>("maintenance_id"));
        colName.setCellValueFactory(new PropertyValueFactory<Maintenance, String>("name"));
        colCost.setCellValueFactory(new PropertyValueFactory<Maintenance, Double>("cost"));
        colContractor.setCellValueFactory(new PropertyValueFactory<Maintenance, String>("contractor"));
        colContractorphone.setCellValueFactory(new PropertyValueFactory<Maintenance, String>("contractorphone"));
        colPid.setCellValueFactory(new PropertyValueFactory<Maintenance, Integer>("property_id"));
        
        tvMaintenances.setItems(list);
    }
     
    private void insertRecord() throws SQLException{
        
        String query = "INSERT into maintenance (maintenance_id, name, cost, contractor, contractorphone, property_id) VALUES (" 
                + tfId.getText() + ",'" + tfName.getText() + "','" + tfCost.getText() + "','"
                + tfContractor.getText() + "','" + tfContractorphone.getText() + "','" + tfPid.getText() + "')";
        System.out.println(query);
        executeQuery(query);
        showMaintenances();

    }
    
    private void updateRecord() throws SQLException{
        String query = "UPDATE  maintenance SET name  = '" + tfName.getText() + "', cost = '" + tfCost.getText() + "', contractor = '" +
                tfContractor.getText() + "', contractorphone = '" + tfContractorphone.getText() + "', property_id = '" + tfPid.getText() +  "' WHERE maintenance_id = " + tfId.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showMaintenances();
    }
    
    private void deleteButton() throws SQLException{
        String query = "DELETE FROM maintenance WHERE maintenance_id =" + tfId.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showMaintenances();
    }
    
    private void executeQuery(String query) throws SQLException {
        conn = DBConnector.getDBconnection();
        Statement st;
        
        try{
            st = conn.createStatement();
            st.executeUpdate(query);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
