package ma.zs.univ.service.impl.admin.commun;

import ma.zs.univ.bean.core.commun.EmployeSalaireHistory;
import ma.zs.univ.dao.criteria.core.commun.EmployeSalaireHistoryCriteria;
import ma.zs.univ.dao.facade.core.commun.EmployeSalaireHistoryDao;
import ma.zs.univ.dao.specification.core.commun.EmployeSalaireHistorySpecification;
import ma.zs.univ.service.facade.admin.commun.EmployeSalaireHistoryAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeSalaireHistoryServiceImpl extends AbstractServiceImpl<EmployeSalaireHistory, EmployeSalaireHistoryCriteria, EmployeSalaireHistoryDao> implements EmployeSalaireHistoryAdminService {
    public EmployeSalaireHistoryServiceImpl(EmployeSalaireHistoryDao dao) {
        super(dao);
    }

    @Override
    public List<EmployeSalaireHistory> findBySocieteId(Long id) {
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

    @Override
    public void configure() {
        super.configure(EmployeSalaireHistory.class, EmployeSalaireHistorySpecification.class);
    }
}
