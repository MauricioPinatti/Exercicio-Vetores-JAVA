import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];

        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
        }

        System.out.println("Nomes lidos:");

        // para cada string "nome"(ou qualquer nome que quiser) : imprima do vetor "nomes"
        for (String nome : nomes) {
            System.out.println(nome);
        }

        /*
        outra forma de imprimir os nomes da lista
        for ( int i=0 ; i < N; i++){
            nomes[i] = sc.next();
            System.out.println(nomes[i]);
        }
         */
        sc.close();
    }
}