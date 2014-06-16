package LivrariaPOO;

import com.sun.org.apache.xml.internal.utils.StringBufferPool;

import java.util.*;

public class Estoque {
    
    private ArrayList<Item> itens = new ArrayList<Item>();
    
    public void cadastraItem(Item item){
        this.itens.add(item);
    }
    
    public void listaItem(){
        
    }
    
    //chama o metódo toString da classe Livros
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Estoque (Total de Itens: "+ itens.size() + ") \n");
        
        for(Item item:itens){
            sb.append(item);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    /*public String toString(){
        String resp;
        for(Livro livros: resp);
        return ;
    }*/
    
    

}