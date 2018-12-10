import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Alimentos {
	@Id
	private int id_vlr;
	private Integer valorEnergetico;
	private Integer proteinas;
	private Integer saisMinerais;
	private String nome;
	private Integer carboidratos;
	private Integer vitaminas;
	private Integer lipidios;
	private Integer gosrdurasSaturadas;
	private Integer gorduras;

	@ManyToMany
	@JoinTable(name = "alimento_pessoa", joinColumns = @JoinColumn(name = "alimento_id"), inverseJoinColumns = @JoinColumn(name = "pessoa_id"))
	private Set<Pessoa> pessoas;

	public Alimentos(int id_vlr, Integer valorEnergetico, Integer proteinas, Integer saisMinerais, String nome,
			Integer carboidratos, Integer vitaminas, Integer lipidios, Integer gosrdurasSaturadas, Integer gorduras) {
		super();
		this.id_vlr = id_vlr;
		this.valorEnergetico = valorEnergetico;
		this.proteinas = proteinas;
		this.saisMinerais = saisMinerais;
		this.nome = nome;
		this.carboidratos = carboidratos;
		this.vitaminas = vitaminas;
		this.lipidios = lipidios;
		this.gosrdurasSaturadas = gosrdurasSaturadas;
		this.gorduras = gorduras;
	}

	public int getId_vlr() {
		return id_vlr;
	}

	public void setId_vlr(int id_vlr) {
		this.id_vlr = id_vlr;
	}

	public Integer getValorEnergetico() {
		return valorEnergetico;
	}

	public void setValorEnergetico(Integer valorEnergetico) {
		this.valorEnergetico = valorEnergetico;
	}

	public Integer getProteinas() {
		return proteinas;
	}

	public void setProteinas(Integer proteinas) {
		this.proteinas = proteinas;
	}

	public Integer getSaisMinerais() {
		return saisMinerais;
	}

	public void setSaisMinerais(Integer saisMinerais) {
		this.saisMinerais = saisMinerais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCarboidratos() {
		return carboidratos;
	}

	public void setCarboidratos(Integer carboidratos) {
		this.carboidratos = carboidratos;
	}

	public Integer getVitaminas() {
		return vitaminas;
	}

	public void setVitaminas(Integer vitaminas) {
		this.vitaminas = vitaminas;
	}

	public Integer getLipidios() {
		return lipidios;
	}

	public void setLipidios(Integer lipidios) {
		this.lipidios = lipidios;
	}

	public Integer getGosrdurasSaturadas() {
		return gosrdurasSaturadas;
	}

	public void setGosrdurasSaturadas(Integer gosrdurasSaturadas) {
		this.gosrdurasSaturadas = gosrdurasSaturadas;
	}

	public Integer getGorduras() {
		return gorduras;
	}

	public void setGorduras(Integer gorduras) {
		this.gorduras = gorduras;
	}

	@Override
	public String toString() {
		return "Alimentos [id_vlr=" + id_vlr + ", valorEnergetico=" + valorEnergetico + ", proteinas=" + proteinas
				+ ", saisMinerais=" + saisMinerais + ", nome=" + nome + ", carboidratos=" + carboidratos
				+ ", vitaminas=" + vitaminas + ", lipidios=" + lipidios + ", gosrdurasSaturadas=" + gosrdurasSaturadas
				+ ", gorduras=" + gorduras + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carboidratos == null) ? 0 : carboidratos.hashCode());
		result = prime * result + ((gorduras == null) ? 0 : gorduras.hashCode());
		result = prime * result + ((gosrdurasSaturadas == null) ? 0 : gosrdurasSaturadas.hashCode());
		result = prime * result + id_vlr;
		result = prime * result + ((lipidios == null) ? 0 : lipidios.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((proteinas == null) ? 0 : proteinas.hashCode());
		result = prime * result + ((saisMinerais == null) ? 0 : saisMinerais.hashCode());
		result = prime * result + ((valorEnergetico == null) ? 0 : valorEnergetico.hashCode());
		result = prime * result + ((vitaminas == null) ? 0 : vitaminas.hashCode());
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
		Alimentos other = (Alimentos) obj;
		if (carboidratos == null) {
			if (other.carboidratos != null)
				return false;
		} else if (!carboidratos.equals(other.carboidratos))
			return false;
		if (gorduras == null) {
			if (other.gorduras != null)
				return false;
		} else if (!gorduras.equals(other.gorduras))
			return false;
		if (gosrdurasSaturadas == null) {
			if (other.gosrdurasSaturadas != null)
				return false;
		} else if (!gosrdurasSaturadas.equals(other.gosrdurasSaturadas))
			return false;
		if (id_vlr != other.id_vlr)
			return false;
		if (lipidios == null) {
			if (other.lipidios != null)
				return false;
		} else if (!lipidios.equals(other.lipidios))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (proteinas == null) {
			if (other.proteinas != null)
				return false;
		} else if (!proteinas.equals(other.proteinas))
			return false;
		if (saisMinerais == null) {
			if (other.saisMinerais != null)
				return false;
		} else if (!saisMinerais.equals(other.saisMinerais))
			return false;
		if (valorEnergetico == null) {
			if (other.valorEnergetico != null)
				return false;
		} else if (!valorEnergetico.equals(other.valorEnergetico))
			return false;
		if (vitaminas == null) {
			if (other.vitaminas != null)
				return false;
		} else if (!vitaminas.equals(other.vitaminas))
			return false;
		return true;
	}

}
