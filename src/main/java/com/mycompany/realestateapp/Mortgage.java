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
public class Mortgage {
    
    private int mortgage_id;
    private int downpayment;
    private int monthlypayment;
    private String start_date;
    private String end_date;
    private int property_id;

    public Mortgage() {
    }

    public Mortgage(int mortgage_id, int downpayment, int monthlypayment, String start_date, String end_date, int property_id) {
        this.mortgage_id = mortgage_id;
        this.downpayment = downpayment;
        this.monthlypayment = monthlypayment;
        this.start_date = start_date;
        this.end_date = end_date;
        this.property_id = property_id;
    }

    public int getMortgage_id() {
        return mortgage_id;
    }

    public void setMortgage_id(int mortgage_id) {
        this.mortgage_id = mortgage_id;
    }

    public int getDownpayment() {
        return downpayment;
    }

    public void setDownpayment(int downpayment) {
        this.downpayment = downpayment;
    }

    public int getMonthlypayment() {
        return monthlypayment;
    }

    public void setMonthlypayment(int monthlypayment) {
        this.monthlypayment = monthlypayment;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }
    
    
    
    
}
