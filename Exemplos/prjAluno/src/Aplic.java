
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 * @author mikael
 */
public class Aplic {
    public static void main(String[] args) {
        Aluno objAlu = new Aluno();
        //definição da classe Aluno
                Scanner entrada = new Scanner(System.in);
        double medPrv,medPrv2, medTrab,medTrab2;
        int opcao,ra ;
  
               
        System.out.println("Digite o ra ");
        ra = entrada.nextInt();
        System.out.println("Digite a nota p1: ");
        medPrv = entrada.nextDouble(); 
        System.out.println("Digite a nota p2: ");
        medPrv2 = entrada.nextDouble(); 
        System.out.println("Digite a nota trab1: ");
        medTrab = entrada.nextDouble();  
        System.out.println("Digite a nota trab2: ");
        medTrab2 = entrada.nextDouble();        
        
        objAlu.setRa(ra);
        objAlu.setNtPrv1(medPrv);
        objAlu.setNtPrv2(medPrv2);
        objAlu.setTrab1(medTrab);
        objAlu.setTrab2(medTrab2);
        
        
        do{
            System.out.println("\n\n1-Exibir Nota das Provas/Trabalhos");
            System.out.println("2-Exibir Média dos Trabalhos/Provas");
            System.out.println("3-Exibir Média Final");
            System.out.println("4-Sair");
            System.out.println("Digite a opção: ");
            opcao = entrada.nextInt();
            if (opcao == 1){
                System.out.println("As notas das primeira e segunda provas: " + objAlu.getNtPrv1() + ", " + objAlu.getNtPrv2());
                System.out.println("As notas dos primeiro e segundo trabalhos: " + objAlu.getTrab1() + ", " + objAlu.getTrab2());
            }else
                if(opcao == 2){
                    System.out.println("A média das notas é: " + objAlu.calcMediaProva());
                    System.out.println("As média dos trabalhos: " + objAlu.calcMediaTrabalho());
                }else
                    if(opcao == 3){
                        System.out.println("Média Final: " + objAlu.calcMediaFinal());
                    }
        }while (opcao < 4);
    }
    
}