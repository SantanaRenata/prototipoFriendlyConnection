
package dao;

import dao.DAOGenerico;
import dao.EnderecoDAO;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import modelo.Endereco;

/*
 *
 * @author abima
 * 
 *//*
    private int id;
    private int cep;
    private String bairro;
    private String rua;
    private String numero;
    private String referencia;
*/
public class EnderecoDAOJDBC implements EnderecoDAO {

    @Override
    public int inserir(Endereco endereco) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("INSERT INTO endereco(cep, bairro, rua, referencia) ")
                .append("VALUES (?, ?, ?, ?)");
     
        String insert = sqlBuilder.toString();
        int linha = 0;
        try {  
            linha = DAOGenerico.executarComando(insert, endereco.getCep(), endereco.getBairro(), endereco.getRua(), endereco.getReferencia());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return linha;
    }

    @Override
    public int editar(Endereco endereco) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("UPDATE endereco SET ")
                .append("cep = ?, ")
                .append("bairro = ? ")
                .append("rua = ? ")
                .append("referencia = ? ")
                .append("WHERE endereco_id = ?");
        String update = sqlBuilder.toString();
        int linha = 0;
        try {
            linha = DAOGenerico.executarComando(update, endereco.getCep(), 
                                                        endereco.getBairro(), 
                                                        endereco.getRua(),
                                                        endereco.getReferencia(),
                                                        endereco.getEnderecoId());
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return linha; 
    }
    

    @Override
    public int apagar(int id) throws ClassNotFoundException, SQLException, SQLIntegrityConstraintViolationException {
       StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("DELETE FROM endereco ")
                .append("WHERE pessoa_id = ?");
        String delete = sqlBuilder.toString();
        int linha = 0;        
        linha = DAOGenerico.executarComando(delete, id);
        return linha; 
    }

    @Override
    public List<Endereco> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Endereco listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}