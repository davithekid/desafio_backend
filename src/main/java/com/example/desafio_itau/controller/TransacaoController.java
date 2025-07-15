package com.example.desafio_itau.controller;

import com.example.desafio_itau.dto.TransacaoGetDTO;
import com.example.desafio_itau.dto.TransacaoPostDTO;
import com.example.desafio_itau.repository.TransacaoRepository;
import com.example.desafio_itau.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("transacao")
public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;
    private TransacaoService transacaoService;


    public TransacaoController(TransacaoRepository transacaoRepository, TransacaoService transacaoService) {
        this.transacaoRepository = transacaoRepository;
        this.transacaoService = transacaoService;
    }

    // GET.
    @GetMapping
    public List<TransacaoGetDTO> getAll(){
        return transacaoService.getAllTodos();
    }

    @PostMapping
    public ResponseEntity<TransacaoGetDTO> postDto(@RequestBody TransacaoPostDTO data){
        TransacaoGetDTO saved = transacaoService.postDTO(data);
        return ResponseEntity.ok(saved);
    }

}
