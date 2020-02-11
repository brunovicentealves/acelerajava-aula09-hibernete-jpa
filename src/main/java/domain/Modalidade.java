package domain;

import javax.persistence.*;

@Entity
@Table(name = "modalidade")

public class Modalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id_modalidade")
    private Integer id_modalidade;
    @Column(name = "nome")
    private String nome_modalidade;


    public Integer getId_modalidade() {
        return id_modalidade;
    }

    public void setId_modalidade(Integer id_modalidade) {
        this.id_modalidade = id_modalidade;
    }

    public String getNome_modalidade() {
        return nome_modalidade;
    }

    public void setNome_modalidade(String nome_modalidade) {
        this.nome_modalidade = nome_modalidade;
    }
}
