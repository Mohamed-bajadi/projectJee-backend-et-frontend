package  ma.zs.univ.dao.specification.core.commun;

import ma.zs.univ.dao.criteria.core.commun.PaiementIrCriteria;
import ma.zs.univ.bean.core.commun.PaiementIr;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class PaiementIrSpecification extends  AbstractSpecification<PaiementIrCriteria, PaiementIr>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("datePaiementIr", criteria.getDatePaiementIr(), criteria.getDatePaiementIrFrom(), criteria.getDatePaiementIrTo());
        addPredicateBigDecimal("totalCotisationPatronal", criteria.getTotalCotisationPatronal(), criteria.getTotalCotisationPatronalMin(), criteria.getTotalCotisationPatronalMax());
        addPredicateBigDecimal("totalCotisationSalarial", criteria.getTotalCotisationSalarial(), criteria.getTotalCotisationSalarialMin(), criteria.getTotalCotisationSalarialMax());
        addPredicateInt("month", criteria.getMonth(), criteria.getMonthMin(), criteria.getMonthMax());
        addPredicateInt("year", criteria.getYear(), criteria.getYearMin(), criteria.getYearMax());
        addPredicateBigDecimal("totalSalaireBrut", criteria.getTotalSalaireBrut(), criteria.getTotalSalaireBrutMin(), criteria.getTotalSalaireBrutMax());
        addPredicateBigDecimal("totalSalaireNet", criteria.getTotalSalaireNet(), criteria.getTotalSalaireNetMin(), criteria.getTotalSalaireNetMax());
        addPredicateFk("societe","id", criteria.getSociete()==null?null:criteria.getSociete().getId());
        addPredicateFk("societe","id", criteria.getSocietes());
    }

    public PaiementIrSpecification(PaiementIrCriteria criteria) {
        super(criteria);
    }

    public PaiementIrSpecification(PaiementIrCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
