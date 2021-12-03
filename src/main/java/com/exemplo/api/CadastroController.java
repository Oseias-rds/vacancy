package com.exemplo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
			 repository.cadastro(
					 usuario.getNome(),
					 usuario.getCpf(),
					 usuario.getDataNascimento(),
					 usuario.getTelefone(),
					 usuario.getEmail(),
					 usuario.getLogin(),
					 usuario.getSenha(),
					 usuario.getCidade(),
					 usuario.getEstado(),
					 usuario.getEndereco()
					 );
			
		}
		@PostMapping(path="/loginp", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public UsuarioCadastro loginUsario(@RequestBody LoginUsuarioBean usuario){
			return repository.listar(usuario.getEmail(), usuario.getSenha());
			
		}
	}