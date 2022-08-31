package com.chamados.chamados;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chamados.chamados.database.RepositorioChamado;
import com.chamados.chamados.entidade.Chamado;

@RestController
@RequestMapping("/chamado")
public class ChamadoRest {
    @Autowired
    private RepositorioChamado repositorio;

    @GetMapping
    public List<Chamado> listar() {
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Chamado chamado) {
        repositorio.save(chamado);
    }

    @PutMapping
    public void alterar(@RequestBody Chamado chamado) {
        if (chamado.getId() > 0)
            repositorio.save(chamado);
    }
@DeleteMapping
    public void excluir(@RequestBody Chamado chamado) {
        repositorio.delete(chamado);
    }

}
