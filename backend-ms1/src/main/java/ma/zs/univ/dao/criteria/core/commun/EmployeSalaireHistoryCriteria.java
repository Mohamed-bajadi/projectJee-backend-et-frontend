package ma.zs.univ.dao.criteria.core.commun;

import ma.zs.univ.dao.criteria.core.avancement.SocieteCriteria;
import ma.zs.univ.zynerator.criteria.BaseCriteria;


import java.util.List;

public class EmployeSalaireHistoryCriteria extends BaseCriteria {
    private String ref;
    private String moisDepart;
    private String moisFin;
    private String anneeDepart;
    private String anneeFin;
    private String salaireBrute;
    private EmployeCriteria employe;
    private SocieteCriteria societe;
    private List<SocieteCriteria> societes;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getMoisDepart() {
        return moisDepart;
    }

    public void setMoisDepart(String moisDepart) {
        this.moisDepart = moisDepart;
    }

    public String getMoisFin() {
        return moisFin;
    }

    public void setMoisFin(String moisFin) {
        this.moisFin = moisFin;
    }

    public String getAnneeDepart() {
        return anneeDepart;
    }

    public void setAnneeDepart(String anneeDepart) {
        this.anneeDepart = anneeDepart;
    }

    public String getAnneeFin() {
        return anneeFin;
    }

    public void setAnneeFin(String anneeFin) {
        this.anneeFin = anneeFin;
    }

    public String getSalaireBrute() {
        return salaireBrute;
    }

    public void setSalaireBrute(String salaireBrute) {
        this.salaireBrute = salaireBrute;
    }

    public EmployeCriteria getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeCriteria employe) {
        this.employe = employe;
    }

    public SocieteCriteria getSociete() {
        return societe;
    }

    public void setSociete(SocieteCriteria societe) {
        this.societe = societe;
    }

    public List<SocieteCriteria> getSocietes() {
        return societes;
    }

    public void setSocietes(List<SocieteCriteria> societes) {
        this.societes = societes;
    }
}
