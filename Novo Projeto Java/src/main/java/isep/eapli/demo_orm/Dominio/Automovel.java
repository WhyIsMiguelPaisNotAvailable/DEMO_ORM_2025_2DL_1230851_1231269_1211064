package isep.eapli.demo_orm.Dominio;

import java.util.Date;

public class Automovel {

    private String matricula;
    private int anoDeFabrico;
    private int anoDeAquisicao;
    private String cor;
    private String cilindrada;
    private float kms;
    private GrupoAutomovel grupoAutomovel;

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
