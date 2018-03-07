package com.henrique.bookmark.model;

import com.henrique.bookmark.R;

import java.util.TooManyListenersException;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

/**
 * Created by enriq on 04/03/2018.
 */

@Entity
public enum Situacao {

    LENDO(R.string.lendo),
    LIDO(R.string.lido),
    LEREI(R.string.lerei);

    @Id private long id;
    private int descricao;
    ToOne<Livro> livro;

    Situacao() {
    }

    Situacao(int descricao) {
        this.descricao = descricao;
    }

    public int getDescricao(){
        return descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ToOne<Livro> getLivro() {
        return livro;
    }

    public void setLivro(ToOne<Livro> livro) {
        this.livro = livro;
    }
}
