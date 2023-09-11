package fatec.poo.model;

/**
 * @author mikael
 */
public class Circulo {
    private double raio;
    private String unidade;
       
    public Circulo(String uniMed){
        unidade = uniMed;
    }       
    public void setRaio(double r){
    raio = r;
    }
    public double getRaio(){
        return(raio);
    }

    public String getUnidade() {
        return unidade;
    }
    
    public double calcArea(){
    return(Math.PI * Math.pow(raio, 2));
    }
    public double calcPerimetro(){
    return(2*(Math.PI * raio));
    }            
    public double calcDiagonal(){
    return (2 * raio);
    }          
}