package com.example.desafio_itau.entity;

import jakarta.persistence.*;

@Entity(name = "vw_contagem_transacao")
@Table(name = "vw_contagem_transacao")
public class Count {


    @Id
    @Column(name = "total_transacoes")
    private Integer total_transacoes;

    public Count() {
    }


    public Integer getTotal_transacoes() {
        return total_transacoes;
    }

    public void setTotal_transacoes(Integer total_transacoes) {
        this.total_transacoes = total_transacoes;
    }
}
