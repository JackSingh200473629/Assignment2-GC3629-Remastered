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
}
