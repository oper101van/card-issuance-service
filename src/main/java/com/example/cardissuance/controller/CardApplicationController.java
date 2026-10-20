package com.example.cardissuance.controller;

import com.example.cardissuance.entity.CardApplication;
import com.example.cardissuance.service.CardApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applications")
public class CardApplicationController {
    private final CardApplicationService cardApplicationService;

    public CardApplicationController(CardApplicationService cardApplicationService) {
        this.cardApplicationService = cardApplicationService;
    }
    @PostMapping
    public CardApplication createApplication(@RequestBody CardApplication application) {
        return cardApplicationService.createApplication(application);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CardApplication> getApplicationById(@PathVariable Long id) {
        return cardApplicationService.getApplicationById(id)
                .map(application -> ResponseEntity.ok(application))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
