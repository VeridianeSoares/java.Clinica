package ifba.profinal.Web2.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Servico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Enumerated
	private TipoServico tipoServico;
	
	private Date dataDoServico;
	@Enumerated
	private StatusServico status;
	
	private float preco;
	
	
	public Servico() {
	}


	public Servico(TipoServico tipoServico, Date dataDoServico, StatusServico status, float preco) {
		this.tipoServico = tipoServico;
		this.dataDoServico = dataDoServico;
		this.status = status;
		this.preco = preco;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public TipoServico getTipoServico() {
		return tipoServico;
	}


	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}


	public Date getDataDoServico() {
		return dataDoServico;
	}


	public void setDataDoServico(Date dataDoServico) {
		this.dataDoServico = dataDoServico;
	}


	public StatusServico getStatus() {
		return status;
	}


	public void setStatus(StatusServico status) {
		this.status = status;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	}
