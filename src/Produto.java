public class Produto {
    String nome;
    double preco;
    int qtd;

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void exibirDados(){
        System.out.println("\nNome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade disponível: " + qtd);
        System.out.println("Valor total: " + preco * qtd);
    }
}
