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

import ifba.profinal.Web2.model.Servico;
import ifba.profinal.Web2.service.ServicoService;

@RestController
@RequestMapping("Servico")
//@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ServicoController {
	@Autowired
  private ServicoService service;
  
	@PostMapping
  public Servico add(@RequestBody  Servico servico) {
	  return service.inserir(servico);
	}  
  @PutMapping
	public Servico atualizar(@RequestBody  Servico servico) {
		return service.atualizar(servico);
	}
  @DeleteMapping
	public void delete(@PathVariable int id ) {
		service.deletePorId(id);
	}
	@GetMapping
	public List<Servico>listar(){
		return service.list();
	}
	@GetMapping("/{id}")
	public Optional<Servico>localizarPorId(@PathVariable int id){
		return service.localizarPorId(id);
	}
}