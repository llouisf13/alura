import java.util.Scanner;

public class Adivinha {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero, numero1, numero2;
        numero = leitor.nextInt();

        if (numero >=0) {
            System.out.println("Número positivo.");
        }else{
            System.out.println("Número negativo.");
        }

        System.out.println("Digite dois números:");
        numero1 = leitor.nextInt();
        numero2 = leitor.nextInt();

        if(numero1 == numero2){
            System.out.println("Números iguais.");
        }else{
            System.out.println("Números diferentes.");
        }
        if (numero1 > numero2) {
            System.out.println(String.format("%d é maior que %d", numero1, numero2));
        }else{
            System.out.println(String.format("%d é menor que %d", numero1, numero2

            ));
        }

       
}

}