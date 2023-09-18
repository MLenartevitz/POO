
package fatec.poo.model;

/*
 * @author Mikael
 */
public class Horista extends Funcionario{
    private double valHorTrab;
    private int qtdHorTrab;

    public Horista( int registro, String nome, String dtAdmissao,double valHorTrab) {
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }

    public void setQtdHorTrab(int qtdHorTrab) {
        this.qtdHorTrab = qtdHorTrab;
    }
    
    public double calcSalBruto() { 
        return (valHorTrab * qtdHorTrab);
    }
    public double calcGratificacao(){
        return ( 0.075 * this.calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return((this.calcSalBruto() + this.calcGratificacao()) - this.calcDesconto());
    }
}
