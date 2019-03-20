
package entidade;

import java.util.Date;

public class Pedido {
    
    private Date data;
    private Encapisulamento_Produto produto;

    public Pedido(Date data, Encapisulamento_Produto produto) {
        this.data = data;
        this.produto = produto;
        this.produto.nome = "TV";
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Encapisulamento_Produto getProduto() {
        return produto;
    }

    public void setProduto(Encapisulamento_Produto produto) {
        this.produto = produto;
    }
    
    
    
}
