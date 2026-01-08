package desafioAtlas.nivel14;

public class Conta {

	String titular;

	double saldo;

	public Conta(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
		}

	}

	public void depositar(double valor) {

		if (valor > 0) {
			this.saldo += valor;

		}

	}

}
