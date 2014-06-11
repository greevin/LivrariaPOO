package LivrariaPOO;

import java.util.*;

public class Estoque {
    
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    
    public void cadastraLivro(Livro livro){
        livros.add(livro);
    }
    
    //chama o metódo toString da classe Livros
    public String toString(){
        return livros.toString();
    }
    
    

}