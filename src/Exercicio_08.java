import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {

    //Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C
    // onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // criando vetor A e B
        int[] vetA = new int[N];
        int[] vetB = new int[N];

        // instanciando vetor A
        for (int i = 0; i < N; i++) {
            vetA[i] = sc.nextInt();
        }
        // instanciando vetor B
        for (int i = 0; i < N; i++) {
            vetB[i] = sc.nextInt();
        }

        //  gerando o vetor C
        int[] vetC = new int[N];
        for (int i=0; i<N; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }

        // mostrando o vetor C na tela
        for (int i=0; i<N; i++) {
            System.out.print(vetC[i] + " ");
        }
        System.out.println();
    }
}
