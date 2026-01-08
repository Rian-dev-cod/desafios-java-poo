package desafioAtlas.nivel14;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String titular) {
		super(titular);
	}

	@Override
	public void depositar(double valor) {

		if ( valor > 0 && valor <= this.saldo) {
			saldo -= valor;
		} 
	}

}
