package com.example.desafio_itau.controller;

import com.example.desafio_itau.dto.TotalResponseDTO;
import com.example.desafio_itau.repository.TotalRepository;
import com.example.desafio_itau.service.TotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("total")

public class TotalController {
    @Autowired
    private TotalRepository repository;
    private TotalService service;

    public TotalController(TotalRepository repository, TotalService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping
    public List<TotalResponseDTO> getAll(){
        return service.getALlTodos();
    }

}
