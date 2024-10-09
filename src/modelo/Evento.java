
package modelo;

<<<<<<< HEAD
import java.time.LocalTime;
import java.time.LocalDate;

=======
import java.text.ParseException;
import java.time.LocalTime;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
/**
 *
 * @author abima
 */
public class Evento {
<<<<<<< HEAD
   private int id;
   private String nome;
   private String descricao;
   private LocalDate data;
   private LocalTime horario;
   private Endereco endereco;

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
=======
   private String nome;
   private String descricao;
   private Date data;
   private LocalTime horario;
   private Endereco endereco;
   private Long enderecoId; // Adicione isso na classe Evento
    private int eventoId;
   
    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int EventoId) {
        this.eventoId = eventoId;
    }
   public Long getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Long enderecoId) {
        this.enderecoId = enderecoId;
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

<<<<<<< HEAD
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
=======
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
>>>>>>> 18ea4291f1d657db1580a266c3823cf2bd7b18b7
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
   
}