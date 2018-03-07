package com.henrique.bookmark.model;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

/**
 * Created by enriq on 04/03/2018.
 */

@Entity
public class Tag {

    @Id private long id;
    private String nomeDaTag;
    private ToOne<Livro> livro;

    public Tag() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeDaTag() {
        return nomeDaTag;
    }

    public void setNomeDaTag(String nomeDaTag) {
        this.nomeDaTag = nomeDaTag;
    }

    public ToOne<Livro> getLivro() {
        return livro;
    }

    public void setLivro(ToOne<Livro> livro) {
        this.livro = livro;
    }
}
