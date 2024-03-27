package ma.zs.univ.ws.dto.commun;

import ma.zs.univ.bean.core.avancement.Societe;
import ma.zs.univ.ws.dto.avancement.SocieteDto;
import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;

public class EmployeDto extends AuditBaseDto {

    @Log
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    @Log
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Log
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public SocieteDto getSociete() {
        return societe;
    }

    public void setSociete(SocieteDto societe) {
        this.societe = societe;
    }

    private Long id;
    private String firstname;
    private String lastname ;
    private String code;
    private SocieteDto societe;

}
