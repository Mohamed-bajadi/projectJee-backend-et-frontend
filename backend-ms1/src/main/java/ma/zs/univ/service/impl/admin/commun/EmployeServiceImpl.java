package ma.zs.univ.service.impl.admin.commun;


import ma.zs.univ.bean.core.avancement.Societe;
import ma.zs.univ.bean.core.commun.Employe;
import ma.zs.univ.bean.core.commun.PaiementIr;
import ma.zs.univ.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.univ.dao.facade.core.commun.EmployeDao;
import ma.zs.univ.dao.specification.core.commun.EmployeSpecification;
import ma.zs.univ.dao.specification.core.commun.PaiementIrSpecification;
import ma.zs.univ.service.facade.admin.avancement.SocieteAdminService;
import ma.zs.univ.service.facade.admin.commun.EmployeAdminService;
import ma.zs.univ.service.impl.admin.avancement.SocieteAdminServiceImpl;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeServiceImpl extends AbstractServiceImpl<Employe, EmployeCriteria, EmployeDao> implements EmployeAdminService {


    public EmployeServiceImpl(EmployeDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Employe.class, EmployeSpecification.class);
    }

    @Override
    public List<Employe> findBySocieteId(Long id) {
        return dao.findBySocieteId(id);
    }

    @Override
    public int deleteBySocieteId(Long id) {
        return dao.deleteBySocieteId(id);
    }

    @Override
    public long countBySocieteId(Long id) {
        return dao.countBySocieteId(id);
    }
}