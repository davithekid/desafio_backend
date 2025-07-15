package com.example.desafio_itau.service;

import com.example.desafio_itau.dto.TransacaoResponseDTO;
import com.example.desafio_itau.dto.TransasaoRequestDTO;
import com.example.desafio_itau.entity.Transacao;
import com.example.desafio_itau.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    // CHAMANDO MEU REPOSITORIO PARA APLICAR FUNCIONALIDADES DO CRUD
    private TransacaoRepository transacaoRepository;

    public TransacaoService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    // METODO GET
    public List<TransacaoResponseDTO> getAllTodos() {
        return transacaoRepository.findAll()
                .stream()
                .map(TransacaoResponseDTO::new)
                .toList();
    }

    // METODO POST
    public TransacaoResponseDTO postDTO(TransasaoRequestDTO data) {
        Transacao entity = new Transacao(data);
        transacaoRepository.save(entity);
        return new TransacaoResponseDTO(entity);
    }
    
}
