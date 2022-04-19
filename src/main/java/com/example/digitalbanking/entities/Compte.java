package com.example.digitalbanking.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class Compte  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCompte;
    private Long Slode;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateExpiration;
}