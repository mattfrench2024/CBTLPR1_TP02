import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ordem;

        do {
            System.out.print("Digite a ordem da matriz quadrada (máx 10): ");
            ordem = sc.nextInt();
        } while (ordem <= 0 || ordem > 10);

        double[][] matriz = new double[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        double determinante = calcularDeterminante(matriz, ordem);
        System.out.println("Determinante da matriz: " + determinante);

        sc.close();
    }

    public static double calcularDeterminante(double[][] matriz, int n) {
        if (n == 1) return matriz[0][0];
        if (n == 2) return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];

        double det = 0;
        for (int k = 0; k < n; k++) {
            double[][] temp = new double[n - 1][n - 1];

            for (int i = 1; i < n; i++) {
                int col = 0;
                for (int j = 0; j < n; j++) {
                    if (j == k) continue;
                    temp[i - 1][col++] = matriz[i][j];
                }
            }

            det += Math.pow(-1, k) * matriz[0][k] * calcularDeterminante(temp, n - 1);
        }

        return det;
    }
}

