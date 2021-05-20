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
public class MortgageControllerTest {
    
    public MortgageControllerTest() {
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
     * Test of initialize method, of class MortgageController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        MortgageController instance = new MortgageController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMortgagesList method, of class MortgageController.
     */
    @Test
    public void testGetMortgagesList() throws Exception {
        System.out.println("getMortgagesList");
        MortgageController instance = new MortgageController();
        ObservableList<Mortgage> expResult = null;
        ObservableList<Mortgage> result = instance.getMortgagesList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMortgages method, of class MortgageController.
     */
    @Test
    public void testShowMortgages() throws Exception {
        System.out.println("showMortgages");
        MortgageController instance = new MortgageController();
        instance.showMortgages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
