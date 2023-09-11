
import fatec.poo.model.Retangulo;

/**
 * @author Mikael
 */
public class Aplic {

    public static void main(String[] args) {
        Retangulo objRet; //definição de ponteiro
        
        objRet = new Retangulo();
        
        //mecanismo de passagem de mensagem 
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        System.out.println(" Resultado de cada um são:");
        System.out.println(" Medida da Area do retangulo " + objRet.calcArea());
        System.out.println(" Medida do Perimetro " + objRet.calcPerimetro());
    }
    
}
