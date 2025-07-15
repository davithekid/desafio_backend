package com.example.desafio_itau.repository;

import com.example.desafio_itau.entity.Count;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CountRepository extends JpaRepository<Count, Integer> {
}
