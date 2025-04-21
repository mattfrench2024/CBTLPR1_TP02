import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] nomes = new String[2][3];

        System.out.println("Digite 6 nomes para a matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Nome [" + i + "][" + j + "]: ");
                nomes[i][j] = sc.nextLine();
            }
        }

        System.out.println("Nomes na matriz:");
        for (String[] linha : nomes) {
            for (String nome : linha) {
                System.out.print(nome + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

