package com.example.cardissuance.service;

import com.example.cardissuance.entity.CardApplication;
import com.example.cardissuance.repository.CardApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardApplicationService {
    private final CardApplicationRepository cardApplicationRepository;

    public CardApplicationService(CardApplicationRepository cardApplicationRepository) {
        this.cardApplicationRepository = cardApplicationRepository;
    }
    public CardApplication createApplication(CardApplication cardApplication) {
        return cardApplicationRepository.save(cardApplication);
    }
    public Optional<CardApplication> getApplicationById(Long id) {
        return cardApplicationRepository.findById(id);
    }
    public List<CardApplication> getAllApplications() {
        return cardApplicationRepository.findAll();
    }
}
