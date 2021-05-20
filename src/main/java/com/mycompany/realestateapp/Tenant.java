/*
 * Tenant Class
 */
package com.mycompany.realestateapp;

import java.util.Date;
import javafx.scene.control.Button;

/**
 *
 * @author guang
 */
public class Tenant {
    
    private int tenant_id;
    private String fname;
    private String lname;
    private String phone;
    private String gender;
    private String property_id;

    public Tenant(){
       
    }

    public Tenant(int tenant_id, String fname, String lname, String phone, String gender, String property_id) {
        this.tenant_id = tenant_id;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.gender = gender;
        this.property_id = property_id;
    }

    @Override
    public String toString() {
        return "Tenant{" + "tenant_id=" + tenant_id + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", gender=" + gender + ", property_id=" + property_id + '}';
    }
    

    public int getTenant_id() {
        return tenant_id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getProperty_id() {
        return property_id;
    }

    public void setTenant_id(int tenant_id) {
        this.tenant_id = tenant_id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setProperty_id(String property_id) {
        this.property_id = property_id;
    }
    
    
      
}
