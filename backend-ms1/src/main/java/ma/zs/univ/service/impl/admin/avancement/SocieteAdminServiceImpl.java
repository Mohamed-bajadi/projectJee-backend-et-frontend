package ma.zs.univ.service.impl.admin.avancement;


import ma.zs.univ.bean.core.avancement.Societe;
import ma.zs.univ.dao.criteria.core.avancement.SocieteCriteria;
import ma.zs.univ.dao.facade.core.avancement.SocieteDao;
import ma.zs.univ.dao.specification.core.avancement.SocieteSpecification;
import ma.zs.univ.service.facade.admin.avancement.SocieteAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class SocieteAdminServiceImpl extends AbstractServiceImpl<Societe, SocieteCriteria, SocieteDao> implements SocieteAdminService {







    public List<Societe> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(Societe.class, SocieteSpecification.class);
    }



    public SocieteAdminServiceImpl(SocieteDao dao) {
        super(dao);
    }

}
