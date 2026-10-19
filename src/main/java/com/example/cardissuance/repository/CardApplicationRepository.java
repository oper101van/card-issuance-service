package com.example.cardissuance.repository;
import com.example.cardissuance.entity.CardApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardApplicationRepository
        extends JpaRepository<CardApplication, Long> {

}

