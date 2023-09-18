/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/*
 * @author Mikael
 */
public class Mensalista extends Funcionario{
    private double valSalMin;
    private int numSalMin;

    public Mensalista( int registro, String nome, String dtAdmissao,double valSalMin) {
        super(registro, nome, dtAdmissao);
        this.valSalMin = valSalMin;
    }

    public void setNumSalMin(int numSalMin) {
        this.numSalMin = numSalMin;
    }
    
    public double calcSalBruto() { 
        return (valSalMin * numSalMin);
    }
    
}