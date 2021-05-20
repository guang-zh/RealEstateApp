/*
 * Bank class for Banking Information related to Interest Rates
 */
package com.mycompany.realestateapp;

import java.util.Date;

/**
 *
 * @author guang
 */
public class Bank {
    
    private int bank_id;
    private String name;
    private Date interestratedate;
    private Double interestrate;
    private String notes;
    private int property_id;

    public Bank() {
    }

    public Bank(int bank_id, String name, Date interestratedate, Double interestrate, String notes, int property_id) {
        this.bank_id = bank_id;
        this.name = name;
        this.interestratedate = interestratedate;
        this.interestrate = interestrate;
        this.notes = notes;
        this.property_id = property_id;
    }

    @Override
    public String toString() {
        return "Bank{" + "bank_id=" + bank_id + ", name=" + name + ", interestratedate=" + interestratedate + ", interestrate=" + interestrate + ", notes=" + notes + ", property_id=" + property_id + '}';
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInterestratedate() {
        return interestratedate;
    }

    public void setInterestratedate(Date interestratedate) {
        this.interestratedate = interestratedate;
    }

    public Double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(Double interestrate) {
        this.interestrate = interestrate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }
    
    
    
    
}
