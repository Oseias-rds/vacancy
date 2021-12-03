package com.exemplo.api;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioCadastro, Long>{
	
	@Modifying
	@Transactional
	@Query(value = " Insert Into usuarios(nome, cpf, cafe)values (?1, ?2, ?3)", nativeQuery = true)
	void cadastro(@Param("nome") String nome, @Param("cpf") String cpf, @Param("cafe") String cafe);
	
	@Query(value = "select * from usuarios", nativeQuery = true)
	List<UsuarioCadastro> listar();

}