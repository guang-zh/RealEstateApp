/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.realestateapp;

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
public class MaintenanceTest {
    
    public MaintenanceTest() {
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
     * Test of getMaintenance_id method, of class Maintenance.
     */
    @Test
    public void testGetMaintenance_id() {
        System.out.println("getMaintenance_id");
        Maintenance instance = new Maintenance();
        int expResult = 0;
        int result = instance.getMaintenance_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaintenance_id method, of class Maintenance.
     */
    @Test
    public void testSetMaintenance_id() {
        System.out.println("setMaintenance_id");
        int maintenance_id = 0;
        Maintenance instance = new Maintenance();
        instance.setMaintenance_id(maintenance_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Maintenance.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Maintenance instance = new Maintenance();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Maintenance.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Maintenance instance = new Maintenance();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCost method, of class Maintenance.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Maintenance instance = new Maintenance();
        double expResult = 0.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCost method, of class Maintenance.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double cost = 0.0;
        Maintenance instance = new Maintenance();
        instance.setCost(cost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContractor method, of class Maintenance.
     */
    @Test
    public void testGetContractor() {
        System.out.println("getContractor");
        Maintenance instance = new Maintenance();
        String expResult = "";
        String result = instance.getContractor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContractor method, of class Maintenance.
     */
    @Test
    public void testSetContractor() {
        System.out.println("setContractor");
        String contractor = "";
        Maintenance instance = new Maintenance();
        instance.setContractor(contractor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContractorphone method, of class Maintenance.
     */
    @Test
    public void testGetContractorphone() {
        System.out.println("getContractorphone");
        Maintenance instance = new Maintenance();
        String expResult = "";
        String result = instance.getContractorphone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContractorphone method, of class Maintenance.
     */
    @Test
    public void testSetContractorphone() {
        System.out.println("setContractorphone");
        String contractorphone = "";
        Maintenance instance = new Maintenance();
        instance.setContractorphone(contractorphone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperty_id method, of class Maintenance.
     */
    @Test
    public void testGetProperty_id() {
        System.out.println("getProperty_id");
        Maintenance instance = new Maintenance();
        int expResult = 0;
        int result = instance.getProperty_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProperty_id method, of class Maintenance.
     */
    @Test
    public void testSetProperty_id() {
        System.out.println("setProperty_id");
        int property_id = 0;
        Maintenance instance = new Maintenance();
        instance.setProperty_id(property_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
