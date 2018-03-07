package com.henrique.bookmark.model;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

/**
 * Created by enriq on 04/03/2018.
 */

@Entity
public class Usuario {

    @Id private long id;
    private String nome;
    private String email;
    private String senha;
    @Backlink
    private ToMany<Livro> livros;

    public Usuario() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ToMany<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ToMany<Livro> livros) {
        this.livros = livros;
    }
}
