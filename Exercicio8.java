import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] original = new int[3][4];
        int[][] resultado = new int[3][4];

        System.out.println("Digite 12 valores para a matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                original[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite a constante multiplicativa: ");
        int constante = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                resultado[i][j] = original[i][j] * constante;
            }
        }

        System.out.println("Matriz original:");
        for (int[] linha : original) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz resultante:");
        for (int[] linha : resultado) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

