package ma.zs.univ.dao.facade.core.avancement;

import org.springframework.data.jpa.repository.Query;
import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.avancement.Societe;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SocieteDao extends AbstractRepository<Societe,Long>  {


    @Query("SELECT NEW Societe(item.id,item.libelle) FROM Societe item")
    List<Societe> findAllOptimized();

}
