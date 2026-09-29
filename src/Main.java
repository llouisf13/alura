public class Main {
    public static void main(String[] args) {
        
       Autor autor1 = new Autor("Rebeca f. Kuang", "Asiática");
       Autor autor2 = new Autor("Marco Túlio", "Brasileiro");

       Livro l1 = new Livro("Guerra da Papoula", 2019, autor1);
       Livro l2 = new Livro("Torto Arado", 2023, autor2);

       l1.exibirDados();
       l2.exibirDados();
    }
}
