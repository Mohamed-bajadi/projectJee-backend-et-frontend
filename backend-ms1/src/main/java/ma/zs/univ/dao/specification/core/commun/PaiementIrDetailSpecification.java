package  ma.zs.univ.dao.specification.core.commun;

import ma.zs.univ.dao.criteria.core.commun.PaiementIrDetailCriteria;
import ma.zs.univ.bean.core.commun.PaiementIrDetail;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class PaiementIrDetailSpecification extends  AbstractSpecification<PaiementIrDetailCriteria, PaiementIrDetail>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("employe", criteria.getEmploye(),criteria.getEmployeLike());
        addPredicateBigDecimal("salaireBrute", criteria.getSalaireBrute(), criteria.getSalaireBruteMin(), criteria.getSalaireBruteMax());
        addPredicateBigDecimal("cotisationpatronel", criteria.getCotisationpatronel(), criteria.getCotisationpatronelMin(), criteria.getCotisationpatronelMax());
        addPredicateBigDecimal("cotoisationsalarial", criteria.getCotoisationsalarial(), criteria.getCotoisationsalarialMin(), criteria.getCotoisationsalarialMax());
        addPredicateBigDecimal("salaireNet", criteria.getSalaireNet(), criteria.getSalaireNetMin(), criteria.getSalaireNetMax());
        addPredicateFk("paiementIr","id", criteria.getPaiementIr()==null?null:criteria.getPaiementIr().getId());
        addPredicateFk("paiementIr","id", criteria.getPaiementIrs());
        addPredicateFk("tauxIr","id", criteria.getTauxIr()==null?null:criteria.getTauxIr().getId());
        addPredicateFk("tauxIr","id", criteria.getTauxIrs());
    }

    public PaiementIrDetailSpecification(PaiementIrDetailCriteria criteria) {
        super(criteria);
    }

    public PaiementIrDetailSpecification(PaiementIrDetailCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
