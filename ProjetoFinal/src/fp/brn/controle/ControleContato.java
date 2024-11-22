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
    
    private IContatoCRUD cliente;
    
    @Override
    public void incluir(Contato pessoa) throws Exception {
        try {
            String erro = verificar(pessoa);           
            if(!erro.isEmpty())throw new Exception(erro);            
            cliente.incluir(pessoa);
        } catch (Exception erro) {
            throw erro;
        }
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
    
    private String verificar(Contato pessoa){
        
        if(pessoa.getIdContato()<1) return "Identificador deve ser maior que zero";
        if(pessoa.getNome().isEmpty()) return "Nome deve ser informado";
        if(pessoa.getNome().matches(".*\\d.*")) return "Nome não pode conter números";
        if(!pessoa.getNome().equals(pessoa.getNome().toUpperCase())) return "Nome deve conter letras maiusculas apenas";
        if(pessoa.getFone().getDdi()<=0 || pessoa.getFone().getDdi()>99) return "Numero do DDI deve ser valido [1-99]";
        if(pessoa.getFone().getDdd()<=0 || pessoa.getFone().getDdd()>99) return "Numero do DDD deve ser valido [1-99]";
        if(pessoa.getFone().getNumero()<=0 || pessoa.getFone().getNumero()>999999999) return "Numero do telefone deve ser valido";
        if(pessoa.getEmail().isEmpty()) return "Email deve ser informado";
        if(!pessoa.getEmail().matches(".+@.+\\..+")) return "Email deve estar ser válido";
        return "";
    }
}
