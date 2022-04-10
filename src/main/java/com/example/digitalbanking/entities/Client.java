package com.example.digitalbanking.entities;

import javax.persistence.*;
import java.util.Date;

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Date dateNaissance;
    private Long Tel;
    private String Adresse;
//    private String CIN;
}
