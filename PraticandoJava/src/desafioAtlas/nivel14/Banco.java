package desafioAtlas.nivel14;


public class Banco {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente("Rian");

		System.out.println("\nNome: " + c1.getTitular());
		System.out.println("Saldo: " + c1.getSaldo());
		
		
		double valor = 100;
		
		c1.depositar(valor);
		double sacarV = 200;
		try {
			if (valor < 0) {
				throw new IllegalArgumentException("Valor invalido");
			}
			if (c1.getSaldo() < valor) {
				throw new RuntimeException("Saldo insuficiente");
			}
			c1.sacar(sacarV);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("\nNome: " + c1.getTitular());
		System.out.println("Saldo: " + c1.getSaldo());
		
		
		Conta c2 = new ContaPoupanca("Ana");
		
		double valor2 = 100;
		c2.depositar(valor2);
		double limite = 500;
		try {
			if(c2.getSaldo() - valor <= -limite) {
				throw new IllegalArgumentException("Limite excedido");
			}
			
			if(valor <= 0) {
				throw new RuntimeException("Limite excedido");
			}

			c2.sacar(50);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("\nNome: " + c2.getTitular());
		System.out.println("Saldo: " + c2.getSaldo());
		
		
		
		
	}
}
