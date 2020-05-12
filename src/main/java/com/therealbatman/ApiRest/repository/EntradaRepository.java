package com.therealbatman.ApiRest.repository;

import com.therealbatman.ApiRest.model.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradaRepository extends JpaRepository<Entrada, Integer> {
}
