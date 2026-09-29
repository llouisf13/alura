import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while(opcao != 3){

        System.out.println("Opção 1: Deseja calcular área quadrado: ");
        System.out.println("Opção 2: Deseja calcular área círculo: ");
        System.out.println("Opção 2: Sair: ");
        System.out.println("Escolha uma opção:");
        opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o lado do quadrado:");
            double lado = scanner.nextDouble();
            double area = lado * lado;
            System.out.println("Área do quadrado " + area);
        }else if(opcao == 2){
            System.out.println("Digite o raio de circulo: ");
            double raio = scanner.nextDouble();
            double raioCirculo = 3.14 * raio * raio;
            System.out.println("Área do círculo: " + raioCirculo);
        }else if(opcao == 3){
            System.out.println("Programa encerrado!");
        }else{
            System.out.println("Opção inválida");
        }
    }
}

}