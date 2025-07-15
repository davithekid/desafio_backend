package com.example.desafio_itau.service;

import com.example.desafio_itau.dto.TransacaoGetDTO;
import com.example.desafio_itau.dto.TransacaoPostDTO;
import com.example.desafio_itau.entity.Transacao;
import com.example.desafio_itau.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransacaoService {

    private TransacaoRepository transacaoRepository;

    public TransacaoService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    public List<TransacaoGetDTO> getAllTodos() {
        return transacaoRepository.findAll()
                .stream()
                .map(TransacaoGetDTO::new)
                .toList();
    }


    public TransacaoGetDTO postDTO(TransacaoPostDTO data){
        Transacao entity = new Transacao(data);
        // não precisa setar dataHora manualmente
        transacaoRepository.save(entity);
        return new TransacaoGetDTO(entity);
    }





}
