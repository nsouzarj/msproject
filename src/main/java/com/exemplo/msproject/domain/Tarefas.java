package com.exemplo.msproject.domain;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Tarefas {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private long id;
    private long idtarefaprincipal;
    private String nomeprojeto;
    private String nometarefa;
    private String recurso;

    private Date datainicio;
    private String duracao;
    private Date dataconclusao;

    private String notatarefa;

    private ArrayList<SubTarefas> subtarefas;

    public Tarefas () {
    }

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public long getIdtarefaprincipal () {
        return idtarefaprincipal;
    }

    public void setIdtarefaprincipal (long idtarefaprincipal) {
        this.idtarefaprincipal = idtarefaprincipal;
    }

    public String getNomeprojeto () {
        return nomeprojeto;
    }

    public void setNomeprojeto (String nomeprojeto) {
        this.nomeprojeto = nomeprojeto;
    }

    public String getNometarefa () {
        return nometarefa;
    }

    public void setNometarefa (String nometarefa) {
        this.nometarefa = nometarefa;
    }

    public String getRecurso () {
        return recurso;
    }

    public void setRecurso (String recurso) {
        this.recurso = recurso;
    }

    public Date getDatainicio () {
        return datainicio;
    }

    public void setDatainicio (Date datainicio) {
        this.datainicio = datainicio;
    }

    public String getDuracao () {
        return duracao;
    }

    public void setDuracao (String duracao) {
        this.duracao = duracao;
    }

    public Date getDataconclusao () {
        return dataconclusao;
    }

    public void setDataconclusao (Date dataconclusao) {
        this.dataconclusao = dataconclusao;
    }

    public String getNotatarefa () {
        return notatarefa;
    }

    public void setNotatarefa (String notatarefa) {
        this.notatarefa = notatarefa;
    }

    public ArrayList<SubTarefas> getSubtarefas () {
        return subtarefas;
    }

    public void setSubtarefas (ArrayList<SubTarefas> subtarefas) {
        this.subtarefas = subtarefas;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;

        if (!(o instanceof Tarefas)) return false;

        Tarefas tarefas = (Tarefas) o;

        return new EqualsBuilder().append(id, tarefas.id).append(idtarefaprincipal, tarefas.idtarefaprincipal).append(nomeprojeto, tarefas.nomeprojeto).append(nometarefa, tarefas.nometarefa).append(recurso, tarefas.recurso).append(datainicio, tarefas.datainicio).append(duracao, tarefas.duracao).append(dataconclusao, tarefas.dataconclusao).append(notatarefa, tarefas.notatarefa).append(subtarefas, tarefas.subtarefas).isEquals();
    }

    @Override
    public int hashCode () {
        return new HashCodeBuilder(17, 37).append(id).append(idtarefaprincipal).append(nomeprojeto).append(nometarefa).append(recurso).append(datainicio).append(duracao).append(dataconclusao).append(notatarefa).append(subtarefas).toHashCode();
    }

    @Override
    public String toString () {
        return "Tarefas{" +
                "id=" + id +
                ", idtarefaprincipal=" + idtarefaprincipal +
                ", nomeprojeto='" + nomeprojeto + '\'' +
                ", nometarefa='" + nometarefa + '\'' +
                ", recurso='" + recurso + '\'' +
                ", datainicio=" + datainicio +
                ", duracao='" + duracao + '\'' +
                ", dataconclusao=" + dataconclusao +
                ", notatarefa='" + notatarefa + '\'' +
                ", subtarefas=" + subtarefas +
                '}';
    }
}
