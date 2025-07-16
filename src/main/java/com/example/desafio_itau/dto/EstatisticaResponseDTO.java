package com.example.desafio_itau.dto;

import com.example.desafio_itau.entity.Estatistica;

public record EstatisticaResponseDTO(
        Integer totalTransacoes,
        Double somaTransacoes,
        Double mediaTransacoes,
        Double minTransacoes,
        Double maxTransacoes
) {
    public EstatisticaResponseDTO(Estatistica view) {
        this(view.getTotalTransacoes(),
                view.getSomaTransacoes(),
                view.getMediaTransacoes(),
                view.getMinTransacoes(),
                view.getMaxTransacoes()
        );
    }


}

