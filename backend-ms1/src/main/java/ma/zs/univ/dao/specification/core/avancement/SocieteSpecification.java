package  ma.zs.univ.dao.specification.core.avancement;

import ma.zs.univ.dao.criteria.core.avancement.SocieteCriteria;
import ma.zs.univ.bean.core.avancement.Societe;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class SocieteSpecification extends  AbstractSpecification<SocieteCriteria, Societe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ice", criteria.getIce(),criteria.getIceLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public SocieteSpecification(SocieteCriteria criteria) {
        super(criteria);
    }

    public SocieteSpecification(SocieteCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
