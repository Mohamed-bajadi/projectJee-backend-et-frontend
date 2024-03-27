package ma.zs.univ.service.facade.admin.commun;

import ma.zs.univ.bean.core.commun.EmployeSalaireHistory;
import ma.zs.univ.dao.criteria.core.commun.EmployeSalaireHistoryCriteria;
import ma.zs.univ.zynerator.service.IService;

import java.util.List;

public interface EmployeSalaireHistoryAdminService extends IService<EmployeSalaireHistory, EmployeSalaireHistoryCriteria> {
    List<EmployeSalaireHistory> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteId(Long id);
}
