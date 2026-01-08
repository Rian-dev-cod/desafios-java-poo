package desafioAtlas;

import java.util.Scanner;

public class Nivel03 {

    public static void main(String[] args) {
        // Calculadora simples
        // Peça dois números

        //Mostre um menu:
        // 1 - Somar
        // 2 - Subtrair
        // 3 - Multiplicar
        // 4 - Dividir

        // Execute a operação escolhida

        // Mostre o resultado

        //Regras
        //✔ Use Scanner
        //✔ Use switch
        //✔ Trate divisão por zero
        //❌ Não use if para escolher a operação
        //❌ Não use loop ainda
        //Digite o primeiro número:
        //10
        //Digite o segundo número:
        //2
        //Escolha a operação:
        //4
        //Resultado: 5

        Scanner input = new Scanner(System.in);
        int calculadora;

        System.out.println("=-=-=-=-=-= Menu: =-=-=-=-=-=-=");
        System.out.println(" 1 - Somar ");
        System.out.println(" 2 - Subtrair ");
        System.out.println(" 3 - Multiplicar ");
        System.out.println(" 4 - Dividir ");
        System.out.println("Escolha a operação: ");
        calculadora = input.nextInt();

        double valorA, valorB, resultado;
        System.out.println("Digite o primeiro número: ");
        valorA = input.nextDouble();

        System.out.println("Digite o segundo número:");
        valorB = input.nextDouble();


        switch (calculadora) {

            case 1:
                resultado = valorA + valorB;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = valorA - valorB;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = valorA * valorB;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (valorB == 0) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    resultado = valorA / valorB;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            default:
                break;
        }

        input.close();

    }
}
