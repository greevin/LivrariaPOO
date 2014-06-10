package LivrariaPOO;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Avenida", "dos Aeronautas", "444", "Nenhum", "Belo Horizonte", "MG");
        Endereco endereco2 = new Endereco("Rua", "da Bahia","550C", "Fundos", "Belo Horizonte", "MG");
        Endereco endereco3 = new Endereco("Rua", "dos Abacateiros", "3000","Sem complemento", "São Paulo", "SP");
        Endereco endereco4 = new Endereco("Avenida", "dos Jacarandás", "3242", "Casa", "Bento Gonçalves", "RS");
        
        Cliente cliente1 = new Cliente("José do Nascimento", 12, 12, endereco1, endereco2);
        //endereco3 onde o Gerente mora.
        LivrariaPOO.Gerente gerente1 = new LivrariaPOO.Gerente("Carlos Eduardo", 34, 34, 450,endereco3);
        LivrariaPOO.Vendedor vendedor1 = new LivrariaPOO.Vendedor("Juliano Pereira", 3434, 434343, 120, endereco4);
        
        //Filial filial1 = new Filial("Livraria da Rua de Cima", endereco3, gerente1);
        
        //Livro livro1 = new Livro("Livro das Abelhas", "Editora Europa", 1, "Capa Dura", "Portugues", 2222, 230, 111111, 50);
        
        /*System.out.println(cliente1);
        System.out.println();
        System.out.println(gerente1);
        System.out.println();
        System.out.println(filial1);
        System.out.println();
        System.out.println(vendedor1);
        System.out.println();*/
        //System.out.println(livro1);
    }
}
