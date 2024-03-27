package ma.zs.univ.service.facade.admin.commun;


import ma.zs.univ.bean.core.commun.Employe;
import ma.zs.univ.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.univ.zynerator.service.IService;

import java.util.List;

public interface EmployeAdminService extends IService<Employe, EmployeCriteria> {

    List<Employe> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteId(Long id);
}
