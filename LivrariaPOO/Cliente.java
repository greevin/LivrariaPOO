package LivrariaPOO;

import java.util.*;

public class Cliente {
    
    private String nome;
    private int dataDeCadastro;
    private int dataDeAniversario;
    private Endereco enderecoDeEntrega;
    private Endereco enderecoDeFaturamento;

    public Cliente(String nome, int dataDeCadastro, int dataDeAniversario, Endereco enderecoDeEntrega,
                   Endereco enderecoDeFaturamento) {
        this.nome = nome;
        this.dataDeAniversario = dataDeAniversario;
        this.dataDeCadastro = dataDeCadastro;
        this.enderecoDeEntrega = enderecoDeEntrega;
        this.enderecoDeFaturamento = enderecoDeFaturamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataDeAniversario(int dataDeAniversario) {
        this.dataDeAniversario = dataDeAniversario;
    }

    public int getDataDeAniversario() {
        return dataDeAniversario;
    }
    
    public void setDataDeCadastro(int dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public int getDataDeCadastro() {
        return dataDeCadastro;
    }
    
    //String nome, int dataDeCadastro, int dataDeAniversario, 
    //Endereco enderecoDeEntrega, Endereco enderecoDeFaturamento
    public String toString(){
        return String.format("Nome do Cliente: %s " +
            "\nCadastrado desde: %d " +
            "\nData de Aniversário: %d " +
            "\nEndereço de Entrega: %s" +
            "\nEndereço de Faturamento: %s", nome, dataDeCadastro, dataDeAniversario, enderecoDeEntrega, enderecoDeFaturamento);
    }
}
