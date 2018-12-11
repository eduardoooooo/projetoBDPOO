import java.util.ArrayList;

public interface NutriAlimentos {

	public Avaliação enviar(Avaliação avaliação, Pessoa pessoa) throws UsuarioInvalidoException;

	public Avaliação qualificar(Avaliação avaliação, ArrayList<Avaliação> qualificar)throws UsuarioInvalidoException;

	public void registrarAvaliação(Avaliação avaliação) throws CodigoInvalidoException;

	public void registrarAlimentos(Avaliação avaliação, Pessoa pessoa) throws CodigoInvalidoException;

	public void registrarPessoa(Pessoa pessoa)throws  UsuarioInvalidoException;

	public void registrarMeta(Meta meta)throws CodigoInvalidoException;

	public void registrarComer(Comer comer, Alimentos alimentos)throws CodigoInvalidoException;

	Pessoa regristarPessoa(Pessoa pessoa) throws UsuarioInvalidoException;

}
