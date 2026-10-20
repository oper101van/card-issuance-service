package com.example.cardissuance.controller;

import com.example.cardissuance.entity.CardApplication;
import com.example.cardissuance.service.CardApplicationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
