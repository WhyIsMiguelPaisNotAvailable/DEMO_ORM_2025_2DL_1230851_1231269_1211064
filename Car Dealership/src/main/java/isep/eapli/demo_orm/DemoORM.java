package isep.eapli.demo_orm;

import isep.eapli.demo_orm.apresentacao.MainMenu;
import isep.eapli.demo_orm.dominio.Automovel;
import isep.eapli.demo_orm.dominio.GrupoAutomovel;
import isep.eapli.demo_orm.util.Matricula;
import jakarta.persistence.*;

public class DemoORM {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DEMO_ORMPU");
        EntityManager em = emf.createEntityManager();
        GrupoAutomovel grupoAutomovel = new GrupoAutomovel("N percebi",4,2000,"Ligeiros");
        Automovel automovel = new Automovel(new Matricula("23","33","xl"),2004,2021,"Preto","Sei la",2000000,grupoAutomovel);
        em.getTransaction().begin();
        em.persist(grupoAutomovel);
        em.persist(automovel);
        em.getTransaction().commit();
        System.out.println("ID gerado: " + grupoAutomovel.getId());
        System.out.println("ID gerado: " + automovel.getId());
        em.close();
        emf.close();
        MainMenu.mainLoop();
    }
}
