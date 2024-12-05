/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp.brn.persistencia;
import fp.brn.modelos.interfaces.IContatoCRUD;
import fp.brn.modelos.classes.*;
import java.util.List;
// Bibliotecas SQL
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// Classe de conexao
import fp.brn.ferramentas.ConexaoBD;
/**
 *
 * @author Bruno
 */
public class ContatoDAO implements IContatoCRUD{
    
    //Conexao com o banco
    private Connection conexao = null;
    public ContatoDAO() throws Exception{
        conexao = ConexaoBD.getConexao();
        if(conexao == null) throw new Exception("ERRO DE CONEXAO");
    }

    @Override
    public void incluir(Contato pessoa) throws Exception {
        try {
            String sql =  "insert into Contatos(nome, ddi, ddd, numero, sexo, email)"
                    +     "values(?,?,?,?,?,?);";
            //Criando vinculo entre o comando SQL e o SGBD
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setInt(2, pessoa.getFone().getDdi());
            preparedStatement.setInt(3, pessoa.getFone().getDdd());
            preparedStatement.setInt(4,pessoa.getFone().getNumero());
            preparedStatement.setString(5,pessoa.getSexo().toString());
            preparedStatement.setString(6,pessoa.getEmail());
            // Mandando o comando SQL para SGBD executar
            preparedStatement.executeUpdate();
        } catch (SQLException erro) {
          //Erro do comando SQL - chave, coluna, nome da tabela, ...
          throw new Exception("SQL Erro: "+ erro.getMessage());
        } catch(Exception erro){
            throw new Exception("Incluir Persistencia: " + erro);
        }
    }

    @Override
    public void alterar(Contato pessoa) throws Exception {
        try {//nome, ddi, ddd, numero, sexo, email
          String sql = "update Contatos set nome = ?, ddi = ? ,ddd = ?, numero = ?, sexo = ?, email = ? where idContato = ?";
          PreparedStatement preparedStatement = conexao.prepareStatement(sql);
          preparedStatement.setString(1, pessoa.getNome());
          preparedStatement.setInt(2, pessoa.getFone().getDdi());
          preparedStatement.setInt(3, pessoa.getFone().getDdd());
          preparedStatement.setInt(4, pessoa.getFone().getNumero());
          preparedStatement.setString(5, pessoa.getSexo().toString());
          preparedStatement.setString(6, pessoa.getEmail());
          preparedStatement.setInt(7, pessoa.getIdContato());
          preparedStatement.executeUpdate();
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro: "+ erro.getMessage());
        } catch(Exception erro){
            throw new Exception("Alterar Servicos Persistencia: " + erro);
        }  
    }

    @Override
    public void excluir(int identificador) throws Exception {
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement("delete from Contatos where idContato=?");
            // Parameters start with 1
            preparedStatement.setInt(1, identificador);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
