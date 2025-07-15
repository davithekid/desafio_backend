package com.example.desafio_itau.dto;

import com.example.desafio_itau.entity.Total;

public record TotalResponseDTO(Integer soma_transacoes) {
    public TotalResponseDTO(Total total){
        this(total.getSoma_transacoes());
    }
}
