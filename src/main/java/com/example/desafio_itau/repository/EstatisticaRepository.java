package com.example.desafio_itau.repository;

import com.example.desafio_itau.Interface.EstatisticaView;
import com.example.desafio_itau.entity.Estatistica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface EstatisticaRepository extends JpaRepository<Estatistica, Long> {
    @Query(value = "SELECT * FROM vw_estatistica", nativeQuery = true)
    List<Estatistica> buscarEstatistica();
}

