package desafioAtlas.nivel11;

public class Polimorfismo {

	public static void main(String[] args) {
		/*
		========================================
		NÍVEL 11 — POLIMORFISMO
		========================================

		OBJETIVO:
		- Tratar objetos diferentes como o mesmo tipo
		- Executar comportamentos diferentes no mesmo método
		- Usar herança + override corretamente

		CONCEITO:
		- Referência do tipo pai (Conta)
		- Objeto real define o comportamento
		- Decisão acontece em tempo de execução

		REGRA DE OURO:
		"Mesmo método, resultado diferente"

		RESTRIÇÕES:
		- NÃO usar instanceof
		- NÃO usar cast
		- NÃO usar if para diferenciar tipo

		========================================
		*/

		Contas[] contas = new Contas[2];
		
		contas[0] = new ContaCorrente("Rian");
		contas[1] = new ContaPoupanca("Ana"); 

		for (int i = 0; i < contas.length; i++) {
			contas[i].depositar(100);
		}
		
		for (int i = 0; i < contas.length; i++) {
			contas[i].sacar(200);
		}

		for (Contas c : contas) {
			System.out.println(c.getUsuario());
			System.out.println(c.getSaldo());		}
		
	}
	
}
