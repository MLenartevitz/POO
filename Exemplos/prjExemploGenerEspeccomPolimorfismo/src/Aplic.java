import fatec.poo.model.Horista;
import fatec.poo.model.Mensalista;
import java.text.DecimalFormat;
/**
 * @author 0030482211028
 */
public class Aplic {
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat ("#,##0.00"); 
    Horista funcHor = new Horista (1010,"Pedro Silveira","14/05/1978",15.80);
    Mensalista funcMen = new Mensalista (0101,"Jacinto Silva","13/09/1983",12.80);
        
    funcHor.setCargo("Pedreiro");
    funcHor.setQtdHorTrab (90);
    System.out.println("O registro do funcionario eh: " + funcHor.getRegistro());
    System.out.println("O funcionario eh: " + funcHor.getNome() );
    System.out.println("O cargo dele eh: " + funcHor.getCargo());
    System.out.println("Data de admissão: " + funcHor.getDtAdmissao());
    System.out.println("Salario Bruto => " +
                        df.format(funcHor.calcSalBruto()));
    System.out.println("Desconto        => " +
                        df.format(funcHor.calcDesconto()));
    System.out.println("Salario Liquido => " +
                        df.format(funcHor.calcSalLiquido ()));
    System.out.println("Gratificação    => " +
                        df.format(funcHor.calcGratificacao()));
    
    funcMen.setCargo("Professor");
    funcMen.setNumSalMin(12);
    System.out.println("\n\nO registro do funcionario eh: " + funcMen.getRegistro());
    System.out.println("O funcionario eh: " + funcMen.getNome() );
    System.out.println("O cargo dele eh: " + funcMen.getCargo());
    System.out.println("Data de admissão: " + funcMen.getDtAdmissao());
    System.out.println("Salario Bruto   => " +
                        df.format(funcMen.calcSalBruto()));
    System.out.println("Desconto        => " +
                        df.format(funcMen.calcDesconto()));
    System.out.println("Salario Liquido => " +
                        df.format(funcMen.calcSalLiquido()));
    }
}