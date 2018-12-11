import java.util.ArrayList;

public interface NutriAlimentos {

	public Avalia��o enviar(Avalia��o avalia��o, Pessoa pessoa) throws UsuarioInvalidoException;

	public Avalia��o qualificar(Avalia��o avalia��o, ArrayList<Avalia��o> qualificar)throws UsuarioInvalidoException;

	public void registrarAvalia��o(Avalia��o avalia��o) throws CodigoInvalidoException;

	public void registrarAlimentos(Avalia��o avalia��o, Pessoa pessoa) throws CodigoInvalidoException;

	public void registrarPessoa(Pessoa pessoa)throws  UsuarioInvalidoException;

	public void registrarMeta(Meta meta)throws CodigoInvalidoException;

	public void registrarComer(Comer comer, Alimentos alimentos)throws CodigoInvalidoException;

	Pessoa regristarPessoa(Pessoa pessoa) throws UsuarioInvalidoException;

}
