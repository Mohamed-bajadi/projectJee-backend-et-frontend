package  ma.zs.univ.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.univ.zynerator.util.ListUtil;

import ma.zs.univ.ws.converter.avancement.SocieteConverter;
import ma.zs.univ.ws.converter.commun.TauxIrConverter;
import ma.zs.univ.ws.converter.commun.PaiementIrDetailConverter;



import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.commun.PaiementIr;
import ma.zs.univ.ws.dto.commun.PaiementIrDto;

@Component
public class PaiementIrConverter extends AbstractConverter<PaiementIr, PaiementIrDto> {

    @Autowired
    private SocieteConverter societeConverter ;
    @Autowired
    private TauxIrConverter tauxIrConverter ;
    @Autowired
    private PaiementIrDetailConverter paiementIrDetailConverter ;
    private boolean societe;
    private boolean paiementIrDetails;

    public  PaiementIrConverter() {
        super(PaiementIr.class, PaiementIrDto.class);
        init(true);
    }

    @Override
    public PaiementIr toItem(PaiementIrDto dto) {
        if (dto == null) {
            return null;
        } else {
        PaiementIr item = new PaiementIr();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDatePaiementIr()))
                item.setDatePaiementIr(DateUtil.stringEnToDate(dto.getDatePaiementIr()));
            if(StringUtil.isNotEmpty(dto.getTotalCotisationPatronal()))
                item.setTotalCotisationPatronal(dto.getTotalCotisationPatronal());
            if(StringUtil.isNotEmpty(dto.getTotalCotisationSalarial()))
                item.setTotalCotisationSalarial(dto.getTotalCotisationSalarial());
            if(StringUtil.isNotEmpty(dto.getMonth()))
                item.setMonth(dto.getMonth());
            if(StringUtil.isNotEmpty(dto.getYear()))
                item.setYear(dto.getYear());
            if(StringUtil.isNotEmpty(dto.getTotalSalaireBrut()))
                item.setTotalSalaireBrut(dto.getTotalSalaireBrut());
            if(StringUtil.isNotEmpty(dto.getTotalSalaireNet()))
                item.setTotalSalaireNet(dto.getTotalSalaireNet());
            if(this.societe && dto.getSociete()!=null &&  dto.getSociete().getId() != null)
                item.setSociete(societeConverter.toItem(dto.getSociete())) ;


            if(this.paiementIrDetails && ListUtil.isNotEmpty(dto.getPaiementIrDetails()))
                item.setPaiementIrDetails(paiementIrDetailConverter.toItem(dto.getPaiementIrDetails()));


        return item;
        }
    }

    @Override
    public PaiementIrDto toDto(PaiementIr item) {
        if (item == null) {
            return null;
        } else {
            PaiementIrDto dto = new PaiementIrDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDatePaiementIr()!=null)
                dto.setDatePaiementIr(DateUtil.dateTimeToString(item.getDatePaiementIr()));
            if(StringUtil.isNotEmpty(item.getTotalCotisationPatronal()))
                dto.setTotalCotisationPatronal(item.getTotalCotisationPatronal());
            if(StringUtil.isNotEmpty(item.getTotalCotisationSalarial()))
                dto.setTotalCotisationSalarial(item.getTotalCotisationSalarial());
            if(StringUtil.isNotEmpty(item.getMonth()))
                dto.setMonth(item.getMonth());
            if(StringUtil.isNotEmpty(item.getYear()))
                dto.setYear(item.getYear());
            if(StringUtil.isNotEmpty(item.getTotalSalaireBrut()))
                dto.setTotalSalaireBrut(item.getTotalSalaireBrut());
            if(StringUtil.isNotEmpty(item.getTotalSalaireNet()))
                dto.setTotalSalaireNet(item.getTotalSalaireNet());
            if(this.societe && item.getSociete()!=null) {
                dto.setSociete(societeConverter.toDto(item.getSociete())) ;

            }
        if(this.paiementIrDetails && ListUtil.isNotEmpty(item.getPaiementIrDetails())){
            paiementIrDetailConverter.init(true);
            paiementIrDetailConverter.setPaiementIr(false);
            dto.setPaiementIrDetails(paiementIrDetailConverter.toDto(item.getPaiementIrDetails()));
            paiementIrDetailConverter.setPaiementIr(true);

        }


        return dto;
        }
    }

    public void copy(PaiementIrDto dto, PaiementIr t) {
    super.copy(dto, t);
    if (dto.getSociete() != null)
        societeConverter.copy(dto.getSociete(), t.getSociete());
    if (dto.getPaiementIrDetails() != null)
        t.setPaiementIrDetails(paiementIrDetailConverter.copy(dto.getPaiementIrDetails()));
    }


    public void initList(boolean value) {
        this.paiementIrDetails = value;
    }

    public void initObject(boolean value) {
        this.societe = value;
    }


    public SocieteConverter getSocieteConverter(){
        return this.societeConverter;
    }
    public void setSocieteConverter(SocieteConverter societeConverter ){
        this.societeConverter = societeConverter;
    }
    public TauxIrConverter getTauxIrConverter(){
        return this.tauxIrConverter;
    }
    public void setTauxIrConverter(TauxIrConverter tauxIrConverter ){
        this.tauxIrConverter = tauxIrConverter;
    }
    public PaiementIrDetailConverter getPaiementIrDetailConverter(){
        return this.paiementIrDetailConverter;
    }
    public void setPaiementIrDetailConverter(PaiementIrDetailConverter paiementIrDetailConverter ){
        this.paiementIrDetailConverter = paiementIrDetailConverter;
    }
    public boolean  isSociete(){
        return this.societe;
    }
    public void  setSociete(boolean societe){
        this.societe = societe;
    }
    public boolean  isPaiementIrDetails(){
        return this.paiementIrDetails ;
    }
    public void  setPaiementIrDetails(boolean paiementIrDetails ){
        this.paiementIrDetails  = paiementIrDetails ;
    }
}
