import java.util.ArrayList;

public interface NutriAlimentos {
	
	public Avalia��o enviar (Avalia��o avalia��o, Pessoa pessoa);
	public Avalia��o qualificar (Avalia��o avalia��o, ArrayList<Avalia��o>qualificar);
	public void registrarAvalia��o(Avalia��o avalia��o);
	public void registrarAlimentos(Avalia��o avalia��o, Pessoa pessoa);
	public void registrarPessoa(Pessoa pessoa); 
	public void registrarMeta(Meta meta);
	public void registrarComer(Comer comer, Alimentos alimentos);
	
	
}
