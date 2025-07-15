package com.example.desafio_itau.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

// apenas preciso mandar o valor
public record TransacaoRequestDTO(
        @NotNull(message = "O valor é obrigatório")
        @Positive(message = "Deve ser positibvo")
        Double valor) {
}




