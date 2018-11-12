import java.util.ArrayList;

public interface NutriAlimentos {
	
	public Avaliação enviar (Avaliação avaliação, Pessoa pessoa);
	public Avaliação qualificar (Avaliação avaliação, ArrayList<Avaliação>qualificar);
	public void registrarAvaliação(Avaliação avaliação);
	public void registrarAlimentos(Avaliação avaliação, Pessoa pessoa);
	public void registrarPessoa(Pessoa pessoa); 
	public void registrarMeta(Meta meta);
	public void registrarComer(Comer comer, Alimentos alimentos);
	
	
}
