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
public class Aluno extends Pessoa {
    private int regEscolar;
    private double mensalidade;

    public Aluno(int regEscolar, String nome, String dataNasc) {
        super(nome, dataNasc);
        this.regEscolar = regEscolar;
    }

    public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
}
