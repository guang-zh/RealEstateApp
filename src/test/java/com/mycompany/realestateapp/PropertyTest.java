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
public class PropertyTest {
    
    public PropertyTest() {
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
     * Test of toString method, of class Property.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Property instance = new Property();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperty_id method, of class Property.
     */
    @Test
    public void testGetProperty_id() {
        System.out.println("getProperty_id");
        Property instance = new Property();
        int expResult = 0;
        int result = instance.getProperty_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Property.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Property instance = new Property();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Property.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Property instance = new Property();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class Property.
     */
    @Test
    public void testGetOwner() {
        System.out.println("getOwner");
        Property instance = new Property();
        String expResult = "";
        String result = instance.getOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Property.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Property instance = new Property();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPostalcode method, of class Property.
     */
    @Test
    public void testGetPostalcode() {
        System.out.println("getPostalcode");
        Property instance = new Property();
        String expResult = "";
        String result = instance.getPostalcode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProperty_id method, of class Property.
     */
    @Test
    public void testSetProperty_id() {
        System.out.println("setProperty_id");
        int property_id = 0;
        Property instance = new Property();
        instance.setProperty_id(property_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Property.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Property instance = new Property();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Property.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Property instance = new Property();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOwner method, of class Property.
     */
    @Test
    public void testSetOwner() {
        System.out.println("setOwner");
        String owner = "";
        Property instance = new Property();
        instance.setOwner(owner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Property.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Property instance = new Property();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPostalcode method, of class Property.
     */
    @Test
    public void testSetPostalcode() {
        System.out.println("setPostalcode");
        String postalcode = "";
        Property instance = new Property();
        instance.setPostalcode(postalcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
