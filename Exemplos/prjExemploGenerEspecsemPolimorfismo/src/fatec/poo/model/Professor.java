/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author mikael
 */
public class Professor extends Pessoa {
    private int regFuncional;
    private double salario;

    public Professor(int regFuncional,String nome, String dataNasc) {
        super(nome, dataNasc);
        this.regFuncional = regFuncional;
    }
     
    public int getRegFuncional() {
        return regFuncional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
