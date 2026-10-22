package com.example.cardissuance.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateCardApplicationRequest {
    private @NotBlank @Size(max = 150) String applicantName;
    private @NotBlank @Size(max = 150) String cardType;

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}