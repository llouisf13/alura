import java.util.Scanner;

public class Verifica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para conferir se é par ou ímpar:");
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("Número par!");
        }else
            System.out.println("Número impar!");

    }
}
