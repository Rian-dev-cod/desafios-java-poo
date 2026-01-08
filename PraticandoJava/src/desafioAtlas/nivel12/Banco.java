package desafioAtlas.nivel12;

public class Banco {

	public static void main(String[] args) {
		
		/*
		========================================
		NÍVEL 12 — ABSTRAÇÃO
		========================================

		OBJETIVO:
		- Usar abstract class
		- Forçar regras nas classes filhas
		- Impedir instanciação da classe base
		- Evoluir o design OO

		CONCEITO:
		- Classe abstrata define o contrato
		- Classes filhas são obrigadas a cumprir
		- Métodos comuns ficam na base
		- Métodos variáveis ficam abstratos

		REGRAS:
		- Classe base NÃO pode ser instanciada
		- Método abstrato NÃO tem corpo
		- Filhas DEVEM implementar
		- Polimorfismo continua funcionando

		FRASE CHAVE:
		"Abstração define o que deve ser feito,
		não como."

		========================================
		*/


		Contas c1 = new ContaCorrente("Rian");

		System.out.println("Nome: " + c1.getUsuario());
		System.out.println("Saldo: " + c1.getSaldo());
		
		
		c1.depositar(100);
		c1.sacar(400);

		System.out.println("Nome: " + c1.getUsuario());
		System.out.println("Saldo: " + c1.getSaldo());
		
		
		Contas c2 = new ContaPoupanca("Ana");
		
		System.out.println("Nome: " + c2.getUsuario());
		System.out.println("Saldo: " + c2.getSaldo());
		
		
		c2.depositar(100);
		c2.sacar(700);

		System.out.println("Nome: " + c2.getUsuario());
		System.out.println("Saldo: " + c2.getSaldo());
		
	}
}
