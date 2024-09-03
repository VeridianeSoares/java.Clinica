//package ifba.profinal.Web2.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import ifba.profinal.Web2.model.Pessoa;
//import ifba.profinal.Web2.repository.PessoaRepository;
//@Service
//public class PessoaService {
//
//	@Autowired
//	private PessoaRepository repository;
//	
//	public Pessoa inserir(Pessoa pessoa) {
//	return repository.save(pessoa);
//	}
//		public Pessoa atualizar(Pessoa pessoa) {
//		return repository.save(pessoa);
//	}
//	public void deletePorId(int id) {
//		 repository.deleteById(id);
//	}
//	public List<Pessoa>list() {
//		return repository.findAll();
//	}
//	public Optional<Pessoa> localizarPorId(int id) {
//		return repository.findById(id);
//	}
//}
