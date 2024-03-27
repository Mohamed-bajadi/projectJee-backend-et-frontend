package ma.zs.univ.dao.specification.core.commun;

import ma.zs.univ.bean.core.commun.Employe;
import ma.zs.univ.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.univ.zynerator.specification.AbstractSpecification;
import org.springframework.data.jpa.domain.Specification;

public class EmployeSpecification extends AbstractSpecification<EmployeCriteria, Employe> {


    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("age",criteria.getAge(),criteria.getAgeLessThen(),criteria.getAgeGreaterThen());
        addPredicate("firstname",criteria.getFirstname(),criteria.getFirstnameLike());
        addPredicate("lastname",criteria.getLastname(), criteria.getLastnameLike());
        addPredicateFk("societe","id", criteria.getSociete()==null?null:criteria.getSociete().getId());
        addPredicateFk("societe","id", criteria.getSocietes());
    }

    public EmployeSpecification(EmployeCriteria criteria) {
        super(criteria);
    }

    public EmployeSpecification(EmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }





}
