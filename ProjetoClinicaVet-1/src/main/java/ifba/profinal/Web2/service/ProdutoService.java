package ifba.profinal.Web2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifba.profinal.Web2.model.Produto;
import ifba.profinal.Web2.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public Produto inserir(Produto produto) {
		return repository.save(produto);
	}
	public Produto atualizar(Produto produto) {
		return repository.save(produto);
	}
	public void deletePorId(int id) {
		 repository.deleteById(id);
	}
	public List<Produto>list() {
		return repository.findAll();
	}
	public Optional<Produto> localizarPorId(int id) {
		return repository.findById(id);
	}
}
