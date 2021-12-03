package com.exemplo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroController {
	
		@Autowired
		private UsuarioRepository repository;
		
		
		@PostMapping(path ="/cadastro", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public void cadastro(@RequestBody CadastroUsuarioBean usuario) {
			 repository.cadastro(usuario.getNome(),usuario.getCpf(), usuario.getCafe());
			
		}
		@GetMapping(path="listar")
		public List<UsuarioCadastro> listarUsuarios(){
			return repository.listar();
			
			
		}
	}