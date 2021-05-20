/*
 * LeasesController class for Leases and associated tenants and properties
 * Link to Properties Table with property_id
 * Link to Tenants Table with tenant_id
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
public class LeasesController implements Initializable {
    
    @FXML
    private void switchToNavigation() throws IOException {
        App.setRoot("NavigationPage");
    }
    
    @FXML
    private TextField tfId;
    @FXML
    private TextField tfTid;
    @FXML
    private TextField tfStartdate;
    @FXML
    private TextField tfEnddate;
    @FXML
    private TextField tfPdf;
    @FXML
    private TextField tfPid;
    
    @FXML
    private TableView<Lease> tvLeases;
    @FXML
    private TableColumn<Lease, Integer> colId;
    @FXML
    private TableColumn<Lease, Integer> colTid;
    @FXML
    private TableColumn<Lease, String> colStartdate;
    @FXML
    private TableColumn<Lease, String> colEnddate;
    @FXML
    private TableColumn<Lease, String> colPdf;
    @FXML
    private TableColumn<Lease, Integer> colPid;
    
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
            // Call method to show all leases
            showLeases();
        } catch (SQLException ex) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public ObservableList<Lease> getLeasesList() throws SQLException{
        ObservableList<Lease> leaseList = FXCollections.observableArrayList();
        conn = DBConnector.getDBconnection();
        String query = "SELECT * FROM lease";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Lease leases;
            while(rs.next()){
                leases = new Lease(rs.getInt("lease_id"), rs.getInt("tenant_id"), rs.getDate("start_date"), rs.getDate("end_date"),rs.getString("pdf"), rs.getInt("property_id"));
                leaseList.add(leases);
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return leaseList;
        
    }
    
     public void showLeases() throws SQLException{
        conn = DBConnector.getDBconnection();

        ObservableList<Lease> list = getLeasesList();
        
        colId.setCellValueFactory(new PropertyValueFactory<Lease, Integer>("lease_id"));
        colTid.setCellValueFactory(new PropertyValueFactory<Lease, Integer>("tenant_id"));
        colStartdate.setCellValueFactory(new PropertyValueFactory<Lease, String>("start_date"));
        colEnddate.setCellValueFactory(new PropertyValueFactory<Lease, String>("end_date"));
        colPdf.setCellValueFactory(new PropertyValueFactory<Lease, String>("pdf"));
        colPid.setCellValueFactory(new PropertyValueFactory<Lease, Integer>("property_id"));
        
        tvLeases.setItems(list);
    }
     
    private void insertRecord() throws SQLException{
        
        String query = "INSERT into lease (lease_id, tenant_id, start_date, end_date, pdf, property_id) VALUES (" 
                + tfId.getText() + ",'" + tfTid.getText() + "','" + tfStartdate.getText() + "','"
                + tfEnddate.getText() + "','" + tfPdf.getText() + "','" + tfPid.getText() + "')";
        System.out.println(query);
        executeQuery(query);
        showLeases();

    }
    
    private void updateRecord() throws SQLException{
        String query = "UPDATE  lease SET tenant_id  = '" + tfTid.getText() + "', start_date = '" + tfStartdate.getText() + "', end_date = '" +
                tfEnddate.getText() + "', pdf = '" + tfPdf.getText() + "', property_id = '" + tfPid.getText() +  "' WHERE lease_id = " + tfId.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showLeases();
    }
    
    private void deleteButton() throws SQLException{
        String query = "DELETE FROM lease WHERE lease_id =" + tfId.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showLeases();
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
