function register () {

	var valorCampoNome = document.getElementById("nome").value;

	var valorCampoCpf = document.getElementById("cpf").value;

	var valorCampoDataNascimento = document.getElementById("dataNascimento").value;
	var valorCampoTelefone = document.getElementById("telefone").value;
	var valorCampoEmail  = document.getElementById("email").value;
	var valorCampoLogin = document.getElementById("login").value;
	var valorCampoSenha = document.getElementById("senha").value;
	var valorCampoCidade = document.getElementById("cidade").value;
	var valorCampoEstado = document.getElementById("estado").value;
	var valorCampoEndereco = document.getElementById("endereco").value;
	
	
	var parametros = { 
			nome: valorCampoNome, 
			cpf: valorCampoCpf,
			dataNascimento: valorCampoDataNascimento,
			telefone: valorCampoTelefone,
			email: valorCampoEmail,
			login: valorCampoLogin,
			senha: valorCampoSenha,
			cidade: valorCampoCidade,
			estado: valorCampoEstado,
			endereco: valorCampoEndereco	
	};
	console.log(parametros);


	parametros = JSON.stringify(parametros)

	fetch("/cadastro", { method: "post", body: parametros, headers: { "Content-Type": "application/json" } }).then(function(resposta) {
	
		if(resposta.ok) {
		
			Toastify({
				text: "Usuário cadastrado.",
				duration: 3000
			}).showToast();
	
		}
		
	});
	
}



document.getElementById("btnCadastro").addEventListener('click', e => {

	e.preventDefault(); //não atualiza a página;
	
	register(); 

});

