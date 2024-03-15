package  ma.zs.univ.ws.dto.commun;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaiementIrDetailDto  extends AuditBaseDto {

    private String employe  ;
    private BigDecimal salaireBrute  ;
    private BigDecimal cotisationpatronel  ;
    private BigDecimal cotoisationsalarial  ;
    private BigDecimal salaireNet  ;

    private PaiementIrDto paiementIr ;
    private TauxIrDto tauxIr ;



    public PaiementIrDetailDto(){
        super();
    }



    @Log
    public String getEmploye(){
        return this.employe;
    }
    public void setEmploye(String employe){
        this.employe = employe;
    }

    @Log
    public BigDecimal getSalaireBrute(){
        return this.salaireBrute;
    }
    public void setSalaireBrute(BigDecimal salaireBrute){
        this.salaireBrute = salaireBrute;
    }

    @Log
    public BigDecimal getCotisationpatronel(){
        return this.cotisationpatronel;
    }
    public void setCotisationpatronel(BigDecimal cotisationpatronel){
        this.cotisationpatronel = cotisationpatronel;
    }

    @Log
    public BigDecimal getCotoisationsalarial(){
        return this.cotoisationsalarial;
    }
    public void setCotoisationsalarial(BigDecimal cotoisationsalarial){
        this.cotoisationsalarial = cotoisationsalarial;
    }

    @Log
    public BigDecimal getSalaireNet(){
        return this.salaireNet;
    }
    public void setSalaireNet(BigDecimal salaireNet){
        this.salaireNet = salaireNet;
    }


    public PaiementIrDto getPaiementIr(){
        return this.paiementIr;
    }

    public void setPaiementIr(PaiementIrDto paiementIr){
        this.paiementIr = paiementIr;
    }
    public TauxIrDto getTauxIr(){
        return this.tauxIr;
    }

    public void setTauxIr(TauxIrDto tauxIr){
        this.tauxIr = tauxIr;
    }






}
