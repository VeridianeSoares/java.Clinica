package ifba.profinal.Web2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifba.profinal.Web2.model.Usuario;
import ifba.profinal.Web2.repository.UsuarioRepository;
@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario inserir(Usuario usuario) {
		return repository.save(usuario);
	}
	public Usuario atualizar(Usuario usuario) {
		return repository.save(usuario);
	}
	public void deletePorId(int id) {
		 repository.deleteById(id);
	}
	public List<Usuario>list() {
		return repository.findAll();
	}
	public Optional<Usuario> localizarPorId(int id) {
		return repository.findById(id);
	}
}
