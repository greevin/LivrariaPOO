package LivrariaPOO;

public class ItemPedido {
    
    private Item item;
    private int quantidade;


    public ItemPedido(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }


    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setQuantidade(int quantidade) {
        
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public String toString(){
        return String.format("Seu item: %s" + "\n\nQuantidade: %d", item, quantidade );
    }
}
