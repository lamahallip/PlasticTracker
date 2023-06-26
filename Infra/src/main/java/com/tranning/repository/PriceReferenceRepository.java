package com.tranning.repository;

import com.plasticTracker.model.PriceReference;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PriceReferenceRepository extends MongoRepository<PriceReference, Integer> {

}
