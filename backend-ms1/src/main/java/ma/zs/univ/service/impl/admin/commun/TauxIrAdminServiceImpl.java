package ma.zs.univ.service.impl.admin.commun;


import ma.zs.univ.bean.core.commun.TauxIr;
import ma.zs.univ.dao.criteria.core.commun.TauxIrCriteria;
import ma.zs.univ.dao.facade.core.commun.TauxIrDao;
import ma.zs.univ.dao.specification.core.commun.TauxIrSpecification;
import ma.zs.univ.service.facade.admin.commun.TauxIrAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TauxIrAdminServiceImpl extends AbstractServiceImpl<TauxIr, TauxIrCriteria, TauxIrDao> implements TauxIrAdminService {













    public void configure() {
        super.configure(TauxIr.class, TauxIrSpecification.class);
    }



    public TauxIrAdminServiceImpl(TauxIrDao dao) {
        super(dao);
    }

}
