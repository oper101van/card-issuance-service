package com.example.cardissuance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "card_applications")
public class CardApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "applicantName", nullable = false, length = 150)
    private String applicantName;

    @Column(name = "cardType", nullable = false, length = 150)
    private String cardType;

    protected CardApplication(){

    }
}
