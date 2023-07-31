package com.example.assignment2gc3629remastered;

import com.google.gson.annotations.SerializedName;

public class ApiResponse {
    @SerializedName("data")
    private Company[] companyData;

    public Company[] getCompanyData() {
        return companyData;
    }
}
