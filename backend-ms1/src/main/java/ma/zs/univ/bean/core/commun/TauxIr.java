package ma.zs.univ.bean.core.commun;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;




import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "taux_ir")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taux_ir_seq",sequenceName="taux_ir_seq",allocationSize=1, initialValue = 1)
public class TauxIr   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal salaireMin = BigDecimal.ZERO;
    private BigDecimal salaireMax = BigDecimal.ZERO;
    private BigDecimal pourcentage = BigDecimal.ZERO;
    private LocalDateTime dateMin ;
    private LocalDateTime dateMax ;
    private BigDecimal cotisationPatronal = BigDecimal.ZERO;
    private BigDecimal cotisationSalarial = BigDecimal.ZERO;



    public TauxIr(){
        super();
    }

    public TauxIr(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="taux_ir_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public BigDecimal getSalaireMin(){
        return this.salaireMin;
    }
    public void setSalaireMin(BigDecimal salaireMin){
        this.salaireMin = salaireMin;
    }
    public BigDecimal getSalaireMax(){
        return this.salaireMax;
    }
    public void setSalaireMax(BigDecimal salaireMax){
        this.salaireMax = salaireMax;
    }
    public BigDecimal getPourcentage(){
        return this.pourcentage;
    }
    public void setPourcentage(BigDecimal pourcentage){
        this.pourcentage = pourcentage;
    }
    public LocalDateTime getDateMin(){
        return this.dateMin;
    }
    public void setDateMin(LocalDateTime dateMin){
        this.dateMin = dateMin;
    }
    public LocalDateTime getDateMax(){
        return this.dateMax;
    }
    public void setDateMax(LocalDateTime dateMax){
        this.dateMax = dateMax;
    }
    public BigDecimal getCotisationPatronal(){
        return this.cotisationPatronal;
    }
    public void setCotisationPatronal(BigDecimal cotisationPatronal){
        this.cotisationPatronal = cotisationPatronal;
    }
    public BigDecimal getCotisationSalarial(){
        return this.cotisationSalarial;
    }
    public void setCotisationSalarial(BigDecimal cotisationSalarial){
        this.cotisationSalarial = cotisationSalarial;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TauxIr tauxIr = (TauxIr) o;
        return id != null && id.equals(tauxIr.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

