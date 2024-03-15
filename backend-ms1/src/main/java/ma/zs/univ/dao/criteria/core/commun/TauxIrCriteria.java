package  ma.zs.univ.dao.criteria.core.commun;



import ma.zs.univ.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class TauxIrCriteria extends  BaseCriteria  {

    private String salaireMin;
    private String salaireMinMin;
    private String salaireMinMax;
    private String salaireMax;
    private String salaireMaxMin;
    private String salaireMaxMax;
    private String pourcentage;
    private String pourcentageMin;
    private String pourcentageMax;
    private LocalDateTime dateMin;
    private LocalDateTime dateMinFrom;
    private LocalDateTime dateMinTo;
    private LocalDateTime dateMax;
    private LocalDateTime dateMaxFrom;
    private LocalDateTime dateMaxTo;
    private String cotisationPatronal;
    private String cotisationPatronalMin;
    private String cotisationPatronalMax;
    private String cotisationSalarial;
    private String cotisationSalarialMin;
    private String cotisationSalarialMax;



    public TauxIrCriteria(){}

    public String getSalaireMin(){
        return this.salaireMin;
    }
    public void setSalaireMin(String salaireMin){
        this.salaireMin = salaireMin;
    }   
    public String getSalaireMinMin(){
        return this.salaireMinMin;
    }
    public void setSalaireMinMin(String salaireMinMin){
        this.salaireMinMin = salaireMinMin;
    }
    public String getSalaireMinMax(){
        return this.salaireMinMax;
    }
    public void setSalaireMinMax(String salaireMinMax){
        this.salaireMinMax = salaireMinMax;
    }
      
    public String getSalaireMax(){
        return this.salaireMax;
    }
    public void setSalaireMax(String salaireMax){
        this.salaireMax = salaireMax;
    }   
    public String getSalaireMaxMin(){
        return this.salaireMaxMin;
    }
    public void setSalaireMaxMin(String salaireMaxMin){
        this.salaireMaxMin = salaireMaxMin;
    }
    public String getSalaireMaxMax(){
        return this.salaireMaxMax;
    }
    public void setSalaireMaxMax(String salaireMaxMax){
        this.salaireMaxMax = salaireMaxMax;
    }
      
    public String getPourcentage(){
        return this.pourcentage;
    }
    public void setPourcentage(String pourcentage){
        this.pourcentage = pourcentage;
    }   
    public String getPourcentageMin(){
        return this.pourcentageMin;
    }
    public void setPourcentageMin(String pourcentageMin){
        this.pourcentageMin = pourcentageMin;
    }
    public String getPourcentageMax(){
        return this.pourcentageMax;
    }
    public void setPourcentageMax(String pourcentageMax){
        this.pourcentageMax = pourcentageMax;
    }
      
    public LocalDateTime getDateMin(){
        return this.dateMin;
    }
    public void setDateMin(LocalDateTime dateMin){
        this.dateMin = dateMin;
    }
    public LocalDateTime getDateMinFrom(){
        return this.dateMinFrom;
    }
    public void setDateMinFrom(LocalDateTime dateMinFrom){
        this.dateMinFrom = dateMinFrom;
    }
    public LocalDateTime getDateMinTo(){
        return this.dateMinTo;
    }
    public void setDateMinTo(LocalDateTime dateMinTo){
        this.dateMinTo = dateMinTo;
    }
    public LocalDateTime getDateMax(){
        return this.dateMax;
    }
    public void setDateMax(LocalDateTime dateMax){
        this.dateMax = dateMax;
    }
    public LocalDateTime getDateMaxFrom(){
        return this.dateMaxFrom;
    }
    public void setDateMaxFrom(LocalDateTime dateMaxFrom){
        this.dateMaxFrom = dateMaxFrom;
    }
    public LocalDateTime getDateMaxTo(){
        return this.dateMaxTo;
    }
    public void setDateMaxTo(LocalDateTime dateMaxTo){
        this.dateMaxTo = dateMaxTo;
    }
    public String getCotisationPatronal(){
        return this.cotisationPatronal;
    }
    public void setCotisationPatronal(String cotisationPatronal){
        this.cotisationPatronal = cotisationPatronal;
    }   
    public String getCotisationPatronalMin(){
        return this.cotisationPatronalMin;
    }
    public void setCotisationPatronalMin(String cotisationPatronalMin){
        this.cotisationPatronalMin = cotisationPatronalMin;
    }
    public String getCotisationPatronalMax(){
        return this.cotisationPatronalMax;
    }
    public void setCotisationPatronalMax(String cotisationPatronalMax){
        this.cotisationPatronalMax = cotisationPatronalMax;
    }
      
    public String getCotisationSalarial(){
        return this.cotisationSalarial;
    }
    public void setCotisationSalarial(String cotisationSalarial){
        this.cotisationSalarial = cotisationSalarial;
    }   
    public String getCotisationSalarialMin(){
        return this.cotisationSalarialMin;
    }
    public void setCotisationSalarialMin(String cotisationSalarialMin){
        this.cotisationSalarialMin = cotisationSalarialMin;
    }
    public String getCotisationSalarialMax(){
        return this.cotisationSalarialMax;
    }
    public void setCotisationSalarialMax(String cotisationSalarialMax){
        this.cotisationSalarialMax = cotisationSalarialMax;
    }
      

}
