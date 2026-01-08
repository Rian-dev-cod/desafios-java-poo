package desafioAtlas.nivel08;

import java.util.Scanner;

public class menu {

    /*
     * ========================================
     * NÍVEL 8 — SEPARAÇÃO DE RESPONSABILIDADES
     * ========================================
     * 
     * OBJETIVO:
     * - Organizar o código como em um sistema real
     * - Separar REGRA DE NEGÓCIO de INTERFACE
     * - Melhorar legibilidade, manutenção e clareza
     * 
     * ----------------------------------------
     * IDEIA PRINCIPAL (EM PORTUGUÊS CLARO)
     * ----------------------------------------
     * - O MENU fala com o usuário
     * - A LÓGICA resolve o problema
     * - Uma classe NÃO faz o trabalho da outra
     * 
     * REGRA DE OURO:
     * "Menu não pensa. Lógica não fala."
     * 
     * ----------------------------------------
     * ESTRUTURA FINAL DO PROJETO
     * ----------------------------------------
     * 
     * 1) Classe EditorTexto (LÓGICA)
     * --------------------------------
     * - NÃO usa Scanner
     * - NÃO usa System.out.println
     * - NÃO tem menu
     * - NÃO pergunta nada ao usuário
     * 
     * RESPONSABILIDADE:
     * - Guardar histórico
     * - Validar índice
     * - Alterar textos
     * - Retornar resultados
     * 
     * ATRIBUTOS:
     * - String[] historico
     * - int indice
     * 
     * MÉTODOS TÍPICOS:
     * - adicionarTexto(String texto)
     * - buscar(int i)
     * - converterMaiusculo(int i)
     * - converterMinusculo(int i)
     * - contarLetras(int i)
     * - substituirPalavra(int i, String antiga, String nova)
     * - mostrarHistorico() -> retorna String ou String[]
     * 
     * ----------------------------------------
     * 2) Classe MenuConsole (INTERFACE)
     * --------------------------------
     * - USA Scanner
     * - USA System.out.println
     * - Mostra menu
     * - Lê opções
     * - Mostra mensagens
     * 
     * RESPONSABILIDADE:
     * - Perguntar dados ao usuário
     * - Mostrar resultados
     * - Chamar métodos do EditorTexto
     * 
     * OBS:
     * - Menu NÃO valida regra de negócio
     * - Menu NÃO acessa array diretamente
     * 
     * ----------------------------------------
     * FLUXO DO PROGRAMA
     * ----------------------------------------
     * main():
     * - cria EditorTexto
     * - cria Scanner
     * - loop do menu
     * - switch de opções
     * - chama métodos do EditorTexto
     * - mostra retorno no console
     * 
     * ----------------------------------------
     * O QUE NÃO PODE NO NÍVEL 8
     * ----------------------------------------
     * - Lógica dentro do menu
     * - Scanner dentro da lógica
     * - System.out.println dentro da lógica
     * - Métodos gigantes
     * - Código duplicado
     * 
     * ----------------------------------------
     * CHECKLIST FINAL
     * ----------------------------------------
     * [ ] Duas classes separadas
     * [ ] EditorTexto sem Scanner e sem print
     * [ ] MenuConsole só conversa com usuário
     * [ ] Código continua funcionando
     * [ ] Histórico continua correto
     * [ ] Índice continua validado
     * 
     * ========================================
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    ------------------------
                    1 - Adicionar texto
                    2 - Mostrar histórico
                    3 - Converter para MAIÚSCULO
                    4 - Converter para MINUSCULA
                    5 - Contar letras
                    6 - Substituir palavra
                    0 - Sair
                    ------------------------
                    """);

            int opcao = input.nextInt();
            input.nextLine();

            if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            }

            switch (opcao) {

                case 1:
                    System.out.println("Digite o texto:");
                    String texto = input.nextLine();

                    EditorTexto.setHistorico(texto);
                    break;

                case 2:
                    EditorTexto.MOSTRAR_HISTORICO.executar(0);
                    break;

                case 3:
                    System.out.println("Digite a posição:");
                    int pos = input.nextInt();
                    EditorTexto.CONVERTER_MAIUSCULO.executar(pos);
                    break;

                case 4:
                    
                    System.out.println("Digite a posição:");
                    int posi = input.nextInt();
                    EditorTexto.CONVERTER_MINUSCULO.executar(posi);
                    break;
                case 5:
                    System.out.println("Digite a posição:");
                    int p = input.nextInt();
                    EditorTexto.CONTAR_LETRAS.executar(p);

                    break;
                case 6:
                    System.out.println("Digite a posição:  ");
                    int po = input.nextInt();
                    EditorTexto.SUBSTITUIR_PALAVRA.executar(po);
            }
        }

    }

}
