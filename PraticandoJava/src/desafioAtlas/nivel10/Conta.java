package desafioAtlas.nivel10;

public class Conta {

	/*
	 * 
	 * 1) Classe PAI — Conta ---------------------------------------- ATRIBUTOS
	 * (protected): - String titular - double saldo
	 * 
	 * CONSTRUTOR: - Recebe o nome do titular - Inicia saldo com 0
	 * 
	 * MÉTODOS: - depositar(double valor) -> boolean - sacar(double valor) ->
	 * boolean (regra simples) - getSaldo() - getTitular()
	 * 
	 * REGRAS: - NÃO usar Scanner - NÃO usar System.out.println - Saldo nunca é
	 * público
	 * 
	 */

	protected String titular;

	protected double saldo = 0.0;


	public Conta(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean depositar(double saldo) {
		if(saldo > 0) {
			this.saldo += saldo;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sacar(double saldo) {
		
		if(saldo > 0 && this.saldo >= saldo) {
			this.saldo -= saldo;
			return true;
		}else {
			return false;
		}
		
		
	}
	

}
