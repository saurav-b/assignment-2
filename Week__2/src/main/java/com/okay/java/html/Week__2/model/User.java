package com.okay.java.html.Week__2.model;

public class User {
    private String fname;
    private String lname;
    private String email;
    private String passwd;
    private String phone;
    private String address;
    private String gender;

    // Getters and setters for all fields

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + ", passwd=" + passwd + 
               ", phone=" + phone + ", address=" + address + ", gender=" + gender + "]";
    }
}
