package com.henrique.bookmark.model;

import com.henrique.bookmark.R;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

/**
 * Created by enriq on 04/03/2018.
 */

@Entity
public enum Avaliacao {

    GOSTEI(R.string.gostei),
    NAOGOSTEI(R.string.nao_gostei);

    @Id private long id;
    private int descricao;
    private String comentario;
    private ToOne<Livro> livro;

    Avaliacao() {
    }

    Avaliacao(int descricao) {
        this.descricao = descricao;
    }

    public int getDescricao() {
        return descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public ToOne<Livro> getLivro() {
        return livro;
    }

    public void setLivro(ToOne<Livro> livro) {
        this.livro = livro;
    }
}
