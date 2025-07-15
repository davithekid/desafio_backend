package com.example.desafio_itau.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity (name = "vw_soma_transacao")
@Table (name = "vw_soma_transacao")
public class Total {

    @Id
    @Column (name = "soma_transacoes")

    private Integer soma_transacoes;



    public Integer getSoma_transacoes() {
        return soma_transacoes;
    }

    public void setSoma_transacoes(Integer soma_transacoes) {
        this.soma_transacoes = soma_transacoes;
    }
}

