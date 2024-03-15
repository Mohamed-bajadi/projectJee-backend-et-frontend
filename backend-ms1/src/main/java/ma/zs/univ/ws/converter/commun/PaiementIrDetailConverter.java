package  ma.zs.univ.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.univ.ws.converter.commun.PaiementIrConverter;
import ma.zs.univ.ws.converter.commun.TauxIrConverter;

import ma.zs.univ.bean.core.commun.PaiementIr;


import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.commun.PaiementIrDetail;
import ma.zs.univ.ws.dto.commun.PaiementIrDetailDto;

@Component
public class PaiementIrDetailConverter extends AbstractConverter<PaiementIrDetail, PaiementIrDetailDto> {

    @Autowired
    private PaiementIrConverter paiementIrConverter ;
    @Autowired
    private TauxIrConverter tauxIrConverter ;
    private boolean paiementIr;
    private boolean tauxIr;

    public  PaiementIrDetailConverter() {
        super(PaiementIrDetail.class, PaiementIrDetailDto.class);
        init(true);
    }

    @Override
    public PaiementIrDetail toItem(PaiementIrDetailDto dto) {
        if (dto == null) {
            return null;
        } else {
        PaiementIrDetail item = new PaiementIrDetail();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getEmploye()))
                item.setEmploye(dto.getEmploye());
            if(StringUtil.isNotEmpty(dto.getSalaireBrute()))
                item.setSalaireBrute(dto.getSalaireBrute());
            if(StringUtil.isNotEmpty(dto.getCotisationpatronel()))
                item.setCotisationpatronel(dto.getCotisationpatronel());
            if(StringUtil.isNotEmpty(dto.getCotoisationsalarial()))
                item.setCotoisationsalarial(dto.getCotoisationsalarial());
            if(StringUtil.isNotEmpty(dto.getSalaireNet()))
                item.setSalaireNet(dto.getSalaireNet());
            if(dto.getPaiementIr() != null && dto.getPaiementIr().getId() != null){
                item.setPaiementIr(new PaiementIr());
                item.getPaiementIr().setId(dto.getPaiementIr().getId());
                item.getPaiementIr().setId(dto.getPaiementIr().getId());
            }

            if(this.tauxIr && dto.getTauxIr()!=null &&  dto.getTauxIr().getId() != null)
                item.setTauxIr(tauxIrConverter.toItem(dto.getTauxIr())) ;




        return item;
        }
    }

    @Override
    public PaiementIrDetailDto toDto(PaiementIrDetail item) {
        if (item == null) {
            return null;
        } else {
            PaiementIrDetailDto dto = new PaiementIrDetailDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getEmploye()))
                dto.setEmploye(item.getEmploye());
            if(StringUtil.isNotEmpty(item.getSalaireBrute()))
                dto.setSalaireBrute(item.getSalaireBrute());
            if(StringUtil.isNotEmpty(item.getCotisationpatronel()))
                dto.setCotisationpatronel(item.getCotisationpatronel());
            if(StringUtil.isNotEmpty(item.getCotoisationsalarial()))
                dto.setCotoisationsalarial(item.getCotoisationsalarial());
            if(StringUtil.isNotEmpty(item.getSalaireNet()))
                dto.setSalaireNet(item.getSalaireNet());
            if(this.paiementIr && item.getPaiementIr()!=null) {
                dto.setPaiementIr(paiementIrConverter.toDto(item.getPaiementIr())) ;

            }
            if(this.tauxIr && item.getTauxIr()!=null) {
                dto.setTauxIr(tauxIrConverter.toDto(item.getTauxIr())) ;

            }


        return dto;
        }
    }

    public void copy(PaiementIrDetailDto dto, PaiementIrDetail t) {
    super.copy(dto, t);
    if (dto.getPaiementIr() != null)
        paiementIrConverter.copy(dto.getPaiementIr(), t.getPaiementIr());
    if (dto.getTauxIr() != null)
        tauxIrConverter.copy(dto.getTauxIr(), t.getTauxIr());
    }



    public void initObject(boolean value) {
        this.paiementIr = value;
        this.tauxIr = value;
    }


    public PaiementIrConverter getPaiementIrConverter(){
        return this.paiementIrConverter;
    }
    public void setPaiementIrConverter(PaiementIrConverter paiementIrConverter ){
        this.paiementIrConverter = paiementIrConverter;
    }
    public TauxIrConverter getTauxIrConverter(){
        return this.tauxIrConverter;
    }
    public void setTauxIrConverter(TauxIrConverter tauxIrConverter ){
        this.tauxIrConverter = tauxIrConverter;
    }
    public boolean  isPaiementIr(){
        return this.paiementIr;
    }
    public void  setPaiementIr(boolean paiementIr){
        this.paiementIr = paiementIr;
    }
    public boolean  isTauxIr(){
        return this.tauxIr;
    }
    public void  setTauxIr(boolean tauxIr){
        this.tauxIr = tauxIr;
    }
}
