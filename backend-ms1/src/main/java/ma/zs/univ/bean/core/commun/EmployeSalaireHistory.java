package ma.zs.univ.bean.core.commun;

import jakarta.persistence.*;
import ma.zs.univ.bean.core.avancement.Societe;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class EmployeSalaireHistory extends AuditBusinessObject {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime moisDepart ;
    private LocalDateTime moisFin;
    private LocalDateTime anneeDepart;
    private LocalDateTime anneeFin;
    private BigDecimal salaireBrute;
    @ManyToOne
    private Societe societe;
    @OneToOne
    private Employe employe;
    private String ref;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getMoisDepart() {
        return moisDepart;
    }

    public void setMoisDepart(LocalDateTime moisDepart) {
        this.moisDepart = moisDepart;
    }

    public LocalDateTime getMoisFin() {
        return moisFin;
    }

    public void setMoisFin(LocalDateTime moisFin) {
        this.moisFin = moisFin;
    }

    public LocalDateTime getAnneeDepart() {
        return anneeDepart;
    }

    public void setAnneeDepart(LocalDateTime anneeDepart) {
        this.anneeDepart = anneeDepart;
    }

    public LocalDateTime getAnneeFin() {
        return anneeFin;
    }

    public void setAnneeFin(LocalDateTime anneeFin) {
        this.anneeFin = anneeFin;
    }

    public BigDecimal getSalaireBrute() {
        return salaireBrute;
    }

    public void setSalaireBrute(BigDecimal salaireBrute) {
        this.salaireBrute = salaireBrute;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
