package LivrariaPOO;

public class Item {
    
    private String nome;
    private String editora;
    private int edicao;
    private String idioma;
    private String dataDePublicacao;
    private int numeroDePaginas;
    private int codigoDeBarras;
    private double preco;


    public Item(String nome, String editora, int edicao, String idioma, String dataDePublicacao, int numeroDePaginas,
                int codigoDeBarras, double preco) {
        this.nome = nome;
        this.editora = editora;
        this.edicao = edicao;
        this.idioma = idioma;
        this.dataDePublicacao = dataDePublicacao;
        this.numeroDePaginas = numeroDePaginas;
        this.codigoDeBarras = codigoDeBarras;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setDataDePublicacao(String dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }

    public String getDataDePublicacao() {
        return dataDePublicacao;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    
    //String nome, String editora, int edicao, String formato, String idioma, int dataDePublicacao,
    //int numeroDePaginas, int codigoDeBarras, double preco

    public String toString() {
        return String.format("\nNome: %s " + "\nEditora: %s" + "\nEdicao: %s" + "\nIdioma: %s" +
                             "\nData de Publicação: %s" + "\nNumero de Páginas: %d" + "\nCódigo de Barras: %s" +
                             "\nPreço: %.2f", nome, editora, edicao, idioma, dataDePublicacao,
                             numeroDePaginas, codigoDeBarras, preco);
    }
}
