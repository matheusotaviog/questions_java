import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o texto a ser invertido: ");
        String texto = sc.nextLine();

        System.out.println("\nTexto invertido abaixo: ");
        for(int i = texto.length()-1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }

        sc.close();

    }

}

