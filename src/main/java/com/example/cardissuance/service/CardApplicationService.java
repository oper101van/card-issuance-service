package com.example.cardissuance.service;

import com.example.cardissuance.repository.CardApplicationRepository;
import org.springframework.stereotype.Service;

@Service
public class CardApplicationService {
    private final CardApplicationRepository cardApplicationRepository;

    public CardApplicationService(CardApplicationRepository cardApplicationRepository) {
        this.cardApplicationRepository = cardApplicationRepository;
    }
}
