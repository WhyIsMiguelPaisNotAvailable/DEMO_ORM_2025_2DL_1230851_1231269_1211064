
package isep.eapli.demo_orm.DAOs;

import isep.eapli.demo_orm.dominio.Automovel;
import jakarta.persistence.EntityManager;

import java.util.List;

public class AutomovelDAO {
    private final GenericDAO<Automovel> dao;

    public AutomovelDAO() {
        dao = new GenericDAO<>( Automovel.class);
    }

    public void save(Automovel t) {
        dao.save(t);
    }

    public void delete(Automovel t) {
        dao.delete(t);
    }

    public Automovel findById(Long id) {
        return dao.findById(id);
    }

    public List<Automovel> getAll() {
        return dao.getAll();
    }
}
