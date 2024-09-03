package ifba.profinal.Web2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifba.profinal.Web2.model.Pedido;
import ifba.profinal.Web2.repository.PedidoRepository;

 @Service
public class PedidoService {

	 @Autowired
	private PedidoRepository repository;
	
	public Pedido inserir(Pedido pedido) {
		return repository.save(pedido);
	}
	public Pedido atualizar(Pedido pedido) {
		return repository.save(pedido);
	}
	public void deletePorId(int id) {
		 repository.deleteById(id);
	}
	public List<Pedido>list() {
		return repository.findAll();
	}
	public Optional<Pedido> localizarPorId(int id) {
		return repository.findById(id);
	}
}
