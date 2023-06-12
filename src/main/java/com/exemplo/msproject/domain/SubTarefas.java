package com.exemplo.msproject.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class SubTarefas {
    private Integer idsubtarefa;
    private Integer idtarefapai;
    private String nomesubtarefa;

    public SubTarefas () {
    }

    public Integer getIdsubtarefa () {
        return idsubtarefa;
    }

    public void setIdsubtarefa (Integer idsubtarefa) {
        this.idsubtarefa = idsubtarefa;
    }

    public Integer getIdtarefapai () {
        return idtarefapai;
    }

    public void setIdtarefapai (Integer idtarefapai) {
        this.idtarefapai = idtarefapai;
    }

    public String getNomesubtarefa () {
        return nomesubtarefa;
    }

    public void setNomesubtarefa (String nomesubtarefa) {
        this.nomesubtarefa = nomesubtarefa;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;

        if (!(o instanceof SubTarefas)) return false;

        SubTarefas that = (SubTarefas) o;

        return new EqualsBuilder().append(idsubtarefa, that.idsubtarefa).append(idtarefapai, that.idtarefapai).append(nomesubtarefa, that.nomesubtarefa).isEquals();
    }

    @Override
    public int hashCode () {
        return new HashCodeBuilder(17, 37).append(idsubtarefa).append(idtarefapai).append(nomesubtarefa).toHashCode();
    }

    @Override
    public String toString () {
        return "SubTarefas{" +
                "idsubtarefa=" + idsubtarefa +
                ", idtarefapai=" + idtarefapai +
                ", nomesubtarefa='" + nomesubtarefa + '\'' +
                '}';
    }
}
