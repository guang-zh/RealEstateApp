/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.realestateapp;

import java.util.Date;
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
public class BankTest {
    
    public BankTest() {
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
     * Test of toString method, of class Bank.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bank instance = new Bank();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBank_id method, of class Bank.
     */
    @Test
    public void testGetBank_id() {
        System.out.println("getBank_id");
        Bank instance = new Bank();
        int expResult = 0;
        int result = instance.getBank_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBank_id method, of class Bank.
     */
    @Test
    public void testSetBank_id() {
        System.out.println("setBank_id");
        int bank_id = 0;
        Bank instance = new Bank();
        instance.setBank_id(bank_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Bank.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Bank instance = new Bank();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Bank.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Bank instance = new Bank();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestratedate method, of class Bank.
     */
    @Test
    public void testGetInterestratedate() {
        System.out.println("getInterestratedate");
        Bank instance = new Bank();
        Date expResult = null;
        Date result = instance.getInterestratedate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInterestratedate method, of class Bank.
     */
    @Test
    public void testSetInterestratedate() {
        System.out.println("setInterestratedate");
        Date interestratedate = null;
        Bank instance = new Bank();
        instance.setInterestratedate(interestratedate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestrate method, of class Bank.
     */
    @Test
    public void testGetInterestrate() {
        System.out.println("getInterestrate");
        Bank instance = new Bank();
        Double expResult = null;
        Double result = instance.getInterestrate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInterestrate method, of class Bank.
     */
    @Test
    public void testSetInterestrate() {
        System.out.println("setInterestrate");
        Double interestrate = null;
        Bank instance = new Bank();
        instance.setInterestrate(interestrate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotes method, of class Bank.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        Bank instance = new Bank();
        String expResult = "";
        String result = instance.getNotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotes method, of class Bank.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        String notes = "";
        Bank instance = new Bank();
        instance.setNotes(notes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperty_id method, of class Bank.
     */
    @Test
    public void testGetProperty_id() {
        System.out.println("getProperty_id");
        Bank instance = new Bank();
        int expResult = 0;
        int result = instance.getProperty_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProperty_id method, of class Bank.
     */
    @Test
    public void testSetProperty_id() {
        System.out.println("setProperty_id");
        int property_id = 0;
        Bank instance = new Bank();
        instance.setProperty_id(property_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
