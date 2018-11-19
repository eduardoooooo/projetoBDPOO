import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Meta {
	@Id
	private int id_met;
	private String descricao;
	private String objetivoPrinc;
	public Meta(int id_met, String descricao, String objetivoPrinc) {
		super();
		this.id_met = id_met;
		this.descricao = descricao;
		this.objetivoPrinc = objetivoPrinc;
	}
	public int getId_met() {
		return id_met;
	}
	public void setId_met(int id_met) {
		this.id_met = id_met;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObjetivoPrinc() {
		return objetivoPrinc;
	}
	public void setObjetivoPrinc(String objetivoPrinc) {
		this.objetivoPrinc = objetivoPrinc;
	}
	@Override
	public String toString() {
		return "Meta [id_met=" + id_met + ", descricao=" + descricao + ", objetivoPrinc=" + objetivoPrinc + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + id_met;
		result = prime * result + ((objetivoPrinc == null) ? 0 : objetivoPrinc.hashCode());
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
		Meta other = (Meta) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id_met != other.id_met)
			return false;
		if (objetivoPrinc == null) {
			if (other.objetivoPrinc != null)
				return false;
		} else if (!objetivoPrinc.equals(other.objetivoPrinc))
			return false;
		return true;
	}
	
}
