package com.tranning.controller;

import com.plasticTracker.service.RecyclingCompanyServices;
import com.plasticTracker.service.impl.RecyclingCompanyServicesImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:27017")
public class RecyclingCompanyController {

    @Autowired
    private RecyclingCompanyServicesImpl recyclingCompanyServicesImpl;
}
