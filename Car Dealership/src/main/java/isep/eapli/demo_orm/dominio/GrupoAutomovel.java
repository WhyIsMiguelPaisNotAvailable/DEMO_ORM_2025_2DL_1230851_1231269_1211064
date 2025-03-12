package isep.eapli.demo_orm.dominio;

public class GrupoAutomovel {
    public String nomeDoGrupo;
    public int portas;
    public float preco;
    public String classe;

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

    @Override
    public String toString() {
        return String.format("Grupo %s, %d Portas, %f€, Classe %s",nomeDoGrupo,portas,preco,classe);
    }
}