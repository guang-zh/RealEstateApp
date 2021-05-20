/*
 * TenantsController class for Tenants of Properties
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
public class TenantsController implements Initializable {
    
    @FXML
    private void switchToNavigation() throws IOException {
        App.setRoot("NavigationPage");
    }
    
    @FXML
    private TextField tfId;
    @FXML
    private TextField tfFname;
    @FXML
    private TextField tfLname;
    @FXML
    private TextField tfPhone;
    @FXML
    private TextField tfGender;
    @FXML
    private TextField tfPid;
    
    @FXML
    private TableView<Tenant> tvTenants;
    @FXML
    private TableColumn<Tenant, Integer> colId;
    @FXML
    private TableColumn<Tenant, String> colFname;
    @FXML
    private TableColumn<Tenant, String> colLname;
    @FXML
    private TableColumn<Tenant, String> colPhone;
    @FXML
    private TableColumn<Tenant, String> colGender;
    @FXML
    private TableColumn<Tenant, Integer> colPid;
    
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
            showTenants();
        } catch (SQLException ex) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public ObservableList<Tenant> getTenantsList() throws SQLException{
        ObservableList<Tenant> tenantList = FXCollections.observableArrayList();
        conn = DBConnector.getDBconnection();
        String query = "SELECT * FROM tenants";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Tenant tenants;
            while(rs.next()){
                tenants = new Tenant(rs.getInt("tenant_id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("phone"),rs.getString("gender"), rs.getString("property_id"));
                tenantList.add(tenants);
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return tenantList;
        
    }
    
     public void showTenants() throws SQLException{
        conn = DBConnector.getDBconnection();

        ObservableList<Tenant> list = getTenantsList();
        
        colId.setCellValueFactory(new PropertyValueFactory<Tenant, Integer>("tenant_id"));
        colFname.setCellValueFactory(new PropertyValueFactory<Tenant, String>("fname"));
        colLname.setCellValueFactory(new PropertyValueFactory<Tenant, String>("lname"));
        colPhone.setCellValueFactory(new PropertyValueFactory<Tenant, String>("phone"));
        colGender.setCellValueFactory(new PropertyValueFactory<Tenant, String>("gender"));
        colPid.setCellValueFactory(new PropertyValueFactory<Tenant, Integer>("property_id"));
        
        tvTenants.setItems(list);
    }
     
    private void insertRecord() throws SQLException{
        
        String query = "INSERT into tenants (tenant_id, firstname, lastname, phone, gender, property_id) VALUES (" 
                + tfId.getText() + ",'" + tfFname.getText() + "','" + tfLname.getText() + "','"
                + tfPhone.getText() + "','" + tfGender.getText() + "','" + tfPid.getText() + "')";
        System.out.println(query);
        executeQuery(query);
        showTenants();

    }
    
    private void updateRecord() throws SQLException{
        String query = "UPDATE  tenants SET firstname  = '" + tfFname.getText() + "', lastname = '" + tfLname.getText() + "', phone = '" +
                tfPhone.getText() + "', gender = '" + tfGender.getText() + "', property_id = '" + tfPid.getText() +  "' WHERE tenant_id = " + tfId.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showTenants();
    }
    
    private void deleteButton() throws SQLException{
        String query = "DELETE FROM tenants WHERE tenant_id =" + tfId.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showTenants();
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
