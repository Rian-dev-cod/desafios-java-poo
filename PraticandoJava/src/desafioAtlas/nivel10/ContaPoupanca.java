package desafioAtlas.nivel10;

public class ContaPoupanca extends Conta {
	/*
	 * 
	 * ----------------------------------------
	 * 
	 * 3) Classe FILHA — ContaPoupanca ---------------------------------------- -
	 * extends Conta
	 * 
	 * REGRA DE SAQUE: - NÃO permite saldo negativo - Só saca se houver saldo
	 * suficiente
	 * 
	 * - Deve sobrescrever (@Override) o método sacar
	 * 
	 * ----------------------------------------
	 * 
	 */

	public ContaPoupanca(String Titular) {
		super(Titular);
	}

	@Override
	public boolean sacar(double valor) {
		if ( valor > 0 && valor <= saldo) {
			saldo -= valor;
			return true;
		} else {

			return false;
		}

	}

}
