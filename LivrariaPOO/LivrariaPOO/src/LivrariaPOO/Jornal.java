package LivrariaPOO;

public class Jornal extends Item {


    public Jornal(String nome, String editora, int edicao, String idioma, String dataDePublicacao, int numeroDePaginas,
                  int codigoDeBarras, double preco, int quantidade) {
        super(nome, editora, edicao, idioma, dataDePublicacao, numeroDePaginas, codigoDeBarras, preco, quantidade);
    }

    public String toString() {
        return super.toString();
    }
}
