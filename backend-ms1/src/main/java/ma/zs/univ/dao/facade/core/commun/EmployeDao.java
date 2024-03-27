package ma.zs.univ.dao.facade.core.commun;




import ma.zs.univ.bean.core.commun.Employe;
import ma.zs.univ.bean.core.commun.PaiementIr;
import ma.zs.univ.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeDao extends AbstractRepository<Employe,Long> {

    List<Employe> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteId(Long id);

}



