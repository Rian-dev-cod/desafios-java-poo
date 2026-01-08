package desafioAtlas.nivel13;

public class Principal {

	public static void main(String[] args) {
		
		
		
		Conta c1 = new ContaCorrente("Rian");

		System.out.println("Nome: " + c1.getTitular());
		System.out.println("Saldo: " + c1.getSaldo());
		
		
		c1.depositar(100);
		c1.sacar(400);

		System.out.println("Nome: " + c1.getTitular());
		System.out.println("Saldo: " + c1.getSaldo());
		
		
		Conta c2 = new ContaPoupanca("Ana");
		
		System.out.println("Nome: " + c2.getTitular());
		System.out.println("Saldo: " + c2.getSaldo());
		
		
		c2.depositar(100);
		c2.sacar(700);

		System.out.println("Nome: " + c2.getTitular());
		System.out.println("Saldo: " + c2.getSaldo());
	}
}
