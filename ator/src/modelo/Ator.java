/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Ator {
    private int codigo;
    private String Nome_real;
    private String Nome_artistico;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_real() {
        return Nome_real;
    }

    public void setNome_real(String Nome_real) {
        this.Nome_real = Nome_real;
    }

    public String getNome_artistico() {
        return Nome_artistico;
    }

    public void setNome_artistico(String Nome_artistico) {
        this.Nome_artistico = Nome_artistico;
    }

    @Override
    public String toString() {
        return "Ator{" + '}';
    }

}
