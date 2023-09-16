package org.example.models;

import org.example.enums.DESIGNATION;
import org.example.enums.GENDER;
import org.example.enums.ROLE;


public class Staff extends Person{
    private int staffNo;
    private DESIGNATION designation;
    private Double walletAmount;


    public Staff() {
        super();
    }

    public Staff(int staffNo, DESIGNATION designation, Double walletAmount) {
        this.staffNo = staffNo;
        this.designation = designation;
        this.walletAmount = walletAmount;
    }

    public Staff(String name, String email, GENDER gender, ROLE role, int staffNo, DESIGNATION designation, Double walletAmount) {
        super(name, email, gender, role);
        this.staffNo = staffNo;
        this.designation = designation;
        this.walletAmount = walletAmount;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public DESIGNATION getDesignation() {
        return designation;
    }

    public void setDesignation(DESIGNATION designation) {
        this.designation = designation;
    }

    public Double getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(Double walletAmount) {
        this.walletAmount = walletAmount;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "staffNo=" + staffNo +
                ", designation=" + designation +
                ", walletAmount=" + walletAmount +
                "} " + super.toString();
    }
}

