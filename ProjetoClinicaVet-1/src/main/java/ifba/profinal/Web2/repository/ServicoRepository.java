package ifba.profinal.Web2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifba.profinal.Web2.model.Servico;



@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {
	

}
