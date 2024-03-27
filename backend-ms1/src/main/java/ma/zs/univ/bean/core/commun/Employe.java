
package ma.zs.univ.bean.core.commun;

import jakarta.persistence.*;
import ma.zs.univ.bean.core.avancement.Societe;
import ma.zs.univ.ws.dto.avancement.SocieteDto;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;

@Entity

public class Employe extends AuditBusinessObject {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String code;
   private String firstname;
   private String lastname;
   @ManyToOne
   private Societe societe;

   public void setId(Long id) {
      this.id = id;
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public Societe getSociete() {
      return societe;
   }

   public void setSociete(Societe societe) {
      this.societe = societe;
   }

   public Long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getFirstname() {
      return firstname;
   }

   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }

   public String getLastname() {
      return lastname;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }
}

