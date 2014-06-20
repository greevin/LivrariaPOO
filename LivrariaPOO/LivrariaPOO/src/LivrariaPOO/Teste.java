package LivrariaPOO;

import java.util.*;

public class Teste {
    public static void main(String[] args) {
        
        Endereco[] enderecos = new Endereco[4];
        
        enderecos[0] = new Endereco("Avenida", "dos Aeronautas", "444", "Nenhum", "Belo Horizonte", "MG");
        enderecos[1] = new Endereco("Rua", "da Bahia","550C", "Fundos", "Belo Horizonte", "MG");
        enderecos[2] = new Endereco("Rua", "dos Abacateiros", "3000","Sem complemento", "São Paulo", "SP");
        enderecos[3] = new Endereco("Avenida", "dos Jacarandás", "3242", "Casa", "Bento Gonçalves", "RS");
        
        for(Endereco endereco : enderecos){
          System.out.printf("%s \n\n", endereco);
        }

        /*Endereco endereco1 = new Endereco("Avenida", "dos Aeronautas", "444", "Nenhum", "Belo Horizonte", "MG");
        Endereco endereco2 = new Endereco("Rua", "da Bahia","550C", "Fundos", "Belo Horizonte", "MG");
        Endereco endereco3 = new Endereco("Rua", "dos Abacateiros", "3000","Sem complemento", "São Paulo", "SP");
        Endereco endereco4 = new Endereco("Avenida", "dos Jacarandás", "3242", "Casa", "Bento Gonçalves", "RS");*/
        
        Cliente cliente1 = new Cliente("José do Nascimento", "12/12/1986", "13/05/2013", enderecos[1], enderecos[2]);
        //endereco3 onde o Gerente mora.
        Gerente gerente1 = new Gerente("Carlos Eduardo", "13/01/1986", "06/05/2003", 450, enderecos[3]);
        //Vendedor vendedor1 = new Vendedor("Juliano Pereira", "10/10/1980", "11/11/2011", 120, endereco4);
        
        //Filial filial1 = new Filial("Livraria da Rua de Cima", endereco3, gerente1);*/
        
        Livro livro1 = new Livro("Livro das Abelhas", "Editora Europa", 1, "Portugues", "05/05/2014", 230, 111111, 50, "Capa Dura", 3);
        Livro livro2 = new Livro("O Senhor dos Anéis - Volume Único", "Editora Atlas", 10, "Portugues", "09/04/2013", 690, 222222, 150, "Capa Comum", 5);

        Jornal jornal1 = new Jornal("O Estado de Minas", "O Estado de Minas", 545454, "Português", "05/10/2013", 50, 22222222, 2, 3);
        
        //ItemPedido item = new ItemPedido(jornal1, 3);
        Estoque estoque = new Estoque();
        estoque.cadastraItem(livro1);
        estoque.cadastraItem(livro2);
        estoque.cadastraItem(jornal1);
        System.out.println(estoque);
        
        ItemPedido item = new ItemPedido(jornal1, 2);
        System.out.println("Pedido do cliente: "+cliente1.getNome());
        System.out.println(item.toString());
        
        //System.out.println(cliente1);
        //System.out.println();
        //System.out.println(gerente1);
        //System.out.println();
        //System.out.println(filial1);
        //System.out.println();
        //System.out.println(vendedor1);
        //System.out.println();
        //System.out.println("Em estoque: ");
        //System.out.println(estoque);
        //System.out.println();
        /*System.out.println(livro1);
        System.out.println();
        System.out.println(livro2);
        System.out.println();*/
        //System.out.println(jornal1);
        //System.out.println(item);*/
        
    }
}
