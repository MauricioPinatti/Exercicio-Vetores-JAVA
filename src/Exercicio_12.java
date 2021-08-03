import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12 {

    //Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres.
    //Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
    //considerando aprovados aqueles cuja média das notas seja maior ou igual a seis.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] nomes = new String[N];
        double[] notasSemestre1 = new double[N];
        double[] notasSemestre2 = new double[N];

        for (int i=0; i<N; i++) {
            nomes[i] = sc.next();
            notasSemestre1[i] = sc.nextDouble();
            notasSemestre2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i=0; i<N; i++) {
            double media = (notasSemestre1[i] + notasSemestre2[i]) / 2.0;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
