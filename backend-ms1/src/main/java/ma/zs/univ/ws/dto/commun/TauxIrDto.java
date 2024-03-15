package  ma.zs.univ.ws.dto.commun;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class TauxIrDto  extends AuditBaseDto {

    private BigDecimal salaireMin  ;
    private BigDecimal salaireMax  ;
    private BigDecimal pourcentage  ;
    private String dateMin ;
    private String dateMax ;
    private BigDecimal cotisationPatronal  ;
    private BigDecimal cotisationSalarial  ;




    public TauxIrDto(){
        super();
    }



    @Log
    public BigDecimal getSalaireMin(){
        return this.salaireMin;
    }
    public void setSalaireMin(BigDecimal salaireMin){
        this.salaireMin = salaireMin;
    }

    @Log
    public BigDecimal getSalaireMax(){
        return this.salaireMax;
    }
    public void setSalaireMax(BigDecimal salaireMax){
        this.salaireMax = salaireMax;
    }

    @Log
    public BigDecimal getPourcentage(){
        return this.pourcentage;
    }
    public void setPourcentage(BigDecimal pourcentage){
        this.pourcentage = pourcentage;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateMin(){
        return this.dateMin;
    }
    public void setDateMin(String dateMin){
        this.dateMin = dateMin;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateMax(){
        return this.dateMax;
    }
    public void setDateMax(String dateMax){
        this.dateMax = dateMax;
    }

    @Log
    public BigDecimal getCotisationPatronal(){
        return this.cotisationPatronal;
    }
    public void setCotisationPatronal(BigDecimal cotisationPatronal){
        this.cotisationPatronal = cotisationPatronal;
    }

    @Log
    public BigDecimal getCotisationSalarial(){
        return this.cotisationSalarial;
    }
    public void setCotisationSalarial(BigDecimal cotisationSalarial){
        this.cotisationSalarial = cotisationSalarial;
    }








}
