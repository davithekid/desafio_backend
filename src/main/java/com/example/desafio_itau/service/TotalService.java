package com.example.desafio_itau.service;

import com.example.desafio_itau.dto.TotalResponseDTO;
import com.example.desafio_itau.repository.TotalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TotalService {
    @Autowired
    private TotalRepository repository;

    public TotalService(TotalRepository repository) {
        this.repository = repository;
    }

    public List<TotalResponseDTO> getALlTodos() {
        return repository.findAll()
                .stream().map(TotalResponseDTO::new)
                .toList();
    }

}
