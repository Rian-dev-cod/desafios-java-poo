package desafioAtlas.nivel14;

public class ContaCorrente extends Conta{

	double limite = 500;
	
	public ContaCorrente(String titular) {
		super(titular);
	}
	
	@Override
	public void sacar(double valor) {
		
		if (saldo - valor >= -limite && valor > 0) {
			this.saldo -= valor;
			
		} 
		
	}
	
}
