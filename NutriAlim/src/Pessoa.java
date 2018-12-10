import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Pessoa implements Indentificavel {
	@Id
	private Long cpf;
	private String nome;
	private Integer altura;
	private Integer peso;

	@OneToMany(mappedBy = "pessoa")
	private Set<Meta> metas;

	public Pessoa(int id_n, String nome, Integer altura, Integer peso, Set<Meta> metas) {
		super();
		this.cpf = (long) id_n;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.metas = metas;
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pessoa [id_n=" + cpf + ", nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", metas=" + metas
				+ "]";
	}

	public long getId_n() {
		return cpf;
	}

	public void setId_n(long l) {
		this.cpf = (long) l;
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

	public Set<Meta> getMetas() {
		return metas;
	}

	public void setMetas(Set<Meta> metas) {
		this.metas = metas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altura == null) ? 0 : altura.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
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

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

}
