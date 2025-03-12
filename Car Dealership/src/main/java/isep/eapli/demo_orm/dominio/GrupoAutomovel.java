package isep.eapli.demo_orm.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GrupoAutomovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public String nomeDoGrupo;
    public int portas;
    public float preco;
    public String classe;

    protected GrupoAutomovel(){}

    public GrupoAutomovel(String nomeDoGrupo, int portas, float preco, String classe){
        this.nomeDoGrupo=nomeDoGrupo;
        this.portas=portas;
        this.preco=preco;
        this.classe=classe;
    }

    public void mudarPortas(int portas){
        this.portas = portas;
    }

    public void alterarClasse(String classe){
        this.classe=classe;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Grupo %s, %d Portas, %f€, Classe %s",nomeDoGrupo,portas,preco,classe);
    }
}