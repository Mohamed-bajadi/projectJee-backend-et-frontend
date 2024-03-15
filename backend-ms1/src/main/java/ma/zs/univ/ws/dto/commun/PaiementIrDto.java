package  ma.zs.univ.ws.dto.commun;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


import ma.zs.univ.ws.dto.avancement.SocieteDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaiementIrDto  extends AuditBaseDto {

    private String datePaiementIr ;
    private BigDecimal totalCotisationPatronal  ;
    private BigDecimal totalCotisationSalarial  ;
    private Integer month  = 0 ;
    private Integer year  = 0 ;
    private BigDecimal totalSalaireBrut  ;
    private BigDecimal totalSalaireNet  ;

    private SocieteDto societe ;

    private List<PaiementIrDetailDto> paiementIrDetails ;


    public PaiementIrDto(){
        super();
    }



    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatePaiementIr(){
        return this.datePaiementIr;
    }
    public void setDatePaiementIr(String datePaiementIr){
        this.datePaiementIr = datePaiementIr;
    }

    @Log
    public BigDecimal getTotalCotisationPatronal(){
        return this.totalCotisationPatronal;
    }
    public void setTotalCotisationPatronal(BigDecimal totalCotisationPatronal){
        this.totalCotisationPatronal = totalCotisationPatronal;
    }

    @Log
    public BigDecimal getTotalCotisationSalarial(){
        return this.totalCotisationSalarial;
    }
    public void setTotalCotisationSalarial(BigDecimal totalCotisationSalarial){
        this.totalCotisationSalarial = totalCotisationSalarial;
    }

    @Log
    public Integer getMonth(){
        return this.month;
    }
    public void setMonth(Integer month){
        this.month = month;
    }

    @Log
    public Integer getYear(){
        return this.year;
    }
    public void setYear(Integer year){
        this.year = year;
    }

    @Log
    public BigDecimal getTotalSalaireBrut(){
        return this.totalSalaireBrut;
    }
    public void setTotalSalaireBrut(BigDecimal totalSalaireBrut){
        this.totalSalaireBrut = totalSalaireBrut;
    }

    @Log
    public BigDecimal getTotalSalaireNet(){
        return this.totalSalaireNet;
    }
    public void setTotalSalaireNet(BigDecimal totalSalaireNet){
        this.totalSalaireNet = totalSalaireNet;
    }


    public SocieteDto getSociete(){
        return this.societe;
    }

    public void setSociete(SocieteDto societe){
        this.societe = societe;
    }



    public List<PaiementIrDetailDto> getPaiementIrDetails(){
        return this.paiementIrDetails;
    }

    public void setPaiementIrDetails(List<PaiementIrDetailDto> paiementIrDetails){
        this.paiementIrDetails = paiementIrDetails;
    }



}
