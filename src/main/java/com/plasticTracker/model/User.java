package com.plasticTracker.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;
import java.lang.annotation.Documented;

@Document("users")
@Data
public class User {
    @Id
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
}
