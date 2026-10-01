/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeavaliativa1;

import java.util.ArrayList;

/**
 *
 * @author 1667158
 */
public class Sala {
    private int numero;
    private int bloco;
    private int capacidadeMaxima;
    private String tipo;
    private Veterinario veterinario;
    private ArrayList<Atendimento> atendimentos;

    public Sala(int numero, int bloco, int capacidadeMaxima, String tipo) {
        this.numero = numero;
        this.bloco = bloco;
        this.capacidadeMaxima = capacidadeMaxima;
        this.tipo = tipo;
        this.veterinario = null;
        this.atendimentos = new ArrayList<Atendimento>();
    }
    
    public boolean atribuirAtendimento(Atendimento atendimento){
        if (atendimentos.isEmpty()){
            atendimentos.add(atendimento);
            return true;
        }
        else if (atendimentos.getFirst().getProcedimento() == atendimento.getProcedimento()) {
            atendimentos.add(atendimento);
            return true;
        }
        return false;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the bloco
     */
    public int getBloco() {
        return bloco;
    }

    /**
     * @param bloco the bloco to set
     */
    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    /**
     * @return the capacidadeMaxima
     */
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    /**
     * @param capacidadeMaxima the capacidadeMaxima to set
     */
    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the veterinario
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }

    /**
     * @param veterinario the veterinario to set
     */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    /**
     * @return the atendimentos
     */
    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    /**
     * @param atendimentos the atendimentos to set
     */
    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
}
