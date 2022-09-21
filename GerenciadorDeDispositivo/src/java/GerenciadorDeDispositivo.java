/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "Dispositivo")
public class GerenciadorDeDispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cod_dispositivo;
    private String descricao;
    private String marca;
    private String imei_sn;
    private String vlrDispositivo;
    private String disponivel;
    private String condicao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCod_dispositivo() {
        return cod_dispositivo;
    }

    public void setCod_dispositivo(int cod_dispositivo) {
        this.cod_dispositivo = cod_dispositivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getImei_sn() {
        return imei_sn;
    }

    public void setImei_sn(String imei_sn) {
        this.imei_sn = imei_sn;
    }

    public String getVlrDispositivo() {
        return vlrDispositivo;
    }

    public void setVlrDispositivo(String vlrDispositivo) {
        this.vlrDispositivo = vlrDispositivo;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    
}
