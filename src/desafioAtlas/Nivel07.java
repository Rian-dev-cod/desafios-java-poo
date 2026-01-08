package desafioAtlas;

import java.util.Scanner;

public class Nivel07 {

    /*
     * ========================================
     * NÍVEL 7.1 — HISTÓRICO DE hitoricoS (ARRAY)
     * ========================================
     * 
     * OBJETIVO:
     * - Trabalhar com array, índice e validação
     * - Guardar histórico das hitoricos geradas
     * - Simular comportamento de sistema real
     * 
     * ----------------------------------------
     * CONCEITO PRINCIPAL
     * ----------------------------------------
     * - A aplicação mantém UMA hitorico atual (estado)
     * - Sempre que a hitorico mudar:
     * -> salvar a nova hitorico no histórico
     * - O histórico tem tamanho FIXO
     * 
     * ----------------------------------------
     * ESTRUTURAS OBRIGATÓRIAS
     * ----------------------------------------
     * - Array de histórico:
     * String[] historico = new String[5];
     * 
     * - Controle de posição:
     * int posicao = 0;
     * 
     * ----------------------------------------
     * REGRAS DO HISTÓRICO
     * ----------------------------------------
     * - Salvar SOMENTE quando a hitorico for alterada
     * - NÃO salvar hitoricos repetidas
     * - NÃO ultrapassar o tamanho do array
     * - Se o histórico estiver cheio:
     * -> mostrar "Histórico cheio!"
     * 
     * ----------------------------------------
     * MENU (NOVA OPÇÃO)
     * ----------------------------------------
     * 6 - Mostrar histórico de hitoricos
     * 
     * ----------------------------------------
     * MOSTRAR HISTÓRICO
     * ----------------------------------------
     * - Usar for
     * - Mostrar apenas posições preenchidas
     * - Exibir índice + hitorico
     * Exemplo:
     * 0 - hitorico original
     * 1 - hitorico EM MAIÚSCULO
     * 2 - hitorico alterada
     * 
     * ----------------------------------------
     * RESTRIÇÕES (NÃO PODE)
     * ----------------------------------------
     * - NÃO usar ArrayList
     * - NÃO usar Stream
     * - NÃO usar Collections
     * - NÃO usar regex
     * 
     * ----------------------------------------
     * DICAS IMPORTANTES
     * ----------------------------------------
     * - Comparar String com .equals()
     * - Cuidar do índice do array
     * - Pensar quem salva no histórico:
     * -> método, não main
     * - main controla fluxo, não regra de negócio
     * 
     * ----------------------------------------
     * ESTRUTURA SUGERIDA
     * ----------------------------------------
     * Classe:
     * - String hitorico
     * - String[] historico
     * - int posicao
     * 
     * Métodos possíveis:
     * - salvarNoHistorico()
     * - mostrarHistorico()
     * - hitoricoJaExisteNoHistorico()
     * 
     * ----------------------------------------
     * CHECKLIST FINAL
     * ----------------------------------------
     * [ ] Array criado
     * [ ] Índice controlado
     * [ ] Não salva repetido
     * [ ] Não estoura limite
     * [ ] Menu mostra histórico
     * [ ] Código organizado
     * 
     * ========================================
     */

    public static void main(String[] args) {

        Nivel07 nivel = new Nivel07();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "----------------------------------------\n" +
                            "1 - Adcionar hitorico\n" +
                            "2 - Mostrar hitorico atual\n" +
                            "3 - Converter para MAIÚSCULO\n" +
                            "4 - Converter para minúsculo\n" +
                            "5 - Contar letras (ignorar espaços)\n" +
                            "6 - Substituir uma palavra\n" +
                            "7 - Mostrar histórico de hitoricos\n" +
                            "0 - Sair\n" +
                            "----------------------------------------\n" +
                            "Escolha uma opção:");

            int opção = input.nextInt();
            input.nextLine();

            int posição;
            if (opção == 0) {
                break;
            }
            ;

            switch (opção) {
                case 1:
                    System.out.println("Digite a hitorico para adcionar: ");
                    String hitorico = input.nextLine();

                    nivel.sethitorico(hitorico);

                    break;
                case 2:
                    nivel.mostrarUltimahitorico();
                    break;
                case 3:
                    System.out.println("Digite a posição: ");
                    posição = input.nextInt();
                    nivel.converterMaiuscula(posição);

                    break;
                case 4:
                    System.out.println("Digite a posição: ");
                    posição = input.nextInt();
                    nivel.converterMinuscula(posição);

                    break;
                case 5:
                    System.out.println("Digite a posição: ");
                    posição = input.nextInt();
                    System.out.println("Total de letras: " + nivel.qtdLetras(posição));
                    break;
                case 6:

                    System.out.println("Digite a posição: ");
                    posição = input.nextInt();
                    nivel.buscar(posição);

                    System.out.println("Digite a palavra que deseja substituir: ");

                    String subs, palavra;
                    subs = input.next();

                    System.out.println("Digite a palavra nova!");

                    palavra = input.next();

                    nivel.substituirPalavra(subs, palavra, posição);

                    break;
                case 7:

                    nivel.mostrarHistorico();
                    break;
                case 0:

                    break;

            }

        }

    }

    String[] hitorico = new String[5];
    int indice = 0;

    public void mostrarHistorico() {
        boolean vazio = true;

        for (int i = 0; i < indice; i++) {
            if (hitorico[i] != null) {
                System.out.println(i + " - " + hitorico[i]);
                vazio = false;
            }
        }

        if (vazio) {
            System.out.println("Histórico vazio!");
        }
    }

    public void converterMaiuscula(int i) {
        String texto = buscar(i);
        if (texto == null)
            return;

        String convertido = texto.toUpperCase();
        if (!texto.equals(convertido)) {
            sethitorico(convertido);
        }
    }

    public void converterMinuscula(int i) {
        String texto = buscar(i);
        if (texto == null)
            return;

        String convertido = texto.toLowerCase();
        if (!texto.equals(convertido)) {
            sethitorico(convertido);
        }
    }

    public int qtdLetras(int i) {
        String texto = buscar(i);
        if (texto == null)
            return 0;

        int contador = 0;
        for (int j = 0; j < texto.length(); j++) {
            if (texto.charAt(j) != ' ') {
                contador++;
            }
        }
        return contador;
    }

    public void substituirPalavra(String antiga, String nova, int i) {
        String texto = buscar(i);
        if (texto == null)
            return;

        if (!texto.contains(antiga)) {
            System.out.println("Nenhuma palavra encontrada!");
            return;
        }

        String resultado = texto.replace(antiga, nova);
        if (!texto.equals(resultado)) {
            sethitorico(resultado);
        }
    }

    public void mostrarUltimahitorico() {

        if (indice > 0) {
            System.out.println(hitorico[indice - 1]);
        } else {
            System.out.println("Historico vazio!");
        }
    }

    public String buscar(int i) {
        if (i < 0 || i >= indice) {
            System.out.println("Posição inválida!");
            return null;
        }
        return hitorico[i];
    }

    public String[] gethitorico() {
        return hitorico;
    }

    public void sethitorico(String novo) {

        for (int i = 0; i < indice; i++) {
            if (hitorico[i].equals(novo)) {
                System.out.println("Frase já existe no histórico!");
                return;
            }
        }

        if (indice < hitorico.length) {
            hitorico[indice] = novo;
            indice++;
        } else {
            System.out.println("Histórico cheio!");
        }
    }

}
