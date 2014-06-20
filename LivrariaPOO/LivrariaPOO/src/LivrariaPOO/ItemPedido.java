package LivrariaPOO;

public class ItemPedido {
    
    private Item item;
    private int quantidade;
    private double total;


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
    
    /*public void setTotal(double total){
        total = quantidade * item.getPreco();
    }*/
    
    //calcula o valor total do item do pedido
    public double calculaValorTotal(){
        return total = quantidade * item.getPreco();
    }
    
    public String toString(){
        return String.format("\nSeu item: %s" + "\nPreço Unitário: %.2f" + "\nQuantidade: %d" + "\nTotal: %.2f", item.getNome(), item.getPreco(), quantidade, calculaValorTotal());
    }
}
