package com.exemplo.msproject.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Tarefa {
    private int id;
    private String nomeTafera;

    public Tarefa () {
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getNomeTafera () {
        return nomeTafera;
    }

    public void setNomeTafera (String nomeTafera) {
        this.nomeTafera = nomeTafera;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;

        if (!(o instanceof Tarefa)) return false;

        Tarefa tarefa = (Tarefa) o;

        return new EqualsBuilder().append(id, tarefa.id).append(nomeTafera, tarefa.nomeTafera).isEquals();
    }

    @Override
    public int hashCode () {
        return new HashCodeBuilder(17, 37).append(id).append(nomeTafera).toHashCode();
    }

    @Override
    public String toString () {
        return "Tarefa{" +
                "id=" + id +
                ", nomeTafera='" + nomeTafera + '\'' +
                '}';
    }
}
