package desafioAtlas.nivel13;

public class ContaPoupanca extends Conta{

	
	
	public ContaPoupanca(String titular) {
		super(titular);
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
