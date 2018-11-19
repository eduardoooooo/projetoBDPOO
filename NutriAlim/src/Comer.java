import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comer {
	@Id
	private int id_hr;
	private Integer data_hora;
	private ArrayList<Pessoa>pessoas;
	private ArrayList<Alimentos>alimento;
	public Comer(int id_hr, Integer data_hora, ArrayList<Pessoa> pessoas, ArrayList<Alimentos> alimento) {
		super();
		this.id_hr = id_hr;
		this.data_hora = data_hora;
		this.pessoas = pessoas;
		this.alimento = alimento;
	}
	public int getId_hr() {
		return id_hr;
	}
	public void setId_hr(int id_hr) {
		this.id_hr = id_hr;
	}
	public Integer getData_hora() {
		return data_hora;
	}
	public void setData_hora(Integer data_hora) {
		this.data_hora = data_hora;
	}
	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	public ArrayList<Alimentos> getAlimento() {
		return alimento;
	}
	public void setAlimento(ArrayList<Alimentos> alimento) {
		this.alimento = alimento;
	}
	@Override
	public String toString() {
		return "Comer [id_hr=" + id_hr + ", data_hora=" + data_hora + ", pessoas=" + pessoas + ", alimento=" + alimento
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alimento == null) ? 0 : alimento.hashCode());
		result = prime * result + ((data_hora == null) ? 0 : data_hora.hashCode());
		result = prime * result + id_hr;
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
		Comer other = (Comer) obj;
		if (alimento == null) {
			if (other.alimento != null)
				return false;
		} else if (!alimento.equals(other.alimento))
			return false;
		if (data_hora == null) {
			if (other.data_hora != null)
				return false;
		} else if (!data_hora.equals(other.data_hora))
			return false;
		if (id_hr != other.id_hr)
			return false;
		if (pessoas == null) {
			if (other.pessoas != null)
				return false;
		} else if (!pessoas.equals(other.pessoas))
			return false;
		return true;
	}
	
	
}
