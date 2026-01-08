package desafioAtlas;

import java.util.Scanner;

public class Nivel02 {

    public static void main(String[] args) {
        
        // Peça um número inteiro
        // verifique se ele é: 
        //  Par ou impar
        // mostre o resultado no terminal

        // Regras: 
        // Use Scanner
        // Use If / else
        // Não use operador ternario 
        // Não use switch 
        // Não use loop
        // Exemplo: 
        //  Digite um número: 
        //  7
        // O número é impar.

        Scanner imput = new Scanner(System.in);
        System.out.println("Digete um número: ");
        int num = imput.nextInt();

        if( num % 2 != 0){
            
            System.out.println("O número é ímpar.");

        } else {

            System.out.println("O número é par.");
            

        }
        
        imput.close();


    }
}
