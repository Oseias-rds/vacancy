function login() {

	var valorCampoEmail = document.getElementById("email").value;

	var valorCampoSenha = document.getElementById("senha").value;
	
	const parametros = JSON.stringify({
		email: valorCampoEmail,
		senha: valorCampoSenha,
	
	});
	
	console.log(parametros);
	
	fetch("/loginp", { method: "POST", body: parametros,  headers: { "Content-Type": "application/json" } }).then(function(resposta) {
	
		if(resposta.ok) {
			resposta.json().then(function(r) {
			console.log(r);
			Toastify({
				text: "Usuário encontrado!.",
				duration: 3000
			}).showToast();

		}).catch((err) => {
		
			Toastify({
				text: "email ou senha incorretos.",
				className: "danger",
				duration: 3000
			}).showToast();
		
		})
		
		
		}else{
			Toastify({
				text: "Erro interno no servidor",
				className: "danger",
				duration: 3000
			}).showToast();
		
		
		}
		
	})
}


document.getElementById("btnEntrar").onclick = function(e) {
	e.preventDefault();
	login();
};