
package dao;

import java.util.List;
import java.sql. *;
import modelo.Endereco;

/**
 *
 * @author abima
 */
public interface EnderecoDAO  {
    public int inserir(Endereco endereco);
    public int editar(Endereco endereco);
    public int apagar(int  id) throws ClassNotFoundException, SQLException, SQLIntegrityConstraintViolationException;
    public List<Endereco> listar();
    public Endereco listar(int id);
}