package ma.zs.univ.dao.facade.core.commun;


import ma.zs.univ.bean.core.commun.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeDao extends JpaRepository<Employe,Long> {

    Employe findById(long id);
    @Transactional
    int deleteById(long id) ;

    List<Employe> findByFirstnameLike(String firstname);

}



