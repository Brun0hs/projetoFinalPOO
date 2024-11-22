/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp.brn.controle;
import fp.brn.modelos.classes.Contato;
import fp.brn.modelos.interfaces.IContatoCRUD;
import java.util.List;
/**
 *
 * @author Bruno
 */
public class ControleContato implements IContatoCRUD{

    @Override
    public void incluir(Contato pessoa) throws Exception {
        
        throw new Exception("controle sendo executado - incluir");
    }

    @Override
    public void alterar(Contato pessoa) throws Exception {
        throw new Exception("controle sendo executado - alterar");
    }

    @Override
    public void excluir(int identificador) throws Exception {
        throw new Exception("controle sendo executado - excluir");
    }

    @Override
    public Contato consultar(int identificador) throws Exception {
        throw new Exception("controle sendo executado - consultar");
    }

    @Override
    public Contato consultar(String nome) throws Exception {
        throw new Exception("controle sendo executado - consultar");
    }

    @Override
    public List<Contato> ListagemDeContatos() throws Exception {
        throw new Exception("controle sendo executado - listagem");
    }
    
}
