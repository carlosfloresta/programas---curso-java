
package entidade;


public class Encapisulamento_Produto {
      String nome;
    private double preco;
    private int quantidade;
    
     public Encapisulamento_Produto(){ 
    }
    
    //isso é o construtor
    public Encapisulamento_Produto(String nome,double preco,int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
    }
    //isso é sobrecarga
    public Encapisulamento_Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco; 
    }
    
   
    
    public void setNome(String nome){
        
        this.nome = nome;
    }
    
    public String getName(){
        
        return nome;
    }
    
     public double getPreco(){
        
        return preco;
    }
     
     public void setPreco(double preco){
        
        this.preco = preco;
    }
     
     public int getQuantidade(){
        
        return quantidade;
    }

    public double totalValueInStock() {
        return preco * quantidade;
    }

    public void addProducts(int quantidade) {
        this.quantidade+= quantidade;
    }

    public void removeProducts(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
