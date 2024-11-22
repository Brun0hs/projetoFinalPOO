/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp.brn.modelos.classes;
import fp.brn.modelos.enumeration.enumSexo;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno
 */
public class Contato {

    private int idContato = 0;
    private String nome = "";
    private Telefone fone = null;
    private enumSexo sexo = null;
    private String email = "";

    public Contato(){}

    public Contato(int idContato, String nome, Telefone fone, enumSexo sexo, String email)throws Exception{
        this.idContato = idContato;
        if (nome.isEmpty()) throw new Exception("Nome deve ser informado");
        this.nome = nome;
        this.fone = fone;
        this.sexo = sexo;
        if (email.isEmpty()) throw new Exception("Nome deve ser informado");
        this.email = email;
    }

    public int getIdContato() {
        return this.idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isEmpty()) throw new Exception("Nome deve ser informado");
        this.nome = nome;
    }

    public Telefone getFone() {
        return this.fone;
    }

    public void setFone(Telefone fone) {
        this.fone = fone;
    }

    public enumSexo getSexo() {
        return this.sexo;
    }

    public void setSexo(enumSexo sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) throws Exception {
        if (email.isEmpty()) throw new Exception("Nome deve ser informado");
        this.email = email;
    }
}
