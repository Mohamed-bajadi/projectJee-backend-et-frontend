package ma.zs.univ.ws.converter.commun;


import ma.zs.univ.bean.core.commun.Employe;
import ma.zs.univ.bean.core.commun.EmployeSalaireHistory;
import ma.zs.univ.bean.core.commun.PaiementIr;
import ma.zs.univ.ws.converter.avancement.SocieteConverter;
import ma.zs.univ.ws.dto.avancement.SocieteDto;
import ma.zs.univ.ws.dto.commun.EmployeDto;
import ma.zs.univ.ws.dto.commun.EmployeSalaireHistoryDto;
import ma.zs.univ.ws.dto.commun.PaiementIrDetailDto;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.zynerator.util.ListUtil;
import ma.zs.univ.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeSalaireHistoryConverter extends AbstractConverter<EmployeSalaireHistory, EmployeSalaireHistoryDto> {


    @Autowired
    private SocieteConverter societeConverter;
    @Autowired
    private EmployeConverter employeConverter;
    private boolean societe;
    private boolean employe;

    protected EmployeSalaireHistoryConverter() {
        super(EmployeSalaireHistory.class, EmployeSalaireHistoryDto.class);
        init(true);
    }


    @Override
    public EmployeSalaireHistory toItem(EmployeSalaireHistoryDto dto) {
        if (dto == null) {
            return null;
        } else {
            EmployeSalaireHistory item = new EmployeSalaireHistory();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if (StringUtil.isNotEmpty(dto.getSalaireBrute()))
                item.setSalaireBrute(dto.getSalaireBrute());
            if (StringUtil.isNotEmpty(dto.getAnneeFin()))
                item.setAnneeFin(DateUtil.stringEnToDate(dto.getAnneeFin()));
            if (StringUtil.isNotEmpty(dto.getAnneeDepart()))
                item.setAnneeDepart(DateUtil.stringEnToDate(dto.getAnneeDepart()));
            if (StringUtil.isNotEmpty(dto.getMoisDepart()))
                item.setMoisDepart(DateUtil.stringEnToDate(dto.getMoisDepart()));
            if (StringUtil.isNotEmpty(dto.getMoisFin()))
                item.setMoisFin(DateUtil.stringEnToDate(dto.getMoisFin()));
            if (this.societe && dto.getSociete() != null && dto.getSociete().getId() != null)
                item.setSociete(societeConverter.toItem(dto.getSociete()));

            if (this.employe && dto.getEmploye() != null && dto.getEmploye().getId() != null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye()));

            return item;
        }
    }

    @Override
    public EmployeSalaireHistoryDto toDto(EmployeSalaireHistory item) {
        if (item == null) {
            return null;
        } else {
            EmployeSalaireHistoryDto dto = new EmployeSalaireHistoryDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getSalaireBrute()))
                dto.setSalaireBrute(item.getSalaireBrute());
            if(item.getMoisDepart()!=null)
                dto.setMoisDepart(DateUtil.dateTimeToString(item.getMoisDepart()));
            if(item.getAnneeDepart()!=null)
                dto.setAnneeDepart(DateUtil.dateTimeToString(item.getAnneeDepart()));
            if(item.getMoisFin()!=null)
                dto.setMoisFin(DateUtil.dateTimeToString(item.getMoisFin()));
            if(item.getAnneeFin()!=null)
                dto.setAnneeFin(DateUtil.dateTimeToString(item.getAnneeFin()));
            if(this.societe && item.getSociete()!=null) {
                dto.setSociete(societeConverter.toDto(item.getSociete())); ;

            }
            if(this.employe && item.getEmploye()!=null) {
                dto.setEmploye(employeConverter.toDto(item.getEmploye())); ;

            }


            return dto;
        }
    }
}






