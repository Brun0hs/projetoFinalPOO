/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp.brn.controle;
import fp.brn.modelos.classes.Contato;
import fp.brn.modelos.interfaces.IContatoCRUD;
import java.util.List;
import fp.brn.persistencia.ContatoDAO;
/**
 *
 * @author Bruno
 */
public class ControleContato implements IContatoCRUD{
    
    private IContatoCRUD persistenciaContato = null;
    
    public ControleContato() throws Exception{
        try{
            persistenciaContato = new ContatoDAO();
        }catch(Exception erro){
            throw erro;
        }
    }
    
    @Override
    public void incluir(Contato pessoa) throws Exception {
        try {
            verificar(pessoa,false);
            persistenciaContato.incluir(pessoa);
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterar(Contato pessoa) throws Exception {
        try{
            verificar(pessoa,true);
            persistenciaContato.alterar(pessoa);
        }catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public void excluir(int identificador) throws Exception {
        try{
            persistenciaContato.excluir(identificador);
        }catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public Contato consultar(int identificador) throws Exception {
        try{
            return persistenciaContato.consultar(identificador);
        }catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public Contato consultar(String nome) throws Exception {
        try{
            return persistenciaContato.consultar(nome);
        }catch(Exception erro){
            throw erro;
        }
    }
        
    @Override
    public List<Contato> ListagemDeContatos() throws Exception {
        try{
            return persistenciaContato.ListagemDeContatos();
        }catch(Exception erro){
            throw erro;
        }
    }
    
    private void verificar(Contato pessoa, boolean busca)throws Exception {
        // mudar para lançar exception
        if(busca){
            if(pessoa.getIdContato()<1) throw new Exception("Identificador deve ser maior que zero");
        }
        
        if(pessoa.getNome().isEmpty()) throw new Exception("Nome deve ser informado");
        if(pessoa.getNome().matches(".*\\d.*")) throw new Exception("Nome não pode conter números");
        
        if(pessoa.getFone() == null) throw new Exception("Telefone deve ser informado"); 
        if(pessoa.getFone().getDdi()<=0 || pessoa.getFone().getDdi()>99) throw new Exception("Numero do DDI deve ser valido [1-99]");
        if(pessoa.getFone().getDdd()<=0 || pessoa.getFone().getDdd()>99) throw new Exception("Numero do DDD deve ser valido [1-99]");
        if(pessoa.getFone().getNumero()<=0 || pessoa.getFone().getNumero()>999999999) throw new Exception("Numero do telefone deve ser valido");
        
        if(pessoa.getEmail().isEmpty()) throw new Exception("Email deve ser informado");
        if(!pessoa.getEmail().matches(".+@.+\\..+")) throw new Exception("Email deve estar ser válido");
    }
}
