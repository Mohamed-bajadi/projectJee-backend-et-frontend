package  ma.zs.univ.dao.criteria.core.commun;


import ma.zs.univ.dao.criteria.core.avancement.SocieteCriteria;

import ma.zs.univ.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PaiementIrCriteria extends  BaseCriteria  {

    private LocalDateTime datePaiementIr;
    private LocalDateTime datePaiementIrFrom;
    private LocalDateTime datePaiementIrTo;
    private String totalCotisationPatronal;
    private String totalCotisationPatronalMin;
    private String totalCotisationPatronalMax;
    private String totalCotisationSalarial;
    private String totalCotisationSalarialMin;
    private String totalCotisationSalarialMax;
    private String month;
    private String monthMin;
    private String monthMax;
    private String year;
    private String yearMin;
    private String yearMax;
    private String totalSalaireBrut;
    private String totalSalaireBrutMin;
    private String totalSalaireBrutMax;
    private String totalSalaireNet;
    private String totalSalaireNetMin;
    private String totalSalaireNetMax;

    private SocieteCriteria societe ;
    private List<SocieteCriteria> societes ;


    public PaiementIrCriteria(){}

    public LocalDateTime getDatePaiementIr(){
        return this.datePaiementIr;
    }
    public void setDatePaiementIr(LocalDateTime datePaiementIr){
        this.datePaiementIr = datePaiementIr;
    }
    public LocalDateTime getDatePaiementIrFrom(){
        return this.datePaiementIrFrom;
    }
    public void setDatePaiementIrFrom(LocalDateTime datePaiementIrFrom){
        this.datePaiementIrFrom = datePaiementIrFrom;
    }
    public LocalDateTime getDatePaiementIrTo(){
        return this.datePaiementIrTo;
    }
    public void setDatePaiementIrTo(LocalDateTime datePaiementIrTo){
        this.datePaiementIrTo = datePaiementIrTo;
    }
    public String getTotalCotisationPatronal(){
        return this.totalCotisationPatronal;
    }
    public void setTotalCotisationPatronal(String totalCotisationPatronal){
        this.totalCotisationPatronal = totalCotisationPatronal;
    }   
    public String getTotalCotisationPatronalMin(){
        return this.totalCotisationPatronalMin;
    }
    public void setTotalCotisationPatronalMin(String totalCotisationPatronalMin){
        this.totalCotisationPatronalMin = totalCotisationPatronalMin;
    }
    public String getTotalCotisationPatronalMax(){
        return this.totalCotisationPatronalMax;
    }
    public void setTotalCotisationPatronalMax(String totalCotisationPatronalMax){
        this.totalCotisationPatronalMax = totalCotisationPatronalMax;
    }
      
    public String getTotalCotisationSalarial(){
        return this.totalCotisationSalarial;
    }
    public void setTotalCotisationSalarial(String totalCotisationSalarial){
        this.totalCotisationSalarial = totalCotisationSalarial;
    }   
    public String getTotalCotisationSalarialMin(){
        return this.totalCotisationSalarialMin;
    }
    public void setTotalCotisationSalarialMin(String totalCotisationSalarialMin){
        this.totalCotisationSalarialMin = totalCotisationSalarialMin;
    }
    public String getTotalCotisationSalarialMax(){
        return this.totalCotisationSalarialMax;
    }
    public void setTotalCotisationSalarialMax(String totalCotisationSalarialMax){
        this.totalCotisationSalarialMax = totalCotisationSalarialMax;
    }
      
    public String getMonth(){
        return this.month;
    }
    public void setMonth(String month){
        this.month = month;
    }   
    public String getMonthMin(){
        return this.monthMin;
    }
    public void setMonthMin(String monthMin){
        this.monthMin = monthMin;
    }
    public String getMonthMax(){
        return this.monthMax;
    }
    public void setMonthMax(String monthMax){
        this.monthMax = monthMax;
    }
      
    public String getYear(){
        return this.year;
    }
    public void setYear(String year){
        this.year = year;
    }   
    public String getYearMin(){
        return this.yearMin;
    }
    public void setYearMin(String yearMin){
        this.yearMin = yearMin;
    }
    public String getYearMax(){
        return this.yearMax;
    }
    public void setYearMax(String yearMax){
        this.yearMax = yearMax;
    }
      
    public String getTotalSalaireBrut(){
        return this.totalSalaireBrut;
    }
    public void setTotalSalaireBrut(String totalSalaireBrut){
        this.totalSalaireBrut = totalSalaireBrut;
    }   
    public String getTotalSalaireBrutMin(){
        return this.totalSalaireBrutMin;
    }
    public void setTotalSalaireBrutMin(String totalSalaireBrutMin){
        this.totalSalaireBrutMin = totalSalaireBrutMin;
    }
    public String getTotalSalaireBrutMax(){
        return this.totalSalaireBrutMax;
    }
    public void setTotalSalaireBrutMax(String totalSalaireBrutMax){
        this.totalSalaireBrutMax = totalSalaireBrutMax;
    }
      
    public String getTotalSalaireNet(){
        return this.totalSalaireNet;
    }
    public void setTotalSalaireNet(String totalSalaireNet){
        this.totalSalaireNet = totalSalaireNet;
    }   
    public String getTotalSalaireNetMin(){
        return this.totalSalaireNetMin;
    }
    public void setTotalSalaireNetMin(String totalSalaireNetMin){
        this.totalSalaireNetMin = totalSalaireNetMin;
    }
    public String getTotalSalaireNetMax(){
        return this.totalSalaireNetMax;
    }
    public void setTotalSalaireNetMax(String totalSalaireNetMax){
        this.totalSalaireNetMax = totalSalaireNetMax;
    }
      

    public SocieteCriteria getSociete(){
        return this.societe;
    }

    public void setSociete(SocieteCriteria societe){
        this.societe = societe;
    }
    public List<SocieteCriteria> getSocietes(){
        return this.societes;
    }

    public void setSocietes(List<SocieteCriteria> societes){
        this.societes = societes;
    }
}
