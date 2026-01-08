package desafioAtlas.nivel08;

import java.util.Scanner;

public enum EditorTexto {

    ADICIONAR_TEXTO {
        @Override
        public void executar(int i) {
            setHistorico("Texto exemplo");
        }
    },

    CONVERTER_MAIUSCULO {
        @Override
        public void executar(int i) {
            String texto = buscar(i);
            if (texto == null)
                return;

            atualizarHistorico(i , texto.toUpperCase());
        }
    },

    CONVERTER_MINUSCULO {
        @Override
        public void executar(int i) {
            String texto = buscar(i);
            if (texto == null)
                return;

            atualizarHistorico(i , texto.toLowerCase());
        }
    },

    CONTAR_LETRAS {
        @Override
        public void executar(int i) {
            String texto = buscar(i);
            if (texto == null)
                return;

            int qtd = texto.replace(" ", "").length();
            System.out.println("Quantidade de letras: " + qtd);
        }
    },

    MOSTRAR_HISTORICO {
        @Override
        public void executar(int i) {
            for (int j = 0; j < indice; j++) {
                System.out.println(j + " - " + historico[j]);
            }
        }
    },
    SUBSTITUIR_PALAVRA {
        @Override
        public void executar(int i) {

            String texto = buscar(i);
            if (texto == null) {
                return;
            }

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a palavra antiga: ");
            String antiga = sc.nextLine();

            if (!texto.contains(antiga)) {
                System.out.println("Nenhuma palavra encontrada!");
                return;
            }

            System.out.print("Digite a palavra nova: ");
            String nova = sc.nextLine();

            String resultado = texto.replace(antiga, nova);

            if (!texto.equalsIgnoreCase(resultado)) {
                atualizarHistorico(i , resultado);
            }
        }
    }

    ;

    public abstract void executar(int i);

    static String[] historico = new String[5];
    static int indice = 0;

    static void setHistorico(String texto) {
        for (int i = 0; i < indice; i++) {
            if (historico[i].equals(texto)) {
                System.out.println("Frase já existe no histórico!");
                return;
            }
        }

        if (indice < historico.length) {
            historico[indice] = texto;
            indice++;
        } else {
            System.out.println("Histórico cheio!");
        }
    }

    static void atualizarHistorico(int i, String novoTexto) {
        if (i < 0 || i >= indice) {
            System.out.println("Posição inválida!");
            return;
        }
        historico[i] = novoTexto;
    }

    static String buscar(int i) {
        if (i < 0 || i >= indice)
            return null;
        return historico[i];
    }
}
