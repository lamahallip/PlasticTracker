package com.tranning.service;

import com.plasticTracker.model.PriceReference;
import com.plasticTracker.model.User;

import java.util.List;

public interface PriceReferenceServices {
    PriceReference createPriceReference(PriceReference priceReference);
    List<PriceReference> getAllPriceReferences();
    PriceReference getPriceReferencebyId (int priceReferenceId);
    PriceReference updatePriceReference(PriceReference priceReference);
    void deletePriceReference(int priceReferenceId);
}
