package desafioAtlas.nivel11;

public class Contas {
	
	
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
	
	public boolean sacar(double valor) {
		
		if(valor > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}else {
			return false;
		}
	}

	
	
}
