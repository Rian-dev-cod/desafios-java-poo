package desafioAtlas.nivel09;

public class Banco {

    public static void main(String[] args) {

        ContaBancaria banco = new ContaBancaria("Rian");

        System.out.println("Nome Usuario: " + banco.getTitular());
        System.out.println("Saldo: " + banco.getSaldo());

        banco.depositar(100.0);
        System.out.println("Saldo: " + banco.getSaldo());

        banco.depositar(100.0);

        if (banco.sacar(50)) {
            System.out.println("Saque de 50 realizado");
        } else {
            System.out.println("Saldo insuficiente para saque de 50");
        }

        if (banco.sacar(300)) {
            System.out.println("Saque de 300 realizado");
        } else {
            System.out.println("Saldo insuficiente para saque de 300");
        }

        System.out.println("Saldo final: " + banco.getSaldo());
    }
}
