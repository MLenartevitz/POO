
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 * @author mikael
 */
public class Aplic {
    public static void main(String[] args) {
        Circulo objCir = new Circulo();
        //definição da classe circulo
                Scanner entrada = new Scanner(System.in);
        double medRaio;
        int opcao;
        
        System.out.println("Digite a medida da Raio do circulo: ");
        medRaio = entrada.nextDouble();    
       
        
        objCir.setRaio(medRaio);
        
        do{
            System.out.println("\n\n1-Consultar área do circulo");
            System.out.println("2-Consultar perimetro do circulo");
            System.out.println("3-Consultar Diagonal do circulo");
            System.out.println("4-Sair");
            System.out.println("Digite a opção: ");
            opcao = entrada.nextInt();
            if (opcao == 1){
                System.out.println("medida da altura do circulo " + objCir.getRaio());
                System.out.println("mostrar área do circulo: " + 
                                    objCir.calcArea());
            }else
                if(opcao == 2){
                    System.out.println("medida da altura do circulo " + objCir.getRaio());
                    System.out.println("mostrar perimetro do circulo: " + 
                                    objCir.calcPerimetro());
                }else
                    if(opcao == 3){
                    System.out.println("medida da altura do circulo " + objCir.getRaio());
                    System.out.println("mostrar diagonal do circulo: " + 
                                    objCir.calcDiagonal());
                    }
        }while(opcao < 4);
    }  
}
