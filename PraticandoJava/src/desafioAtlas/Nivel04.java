package desafioAtlas;

import java.util.Scanner;

public class Nivel04 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    // Desafio Nível 4.1 — Contador de letras
    // O que o programa deve fazer
    // Pedir uma frase ao usuário
    // Contar quantas letras existem, ignorando espaços
    // Mostrar o total

    // 📌 Exemplo
    // Entrada:
    // Digite uma frase:
    // Rian é esforçado
    // Saída:
    // Total de letras: 14
    // (sem contar os espaços)

    // 🚫 Regras (essas são pra filtrar)
    // ✔ Use Scanner
    // ✔ Use for
    // ✔ Use charAt
    // ❌ NÃO pode usar:
    // replace
    // split
    // length() para descontar espaço
    // ❌ NÃO pode usar regex
    // ❌ NÃO pode usar Stream
    // 👉 Tem que percorrer a String caractere por caractere.

    Scanner input = new Scanner(System.in);
     
    System.out.println("Digite uma frase: ");
    
    String frase = input.nextLine();

    int contador = 0 ;

    for (int i = 0; i < frase.length(); i++) {
        
        char c = frase.charAt(i);
        if(c != ' '){
            contador++;
        }
    }
    
    System.out.println("Total de letras: " + contador);

    input.close();


    }

}