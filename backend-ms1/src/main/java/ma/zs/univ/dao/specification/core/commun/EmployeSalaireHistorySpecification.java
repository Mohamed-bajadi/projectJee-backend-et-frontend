package ma.zs.univ.dao.specification.core.commun;

import ma.zs.univ.bean.core.commun.EmployeSalaireHistory;
import ma.zs.univ.dao.criteria.core.commun.EmployeSalaireHistoryCriteria;
import ma.zs.univ.zynerator.specification.AbstractSpecification;
import org.springframework.data.jpa.domain.Specification;

public class EmployeSalaireHistorySpecification extends AbstractSpecification<EmployeSalaireHistoryCriteria, EmployeSalaireHistory> {
    public EmployeSalaireHistorySpecification(EmployeSalaireHistoryCriteria criteria) {
        super(criteria);
    }

    public EmployeSalaireHistorySpecification(EmployeSalaireHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref",criteria.getRef());
        addPredicate("moisDeparte",criteria.getAnneeDepart());
        addPredicate("moisFin",criteria.getMoisFin());
        addPredicateBigDecimal("salaireBrute", criteria.getSalaireBrute());
        addPredicate("anneeDepart",criteria.getAnneeDepart());
        addPredicateFk("societe","id", criteria.getSociete()==null?null:criteria.getSociete().getId());
        addPredicateFk("societe","id", criteria.getSocietes());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());

    }


}
