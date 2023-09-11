
import fatec.poo.model.Circulo;
import java.text.DecimalFormat; 
import java.util.Scanner;

/**
 * @author mikael
 */
public class Aplic {
    public static void main(String[] args) {
        //definição da classe circulo
                Scanner entrada = new Scanner(System.in);
        double medRaio;
        int opcao;
        String unidade;
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        Circulo objCir = new Circulo(unidade);

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
                    switch (opcao) {
                        case 1:
                            System.out.println("medida da altura do circulo " + objCir.getRaio() + " " + objCir.getUnidade()); 
                            System.out.println("mostrar área do circulo: " +
                                    objCir.calcArea() + " " + objCir.getUnidade());
                            break;
                        case 2:
                            System.out.println("medida da altura do circulo " + objCir.getRaio() + " " + objCir.getUnidade());
                            System.out.println("mostrar perimetro do circulo: " + 
                                    objCir.calcPerimetro() + " " + objCir.getUnidade());
                            break;
                        case 3:
                            System.out.println("medida da altura do circulo " + objCir.getRaio() + " " + objCir.getUnidade());
                            System.out.println("mostrar diagonal do circulo: " + 
                                    objCir.calcDiagonal() + " " + objCir.getUnidade());
                            break;
                        default:
                            break;
                    }
        }while(opcao < 4);
    }  
}
