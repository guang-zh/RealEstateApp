/*
 * Properties Controller Class 
 * Connection to MySQL Database and Update Properties Information
 * property_id as foreign key for Tenants, Maintenance, Leases, Banks, Mortgages
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
public class PropertiesController implements Initializable {
    
    @FXML
    private void switchToNavigation() throws IOException {
        App.setRoot("NavigationPage");
    }
    
    @FXML
    private TextField tfID;
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfType;
    @FXML
    private TextField tfOwner;
    @FXML
    private TextField tfPostalCode;
    @FXML
    private TextField tfAddress;
    
    @FXML
    private TableView<Property> tvProperties;
    @FXML
    private TableColumn<Property, Integer> colId;
    @FXML
    private TableColumn<Property, String> colName;
    @FXML
    private TableColumn<Property, String> colType;
    @FXML
    private TableColumn<Property, String> colOwner;
    @FXML
    private TableColumn<Property, String> colPostalCode;
    @FXML
    private TableColumn<Property, String> colAddress;
    
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
            showProperties();
        } catch (SQLException ex) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ObservableList<Property> getPropertiesList() throws SQLException{
        ObservableList<Property> propertyList = FXCollections.observableArrayList();
        conn = DBConnector.getDBconnection();
        String query = "SELECT * FROM properties";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Property properties;
            while(rs.next()){
                properties = new Property(rs.getInt("property_id"), rs.getString("name"), rs.getString("type"), rs.getString("owner"),rs.getString("address"), rs.getString("postalcode"));
                propertyList.add(properties);
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return propertyList;
        
    }
    
    public void showProperties() throws SQLException{
        conn = DBConnector.getDBconnection();

        ObservableList<Property> list = getPropertiesList();
        
        colId.setCellValueFactory(new PropertyValueFactory<Property, Integer>("property_id"));
        colName.setCellValueFactory(new PropertyValueFactory<Property, String>("name"));
        colType.setCellValueFactory(new PropertyValueFactory<Property, String>("type"));
        colOwner.setCellValueFactory(new PropertyValueFactory<Property, String>("owner"));
        colPostalCode.setCellValueFactory(new PropertyValueFactory<Property, String>("postalcode"));
        colAddress.setCellValueFactory(new PropertyValueFactory<Property, String>("address"));
        
        tvProperties.setItems(list);
    }
    
    private void insertRecord() throws SQLException{
        
        String query = "INSERT into properties (property_id, name, type, owner, address, postalcode) VALUES (" 
                + tfID.getText() + ",'" + tfName.getText() + "','" + tfType.getText() + "','"
                + tfOwner.getText() + "','" + tfAddress.getText() + "','" + tfPostalCode.getText() + "')";
        System.out.println(query);
        executeQuery(query);
        showProperties();

    }
    
     private void updateRecord() throws SQLException{
        String query = "UPDATE  properties SET name  = '" + tfName.getText() + "', type = '" + tfType.getText() + "', owner = '" +
                tfOwner.getText() + "', postalcode = '" + tfPostalCode.getText() + "' WHERE property_id = " + tfID.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showProperties();
    }
    
    private void deleteButton() throws SQLException{
        String query = "DELETE FROM properties WHERE property_id =" + tfID.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showProperties();
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
    
    
//    @FXML
//    private void showConfirmAlert(ActionEvent e) {
//        Alert alert = new Alert (AlertType.CONFIRMATION);
//        alert.setContentText("Please confirm if you want to continue the action");
//        alert.show()
//    }
//    
//    @FXML
//    private void showWarningAlert(ActionEvent e) {
//        Alert alert = new Alert (AlertType.WARNING);
//        alert.setContentText("Warning: please verify before continue");
//        alert.show()
//    }
}
