import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String nome = "Luís Felipe";
        String tipoConta = "Conta Poupança";
        double saldo = 2999.99;

        System.out.println("----------------------------------");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("\n----------------------------------");


        int opcao = 0;
        double valor;
        double recebe;

        while (opcao != 4) {
            System.out.println("\nMenu de opções: ");
            System.out.println("Opção 1: Visualizar saldo");
            System.out.println("Opção 2: Enviar valor");
            System.out.println("Opção 3: Receber valor");
            System.out.println("Opção 4: Sair");
            opcao = scanner.nextInt();
            
            if(opcao == 1){
                System.out.println("Seu saldo atual é: " + saldo);
            }else if (opcao == 2) {
                System.out.println("Digite o valor que quer enviar: ");
                valor = scanner.nextDouble();
                System.out.println("Valor enviado!" + valor);
                saldo = saldo - valor;
            }else if(opcao == 3){
                System.out.println("Digite o valor que quer receber:");
                recebe = scanner.nextDouble();
                System.out.println("Valor recebido!" + recebe);
                saldo = saldo + recebe;
            }else if (opcao == 4) {
                System.out.println("Programa encerrado!");
            }else{
                System.out.println("Opção inválida!");
            }
        }
    }
}
