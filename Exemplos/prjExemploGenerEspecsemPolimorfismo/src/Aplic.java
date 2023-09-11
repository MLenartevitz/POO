
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;


/*//
 *
 * @author mikael
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Aluno objAluno = new Aluno(1010, "Carlos Silveira", "15/03/1978");
        Professor objProf = new Professor(1021, "Dimas Turbo", "11/09/2001");
        
        objAluno.setMensalidade(1500);
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objAluno.getMensalidade()));
        
        objProf.setSalario(2000);
        System.out.println("\nRegistro Função: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data Nascimento: " + objProf.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objProf.getSalario()));
        
    }
    
}
