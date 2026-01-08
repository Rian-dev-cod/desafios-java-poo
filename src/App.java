import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner imput = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = imput.nextLine();

        System.out.println("Digite a palavra que deseja substituir: ");

        String palavra = imput.nextLine();

        System.out.println("Digite a palavra nova!");
        
        String subs = imput.nextLine();

        System.out.println(frase.replace(subs, palavra));

        
        imput.close();
    }
}

