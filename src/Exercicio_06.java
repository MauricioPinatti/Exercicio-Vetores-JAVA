import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

    //Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
    //do vetor (supor não haver empates). Mostrar também a posição do maior elemento.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // variavel N para dizer tamanho do vetor
        int N = sc.nextInt();

        // criando novo vetor
        double[] vet = new double[N];

        // preenchendo as posições do vetor
        for ( int i=0 ; i < N; i++){
            vet[i] = sc.nextDouble();
        }

        //identificando o maior numero digitado e a posição

        // variavel para armazenar o maior numero
        double maior = vet[0];
        // variavel para dizer a posição do maior numero digitado
        int posicaoMaior = 0;


        for (int i=1; i<N; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("%.1f%n", maior);
        System.out.println(posicaoMaior);

        sc.close();
    }
}
