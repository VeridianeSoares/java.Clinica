package ifba.profinal.Web2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifba.profinal.Web2.model.Funcionario;
import ifba.profinal.Web2.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
   private FuncionarioRepository repository;
	
	public Funcionario inserir(Funcionario funcionario) {
		return repository.save(funcionario);
	}
	public Funcionario atualizar(Funcionario funcionario) {
		return repository.save(funcionario);
	}
	public void deletePorId(int id) {
		 repository.deleteById(id);
	}
	public List<Funcionario>list() {
		return repository.findAll();
	}
	public Optional<Funcionario> localizarPorId(int id) {
		return repository.findById(id);
	}
}
