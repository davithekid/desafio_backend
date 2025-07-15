package com.example.desafio_itau.service;

import com.example.desafio_itau.dto.TransacaoResponseDTO;
import com.example.desafio_itau.dto.TransacaoRequestDTO;
import com.example.desafio_itau.entity.Transacao;
import com.example.desafio_itau.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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
    public TransacaoResponseDTO postDTO( TransacaoRequestDTO data) {
        Transacao entity = new Transacao(data);
        transacaoRepository.save(entity);
        return new TransacaoResponseDTO(entity);
    }

    // METEDO DELETE

    public void deleteById(UUID id){
       transacaoRepository.deleteById(id);

    }

}
