package isep.eapli.demo_orm.Dominio;

public class GrupoAutomovel {
    public String nomeDoGrupo;
    public int portas;
    public float preco;
    public String classe;


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