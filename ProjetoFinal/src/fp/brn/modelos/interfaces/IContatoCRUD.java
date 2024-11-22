/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fp.brn.modelos.interfaces;
import fp.brn.modelos.classes.Contato;
import java.util.List;
/**
 *
 * @author Bruno
 */
public interface IContatoCRUD {
    
    public void incluir(Contato pessoa)throws Exception;
    
    public void alterar(Contato pessoa)throws Exception;
    
    public void excluir(int identificador)throws Exception;
    
    public Contato consultar(int identificador)throws Exception;
    
    public Contato consultar(String nome)throws Exception;
    
    public List<Contato> ListagemDeContatos() throws Exception;
    
}
