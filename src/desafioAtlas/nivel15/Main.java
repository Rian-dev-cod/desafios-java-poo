package desafioAtlas.nivel15;

public class Main {

	public static void main(String[] args) {
		
		Cliente usaurio = new Cliente("Rian", "04834328147");
		Conta conta = new Conta(usaurio);
		
		conta.depositar(100);
		conta.sacar(50);
		
		System.out.println("Cliente: " + conta.getCliente().getNome());
		System.out.println("Saldo: " + conta.getSaldo());
		
		conta.mostrarRelatorio();
		
		
	}
}
