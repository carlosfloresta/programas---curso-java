
package entidade;


public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    
    
    public double gradeFinal(){
        
        return nota1+nota2+nota3;
    }
    
    public double pontosParaPassar(){
        
       if (gradeFinal() < 60.0) {
        return 60.0 - gradeFinal();
        }
          else {
          return 0.0;
}
    }
}
