package com.tranning.model.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("PriceReference")
@Data
public class PriceReference {
    @Id
    private int id;
    private Plastic typePlastic;
    private int price;
    private Date date_updated;
}
