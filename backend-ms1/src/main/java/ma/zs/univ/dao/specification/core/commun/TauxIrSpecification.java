package  ma.zs.univ.dao.specification.core.commun;

import ma.zs.univ.dao.criteria.core.commun.TauxIrCriteria;
import ma.zs.univ.bean.core.commun.TauxIr;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class TauxIrSpecification extends  AbstractSpecification<TauxIrCriteria, TauxIr>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("salaireMin", criteria.getSalaireMin(), criteria.getSalaireMinMin(), criteria.getSalaireMinMax());
        addPredicateBigDecimal("salaireMax", criteria.getSalaireMax(), criteria.getSalaireMaxMin(), criteria.getSalaireMaxMax());
        addPredicateBigDecimal("pourcentage", criteria.getPourcentage(), criteria.getPourcentageMin(), criteria.getPourcentageMax());
        addPredicate("dateMin", criteria.getDateMin(), criteria.getDateMinFrom(), criteria.getDateMinTo());
        addPredicate("dateMax", criteria.getDateMax(), criteria.getDateMaxFrom(), criteria.getDateMaxTo());
        addPredicateBigDecimal("cotisationPatronal", criteria.getCotisationPatronal(), criteria.getCotisationPatronalMin(), criteria.getCotisationPatronalMax());
        addPredicateBigDecimal("cotisationSalarial", criteria.getCotisationSalarial(), criteria.getCotisationSalarialMin(), criteria.getCotisationSalarialMax());
    }

    public TauxIrSpecification(TauxIrCriteria criteria) {
        super(criteria);
    }

    public TauxIrSpecification(TauxIrCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
