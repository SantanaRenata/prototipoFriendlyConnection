
package modelo;


public class Endereco {
<<<<<<< HEAD
    private int id;
    private int cep;
    private String bairro;
    private String rua;
    private String numero;
    private String referencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
=======
    private Long enderecoId;
    private String cep;
    private String bairro;
    private String rua;
    private String referencia;

    public Long getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Long enderecoId) {
        this.enderecoId = enderecoId;
    }
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

<<<<<<< HEAD
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

=======
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}