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

import ifba.profinal.Web2.model.Usuario;
import ifba.profinal.Web2.service.UsuarioService;
@RestController
@RequestMapping("Usuario")
//@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UsuarioController {
	@Autowired
  private UsuarioService service;
  
	@PostMapping
  public Usuario add(@RequestBody  Usuario usuario) {
	  return service.inserir(usuario);
	}  
  @PutMapping
	public Usuario atualizar(@RequestBody  Usuario usuario) {
		return service.atualizar(usuario);
	}
  @DeleteMapping
	public void delete(@PathVariable int id ) {
		service.deletePorId(id);
	}
	@GetMapping
	public List<Usuario>listar(){
		return service.list();
	}
	@GetMapping("/{id}")
	public Optional<Usuario>localizarPorId(@PathVariable int id){
		return service.localizarPorId(id);
	}
}