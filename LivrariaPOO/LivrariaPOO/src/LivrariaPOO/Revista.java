package LivrariaPOO;

public class Revista extends Item {


    public Revista(String nome, String editora, int edicao, String idioma, String dataDePublicacao,
                   int numeroDePaginas, int codigoDeBarras, double preco) {
        super(nome, editora, edicao, idioma, dataDePublicacao, numeroDePaginas, codigoDeBarras, preco);
    }
    
    public String toString(){
        return super.toString();
    }
}
