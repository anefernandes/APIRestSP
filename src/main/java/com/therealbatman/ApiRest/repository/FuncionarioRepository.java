package com.therealbatman.ApiRest.repository;

import com.therealbatman.ApiRest.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
   @Query(value = "SELECT f.nome FROM Funcionario f where f.placa_funcionario =:placa")
   List<String> getNomeByPlaca(String placa);

}
