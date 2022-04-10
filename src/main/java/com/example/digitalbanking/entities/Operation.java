package com.example.digitalbanking.entities;

import javax.persistence.*;
import java.util.Date;

public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numOpération;
    private Long montant;
    @Temporal(TemporalType.DATE)
    private Date dateOperation;
}
