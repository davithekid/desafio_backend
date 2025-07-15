package com.example.desafio_itau.dto;

import com.example.desafio_itau.entity.Count;

public record CountResponseDTO(Integer total_transacoes){
    public CountResponseDTO(Count contagem){
        this(contagem.getTotal_transacoes());
    }
}
