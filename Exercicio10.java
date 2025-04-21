import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ordem;

        do {
            System.out.print("Digite a ordem da matriz quadrada (máx 10): ");
            ordem = sc.nextInt();
        } while (ordem <= 0 || ordem > 10);

        double[][] matriz = new double[ordem][ordem];
        double[][] identidade = new double[ordem][ordem];

        // Entrada da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
                identidade[i][j] = (i == j) ? 1 : 0;
            }
        }

        // Gauss-Jordan para inversa
        for (int i = 0; i < ordem; i++) {
            double pivo = matriz[i][i];
            if (pivo == 0) {
                System.out.println("A matriz não é inversível.");
                return;
            }

            for (int j = 0; j < ordem; j++) {
                matriz[i][j] /= pivo;
                identidade[i][j] /= pivo;
            }

            for (int k = 0; k < ordem; k++) {
                if (k != i) {
                    double fator = matriz[k][i];
                    for (int j = 0; j < ordem; j++) {
                        matriz[k][j] -= fator * matriz[i][j];
                        identidade[k][j] -= fator * identidade[i][j];
                    }
                }
            }
        }

        System.out.println("Matriz inversa:");
        for (double[] linha : identidade) {
            for (double valor : linha) {
                System.out.printf("%.2f\t", valor);
            }
            System.out.println();
        }

        sc.close();
    }
}

