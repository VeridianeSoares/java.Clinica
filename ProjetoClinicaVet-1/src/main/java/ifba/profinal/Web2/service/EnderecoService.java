package ifba.profinal.Web2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifba.profinal.Web2.model.Endereco;
import ifba.profinal.Web2.repository.EnderecoRepository;

@Service 
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;
	
	public Endereco inserir(Endereco endereco) {
		return repository.save(endereco);
	}
	public Endereco atualizar(Endereco endereco) {
		return repository.save(endereco);
	}
	public void deletePorId(int id) {
		 repository.deleteById(id);
	}
	public List<Endereco>list() {
		return repository.findAll();
	}
	public Optional<Endereco> localizarPorId(int id) {
		return repository.findById(id);
	}
}
