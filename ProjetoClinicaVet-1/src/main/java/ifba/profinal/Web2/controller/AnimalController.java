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

import ifba.profinal.Web2.model.Animal;
import ifba.profinal.Web2.service.AnimalService;

@RestController
@RequestMapping("animal")
//@CrossOrigin(origins = "http://127.0.0.1:5500")
public class AnimalController {
	
	@Autowired
    private AnimalService service;
  
	@PostMapping
	public Animal add(@RequestBody  Animal animal) {
		return service.inserir(animal);
	}  
	
    @PutMapping("/{id}")
	public Animal atualizar(@PathVariable int id, @RequestBody  Animal animal) {
		return service.atualizar(animal);
	}
  
    @DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.deletePorId(id);
	}
  
	@GetMapping
	public List<Animal>listar(){
		return service.list();
	}
	
	@GetMapping("/{id}")
	public Optional<Animal>localizarPorId(@PathVariable int id){
		return service.localizarPorId(id);
	}
}