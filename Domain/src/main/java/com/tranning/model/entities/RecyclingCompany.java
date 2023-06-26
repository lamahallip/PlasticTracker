package com.tranning.model.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("RecyclingCompanies")
@Data
public class RecyclingCompany {
    @Id
    private int id;
    private String nom;
    private String address;
    private String number;
    private String email;
    private Plastic typePlactic;
    private int quantity;

}
