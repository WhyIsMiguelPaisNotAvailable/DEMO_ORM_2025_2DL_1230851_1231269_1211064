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

    public void alterarKms(float kms){
        this.kms=kms;
    }

}
