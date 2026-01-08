package desafioAtlas.nivel11;

public class ContaCorrente extends Contas{
	
	double limite = 500;
	
	public ContaCorrente(String usuario) {
		super(usuario);
	}
	
	@Override
	public boolean sacar(double valor) {
		if(saldo - valor >= -limite && valor > 0 ) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

}
