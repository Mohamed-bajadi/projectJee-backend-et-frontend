package ma.zs.univ.dao.facade.core.commun;

import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.commun.PaiementIr;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PaiementIrDao extends AbstractRepository<PaiementIr,Long>  {

    List<PaiementIr> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteId(Long id);


}
