package ifba.profinal.Web2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifba.profinal.Web2.model.Funcionario;



@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
	

}
