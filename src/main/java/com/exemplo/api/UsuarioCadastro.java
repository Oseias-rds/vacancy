package com.exemplo.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "usuarios")
public class UsuarioCadastro {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long id;
	
	@Column
	String nome;
	@Column
	String cpf;
	@Column
	String cafe;
	
	
	
	public UsuarioCadastro(Long id, String nome, String cpf, String cafe) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cafe = cafe;
	}
	
	public UsuarioCadastro() {
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCafe() {
		return cafe;
	}

	public void setCafe(String cafe) {
		this.cafe = cafe;
	}
	
	

}
