package LivrariaPOO;


import java.util.Date;

/** 
 * Classe com as informações do Gerente. Gerente É-UM tipo de Funcionário.
 * 
 * **/
public class Gerente extends Funcionario{
    
    /*private String nome;
    private int dataDeAdmissao;
    private int dataDeAniversario;
    private double salario;
    private Endereco enderecoDoGerente;
    
    public Gerente(String nome, int dataDeAdmissao, int dataDeAniversario, double salario, Endereco enderecoDoGerente) {
        this.nome = nome;
        this.dataDeAdmissao = dataDeAdmissao;
        this.dataDeAniversario = dataDeAniversario;
        this.salario = salario;
        this.enderecoDoGerente = enderecoDoGerente;
    }*/
    
    

   /* public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
    public void setDataDeAdmissao(int dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public int getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setEnderecoDoGerente(Endereco enderecoDoGerente) {
        this.enderecoDoGerente = enderecoDoGerente;
    }

    public Endereco getEnderecoDoGerente() {
        return enderecoDoGerente;
    }*/
    
    //String nome, int dataDeAdmissao, int dataDeAniversario, double salario, Endereco enderecoDaLivraria

    public Gerente(String nome, String dataDeAdmissao, String dataDeAniversario, double salario,
                   LivrariaPOO.Endereco enderecoDoFuncionario) {
        super(nome, dataDeAdmissao, dataDeAniversario, salario, enderecoDoFuncionario);
    }

    public String toString(){
        return String.format("Nome do Gerente: %s " +
            "\nData de Admissão: %s" +
            "\nData de Aniversário: %s" +
            "\nSalário: %.2f " +
            "\nEndereço da Gerente: %s", nome, dataDeAdmissao, dataDeAniversario, salario, enderecoDoFuncionario);
    }
}
