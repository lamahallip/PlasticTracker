package com.plasticTracker.service;

import com.plasticTracker.model.RecyclingCompany;
import com.plasticTracker.model.User;

import java.util.List;

public interface RecyclingCompanyServices {
    RecyclingCompany createRecyclingCompany(RecyclingCompany recyclingCompany);
    List<RecyclingCompany> getAllRecyclingCompanies();
    RecyclingCompany getRecyclingCompanybyId (int recyclingCompanyId);
    RecyclingCompany updateRecyclingCompany(RecyclingCompany recyclingCompany);
    void deleteRecyclingCompany(int recyclingCompanyId);

}
