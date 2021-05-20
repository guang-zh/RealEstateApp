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
public class MortgageTest {
    
    public MortgageTest() {
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
     * Test of getMortgage_id method, of class Mortgage.
     */
    @Test
    public void testGetMortgage_id() {
        System.out.println("getMortgage_id");
        Mortgage instance = new Mortgage();
        int expResult = 0;
        int result = instance.getMortgage_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMortgage_id method, of class Mortgage.
     */
    @Test
    public void testSetMortgage_id() {
        System.out.println("setMortgage_id");
        int mortgage_id = 0;
        Mortgage instance = new Mortgage();
        instance.setMortgage_id(mortgage_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDownpayment method, of class Mortgage.
     */
    @Test
    public void testGetDownpayment() {
        System.out.println("getDownpayment");
        Mortgage instance = new Mortgage();
        int expResult = 0;
        int result = instance.getDownpayment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDownpayment method, of class Mortgage.
     */
    @Test
    public void testSetDownpayment() {
        System.out.println("setDownpayment");
        int downpayment = 0;
        Mortgage instance = new Mortgage();
        instance.setDownpayment(downpayment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonthlypayment method, of class Mortgage.
     */
    @Test
    public void testGetMonthlypayment() {
        System.out.println("getMonthlypayment");
        Mortgage instance = new Mortgage();
        int expResult = 0;
        int result = instance.getMonthlypayment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonthlypayment method, of class Mortgage.
     */
    @Test
    public void testSetMonthlypayment() {
        System.out.println("setMonthlypayment");
        int monthlypayment = 0;
        Mortgage instance = new Mortgage();
        instance.setMonthlypayment(monthlypayment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart_date method, of class Mortgage.
     */
    @Test
    public void testGetStart_date() {
        System.out.println("getStart_date");
        Mortgage instance = new Mortgage();
        String expResult = "";
        String result = instance.getStart_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStart_date method, of class Mortgage.
     */
    @Test
    public void testSetStart_date() {
        System.out.println("setStart_date");
        String start_date = "";
        Mortgage instance = new Mortgage();
        instance.setStart_date(start_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnd_date method, of class Mortgage.
     */
    @Test
    public void testGetEnd_date() {
        System.out.println("getEnd_date");
        Mortgage instance = new Mortgage();
        String expResult = "";
        String result = instance.getEnd_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnd_date method, of class Mortgage.
     */
    @Test
    public void testSetEnd_date() {
        System.out.println("setEnd_date");
        String end_date = "";
        Mortgage instance = new Mortgage();
        instance.setEnd_date(end_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperty_id method, of class Mortgage.
     */
    @Test
    public void testGetProperty_id() {
        System.out.println("getProperty_id");
        Mortgage instance = new Mortgage();
        int expResult = 0;
        int result = instance.getProperty_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProperty_id method, of class Mortgage.
     */
    @Test
    public void testSetProperty_id() {
        System.out.println("setProperty_id");
        int property_id = 0;
        Mortgage instance = new Mortgage();
        instance.setProperty_id(property_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
