<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

=======

package dao;

import dao.DAOGenerico;
import dao.EnderecoDAO;
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import modelo.Endereco;

<<<<<<< HEAD
/**
 *
 * @author abima
 * 
 * 
 * private int id;
=======
/*
 *
 * @author abima
 * 
 *//*
    private int id;
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
    private int cep;
    private String bairro;
    private String rua;
    private String numero;
    private String referencia;
<<<<<<< HEAD
 */
=======
*/
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
public class EnderecoDAOJDBC implements EnderecoDAO {

    @Override
    public int inserir(Endereco endereco) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
<<<<<<< HEAD
                .append("INSERT INTO pessoa(cep, bairro, rua, numero, referencia) ")
                .append("VALUES (?, ?, ?, ?, ?)");
=======
                .append("INSERT INTO endereco(cep, bairro, rua, referencia) ")
                .append("VALUES (?, ?, ?, ?)");
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
     
        String insert = sqlBuilder.toString();
        int linha = 0;
        try {  
<<<<<<< HEAD
            linha = DAOGenerico.executarComando(insert, endereco.getCep(), endereco.getBairro(), endereco.getRua(), endereco.getNumero(), endereco.getReferencia());
=======
            linha = DAOGenerico.executarComando(insert, endereco.getCep(), endereco.getBairro(), endereco.getRua(), endereco.getReferencia());
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
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
<<<<<<< HEAD
                .append("numero = ? ")
=======
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
                .append("referencia = ? ")
                .append("WHERE endereco_id = ?");
        String update = sqlBuilder.toString();
        int linha = 0;
        try {
            linha = DAOGenerico.executarComando(update, endereco.getCep(), 
                                                        endereco.getBairro(), 
                                                        endereco.getRua(),
<<<<<<< HEAD
                                                        endereco.getNumero(),
                                                        endereco.getReferencia(),
                                                        endereco.getId());
=======
                                                        endereco.getReferencia(),
                                                        endereco.getEnderecoId());
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
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