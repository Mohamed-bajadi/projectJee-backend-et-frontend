package ma.zs.univ.ws.dto.commun;


import com.fasterxml.jackson.annotation.JsonFormat;
import ma.zs.univ.ws.dto.avancement.SocieteDto;
import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;

import java.math.BigDecimal;

public class EmployeSalaireHistoryDto extends AuditBaseDto {
    private String moisDepart ;
    private String moisFin;
    private String anneeDepart;
    private String anneeFin;
    private BigDecimal salaireBrute;
    private SocieteDto societe;
    private EmployeDto employe;
    private String ref;
    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getMoisDepart() {
        return moisDepart;
    }

    public void setMoisDepart(String moisDepart) {
        this.moisDepart = moisDepart;
    }
    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getMoisFin() {
        return moisFin;
    }

    public void setMoisFin(String moisFin) {
        this.moisFin = moisFin;
    }
    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getAnneeDepart() {
        return anneeDepart;
    }

    public void setAnneeDepart(String anneeDepart) {
        this.anneeDepart = anneeDepart;
    }
    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getAnneeFin() {
        return anneeFin;
    }

    public void setAnneeFin(String anneeFin) {
        this.anneeFin = anneeFin;
    }

    public BigDecimal getSalaireBrute() {
        return salaireBrute;
    }

    public void setSalaireBrute(BigDecimal salaireBrute) {
        this.salaireBrute = salaireBrute;
    }

    public SocieteDto getSociete() {
        return societe;
    }

    public void setSociete(SocieteDto societe) {
        this.societe = societe;
    }

    public EmployeDto getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeDto employe) {
        this.employe = employe;
    }
    @Log
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
