package ifba.profinal.Web2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifba.profinal.Web2.model.Endereco;
import ifba.profinal.Web2.model.Funcionario;
import ifba.profinal.Web2.repository.EnderecoRepository;
import ifba.profinal.Web2.service.FuncionarioService;

@RestController
@RequestMapping("Funcionario")
//@CrossOrigin(origins = "http://127.0.0.1:5500")

public class FuncionarioController2 {
	@Autowired
	private FuncionarioService service;
	@Autowired
	private EnderecoRepository enderecoRepository;

	@PostMapping
	public ResponseEntity<?> addFuncionario(@RequestBody Funcionario funcionario) {

		// Salvar o endereço primeiro
		Endereco endereco = funcionario.getEndereco();
		if (endereco != null) {
			endereco = enderecoRepository.save(endereco);
		}

		// Associar o endereço salvo ao funcionário
		funcionario.setEndereco(endereco);

		// Salvar o funcionário
		Funcionario savedFuncionario = service.inserir(funcionario);
		return ResponseEntity.ok(savedFuncionario);
	}

	@PutMapping
	public Funcionario atualizar(@RequestBody Funcionario funcionario) {
		return service.atualizar(funcionario);
	}

	@DeleteMapping
	public void delete(@PathVariable int id) {
		service.deletePorId(id);
	}

	@GetMapping
	public List<Funcionario> listar() {
		return service.list();
	}

	@GetMapping("/{id}")
	public Optional<Funcionario> localizarPorId(@PathVariable int id) {
		return service.localizarPorId(id);
	}
}