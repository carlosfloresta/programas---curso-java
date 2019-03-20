
package entidade;

public class Construtor_Produto {

    public String nome;
    public double preco;
    public int quantidade;
    
    //isso é o construtor
    public Construtor_Produto(String nome,double preco,int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
    }
    //isso é sobrecarga
    public Construtor_Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco; 
    }
    
    public Construtor_Produto(){ 
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
