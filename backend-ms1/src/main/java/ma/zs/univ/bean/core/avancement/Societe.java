package ma.zs.univ.bean.core.avancement;

import java.util.Objects;







import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "societe")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="societe_seq",sequenceName="societe_seq",allocationSize=1, initialValue = 1)
public class Societe   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String ice;
    @Column(length = 500)
    private String libelle;



    public Societe(){
        super();
    }

    public Societe(Long id){
        this.id = id;
    }

    public Societe(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }
    public Societe(String libelle){
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="societe_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getIce(){
        return this.ice;
    }
    public void setIce(String ice){
        this.ice = ice;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Societe societe = (Societe) o;
        return id != null && id.equals(societe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

