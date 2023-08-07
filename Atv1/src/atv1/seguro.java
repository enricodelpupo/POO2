/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author alunolab08
 */
public class seguro {
    public float valor;
    public boolean vigencia;
    private cliente proprietario;
    private cliente [] assegurador;

    public seguro(float valor, boolean vigencia, cliente proprietario) {
        this.valor = valor;
        this.vigencia = vigencia;
        this.proprietario = proprietario;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(cliente proprietario) {
        this.proprietario = proprietario;
    }

    public cliente[] getAssegurador() {
        return assegurador;
    }

    public void setAssegurador(cliente[] assegurador) {
        this.assegurador = assegurador;
    }
}
