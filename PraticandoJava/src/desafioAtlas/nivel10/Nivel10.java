package desafioAtlas.nivel10;

public class Nivel10 {

	/*
	========================================
	NÍVEL 10 — HERANÇA (CONTA BANCÁRIA)
	========================================

	OBJETIVO:
	- Aprender herança na prática
	- Reaproveitar código com classe pai
	- Criar regras diferentes em classes filhas
	- Evoluir Orientação a Objetos

	CONCEITO PRINCIPAL:
	- Existe uma classe base (Conta)
	- Existem tipos diferentes de conta
	- Todas compartilham o que é comum
	- Cada tipo tem sua própria regra de saque
	----------------------------------------

	4) Classe Banco (main)
	----------------------------------------
	RESPONSABILIDADE:
	- Criar contas
	- Chamar métodos
	- Mostrar resultados no console

	AQUI PODE:
	- System.out.println
	- Testar depósitos e saques

	----------------------------------------

	REGRAS IMPORTANTES:
	- Tudo que é igual fica na classe pai
	- O que muda fica na classe filha
	- Lógica não imprime
	- Menu apenas mostra resultados

	FRASE CHAVE:
	"Herança é reaproveitar o que é comum e especializar o que muda."

	CHECKLIST FINAL:
	[ ] Classe Conta criada
	[ ] Classe ContaCorrente criada
	[ ] Classe ContaPoupanca criada
	[ ] Herança funcionando
	[ ] Regras de saque diferentes
	[ ] Código organizado

	========================================
	*/

	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente("Rian");
		
		System.out.println("Nome: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());
		
		
		conta.depositar(100);
		conta.sacar(700);

		System.out.println("Nome: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());
		
		
		
	}
	
	
}
