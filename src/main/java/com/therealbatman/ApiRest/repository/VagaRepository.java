package com.therealbatman.ApiRest.repository;

import com.therealbatman.ApiRest.model.Vagas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VagaRepository extends JpaRepository<Vagas, Integer> {
    @Query(value = "SELECT vagasDisponiveis FROM Vagas")
    List<Integer> getTotal();
}
