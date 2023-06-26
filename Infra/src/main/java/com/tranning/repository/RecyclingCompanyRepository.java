package com.tranning.repository;

import com.plasticTracker.model.RecyclingCompany;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecyclingCompanyRepository extends MongoRepository<RecyclingCompany, Integer> {

}
