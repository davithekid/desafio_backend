package com.example.desafio_itau.controller;

import com.example.desafio_itau.dto.CountResponseDTO;
import com.example.desafio_itau.repository.CountRepository;
import com.example.desafio_itau.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("estatistica")
public class CountController {


    private final CountService countService;
    private final CountRepository countRepository;

    @Autowired
    public CountController(CountService countService, CountRepository countRepository) {
        this.countService = countService;
        this.countRepository = countRepository;
    }

    @GetMapping
    public List<CountResponseDTO> getAll() {
        return countService.gettAllTodos();
    }
}

