package desafioAtlas.nivel12;

abstract class Contas {
	
	
	protected String usuario;
	
	protected double saldo = 0;
	
	public Contas(String usuario) {
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public abstract boolean sacar(double valor);
	
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}else {
			return false;
		}
	}

	
	
}
