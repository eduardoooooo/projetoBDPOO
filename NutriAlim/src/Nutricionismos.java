import java.util.ArrayList;

public class Nutricionismos implements NutriAlimentos{

	@Override
	public Pessoa regristarPessoa(Pessoa pessoa) throws  UsuarioInvalidoException{
		Pessoa pessoa = new Pessoa();
		if(usuario == null || Usuario.isEmpty()) {
			throw new CodigoInvalidoException();
		}
		return null;
	}

	
	@Override
	public Avaliação enviar(Avaliação avaliação, Pessoa pessoa) throws UsuarioInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Avaliação qualificar(Avaliação avaliação, ArrayList<Avaliação> qualificar) throws UsuarioInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrarAvaliação(Avaliação avaliação) throws CodigoInvalidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarAlimentos(Avaliação avaliação, Pessoa pessoa) throws CodigoInvalidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarPessoa(Pessoa pessoa) throws UsuarioInvalidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarMeta(Meta meta) throws CodigoInvalidoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarComer(Comer comer, Alimentos alimentos) throws CodigoInvalidoException {
		// TODO Auto-generated method stub
		
	}

	
}
