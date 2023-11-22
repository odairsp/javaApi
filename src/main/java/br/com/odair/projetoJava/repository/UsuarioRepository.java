package br.com.odair.projetoJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.odair.projetoJava.entity.UsuarioEntity;

// Extends traz as operações basicas do CRUD

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
