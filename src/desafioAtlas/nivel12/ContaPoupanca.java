package desafioAtlas.nivel12;

public class ContaPoupanca extends Contas{

	
	public ContaPoupanca(String usuario) {
		super(usuario);
	}
	
	@Override
	public boolean sacar(double valor) {
		if ( valor > 0 && valor <= this.saldo) {
			saldo -= valor;
			return true;
		} else {

			return false;
		}
	}
	
}
