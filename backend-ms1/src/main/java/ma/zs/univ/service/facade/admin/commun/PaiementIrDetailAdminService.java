package ma.zs.univ.service.facade.admin.commun;

import java.util.List;
import ma.zs.univ.bean.core.commun.PaiementIrDetail;
import ma.zs.univ.dao.criteria.core.commun.PaiementIrDetailCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface PaiementIrDetailAdminService extends  IService<PaiementIrDetail,PaiementIrDetailCriteria>  {

    List<PaiementIrDetail> findByPaiementIrId(Long id);
    int deleteByPaiementIrId(Long id);
    long countByPaiementIrId(Long id);
    List<PaiementIrDetail> findByTauxIrId(Long id);
    int deleteByTauxIrId(Long id);
    long countByTauxIrId(Long id);




}
