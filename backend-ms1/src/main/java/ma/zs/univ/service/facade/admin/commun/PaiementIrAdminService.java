package ma.zs.univ.service.facade.admin.commun;

import java.util.List;
import ma.zs.univ.bean.core.commun.PaiementIr;
import ma.zs.univ.dao.criteria.core.commun.PaiementIrCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface PaiementIrAdminService extends IService<PaiementIr,PaiementIrCriteria>  {

    List<PaiementIr> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteId(Long id);




}
