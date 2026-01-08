package desafioAtlas.nivel13;

public abstract class Conta implements Banco {

	String titular;

	double saldo = 0.0;

	public Conta(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public boolean sacar(double valor) {
		if (valor > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}

}
