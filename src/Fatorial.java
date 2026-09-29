import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber seu fatorial:");
        int num = scanner.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= num; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial é: " + fatorial);
    }
}
