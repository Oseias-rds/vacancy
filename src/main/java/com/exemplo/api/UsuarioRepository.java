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
	@Query(value = "insert into usuariocliente(nome, cpf, data_nascimento, telefone, email, login, senha, cidade, estado, endereco )values (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10)", nativeQuery = true)
	void cadastro(
			@Param("nome") String nome, 
			@Param("cpf") String cpf, 
			@Param("dataNascimento") String dataNascimento, 
			@Param("telefone") String telefone, 
			@Param("email") String email,  
			@Param("login") String login,
			@Param("senha") String senha, 
			@Param("cidade") String cidade, 
			@Param("estado") String estado, 
			@Param("endereco") String endereco
	);
	
	@Query(value = "select * from usuariocliente where email = ?1 and senha = ?2", nativeQuery = true)
	UsuarioCadastro listar(
		@Param("email") String email,
		@Param("senha") String senha	
	);

}