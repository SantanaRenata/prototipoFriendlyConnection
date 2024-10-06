
package modelo;

import java.text.ParseException;
import java.time.LocalTime;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author abima
 */
public class Evento {
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
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