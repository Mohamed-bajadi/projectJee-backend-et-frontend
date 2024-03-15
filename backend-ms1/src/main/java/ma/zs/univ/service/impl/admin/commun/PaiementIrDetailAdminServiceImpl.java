package ma.zs.univ.service.impl.admin.commun;


import ma.zs.univ.bean.core.commun.PaiementIrDetail;
import ma.zs.univ.dao.criteria.core.commun.PaiementIrDetailCriteria;
import ma.zs.univ.dao.facade.core.commun.PaiementIrDetailDao;
import ma.zs.univ.dao.specification.core.commun.PaiementIrDetailSpecification;
import ma.zs.univ.service.facade.admin.commun.PaiementIrDetailAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.univ.service.facade.admin.commun.PaiementIrAdminService ;
import ma.zs.univ.bean.core.commun.PaiementIr ;
import ma.zs.univ.service.facade.admin.commun.TauxIrAdminService ;
import ma.zs.univ.bean.core.commun.TauxIr ;

import java.util.List;
@Service
public class PaiementIrDetailAdminServiceImpl extends AbstractServiceImpl<PaiementIrDetail, PaiementIrDetailCriteria, PaiementIrDetailDao> implements PaiementIrDetailAdminService {






    public void findOrSaveAssociatedObject(PaiementIrDetail t){
        if( t != null) {
            t.setPaiementIr(paiementIrService.findOrSave(t.getPaiementIr()));
            t.setTauxIr(tauxIrService.findOrSave(t.getTauxIr()));
        }
    }

    public List<PaiementIrDetail> findByPaiementIrId(Long id){
        return dao.findByPaiementIrId(id);
    }
    public int deleteByPaiementIrId(Long id){
        return dao.deleteByPaiementIrId(id);
    }
    public long countByPaiementIrId(Long id){
        return dao.countByPaiementIrId(id);
    }
    public List<PaiementIrDetail> findByTauxIrId(Long id){
        return dao.findByTauxIrId(id);
    }
    public int deleteByTauxIrId(Long id){
        return dao.deleteByTauxIrId(id);
    }
    public long countByTauxIrId(Long id){
        return dao.countByTauxIrId(id);
    }






    public void configure() {
        super.configure(PaiementIrDetail.class, PaiementIrDetailSpecification.class);
    }


    @Autowired
    private PaiementIrAdminService paiementIrService ;
    @Autowired
    private TauxIrAdminService tauxIrService ;

    public PaiementIrDetailAdminServiceImpl(PaiementIrDetailDao dao) {
        super(dao);
    }

}
