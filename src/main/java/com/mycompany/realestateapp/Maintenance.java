/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.realestateapp;

import java.util.Date;

/**
 *
 * @author guang
 */
public class Maintenance {
    
    private int maintenance_id;
    private String name;
    private double cost;
    private String contractor;
    private String contractorphone;
    private int property_id;

    public Maintenance() {
    }

    public Maintenance(int maintenance_id, String name, double cost, String contractor, String contractorphone, int property_id) {
        this.maintenance_id = maintenance_id;
        this.name = name;
        this.cost = cost;
        this.contractor = contractor;
        this.contractorphone = contractorphone;
        this.property_id = property_id;
    }

    public int getMaintenance_id() {
        return maintenance_id;
    }

    public void setMaintenance_id(int maintenance_id) {
        this.maintenance_id = maintenance_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getContractorphone() {
        return contractorphone;
    }

    public void setContractorphone(String contractorphone) {
        this.contractorphone = contractorphone;
    }

    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }

    
    
    
    
    
}
