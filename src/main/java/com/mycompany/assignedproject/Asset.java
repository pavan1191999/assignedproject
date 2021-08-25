/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignedproject;

/**
 *
 * @author pavan.reddy
 */
public class Asset {
    int id;
    Address address;
    double area;
    Farmer ownerid;

    public Asset(int id, Address address, double area) {
        this.id = id;
        this.address = address;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Farmer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Farmer ownerid) {
        this.ownerid = ownerid;
    }

    @Override
    public String toString() {
        return "Asset{" + "id=" + id + ", address=" + address + ", area=" + area + ", ownerid=" + ownerid + '}';
    }
    
}
