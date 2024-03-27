package ma.zs.univ.dao.criteria.core.commun;

import ma.zs.univ.dao.criteria.core.avancement.SocieteCriteria;
import ma.zs.univ.zynerator.criteria.BaseCriteria;

import java.util.List;

public class EmployeCriteria extends BaseCriteria {
    private String firstname;
    private String lastname;
    private String firstnameLike;
    private String lastnameLike;
    private String ageLessThen;
    private String ageGreaterThen;
    private String age;

    private SocieteCriteria societe ;
    private List<SocieteCriteria> societes ;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstnameLike() {
        return firstnameLike;
    }

    public void setFirstnameLike(String firstnameLike) {
        this.firstnameLike = firstnameLike;
    }

    public String getLastnameLike() {
        return lastnameLike;
    }

    public void setLastnameLike(String lastnameLike) {
        this.lastnameLike = lastnameLike;
    }

    public String getAgeLessThen() {
        return ageLessThen;
    }

    public void setAgeLessThen(String ageLessThen) {
        this.ageLessThen = ageLessThen;
    }

    public String getAgeGreaterThen() {
        return ageGreaterThen;
    }

    public void setAgeGreaterThen(String ageGreaterThen) {
        this.ageGreaterThen = ageGreaterThen;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
