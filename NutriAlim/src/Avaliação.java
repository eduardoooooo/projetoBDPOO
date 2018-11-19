import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="AVALIA��ES")
public class Avalia��o {
	
	@Id
	@GeneratedValue
	private int idKal;
	private Integer caloriasGastas;
	private Integer eer;
	private Integer imc;
	private ArrayList<Pessoa>pessoas;
	
	
	public Avalia��o(Integer idKal, Integer caloriasGastas, Integer eer, Integer imc, ArrayList<Pessoa> pessoas) {
		super();
		this.idKal = idKal;
		this.caloriasGastas = caloriasGastas;
		this.eer = eer;
		this.imc = imc;
		this.pessoas = pessoas;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caloriasGastas == null) ? 0 : caloriasGastas.hashCode());
		result = prime * result + ((eer == null) ? 0 : eer.hashCode());
		result = prime * result + idKal;
		result = prime * result + ((imc == null) ? 0 : imc.hashCode());
		result = prime * result + ((pessoas == null) ? 0 : pessoas.hashCode());
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
		Avalia��o other = (Avalia��o) obj;
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
		if (pessoas == null) {
			if (other.pessoas != null)
				return false;
		} else if (!pessoas.equals(other.pessoas))
			return false;
		return true;
	}


	public int getIdKal() {
		return idKal;
	}


	public void setIdKal(int idKal) {
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


	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}


	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}


	public Avalia��o(int idKal, Integer caloriasGastas, Integer eer, Integer imc, ArrayList<Pessoa> pessoas) {
		super();
		this.idKal = idKal;
		this.caloriasGastas = caloriasGastas;
		this.eer = eer;
		this.imc = imc;
		this.pessoas = pessoas;
	}


	@Override
	public String toString() {
		return "Avalia��o [idKal=" + idKal + ", caloriasGastas=" + caloriasGastas + ", eer=" + eer + ", imc=" + imc
				+ ", pessoas=" + pessoas + "]";
	}

}
	
