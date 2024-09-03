package ifba.profinal.Web2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifba.profinal.Web2.model.Servico;
import ifba.profinal.Web2.repository.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository repository;
	
	public Servico inserir(Servico servico) {
		return repository.save(servico);
	}
	public Servico atualizar(Servico servico) {
		return repository.save(servico);
	}
	public void deletePorId(int id) {
		 repository.deleteById(id);
	}
	public List<Servico>list() {
		return repository.findAll();
	}
	public Optional<Servico> localizarPorId(int id) {
		return repository.findById(id);
	}
}
