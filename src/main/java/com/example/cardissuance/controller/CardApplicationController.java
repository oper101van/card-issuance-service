package com.example.cardissuance.controller;

import com.example.cardissuance.dto.CreateCardApplicationRequest;
import com.example.cardissuance.entity.CardApplication;
import com.example.cardissuance.service.CardApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class CardApplicationController {
    private final CardApplicationService cardApplicationService;

    public CardApplicationController(CardApplicationService cardApplicationService) {
        this.cardApplicationService = cardApplicationService;
    }
    @PostMapping
    public CardApplication createApplication(@RequestBody CreateCardApplicationRequest application) {
        CardApplication cardApplication = new CardApplication(application.getApplicantName(), application.getCardType());
        return cardApplicationService.createApplication(cardApplication);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CardApplication> getApplicationById(@PathVariable Long id) {
        return cardApplicationService.getApplicationById(id)
                .map(application -> ResponseEntity.ok(application))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping
    public List<CardApplication> getAllApplications() {
        return cardApplicationService.getAllApplications();
    }
    @PutMapping("/{id}")
    public ResponseEntity<CardApplication> updateApplication(@PathVariable Long id, @RequestBody CardApplication cardApplication) {
       return ResponseEntity.of(cardApplicationService.updateApplication(id, cardApplication));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApplication(@PathVariable Long id) {
        if(cardApplicationService.deleteApplication(id)) {
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
