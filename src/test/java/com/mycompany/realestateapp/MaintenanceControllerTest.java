/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.realestateapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 1
 */
public class MaintenanceControllerTest {
    
    public MaintenanceControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of initialize method, of class MaintenanceController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        MaintenanceController instance = new MaintenanceController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaintenancesList method, of class MaintenanceController.
     */
    @Test
    public void testGetMaintenancesList() throws Exception {
        System.out.println("getMaintenancesList");
        MaintenanceController instance = new MaintenanceController();
        ObservableList<Maintenance> expResult = null;
        ObservableList<Maintenance> result = instance.getMaintenancesList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMaintenances method, of class MaintenanceController.
     */
    @Test
    public void testShowMaintenances() throws Exception {
        System.out.println("showMaintenances");
        MaintenanceController instance = new MaintenanceController();
        instance.showMaintenances();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
