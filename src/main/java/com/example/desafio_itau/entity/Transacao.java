package com.example.desafio_itau.entity;

import com.example.desafio_itau.dto.TransacaoRequestDTO;
import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "transacao")
@Table(name = "transacao")
public class Transacao {

    // definindo criptografia UUID
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;

    private Double valor;

    @Column(name = "dataHora", columnDefinition = "DATETIME")
    private LocalDateTime dataHora;

    // metodo para definir hora
    // tornando-o persistente
    @PrePersist
    protected void onCreate() {
        this.dataHora = LocalDateTime.now();
    }

    public Transacao() {
    }

    public Transacao(TransacaoRequestDTO dto) {
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
