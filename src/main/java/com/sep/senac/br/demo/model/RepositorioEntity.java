package com.sep.senac.br.demo.model;

import javax.persistence.*;

@Entity
@Table(name= "repositorios")
public class RepositorioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;
    @Column
    private String url;
    @Column
    private String descricao;
    @Column
    private String linguagens;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RepositorioEntitty{" +
                "nome='" + nome + '\'' +
                ", url='" + url + '\'' +
                ", descricao='" + descricao + '\'' +
                ", linguagens='" + linguagens + '\'' +
                '}';

    }
}
