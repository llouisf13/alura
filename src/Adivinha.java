import java.util.Scanner;

public class Adivinha {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero;
        numero = leitor.nextInt();

        if (numero >=0) {
            System.out.println("Número positivo.");
        }else{
            System.out.println("Número negativo.");
        }

       
}

}