package isep.eapli.demo_orm.DAOs;

import isep.eapli.demo_orm.util.JPAUtil;
import jakarta.persistence.*;

import java.util.List;

public class GenericDAO<T> {
    
    private final Class<T> classe;

    public GenericDAO(Class < T > classe) {
        this.classe = classe;
    }
    public void save (T t){
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        em.close();
    }
    public void delete (T t){
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();
        em.close();
    }
    public T findById (Long id){
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        T reference =  em.getReference(classe, id);
        em.getTransaction().commit();
        em.close();
        return reference;
    }
    public List<T> getAll () {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        List<T> l = em.createQuery("from " + classe.getName() + "p").getResultList();
        em.getTransaction().commit();
        em.close();
        return l;
    }
}

