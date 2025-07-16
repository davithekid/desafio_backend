package com.example.desafio_itau.controller;

import com.example.desafio_itau.dto.EstatisticaResponseDTO;
import com.example.desafio_itau.repository.EstatisticaRepository;
import com.example.desafio_itau.service.EstatisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("estatistica")
public class EstatisticaController {

    @Autowired
    private EstatisticaRepository estatisticaRepository;
    private EstatisticaService service;

    public EstatisticaController(EstatisticaRepository estatisticaRepository, EstatisticaService service) {
        this.estatisticaRepository = estatisticaRepository;
        this.service = service;
    }

    @GetMapping
    public List<EstatisticaResponseDTO> getAll(){
        return service.getAllEstatisticas();
    }
}
