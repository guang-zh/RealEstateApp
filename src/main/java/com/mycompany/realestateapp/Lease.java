/*
 * Lease class for Leasing Information related to Tenants and Properties
 */
package com.mycompany.realestateapp;

import java.util.Date;

/**
 *
 * @author guang
 */
public class Lease {
    
    private int lease_id;
    private int tenant_id;
    private Date start_date;
    private Date end_date;
    private String pdf;
    private int property_id;

    public Lease() {
    }

    public Lease(int lease_id, int tenant_id, Date start_date, Date end_date, String pdf, int property_id) {
        this.lease_id = lease_id;
        this.tenant_id = tenant_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.pdf = pdf;
        this.property_id = property_id;
    }

    public int getLease_id() {
        return lease_id;
    }

    public void setLease_id(int lease_id) {
        this.lease_id = lease_id;
    }

    public int getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(int tenant_id) {
        this.tenant_id = tenant_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }

    
    
}
