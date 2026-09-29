public class Livro {
    String titulo;
    int anoDePublicacao;
    Autor autor;

    public Livro(String titulo, int anoDePublicacao, Autor autor){
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.autor = autor;
    }

    public void exibirDados(){
        System.out.println("Título: " + titulo);
        System.out.println("Ano de publicação: " + anoDePublicacao);
        System.out.println("Autor: " + autor.nome);
        System.out.println("Nacionalidade do autor: " + autor.nacionalidade);
    }
}
