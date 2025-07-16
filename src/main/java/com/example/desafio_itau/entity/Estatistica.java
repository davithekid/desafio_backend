package com.example.desafio_itau.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "vw_estatistica")
public class Estatistica {

    @Id
    private Integer id;  // mapenando o id da view

    private Integer totalTransacoes;
    private Double somaTransacoes;
    private Double mediaTransacoes;
    private Double minTransacoes;
    private Double maxTransacoes;

    // getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalTransacoes() {
        return totalTransacoes;
    }

    public void setTotalTransacoes(Integer totalTransacoes) {
        this.totalTransacoes = totalTransacoes;
    }

    public Double getSomaTransacoes() {
        return somaTransacoes;
    }

    public void setSomaTransacoes(Double somaTransacoes) {
        this.somaTransacoes = somaTransacoes;
    }

    public Double getMediaTransacoes() {
        return mediaTransacoes;
    }

    public void setMediaTransacoes(Double mediaTransacoes) {
        this.mediaTransacoes = mediaTransacoes;
    }

    public Double getMinTransacoes() {
        return minTransacoes;
    }

    public void setMinTransacoes(Double minTransacoes) {
        this.minTransacoes = minTransacoes;
    }

    public Double getMaxTransacoes() {
        return maxTransacoes;
    }

    public void setMaxTransacoes(Double maxTransacoes) {
        this.maxTransacoes = maxTransacoes;
    }
}
