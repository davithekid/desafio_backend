package com.example.desafio_itau.entity;

import com.example.desafio_itau.dto.TransacaoPostDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

  import com.fasterxml.jackson.annotation.JsonFormat;
@Table(name = "transacao")
@Entity(name = "transacao")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;

    private double valor;


    @Column(name = "dataHora", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Sao_Paulo")
    private LocalDateTime dataHora;


    // Método que define a data automaticamente antes de salvar
    @PrePersist
    protected void onCreate() {
        this.dataHora = LocalDateTime.now();
    }


    public Transacao() {
    }


    public Transacao(TransacaoPostDTO dto) {
        this.valor = dto.valor();

    }


    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
