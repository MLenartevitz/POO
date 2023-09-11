
import fatec.poo.model.Retangulo;
import java.util.Scanner;
/**
 * @author Mikael
 */
public class Aplic {

    public static void main(String[] args) {
        Retangulo objRet; //definição de ponteiro
        Scanner entrada;
        int opcao;
        
        objRet = new Retangulo();
        entrada = new Scanner(System.in);
        
        //mecanismo de passagem de mensagem 
        System.out.println("Digite o valor da altura: ");
        objRet.setAltura(entrada.nextDouble());
        System.out.println("Digite o valor da base: ");
        objRet.setBase(entrada.nextDouble());    
        
        do{
        System.out.println("Escolha alguma opção");
        System.out.println("1 - Area ");
        System.out.println("2 - Perimetro");
        System.out.println("3 - Sair");      
        opcao = entrada.nextInt();
        if(opcao == 1){
                    System.out.println("Medida da Area do retangulo " + objRet.calcArea());                
        }
        else
           if(opcao == 2){
                    System.out.println("Medida do Perimetro " + objRet.calcPerimetro());
        }
        }while(opcao < 3);
    }
    
}
