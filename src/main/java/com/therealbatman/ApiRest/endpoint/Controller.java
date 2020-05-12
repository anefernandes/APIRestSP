package com.therealbatman.ApiRest.endpoint;

import com.therealbatman.ApiRest.model.Entrada;
import com.therealbatman.ApiRest.model.Funcionario;
import com.therealbatman.ApiRest.model.Saida;
import com.therealbatman.ApiRest.model.Visitante;
import com.therealbatman.ApiRest.repository.EntradaRepository;
import com.therealbatman.ApiRest.repository.FuncionarioRepository;
import com.therealbatman.ApiRest.repository.SaidaRepository;
import com.therealbatman.ApiRest.repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;

@RestController
public class Controller {
    @Autowired
    private EntradaRepository eDAO;
    @Autowired
    private SaidaRepository sDAO;
    @Autowired
    private FuncionarioRepository fDAO;
    @Autowired
    private VisitanteRepository vDAO;

    @GetMapping("/entrada")
    ResponseEntity<?> listE() {
        return new ResponseEntity<>(eDAO.findAll(), HttpStatus.OK);
    }

    @GetMapping("/saida")
    ResponseEntity<?> listS() {
        return new ResponseEntity<>(sDAO.findAll(), HttpStatus.OK);
    }

    @GetMapping("/funcionario")
    ResponseEntity<?> listF() {
        return new ResponseEntity<>(fDAO.findAll(), HttpStatus.OK);
    }

    @GetMapping("/funcionario/{placa}")
    ResponseEntity<?> NomeByPlaca(@PathVariable String placa) {
        return new ResponseEntity<>(fDAO.getNomeByPlaca(placa), HttpStatus.OK);
    }

    @GetMapping("/visitante")
    ResponseEntity<?> listV() {
        return new ResponseEntity<>(vDAO.findAll(), HttpStatus.OK);
    }

    @GetMapping("/visitante/{placa}")
    ResponseEntity<?> NomeByPlacaV(@PathVariable String placa) {
        return new ResponseEntity<>(vDAO.getNomeByPlaca(placa), HttpStatus.OK);
    }

    @PostMapping(path = "/funcionario/add")//salva os valores
    public ResponseEntity<?> saveF(@RequestBody Funcionario funcionario) {
        fDAO.save(funcionario);
        return new ResponseEntity<>(fDAO.save(funcionario), HttpStatus.CREATED);
    }

    @PostMapping(path = "/visitante/add")
    public ResponseEntity<?> saveV(@RequestBody Visitante visitante) {
        vDAO.save(visitante);
        return new ResponseEntity<>(vDAO.save(visitante), HttpStatus.CREATED);
    }

    @PostMapping(path = "/entrada/add")
    public ResponseEntity<?> saveE(@RequestBody Entrada entrada) {
        eDAO.save(entrada);
        return new ResponseEntity<>(eDAO.save(entrada), HttpStatus.CREATED);
    }

//    @PutMapping(path = "/funcionario/{id}")
//    public

    @PostMapping(path = "/saida/add")
    public ResponseEntity<?> saveS(@RequestBody Saida saida) {
        sDAO.save(saida);
        return new ResponseEntity<>(sDAO.save(saida), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "entrada/delete/{id}")
    public ResponseEntity<?> deleteE(@PathVariable Integer id) {
        eDAO.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete_v/{id}")
    public ResponseEntity<?> deleteV(@PathVariable Integer id) {
        vDAO.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "saida/delete/{id}")
    public ResponseEntity<?> deleteS(@PathVariable Integer id) {
        sDAO.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete_f/{id}")
    public ResponseEntity<?> deleteF(@PathVariable Integer id) {
        fDAO.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}