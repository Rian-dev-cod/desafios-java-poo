package desafioAtlas.nivel10;

public class ContaCorrente extends Conta {

	/*
	 * 
	 * ----------------------------------------
	 * 
	 * 2) Classe FILHA — ContaCorrente ---------------------------------------- -
	 * extends Conta - Possui limite de crédito (ex: 500)
	 * 
	 * REGRA DE SAQUE: - Pode sacar mesmo sem saldo - Saldo pode ficar negativo até
	 * o limite
	 * 
	 * - Deve sobrescrever (@Override) o método sacar
	 * 
	 */
	
	double limite = 500.0;
	
	public ContaCorrente (String Titular) {
		super(Titular);
	}

	@Override
	public boolean sacar(double valor) {
		if(saldo - valor >= -limite && valor > 0) {
			saldo -= valor;
			return true;
		}else {
			return false;
		}
	}

}
