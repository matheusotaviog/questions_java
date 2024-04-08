import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c = 0;
        int numeroFibonnaci;
        boolean pertenceFibonnaci = false;

        System.out.print("Entre com o número: ");
        int numInformado = sc.nextInt();

        System.out.println("\nNúmero informado: " + numInformado + "\n");

        System.out.print("Sequência gerada:");

        while (c < numInformado) {
            numeroFibonnaci = geraFibonacci(c);
            System.out.print(" " + numeroFibonnaci);

            if (numInformado == numeroFibonnaci) {
                pertenceFibonnaci = true;
            }

            c++;
        }

        if(pertenceFibonnaci) {
            System.out.println("\n\nO número " + "PERTENCE a sequência Fibonnaci.");
        } else {
            System.out.println("\n\nO número " + "NÃO PERTENCE a sequência Fibonnaci.");
        }

        sc.close();
    }

    public static int geraFibonacci(int n) {

        if (n < 2) {
            return n;
        } else {
            return (n - 1) + (n - 2);
        }

    }

}
