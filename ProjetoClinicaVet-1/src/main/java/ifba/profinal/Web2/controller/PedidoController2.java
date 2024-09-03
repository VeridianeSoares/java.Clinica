package ifba.profinal.Web2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifba.profinal.Web2.model.Pedido;
import ifba.profinal.Web2.service.PedidoService;

@RestController
@RequestMapping("Pedido")
//@CrossOrigin(origins = "http://127.0.0.1:5500")
public class PedidoController2 {
	@Autowired
  private PedidoService service;
  
	@PostMapping
  public Pedido add(@RequestBody  Pedido pedido) {
	  return service.inserir(pedido);
	}  
  @PutMapping
	public Pedido atualizar(@RequestBody  Pedido pedido) {
		return service.atualizar(pedido);
	}@DeleteMapping
	public void delete(@PathVariable int id ) {
		service.deletePorId(id);
	}
	@GetMapping
	public List<Pedido>listar(){
		return service.list();
	}
	@GetMapping("/{id}")
	public Optional<Pedido>localizarPorId(@PathVariable int id){
		return service.localizarPorId(id);
	}
}