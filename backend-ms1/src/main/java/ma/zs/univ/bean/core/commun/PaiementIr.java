package ma.zs.univ.bean.core.commun;

import java.util.Objects;
import java.util.List;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import ma.zs.univ.bean.core.avancement.Societe;
import ma.zs.univ.bean.core.commun.TauxIr;
import ma.zs.univ.bean.core.commun.PaiementIrDetail;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "paiement_ir")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="paiement_ir_seq",sequenceName="paiement_ir_seq",allocationSize=1, initialValue = 1)
public class PaiementIr   extends AuditBusinessObject     {

    private Long id;

    private LocalDateTime datePaiementIr ;
    private BigDecimal totalCotisationPatronal = BigDecimal.ZERO;
    private BigDecimal totalCotisationSalarial = BigDecimal.ZERO;
    private Integer month = 0;
    private Integer year = 0;
    private BigDecimal totalSalaireBrut = BigDecimal.ZERO;
    private BigDecimal totalSalaireNet = BigDecimal.ZERO;

    private Societe societe ;

    private List<PaiementIrDetail> paiementIrDetails ;

    public PaiementIr(){
        super();
    }

    public PaiementIr(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="paiement_ir_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public LocalDateTime getDatePaiementIr(){
        return this.datePaiementIr;
    }
    public void setDatePaiementIr(LocalDateTime datePaiementIr){
        this.datePaiementIr = datePaiementIr;
    }
    public BigDecimal getTotalCotisationPatronal(){
        return this.totalCotisationPatronal;
    }
    public void setTotalCotisationPatronal(BigDecimal totalCotisationPatronal){
        this.totalCotisationPatronal = totalCotisationPatronal;
    }
    public BigDecimal getTotalCotisationSalarial(){
        return this.totalCotisationSalarial;
    }
    public void setTotalCotisationSalarial(BigDecimal totalCotisationSalarial){
        this.totalCotisationSalarial = totalCotisationSalarial;
    }
    public Integer getMonth(){
        return this.month;
    }
    public void setMonth(Integer month){
        this.month = month;
    }
    public Integer getYear(){
        return this.year;
    }
    public void setYear(Integer year){
        this.year = year;
    }
    public BigDecimal getTotalSalaireBrut(){
        return this.totalSalaireBrut;
    }
    public void setTotalSalaireBrut(BigDecimal totalSalaireBrut){
        this.totalSalaireBrut = totalSalaireBrut;
    }
    public BigDecimal getTotalSalaireNet(){
        return this.totalSalaireNet;
    }
    public void setTotalSalaireNet(BigDecimal totalSalaireNet){
        this.totalSalaireNet = totalSalaireNet;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "societe")
    public Societe getSociete(){
        return this.societe;
    }
    public void setSociete(Societe societe){
        this.societe = societe;
    }
    @OneToMany(mappedBy = "paiementIr")

    public List<PaiementIrDetail> getPaiementIrDetails(){
        return this.paiementIrDetails;
    }
    public void setPaiementIrDetails(List<PaiementIrDetail> paiementIrDetails){
        this.paiementIrDetails = paiementIrDetails;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaiementIr paiementIr = (PaiementIr) o;
        return id != null && id.equals(paiementIr.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

