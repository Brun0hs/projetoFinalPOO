/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp.brn.persistencia;
import fp.brn.modelos.interfaces.IContatoCRUD;
import fp.brn.modelos.classes.*;
import java.util.List;
/**
 *
 * @author Bruno
 */
public class ContatoDAO implements IContatoCRUD{

    @Override
    public void incluir(Contato pessoa) throws Exception {
        throw new Exception("Incluindo no SGBD - Construindo");
    }

    @Override
    public void alterar(Contato pessoa) throws Exception {
        throw new Exception("Alterando no SGBD - Construindo");    
    }

    @Override
    public void excluir(int identificador) throws Exception {
        throw new Exception("Exclindo do SGBD - Construindo");
    }

    @Override
    public Contato consultar(int identificador) throws Exception {
        throw new Exception("Consultando no SGBD - Construindo");
    }

    @Override
    public Contato consultar(String nome) throws Exception {
        throw new Exception("Consultando no SGBD - Construindo");
    }

    @Override
    public List<Contato> ListagemDeContatos() throws Exception {
        throw new Exception("Listando do SGBD - Construindo");
    }
    
}
