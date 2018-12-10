import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AVALIAÇÕES")
public class Avaliação {

	@Id
	@GeneratedValue
	private Long idKal;
	private Integer caloriasGastas;
	private Integer eer;
	private Integer imc;

	@ManyToOne
	@JoinColumn(name = "id_pessoa")
	private Pessoa pessoa;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caloriasGastas == null) ? 0 : caloriasGastas.hashCode());
		result = prime * result + ((eer == null) ? 0 : eer.hashCode());
		result = (int) (prime * result + idKal);
		result = prime * result + ((imc == null) ? 0 : imc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaliação other = (Avaliação) obj;
		if (caloriasGastas == null) {
			if (other.caloriasGastas != null)
				return false;
		} else if (!caloriasGastas.equals(other.caloriasGastas))
			return false;
		if (eer == null) {
			if (other.eer != null)
				return false;
		} else if (!eer.equals(other.eer))
			return false;
		if (idKal != other.idKal)
			return false;
		if (imc == null) {
			if (other.imc != null)
				return false;
		} else if (!imc.equals(other.imc))
			return false;
		return true;
	}

	public Long getIdKal() {
		return idKal;
	}

	public void setIdKal(Long idKal) {
		this.idKal = idKal;
	}

	public Integer getCaloriasGastas() {
		return caloriasGastas;
	}

	public void setCaloriasGastas(Integer caloriasGastas) {
		this.caloriasGastas = caloriasGastas;
	}

	public Integer getEer() {
		return eer;
	}

	public void setEer(Integer eer) {
		this.eer = eer;
	}

	public Integer getImc() {
		return imc;
	}

	public void setImc(Integer imc) {
		this.imc = imc;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Avaliação [idKal=" + idKal + ", caloriasGastas=" + caloriasGastas + ", eer=" + eer + ", imc=" + imc
				+ "]";
	}


	

}
