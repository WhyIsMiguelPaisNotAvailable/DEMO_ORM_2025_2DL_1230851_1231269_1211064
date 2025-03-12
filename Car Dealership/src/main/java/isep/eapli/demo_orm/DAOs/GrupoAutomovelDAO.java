
package isep.eapli.demo_orm.DAOs;

import isep.eapli.demo_orm.dominio.Automovel;
import isep.eapli.demo_orm.dominio.GrupoAutomovel;
import jakarta.persistence.EntityManager;

import java.util.List;

public class GrupoAutomovelDAO {
    private final GenericDAO<GrupoAutomovel> dao;

    public GrupoAutomovelDAO() {
        dao = new GenericDAO<>(GrupoAutomovel.class);
    }

    public void save(GrupoAutomovel t) {
        dao.save(t);
    }

    public void delete(GrupoAutomovel t) {
        dao.delete(t);
    }

    public GrupoAutomovel findById(Long id) {
        return dao.findById(id);
    }

    public List<GrupoAutomovel> getAll() {
        return dao.getAll();
    }
}
