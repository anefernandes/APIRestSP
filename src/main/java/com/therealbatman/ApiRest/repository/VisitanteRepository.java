package com.therealbatman.ApiRest.repository;

import com.therealbatman.ApiRest.model.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VisitanteRepository extends JpaRepository<Visitante, Integer> {
    @Query(value = "SELECT v.nome FROM Visitante v where v.placa_visitante =:placa")
    List<String> getNomeByPlaca(String placa);
}
