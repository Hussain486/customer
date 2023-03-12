package com.a2z.customer.model;



public class Customer {

    int custId;

    String custName;

    String custEmail;

    String custLocation;

    public Customer() {
    }

    public Customer(int custId, String custName, String custEmail, String custLocation, int custAge) {
        this.custId = custId;
        this.custName = custName;
        this.custEmail = custEmail;
        this.custLocation = custLocation;
        this.custAge = custAge;
    }

    int custAge;



    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custEmail='" + custEmail + '\'' +
                ", custLocation='" + custLocation + '\'' +
                ", custAge=" + custAge +
                '}';
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustLocation() {
        return custLocation;
    }

    public void setCustLocation(String custLocation) {
        this.custLocation = custLocation;
    }

    public int getCustAge() {
        return custAge;
    }

    public void setCustAge(int custAge) {
        this.custAge = custAge;
    }





}
