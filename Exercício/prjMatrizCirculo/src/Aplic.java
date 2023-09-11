
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author mikael
 */
public class Aplic {
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("0.00");
       Scanner entrada = new Scanner(System.in);       
       String unidade;
       int i;
       
       Circulo[] matCir = new Circulo[10];
        //definição da classe circulo
        double medRaio;
        int opcao;
        
        for (i=0; i < 10; i++){
        System.out.println("\n\nDigite a unidade de medida: ");
        unidade = entrada.next(); 
        
        matCir[i] = new Circulo(unidade);

        System.out.println("Digite a medida da Raio do circulo: ");
        medRaio = entrada.nextDouble();    
       
        
        matCir[i].setRaio(medRaio);
        
          for (i=0; i < 10; i++){                         //passagem de mensagens
            System.out.println("\n\nObjeto Retangulo " + (i+1)); 

            System.out.println("Medida da base: " + df.format(matCir[i].getRaio()) + 
                                                    "   " + matCir[i].getUnidadeMedida());	
            System.out.println("Área: "  + df.format(matCir[i].calcArea()) + 
                                                    "   " + matCir[i].getUnidadeMedida());
            System.out.println("Perímetro: " + df.format(matCir[i].calcPerimetro()) + 
                                                    "   " + matCir[i].getUnidadeMedida());
            System.out.println("Diagonal: "  + df.format(matCir[i].calcDiagonal()) + 
                                                    "   " + matCir[i].getUnidadeMedida());
        }   
        }
    }
}
        

