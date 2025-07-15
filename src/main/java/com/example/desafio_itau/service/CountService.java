package com.example.desafio_itau.service;

import com.example.desafio_itau.dto.CountResponseDTO;
import com.example.desafio_itau.repository.CountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountService {

    @Autowired
    private CountRepository countRepository;

    public CountService(CountRepository countRepository) {
        this.countRepository = countRepository;
    }

    // Get.
    public List<CountResponseDTO> gettAllTodos(){
        return countRepository.findAll()
                .stream().map(CountResponseDTO:: new)
                .toList();
    }

}
