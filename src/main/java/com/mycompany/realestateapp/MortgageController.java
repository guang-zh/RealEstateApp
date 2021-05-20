/*
 * MortgagesController class for Mortgages and associated interest rates
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
public class MortgageController implements Initializable {
    
    @FXML
    private void switchToNavigation() throws IOException {
        App.setRoot("NavigationPage");
    }
    
    @FXML
    private TextField tfId;
    @FXML
    private TextField tfDownpayment;
    @FXML
    private TextField tfMonthlypayment;
    @FXML
    private TextField tfStartdate;
    @FXML
    private TextField tfEnddate;
    @FXML
    private TextField tfPid;
    
    @FXML
    private TableView<Mortgage> tvMortgages;
    @FXML
    private TableColumn<Mortgage, Integer> colId;
    @FXML
    private TableColumn<Mortgage, Integer> colDownpayment;
    @FXML
    private TableColumn<Mortgage, Integer> colMonthlypayment;
    @FXML
    private TableColumn<Mortgage, String> colStartdate;
    @FXML
    private TableColumn<Mortgage, String> colEnddate;
    @FXML
    private TableColumn<Mortgage, Integer> colPid;
    
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
            showMortgages();
        } catch (SQLException ex) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
     public ObservableList<Mortgage> getMortgagesList() throws SQLException{
        ObservableList<Mortgage> mortgageList = FXCollections.observableArrayList();
        conn = DBConnector.getDBconnection();
        String query = "SELECT * FROM mortgage";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Mortgage mortgages;
            while(rs.next()){
                mortgages = new Mortgage(rs.getInt("mortgage_id"), rs.getInt("downpayment"), rs.getInt("monthlypayment"), rs.getString("start_date"),rs.getString("end_date"), rs.getInt("property_id"));
                mortgageList.add(mortgages);
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return mortgageList;
        
    }
    
     public void showMortgages() throws SQLException{
        conn = DBConnector.getDBconnection();

        ObservableList<Mortgage> list = getMortgagesList();
        
        colId.setCellValueFactory(new PropertyValueFactory<Mortgage, Integer>("mortgage_id"));
        colDownpayment.setCellValueFactory(new PropertyValueFactory<Mortgage, Integer>("downpayment"));
        colMonthlypayment.setCellValueFactory(new PropertyValueFactory<Mortgage, Integer>("monthlypayment"));
        colStartdate.setCellValueFactory(new PropertyValueFactory<Mortgage, String>("start_date"));
        colEnddate.setCellValueFactory(new PropertyValueFactory<Mortgage, String>("end_date"));
        colPid.setCellValueFactory(new PropertyValueFactory<Mortgage, Integer>("property_id"));
        
        tvMortgages.setItems(list);
    }
     
    private void insertRecord() throws SQLException{
        
        String query = "INSERT into mortgage (mortgage_id, downpayment, monthlypayment, start_date, end_date, property_id) VALUES (" 
                + tfId.getText() + ",'" + tfDownpayment.getText() + "','" + tfMonthlypayment.getText() + "','"
                + tfStartdate.getText() + "','" + tfEnddate.getText() + "','" + tfPid.getText() + "')";
        System.out.println(query);
        executeQuery(query);
        showMortgages();

    }
    
    private void updateRecord() throws SQLException{
        String query = "UPDATE  mortgage SET downpayment  = '" + tfDownpayment.getText() + "', monthlypayment = '" + tfMonthlypayment.getText() + "', start_date = '" +
                tfStartdate.getText() + "', end_date = '" + tfEnddate.getText() + "', property_id = '" + tfPid.getText() +  "' WHERE mortgage_id = " + tfId.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showMortgages();
    }
    
    private void deleteButton() throws SQLException{
        String query = "DELETE FROM mortgage WHERE mortgage_id =" + tfId.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showMortgages();
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
