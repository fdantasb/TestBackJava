package br.com.fdantasb.domain;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Gasto implements Serializable {

    private static final long serialVersionUID = 7695562818079526722L;

    private Long id;
    private String descricao;
    private Double valor;
    private Date data;
    //private Usuario user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (StringUtils.isBlank(descricao)) {
            throw new IllegalArgumentException("A descrição não pode ser nula ou vazia.");
        }

        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do gasto não pode ser igual ou inferior a zero.");
        }

        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        Date currentDate = Calendar.getInstance().getTime();
        if (currentDate.before(data)) {
            throw new IllegalArgumentException("A data informada não pode ser futura");
        }
        this.data = data;
    }
}
