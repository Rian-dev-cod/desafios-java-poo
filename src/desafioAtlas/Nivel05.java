package desafioAtlas;

import java.util.Scanner;

public class Nivel05 {

    String frase;


    public void substituirPalavra (String subs, String palavra){
        if (this.frase.contains(subs)){
            setFrase(this.frase.replace(subs, palavra));

        }else{
            System.out.println("Nenhuma palavra encontrada!");
        }
    }

    public int qtdLetras() {

        int contador = 0;

        for (int i = 0; i < this.frase.length(); i++) {

            char c = this.frase.charAt(i);

            if (c != ' ') {
                contador++;
            }

        }
        return contador;
    }

    public void converterMaiusculo() {
        this.frase = this.frase.toUpperCase();
    }

    public void converterMinusculo() {
        this.frase = this.frase.toLowerCase();
    }

    public String getFrase() {
        return this.frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public static void main(String[] args) {

        /*
         * ========================================
         * NÍVEL 6 — MENU INTERATIVO DE TEXTO
         * ========================================
         * 
         * OBJETIVO:
         * - Trabalhar com loop, switch, métodos e estado
         * - Manipular UMA frase ao longo do programa
         * 
         * ----------------------------------------
         * FLUXO GERAL DO PROGRAMA
         * ----------------------------------------
         * 1. Pedir uma frase inicial
         * 2. Entrar em loop (while ou do-while)
         * 3. Mostrar menu de opções
         * 4. Ler opção do usuário
         * 5. Executar ação escolhida
         * 6. Atualizar a frase quando necessário
         * 7. Sair apenas quando opção = 0
         * 
         * ----------------------------------------
         * MENU OBRIGATÓRIO
         * ----------------------------------------
         * 1 - Mostrar frase atual
         * 2 - Converter para MAIÚSCULO
         * 3 - Converter para minúsculo
         * 4 - Contar letras (ignorar espaços)
         * 5 - Substituir uma palavra
         * 0 - Sair
         * 
         * ----------------------------------------
         * REGRAS IMPORTANTES
         * ----------------------------------------
         * - Usar while ou do-while
         * - Usar switch para o menu
         * - Usar métodos separados
         * - NÃO fazer tudo no main
         * - NÃO usar regex
         * - NÃO usar Stream
         * - A frase deve ser reaproveitada (estado)
         * 
         * ----------------------------------------
         * ESTRUTURA SUGERIDA
         * ----------------------------------------
         * main():
         * - Scanner
         * - variável String frase
         * - loop do menu
         * - switch chamando métodos
         * 
         * Métodos (exemplos de responsabilidade):
         * - mostrarFrase(String frase)
         * - converterMaiusculo(String frase) -> retorna String
         * - converterMinusculo(String frase) -> retorna String
         * - contarLetras(String frase) -> retorna int
         * - substituirPalavra(String frase, Scanner input) -> retorna String
         * 
         * ----------------------------------------
         * DICAS DE QUALIDADE
         * ----------------------------------------
         * - Cada método faz UMA coisa
         * - main só controla fluxo
         * - Evitar código duplicado
         * - Mensagens claras no console
         * 
         * ========================================
         */

        Scanner input = new Scanner(System.in);

        Nivel05 obj = new Nivel05();

        System.out.println("Digite a frase: ");
        String frase = input.nextLine();
        obj.setFrase(frase);

        while (true) {

            System.out.println("----------------------------------------");
            System.out.println("1 - Mostrar frase atual");
            System.out.println("2 - Converter para MAIÚSCULO");
            System.out.println("3 - Converter para minúsculo");
            System.out.println("4 - Contar letras (ignorar espaços)");
            System.out.println("5 - Substituir uma palavra");
            System.out.println("0 - Sair");

            int opção = input.nextInt();

            if(opção == 0){
                break;
            };
            switch (opção) {

                case 1:
                    System.out.println("Frase digitada: ");
                    System.out.println(obj.getFrase());
                    break;
                case 2:
                    obj.converterMaiusculo();
                    System.out.println(obj.getFrase());
                    break;
                case 3:
                    obj.converterMinusculo();
                    System.out.println(obj.getFrase());
                    break;
                case 4:
                    System.out.println("Total de letras: " + obj.qtdLetras());
                    break;
                case 5:
                    System.out.println("Digite a palavra que deseja substituir: ");

                    String subs, palavra;
                    subs = input.next();

                    System.out.println("Digite a palavra nova!");

                    palavra = input.next();

                    obj.substituirPalavra(subs, palavra);
                    break;
                case 0:
                    break;
            }

        }

    }
}
