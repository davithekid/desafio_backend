package com.example.desafio_itau.service;

import com.example.desafio_itau.dto.EstatisticaResponseDTO;
import com.example.desafio_itau.repository.EstatisticaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstatisticaService {


    private EstatisticaRepository repository;

    public EstatisticaService(EstatisticaRepository repository) {
        this.repository = repository;
    }

    // Get
    public List<EstatisticaResponseDTO> getAllEstatisticas() {
        return repository.findAll()
                .stream()
                .map(EstatisticaResponseDTO::new)
                .toList();
    }
}
