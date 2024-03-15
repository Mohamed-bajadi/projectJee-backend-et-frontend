package  ma.zs.univ.dao.criteria.core.commun;



import ma.zs.univ.zynerator.criteria.BaseCriteria;
import java.util.List;

public class PaiementIrDetailCriteria extends  BaseCriteria  {

    private String employe;
    private String employeLike;
    private String salaireBrute;
    private String salaireBruteMin;
    private String salaireBruteMax;
    private String cotisationpatronel;
    private String cotisationpatronelMin;
    private String cotisationpatronelMax;
    private String cotoisationsalarial;
    private String cotoisationsalarialMin;
    private String cotoisationsalarialMax;
    private String salaireNet;
    private String salaireNetMin;
    private String salaireNetMax;

    private PaiementIrCriteria paiementIr ;
    private List<PaiementIrCriteria> paiementIrs ;
    private TauxIrCriteria tauxIr ;
    private List<TauxIrCriteria> tauxIrs ;


    public PaiementIrDetailCriteria(){}

    public String getEmploye(){
        return this.employe;
    }
    public void setEmploye(String employe){
        this.employe = employe;
    }
    public String getEmployeLike(){
        return this.employeLike;
    }
    public void setEmployeLike(String employeLike){
        this.employeLike = employeLike;
    }

    public String getSalaireBrute(){
        return this.salaireBrute;
    }
    public void setSalaireBrute(String salaireBrute){
        this.salaireBrute = salaireBrute;
    }   
    public String getSalaireBruteMin(){
        return this.salaireBruteMin;
    }
    public void setSalaireBruteMin(String salaireBruteMin){
        this.salaireBruteMin = salaireBruteMin;
    }
    public String getSalaireBruteMax(){
        return this.salaireBruteMax;
    }
    public void setSalaireBruteMax(String salaireBruteMax){
        this.salaireBruteMax = salaireBruteMax;
    }
      
    public String getCotisationpatronel(){
        return this.cotisationpatronel;
    }
    public void setCotisationpatronel(String cotisationpatronel){
        this.cotisationpatronel = cotisationpatronel;
    }   
    public String getCotisationpatronelMin(){
        return this.cotisationpatronelMin;
    }
    public void setCotisationpatronelMin(String cotisationpatronelMin){
        this.cotisationpatronelMin = cotisationpatronelMin;
    }
    public String getCotisationpatronelMax(){
        return this.cotisationpatronelMax;
    }
    public void setCotisationpatronelMax(String cotisationpatronelMax){
        this.cotisationpatronelMax = cotisationpatronelMax;
    }
      
    public String getCotoisationsalarial(){
        return this.cotoisationsalarial;
    }
    public void setCotoisationsalarial(String cotoisationsalarial){
        this.cotoisationsalarial = cotoisationsalarial;
    }   
    public String getCotoisationsalarialMin(){
        return this.cotoisationsalarialMin;
    }
    public void setCotoisationsalarialMin(String cotoisationsalarialMin){
        this.cotoisationsalarialMin = cotoisationsalarialMin;
    }
    public String getCotoisationsalarialMax(){
        return this.cotoisationsalarialMax;
    }
    public void setCotoisationsalarialMax(String cotoisationsalarialMax){
        this.cotoisationsalarialMax = cotoisationsalarialMax;
    }
      
    public String getSalaireNet(){
        return this.salaireNet;
    }
    public void setSalaireNet(String salaireNet){
        this.salaireNet = salaireNet;
    }   
    public String getSalaireNetMin(){
        return this.salaireNetMin;
    }
    public void setSalaireNetMin(String salaireNetMin){
        this.salaireNetMin = salaireNetMin;
    }
    public String getSalaireNetMax(){
        return this.salaireNetMax;
    }
    public void setSalaireNetMax(String salaireNetMax){
        this.salaireNetMax = salaireNetMax;
    }
      

    public PaiementIrCriteria getPaiementIr(){
        return this.paiementIr;
    }

    public void setPaiementIr(PaiementIrCriteria paiementIr){
        this.paiementIr = paiementIr;
    }
    public List<PaiementIrCriteria> getPaiementIrs(){
        return this.paiementIrs;
    }

    public void setPaiementIrs(List<PaiementIrCriteria> paiementIrs){
        this.paiementIrs = paiementIrs;
    }
    public TauxIrCriteria getTauxIr(){
        return this.tauxIr;
    }

    public void setTauxIr(TauxIrCriteria tauxIr){
        this.tauxIr = tauxIr;
    }
    public List<TauxIrCriteria> getTauxIrs(){
        return this.tauxIrs;
    }

    public void setTauxIrs(List<TauxIrCriteria> tauxIrs){
        this.tauxIrs = tauxIrs;
    }
}
