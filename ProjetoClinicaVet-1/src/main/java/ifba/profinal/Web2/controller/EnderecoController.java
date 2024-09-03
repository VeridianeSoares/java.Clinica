package ifba.profinal.Web2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifba.profinal.Web2.model.Endereco;
import ifba.profinal.Web2.service.EnderecoService;


@RestController
@RequestMapping("endereco")
//@CrossOrigin(origins = "http://127.0.0.1:5500")
public class EnderecoController {
	
	@Autowired
  private EnderecoService service;
  
	@PostMapping
  public Endereco add( Endereco endereco) {
	  return service.inserir(endereco);
	}  
  @PutMapping
	public Endereco atualizar(@RequestBody Endereco endereco) {
		return service.atualizar(endereco);
	}
  @DeleteMapping("/{id}") 
	public void delete(@PathVariable int id ) {
		service.deletePorId(id);
	}
	@GetMapping
	public List<Endereco>listar(){
		return service.list();
	}
	@GetMapping("/{id}")
	public Optional<Endereco>localizarPorId(@PathVariable int id){
		return service.localizarPorId(id);
	}
}