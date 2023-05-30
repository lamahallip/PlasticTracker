package com.plasticTracker.service.impl;

import com.plasticTracker.model.PriceReference;
import com.plasticTracker.repository.PriceReferenceRepository;
import com.plasticTracker.service.PriceReferenceServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PriceReferenceServicesImpl implements PriceReferenceServices {

    @Autowired
    private PriceReferenceRepository priceReferenceRepository;


    @Override
    public PriceReference createPriceReference(PriceReference priceReference) {
        return priceReferenceRepository.save(priceReference);
    }

    @Override
    public List<PriceReference> getAllPriceReferences() {
        return priceReferenceRepository.findAll();
    }

    @Override
    public PriceReference getPriceReferencebyId(int priceReferenceId) {
        return priceReferenceRepository.findById(priceReferenceId).get();
    }

    @Override
    public PriceReference updatePriceReference(PriceReference priceReference) {

        PriceReference priceReferenceExiting = priceReferenceRepository.findById(priceReference.getId()).get();
        priceReferenceExiting.setPrice(priceReferenceExiting.getPrice());
        priceReferenceExiting.setDate_updated(priceReferenceExiting.getDate_updated());

        return priceReferenceRepository.save(priceReferenceExiting);
    }

    @Override
    public void deletePriceReference(int priceReferenceId) {

        priceReferenceRepository.deleteById(priceReferenceId);

    }
}
