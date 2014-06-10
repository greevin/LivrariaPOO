package LivrariaPOO;


public class Vendedor extends LivrariaPOO.Funcionario{

    public Vendedor(String nome, int dataDeAdmissao, int dataDeAniversario, double salario,
                    LivrariaPOO.Endereco enderecoDoFuncionario) {
        super(nome, dataDeAdmissao, dataDeAniversario, salario, enderecoDoFuncionario);
    }
    
    public String toString(){
        return String.format("Nome do Vendedor: %s " +
            "\nData de Admissão: %s" +
            "\nData de Aniversário: %s" +
            "\nSalário: %.2f " +
            "\nEndereço da Vendedor: %s", nome, dataDeAdmissao, dataDeAniversario, salario, enderecoDoFuncionario);
    }
}
