import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;

        do {
            System.out.print("Digite o número de linhas (máx 10): ");
            m = sc.nextInt();
            System.out.print("Digite o número de colunas (máx 10): ");
            n = sc.nextInt();
        } while (m <= 0 || n <= 0 || m > 10 || n > 10);

        int[][] matriz = new int[m][n];

        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz transposta:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
 
