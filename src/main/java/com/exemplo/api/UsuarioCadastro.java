package com.exemplo.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "")
public class UsuarioCadastro {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long id;
	
	@Column
	String nome;
	@Column
	String cpf;

	@Column(name = "data_nascimento")
	String dataNascimento;
	@Column
	String telefone;
	@Column
	String email;
	@Column
	String login;
	@Column
	String  senha;
	@Column
	String  cidade;
	@Column
	String estado;
	@Column
	String endereco;
	
	
	
	
	public UsuarioCadastro(Long id, String nome, String cpf, String cafe, String dataNascimento, String telefone,
			String email, String login, String senha, String cidade, String estado, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.cidade = cidade;
		this.estado = estado;
		this.endereco = endereco;
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



	public String getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}


	

}
