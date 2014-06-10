package LivrariaPOO;


public class Funcionario {
    
    protected String nome;
    protected int dataDeAdmissao;
    protected int dataDeAniversario;
    protected double salario;
    protected LivrariaPOO.Endereco enderecoDoFuncionario;

    public Funcionario(String nome, int dataDeAdmissao, int dataDeAniversario, double salario,
                       LivrariaPOO.Endereco enderecoDoFuncionario) {
        super();
        this.nome = nome;
        this.dataDeAdmissao = dataDeAdmissao;
        this.dataDeAniversario = dataDeAniversario;
        this.salario = salario;
        this.enderecoDoFuncionario = enderecoDoFuncionario;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataDeAdmissao(int dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public int getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAniversario(int dataDeAniversario) {
        this.dataDeAniversario = dataDeAniversario;
    }

    public int getDataDeAniversario() {
        return dataDeAniversario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setEnderecoDoFuncionario(LivrariaPOO.Endereco enderecoDoFuncionario) {
        this.enderecoDoFuncionario = enderecoDoFuncionario;
    }

    public LivrariaPOO.Endereco getEnderecoDoFuncionario() {
        return enderecoDoFuncionario;
    }
}
