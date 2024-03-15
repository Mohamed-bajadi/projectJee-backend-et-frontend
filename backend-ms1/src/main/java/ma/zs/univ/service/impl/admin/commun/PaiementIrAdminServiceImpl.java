package ma.zs.univ.service.impl.admin.commun;


import ma.zs.univ.bean.core.commun.PaiementIr;
import ma.zs.univ.dao.criteria.core.commun.PaiementIrCriteria;
import ma.zs.univ.dao.facade.core.commun.PaiementIrDao;
import ma.zs.univ.dao.specification.core.commun.PaiementIrSpecification;
import ma.zs.univ.service.facade.admin.commun.PaiementIrAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.zs.univ.service.facade.admin.avancement.SocieteAdminService ;
import ma.zs.univ.bean.core.avancement.Societe ;
import ma.zs.univ.service.facade.admin.commun.PaiementIrDetailAdminService ;
import ma.zs.univ.bean.core.commun.PaiementIrDetail ;

import java.util.List;
@Service
public class PaiementIrAdminServiceImpl extends AbstractServiceImpl<PaiementIr, PaiementIrCriteria, PaiementIrDao> implements PaiementIrAdminService {


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public PaiementIr create(PaiementIr t) {
        PaiementIr saved= super.create(t);
        if (saved != null && t.getPaiementIrDetails() != null) {
                t.getPaiementIrDetails().forEach(element-> {
                    element.setPaiementIr(saved);
                    paiementIrDetailService.create(element);
            });
        }
        return saved;

    }

    public PaiementIr findWithAssociatedLists(Long id){
        PaiementIr result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setPaiementIrDetails(paiementIrDetailService.findByPaiementIrId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        paiementIrDetailService.deleteByPaiementIrId(id);
    }


    public void updateWithAssociatedLists(PaiementIr paiementIr){
    if(paiementIr !=null && paiementIr.getId() != null){
            List<List<PaiementIrDetail>> resultPaiementIrDetails= paiementIrDetailService.getToBeSavedAndToBeDeleted(paiementIrDetailService.findByPaiementIrId(paiementIr.getId()),paiementIr.getPaiementIrDetails());
            paiementIrDetailService.delete(resultPaiementIrDetails.get(1));
            ListUtil.emptyIfNull(resultPaiementIrDetails.get(0)).forEach(e -> e.setPaiementIr(paiementIr));
            paiementIrDetailService.update(resultPaiementIrDetails.get(0),true);
    }
    }




    public void findOrSaveAssociatedObject(PaiementIr t){
        if( t != null) {
            t.setSociete(societeService.findOrSave(t.getSociete()));
        }
    }

    public List<PaiementIr> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }
    public long countBySocieteId(Long id){
        return dao.countBySocieteId(id);
    }






    public void configure() {
        super.configure(PaiementIr.class, PaiementIrSpecification.class);
    }


    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private PaiementIrDetailAdminService paiementIrDetailService ;

    public PaiementIrAdminServiceImpl(PaiementIrDao dao) {
        super(dao);
    }

}
