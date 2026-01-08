package desafioAtlas;

import java.util.Scanner;

public class Nivel01 {

    public static void main(String[] args) {
        
        // Faça umprograma que: 
        // Pergunte o nome do usuário
        // Pergunte a idade 
        // Mostre: 
        //   Olá Rian, você tem 21 anos.

        // Regras: 
        //  Use Scanner
        //  Use System.outprintln
        //  Não use if

        Scanner imput = new Scanner(System.in);
        
        System.out.println("Nome de usuário: ");

        String nome = imput.nextLine();

        System.out.println("Qual idade? ");

        int idade = imput.nextInt();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos." );

         
         
        imput.close();



    }
}
