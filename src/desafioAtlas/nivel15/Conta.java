package desafioAtlas.nivel15;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	private Cliente cliente;

	double saldo = 0;

	List<Operacao> historico = new ArrayList<>();
	
	
	public Conta(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean sacar(double valor) {

		if (valor > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			
			
			historico.add(new Operacao(TipoOperacao.SAQUE, valor));
			return true;
		} else {
			return false;
		}

	}

	public void mostrarRelatorio() {
		System.out.println("Historioco: \n");
		for (Operacao op : historico) {
			System.out.println(
					op.getTipo().gerarRelatorio(cliente , op.getValor()));
		}
		
	}
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;

			historico.add(new Operacao(TipoOperacao.DEPOSITAR, valor));
			return true;
		} else {
			return false;
		}
	}

}
