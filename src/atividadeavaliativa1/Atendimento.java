/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeavaliativa1;

import java.util.Date;

/**
 *
 * @author 1667158
 */
public class Atendimento {
    private String codigo;
    private String nomeAnimal;
    private String especie;
    private String nomeTutor;
    private Date data;
    private String status;
    private String observacoes;
    private Procedimento procedimento;
    private Sala sala;

    public Atendimento(String codigo, String nomeAnimal, String especie, String nomeTutor, Date data, String status, String observacoes) {
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.nomeTutor = nomeTutor;
        this.data = data;
        this.status = status;
        this.observacoes = observacoes;
        this.procedimento = null;
        this.sala = null;
    }
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeAnimal
     */
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    /**
     * @param nomeAnimal the nomeAnimal to set
     */
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the nomeTutor
     */
    public String getNomeTutor() {
        return nomeTutor;
    }

    /**
     * @param nomeTutor the nomeTutor to set
     */
    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the procedimento
     */
    public Procedimento getProcedimento() {
        return procedimento;
    }

    /**
     * @param procedimento the procedimento to set
     */
    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    /**
     * @return the sala
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
