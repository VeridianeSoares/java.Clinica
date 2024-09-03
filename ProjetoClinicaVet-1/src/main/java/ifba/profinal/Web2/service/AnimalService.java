package ifba.profinal.Web2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifba.profinal.Web2.model.Animal;
import ifba.profinal.Web2.repository.AnimalRepository;
@Service
public class AnimalService {

	@Autowired
	private AnimalRepository repository;
	
	public Animal inserir(Animal animal) {
		return repository.save(animal);
	}
	public Animal atualizar(Animal animal) {
		return repository.save(animal);
	}
	public void deletePorId(int id) {
		 repository.deleteById(id);
	}
	public List<Animal>list() {
		return repository.findAll();
	}
	public Optional<Animal> localizarPorId(int id) {
		return repository.findById(id);
	}
}
