package LivrariaPOO;

import com.sun.org.apache.xml.internal.utils.StringBufferPool;

import java.util.*;

public class Estoque {
    
    private ArrayList<Item> itens = new ArrayList<Item>();
    
    public void cadastraItem(Item item){
        this.itens.add(item);
    }
    
    public void removeItem(Item item, int quantidade){
        int i = item.getQuantidade() - quantidade;
        //i--;
        System.out.println("Quantidade Total do "+ item.getNome() + " em estoque: "+ i);
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
}