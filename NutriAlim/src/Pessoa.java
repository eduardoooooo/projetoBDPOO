import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Pessoa  {
	@Id
	private int id_n;
	private String nome;
	private Integer altura;
	private Integer peso;
	
	@OneToMany(mappedBy="pessoa")
	private ArrayList<Meta> metas;
	
	public Pessoa(int id_n, String nome, Integer altura, Integer peso, ArrayList<Meta> metas) {
		super();
		this.id_n = id_n;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.metas = metas;
	}
	@Override
	public String toString() {
		return "Pessoa [id_n=" + id_n + ", nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", metas=" + metas
				+ "]";
	}
	public int getId_n() {
		return id_n;
	}
	public void setId_n(int id_n) {
		this.id_n = id_n;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public ArrayList<Meta> getMetas() {
		return metas;
	}
	public void setMetas(ArrayList<Meta> metas) {
		this.metas = metas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altura == null) ? 0 : altura.hashCode());
		result = prime * result + id_n;
		result = prime * result + ((metas == null) ? 0 : metas.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((peso == null) ? 0 : peso.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (altura == null) {
			if (other.altura != null)
				return false;
		} else if (!altura.equals(other.altura))
			return false;
		if (id_n != other.id_n)
			return false;
		if (metas == null) {
			if (other.metas != null)
				return false;
		} else if (!metas.equals(other.metas))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (peso == null) {
			if (other.peso != null)
				return false;
		} else if (!peso.equals(other.peso))
			return false;
		return true;
	}
	 
	

}
