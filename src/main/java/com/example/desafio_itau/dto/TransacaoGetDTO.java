package com.example.desafio_itau.dto;

import com.example.desafio_itau.entity.Transacao;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public record TransacaoGetDTO(UUID id, double valor, LocalDateTime dataHora) {
    public TransacaoGetDTO(Transacao transacao){
        this(transacao.getID(), transacao.getValor(), transacao.getDataHora());
    }
}
