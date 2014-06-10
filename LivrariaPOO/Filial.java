package LivrariaPOO;

public class Filial {
    
    private String razaoSocial;
    private LivrariaPOO.Endereco enderecoFisico;
    private Gerente gerente;
    private LivrariaPOO.Estoque estoque;

    public Filial(String razaoSocial, LivrariaPOO.Endereco enderecoFisico, Gerente gerente) {
        super();
        this.razaoSocial = razaoSocial;
        this.enderecoFisico = enderecoFisico;
        this.gerente = gerente;
    }


    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setEnderecoFisico(LivrariaPOO.Endereco enderecoFisico) {
        this.enderecoFisico = enderecoFisico;
    }

    public LivrariaPOO.Endereco getEnderecoFisico() {
        return enderecoFisico;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Gerente getGerente() {
        return gerente;
    }
    
    //String razaoSocial, Endereco enderecoFisico, Gerente gerente
    public String toString(){
        return String.format("Razão Social: %s"+
                             "\nEndereço da Livraria: %s"+
                             "\n%s", razaoSocial, enderecoFisico, gerente);
    }
}
