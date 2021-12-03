function login() {

	var valoCampoNome = document.getElementById("nome").value;

	var valorCampoCpf = document.getElementById("cpf").value;

	var valorCampoComida = document.getElementById("comida").value;

	var parametros = { nome: valoCampoNome, cpf: valorCampoCpf, cafe: valorCampoComida };


	parametros = JSON.stringify(parametros)

	fetch("/cadastro", { method: "post", body: parametros, headers: { "Content-Type": "application/json" } }).then(function(resposta) {
		toastr.success("Usuario cadastrado com sucesoooo!");
		


	})
	fetch("/listar", { method: "get", headers: { "Content-Type": "application/json" } }).then(function(resposta) {
		resposta.json().then(function(r) {
			console.log(r)

		})
	})
}
document.getElementById("btn").onclick = function() {
	login();
};