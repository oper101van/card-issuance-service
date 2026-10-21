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

    protected CardApplication() {

    }

    public CardApplication(String applicantName, String cardType) {
        this.applicantName = applicantName;
        this.cardType = cardType;
    }

    public Long getId() {
        return id;
    }
    public String getApplicantName() {
        return applicantName;
    }
    public String getCardType() {
        return cardType;
    }
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
