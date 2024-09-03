package ifba.profinal.Web2.model;

import jakarta.persistence.Entity;

@Entity
public class Funcionario extends Pessoa {

	private String matricula;
	private String funcao;
	
	public Funcionario() {
		super();
	}

	public Funcionario(String matricula, String funcao) {
		this.matricula = matricula;
		this.funcao = funcao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	
	
}
