package com.henrique.bookmark.model;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

/**
 * Created by enriq on 04/03/2018.
 */

@Entity
public class Livro {

    @Id private long id;
    private String titulo;
    private String categoria;
    private String autor;
    private int anoDePublicacao;
    private int quantidadeDePaginas;
    @Backlink
    private ToMany<Tag> tags;
    private ToOne<Situacao> situacao;
    private ToOne<Avaliacao> avaliacao;
    private ToOne<Usuario> usuario;

    public Livro() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    public void setQuantidadeDePaginas(int quantidadeDePaginas) {
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public ToMany<Tag> getTags() {
        return tags;
    }

    public void setTags(ToMany<Tag> tags) {
        this.tags = tags;
    }

    public ToOne<Situacao> getSituacao() {
        return situacao;
    }

    public void setSituacao(ToOne<Situacao> situacao) {
        this.situacao = situacao;
    }

    public ToOne<Avaliacao> getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(ToOne<Avaliacao> avaliacao) {
        this.avaliacao = avaliacao;
    }

    public ToOne<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ToOne<Usuario> usuario) {
        this.usuario = usuario;
    }
}
