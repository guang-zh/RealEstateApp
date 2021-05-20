/*
 * BanksController class for Banks and associated interest rates
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
public class BanksController implements Initializable {
    
    @FXML
    private void switchToNavigation() throws IOException {
        App.setRoot("NavigationPage");
    }
    
    @FXML
    private TextField tfId;
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfInterestratedate;
    @FXML
    private TextField tfInterestrate;
    @FXML
    private TextField tfNotes;
    @FXML
    private TextField tfPid;
    
    @FXML
    private TableView<Bank> tvBanks;
    @FXML
    private TableColumn<Bank, Integer> colId;
    @FXML
    private TableColumn<Bank, String> colName;
    @FXML
    private TableColumn<Bank, String> colInterestratedate;
    @FXML
    private TableColumn<Bank, Double> colInterestrate;
    @FXML
    private TableColumn<Bank, String> colNotes;
    @FXML
    private TableColumn<Bank, Integer> colPid;
    
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
            // Call method to show all banks
            showBanks();
        } catch (SQLException ex) {
            Logger.getLogger(PropertiesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public ObservableList<Bank> getBanksList() throws SQLException{
        ObservableList<Bank> bankList = FXCollections.observableArrayList();
        conn = DBConnector.getDBconnection();
        String query = "SELECT * FROM banks";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Bank banks;
            while(rs.next()){
                banks = new Bank(rs.getInt("bank_id"), rs.getString("name"), rs.getDate("interestratedate"), rs.getDouble("interestrate"),rs.getString("notes"), rs.getInt("property_id"));
                bankList.add(banks);
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return bankList;
        
    }
    
     public void showBanks() throws SQLException{
        conn = DBConnector.getDBconnection();

        ObservableList<Bank> list = getBanksList();
        
        colId.setCellValueFactory(new PropertyValueFactory<Bank, Integer>("bank_id"));
        colName.setCellValueFactory(new PropertyValueFactory<Bank, String>("name"));
        colInterestratedate.setCellValueFactory(new PropertyValueFactory<Bank, String>("interestratedate"));
        colInterestrate.setCellValueFactory(new PropertyValueFactory<Bank, Double>("interestrate"));
        colNotes.setCellValueFactory(new PropertyValueFactory<Bank, String>("notes"));
        colPid.setCellValueFactory(new PropertyValueFactory<Bank, Integer>("property_id"));
        
        tvBanks.setItems(list);
    }
     
    private void insertRecord() throws SQLException{
        
        String query = "INSERT into banks (bank_id, name, interestratedate, interestrate, notes, property_id) VALUES (" 
                + tfId.getText() + ",'" + tfName.getText() + "','" + tfInterestratedate.getText() + "','"
                + tfInterestrate.getText() + "','" + tfNotes.getText() + "','" + tfPid.getText() + "')";
        System.out.println(query);
        executeQuery(query);
        showBanks();

    }
    
    private void updateRecord() throws SQLException{
        String query = "UPDATE  banks SET name  = '" + tfName.getText() + "', interestratedate = '" + tfInterestratedate.getText() + "', interestrate = '" +
                tfInterestrate.getText() + "', notes = '" + tfNotes.getText() + "', property_id = '" + tfPid.getText() +  "' WHERE bank_id = " + tfId.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showBanks();
    }
    
    private void deleteButton() throws SQLException{
        String query = "DELETE FROM banks WHERE bank_id =" + tfId.getText() + "";
        System.out.println(query);
        executeQuery(query);
        showBanks();
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
