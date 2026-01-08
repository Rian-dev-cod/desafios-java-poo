package desafioAtlas.nivel15;

public class Operacao {

	TipoOperacao tipo;
	double valor;
	
	
	public Operacao(TipoOperacao tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
		
	}


	public TipoOperacao getTipo() {
		return tipo;
	}


	public double getValor() {
		return valor;
	}
	
	
	
}
