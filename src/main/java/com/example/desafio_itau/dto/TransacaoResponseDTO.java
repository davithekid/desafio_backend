package com.example.desafio_itau.dto;

import com.example.desafio_itau.entity.Transacao;
import java.time.LocalDateTime;
import java.util.UUID;

// RESPONSE
public record TransacaoResponseDTO(UUID id, Double valor, LocalDateTime dataHora) {
    public TransacaoResponseDTO(Transacao transacao){
        this(transacao.getID(), transacao.getValor(), transacao.getDataHora());
    }
}
