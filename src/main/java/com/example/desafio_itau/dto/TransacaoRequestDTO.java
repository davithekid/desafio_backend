package com.example.desafio_itau.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

// apenas preciso mandar o valor
public record TransacaoRequestDTO(
        @NotNull(message = "O valor não pode ser nulo.")
        @Positive(message = "O valor deve ser positivo")
        Double valor) {
}




