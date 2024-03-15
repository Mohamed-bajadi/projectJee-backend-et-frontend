package  ma.zs.univ.ws.dto.avancement;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;





@JsonInclude(JsonInclude.Include.NON_NULL)
public class SocieteDto  extends AuditBaseDto {

    private String ice  ;
    private String libelle  ;




    public SocieteDto(){
        super();
    }



    @Log
    public String getIce(){
        return this.ice;
    }
    public void setIce(String ice){
        this.ice = ice;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }








}
