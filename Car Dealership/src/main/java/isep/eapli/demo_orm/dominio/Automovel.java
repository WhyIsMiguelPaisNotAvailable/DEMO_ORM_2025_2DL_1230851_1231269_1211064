package isep.eapli.demo_orm.dominio;

import isep.eapli.demo_orm.util.Matricula;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Automovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Embedded
    private Matricula matricula;
    private int anoDeFabrico;
    private int anoDeAquisicao;
    private String cor;
    private String cilindrada;
    private float kms;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GrupoAutomovel")
    private GrupoAutomovel grupoAutomovel;

    protected Automovel(){}

    public Automovel(Matricula matricula, int anoDeFabrico, int anoDeAquisicao, String cor, String cilindrada, float kms, GrupoAutomovel grupoAutomovel){
        this.matricula=matricula;
        this.anoDeFabrico=anoDeFabrico;
        this.anoDeAquisicao=anoDeAquisicao;
        this.cor=cor;
        this.cilindrada=cilindrada;
        this.kms=kms;
        this.grupoAutomovel=grupoAutomovel;
    }

    public long getId() {
        return id;
    }

    public String matricula(String matricula){
        return matricula;
    }
    public void alterarKms(float kms){
        this.kms=kms;
    }

    @Override
    public String toString() {
        return String.format("matricula:" + matricula + "ano de fabrico:" + anoDeFabrico + "Ano de Aquisição: " + anoDeAquisicao + "cor: " + cor + "cilindrada: " + cilindrada + "Kms: " + kms + "grupo automóvel: " + grupoAutomovel);
    }
}