import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10 {

    // Fazer um programa para ler um vetor de N números inteiros. Em seguida,
    // mostrar na tela a média aritmética somente dos números pares lidos.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // criando vetor
        int N = sc.nextInt();
        int[] vet = new int[N];

        // instanciando vetor
        for (int i=0; i<N; i++) {
            vet[i] = sc.nextInt();
        }

        // 1: calculando e mostrando a media
        double soma = 0.0;
        int cont = 0;
        for (int i=0; i<N; i++) {
                if (vet[i] % 2 == 0){
                    soma = soma + vet[i];
                    cont = cont + 1;
                }
        }

        if (cont == 0) {
            System.out.println("Nao havia nenhum numero par");
        }
        else {
            double media = soma / cont;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
