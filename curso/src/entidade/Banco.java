
package entidade;


public class Banco {
    private int numeroConta;
    private String nome;
    private double valorInicial;
    
    public Banco(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }
    
    public Banco(int numeroConta, String nome, double valorInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
       addSaldo(valorInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorInicial() {
        return valorInicial;
    }
    
     public void addSaldo(double saldo) {
        valorInicial+= saldo;
    }

    public void removeSaldo(double saldo) {
        valorInicial -= saldo + 5;
    }
    
    public String toString() {
        return  "Conta: "
                + numeroConta
                + ", Correntista: "
                + nome
                + " Saldo da conta: $ "
                + String.format("%.2f", valorInicial);
    }
    
}
