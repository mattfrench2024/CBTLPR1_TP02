import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextInt();

        do {
            System.out.print("Digite o segundo valor (maior que o primeiro): ");
            valor2 = sc.nextInt();
            if (valor2 <= valor1) {
                System.out.println("Erro: o segundo valor deve ser maior que o primeiro.");
            }
        } while (valor2 <= valor1);

        System.out.println("Valores aceitos: " + valor1 + " e " + valor2);
        sc.close();
    }
}

