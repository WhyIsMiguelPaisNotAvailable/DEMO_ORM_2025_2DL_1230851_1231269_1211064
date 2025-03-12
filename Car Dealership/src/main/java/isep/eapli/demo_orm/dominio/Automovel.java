package isep.eapli.demo_orm.dominio;

import java.util.Date;

public class Automovel {

    private String matricula;
    private int anoDeFabrico;
    private int anoDeAquisicao;
    private String cor;
    private String cilindrada;
    private float kms;
    private GrupoAutomovel grupoAutomovel;

    public Automovel(String matricula, int anoDeFabrico, int anoDeAquisicao, String cor, String cilindrada, float kms, GrupoAutomovel grupoAutomovel){
        this.matricula=matricula;
        this.anoDeFabrico=anoDeFabrico;
        this.anoDeAquisicao=anoDeAquisicao;
        this.cor=cor;
        this.cilindrada=cilindrada;
        this.kms=kms;
        this.grupoAutomovel=grupoAutomovel;
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