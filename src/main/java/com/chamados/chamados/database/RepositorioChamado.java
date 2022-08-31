package com.chamados.chamados.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chamados.chamados.entidade.Chamado;

public interface RepositorioChamado extends JpaRepository<Chamado,Long>{
    
}
