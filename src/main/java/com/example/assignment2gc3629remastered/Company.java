package com.example.assignment2gc3629remastered;

import com.google.gson.annotations.SerializedName;

public class Company {
    private int id;
    private String name;
    private String email;
    @SerializedName("vat")
    private String companyNumber;
    private String phone;
    private String country;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }
}
