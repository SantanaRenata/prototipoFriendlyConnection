
package dao;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import modelo.Evento;

/**
 *
 * @author abima
 */
public class EventoDAOJDBC implements EventoDAO {

    @Override
    public int inserir(Evento evento) {
       StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("INSERT INTO pessoa(nome, descricao, data, horario, endereco) ")
                .append("VALUES (?, ?)");
     
        String insert = sqlBuilder.toString();
        int linha = 0;
        try {  
            linha = DAOGenerico.executarComando(insert, evento.getNome(), evento.getDescricao(), evento.getData(), evento.getHorario(), evento.getEndereco().getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return linha; 
    }

    @Override
    public int editar(Evento evento) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("UPDATE evento SET ")
                .append("nome = ?, ")
                .append("descricao = ?, ")
                .append("data = ?, ")
                .append("horario = ?, ")
                .append("endereco = ? ")
                .append("WHERE evento_id = ?");
        String update = sqlBuilder.toString();
        int linha = 0;
        try {
            linha = DAOGenerico.executarComando(update, evento.getNome(),
                                                        evento.getDescricao(),
                                                        evento.getData(),
                                                        evento.getHorario(),
                                                        evento.getEndereco().getId());       
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return linha; 
    }

    @Override
    public int apagar(int id) throws ClassNotFoundException, SQLException, SQLIntegrityConstraintViolationException {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("DELETE FROM evento ")
                .append("WHERE evento_id = ?");
        String delete = sqlBuilder.toString();
        int linha = 0;        
        linha = DAOGenerico.executarComando(delete, id);
        return linha;}

    @Override
    public List<Evento> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Evento listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}