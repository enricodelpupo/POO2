/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author alunolab08
 */
public class cliente {
    public String nome;
    private static String cpf;

    public cliente(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        cliente.cpf = cpf;
    }

}
