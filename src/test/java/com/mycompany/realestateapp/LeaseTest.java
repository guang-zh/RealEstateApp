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
public class LeaseTest {
    
    public LeaseTest() {
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
     * Test of getLease_id method, of class Lease.
     */
    @Test
    public void testGetLease_id() {
        System.out.println("getLease_id");
        Lease instance = new Lease();
        int expResult = 0;
        int result = instance.getLease_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLease_id method, of class Lease.
     */
    @Test
    public void testSetLease_id() {
        System.out.println("setLease_id");
        int lease_id = 0;
        Lease instance = new Lease();
        instance.setLease_id(lease_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTenant_id method, of class Lease.
     */
    @Test
    public void testGetTenant_id() {
        System.out.println("getTenant_id");
        Lease instance = new Lease();
        int expResult = 0;
        int result = instance.getTenant_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTenant_id method, of class Lease.
     */
    @Test
    public void testSetTenant_id() {
        System.out.println("setTenant_id");
        int tenant_id = 0;
        Lease instance = new Lease();
        instance.setTenant_id(tenant_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart_date method, of class Lease.
     */
    @Test
    public void testGetStart_date() {
        System.out.println("getStart_date");
        Lease instance = new Lease();
        Date expResult = null;
        Date result = instance.getStart_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStart_date method, of class Lease.
     */
    @Test
    public void testSetStart_date() {
        System.out.println("setStart_date");
        Date start_date = null;
        Lease instance = new Lease();
        instance.setStart_date(start_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnd_date method, of class Lease.
     */
    @Test
    public void testGetEnd_date() {
        System.out.println("getEnd_date");
        Lease instance = new Lease();
        Date expResult = null;
        Date result = instance.getEnd_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnd_date method, of class Lease.
     */
    @Test
    public void testSetEnd_date() {
        System.out.println("setEnd_date");
        Date end_date = null;
        Lease instance = new Lease();
        instance.setEnd_date(end_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPdf method, of class Lease.
     */
    @Test
    public void testGetPdf() {
        System.out.println("getPdf");
        Lease instance = new Lease();
        String expResult = "";
        String result = instance.getPdf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPdf method, of class Lease.
     */
    @Test
    public void testSetPdf() {
        System.out.println("setPdf");
        String pdf = "";
        Lease instance = new Lease();
        instance.setPdf(pdf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperty_id method, of class Lease.
     */
    @Test
    public void testGetProperty_id() {
        System.out.println("getProperty_id");
        Lease instance = new Lease();
        int expResult = 0;
        int result = instance.getProperty_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProperty_id method, of class Lease.
     */
    @Test
    public void testSetProperty_id() {
        System.out.println("setProperty_id");
        int property_id = 0;
        Lease instance = new Lease();
        instance.setProperty_id(property_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
