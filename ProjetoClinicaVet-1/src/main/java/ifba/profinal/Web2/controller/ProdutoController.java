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

import ifba.profinal.Web2.model.Produto;
import ifba.profinal.Web2.service.ProdutoService;

@RestController
@RequestMapping("Produto")
//@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ProdutoController {
	@Autowired
  private ProdutoService service;
  
	@PostMapping
  public Produto add(@RequestBody  Produto produto) {
	  return service.inserir(produto);
	}  
  @PutMapping
	public Produto atualizar(@RequestBody  Produto produto) {
		return service.atualizar(produto);
	}
  @DeleteMapping
	public void delete(@PathVariable int id ) {
		service.deletePorId(id);
	}
	@GetMapping
	public List<Produto>listar(){
		return service.list();
	}
	@GetMapping("/{id}")
	public Optional<Produto>localizarPorId(@PathVariable int id){
		return service.localizarPorId(id);
	}
}