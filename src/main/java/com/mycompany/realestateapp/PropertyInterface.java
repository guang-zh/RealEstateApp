/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.realestateapp;

/**
 *
 * @author guang
 */
public interface PropertyInterface {

    String getAddress();

    String getName();

    String getOwner();

    String getPostalcode();

    int getProperty_id();

    String getType();

    void setAddress(String address);

    void setName(String name);

    void setOwner(String owner);

    void setPostalcode(String postalcode);

    void setProperty_id(int property_id);

    void setType(String type);

    String toString();
    
}
