/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.realestateapp;
import java.util.Date;
import javafx.scene.control.Button;

/**
 *
 * @author guang
 */
public class Condo implements PropertyInterface {
    
    private int property_id;
    private String name;
    private String type;
    private String owner;
    private String address;
    private String postalcode;

    public Condo(){
       
    }

    public Condo(int property_id, String name, String type, String owner, String address, String postalcode) {
        this.property_id = property_id;
        this.name = name;
        this.type = type;
        this.owner = owner;
        this.address = address;
        this.postalcode = postalcode;
    }

    @Override
    public String toString() {
        return "Property{" + "property_id=" + property_id + ", name=" + name + ", type=" + type + ", owner=" + owner + ", address=" + address + ", postalcode=" + postalcode + '}';
    }

    @Override
    public int getProperty_id() {
        return property_id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getPostalcode() {
        return postalcode;
    }

    @Override
    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
    
    
    
    
}
