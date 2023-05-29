package com.plasticTracker.service.impl;

import com.plasticTracker.model.RecyclingCompany;
import com.plasticTracker.repository.RecyclingCompanyRepository;
import com.plasticTracker.service.RecyclingCompanyServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RecyclingCompanyServicesImpl implements RecyclingCompanyServices {

    private RecyclingCompanyRepository recyclingCompanyRepository;
    @Override
    public RecyclingCompany createRecyclingCompany(RecyclingCompany recyclingCompany) {
        return recyclingCompanyRepository.save(recyclingCompany);
    }

    @Override
    public List<RecyclingCompany> getAllRecyclingCompanies() {
        return recyclingCompanyRepository.findAll();
    }

    @Override
    public RecyclingCompany getRecyclingCompanybyId(int recyclingCompanyId) {
        return recyclingCompanyRepository.findById(recyclingCompanyId).get();
    }

    @Override
    public RecyclingCompany updateRecyclingCompany(RecyclingCompany recyclingCompany) {
        RecyclingCompany recyclingCompanyExitting = recyclingCompanyRepository.findById(recyclingCompany.getId()).get();
        recyclingCompanyExitting.setNom(recyclingCompany.getNom());
        recyclingCompanyExitting.setAddress(recyclingCompany.getAddress());
        recyclingCompanyExitting.setNumber(recyclingCompany.getNumber());
        recyclingCompanyExitting.setEmail(recyclingCompany.getEmail());
        recyclingCompanyExitting.setQuantity(recyclingCompany.getQuantity());

        return recyclingCompanyRepository.save(recyclingCompanyExitting);
    }

    @Override
    public void deleteRecyclingCompany(int recyclingCompanyId) {
        recyclingCompanyRepository.deleteById(recyclingCompanyId);
    }
}
