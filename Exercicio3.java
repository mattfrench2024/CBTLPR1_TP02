import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            int n;
            do {
                System.out.print("Digite a quantidade de valores (menor que 20): ");
                n = sc.nextInt();
                if (n <= 0 || n >= 20) {
                    System.out.println("Erro: número inválido. Tente novamente.");
                }
            } while (n <= 0 || n >= 20);

            int[] valores = new int[n];
            int soma = 0, positivos = 0, negativos = 0;
            int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                System.out.print("Digite o valor [" + (i + 1) + "]: ");
                valores[i] = sc.nextInt();
                soma += valores[i];
                if (valores[i] > 0) positivos++;
                else if (valores[i] < 0) negativos++;

                if (valores[i] > maior) maior = valores[i];
                if (valores[i] < menor) menor = valores[i];
            }

            double media = soma / (double) n;
            double percPos = (positivos * 100.0) / n;
            double percNeg = (negativos * 100.0) / n;

            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média: " + media);
            System.out.printf("%% Positivos: %.2f%%\n", percPos);
            System.out.printf("%% Negativos: %.2f%%\n", percNeg);

            do {
                System.out.print("Deseja executar novamente? (S/N): ");
                repetir = sc.next().toUpperCase().charAt(0);
            } while (repetir != 'S' && repetir != 'N');

        } while (repetir == 'S');

        sc.close();
    }
}

