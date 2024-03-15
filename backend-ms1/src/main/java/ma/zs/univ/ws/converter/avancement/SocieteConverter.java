package  ma.zs.univ.ws.converter.avancement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.avancement.Societe;
import ma.zs.univ.ws.dto.avancement.SocieteDto;

@Component
public class SocieteConverter extends AbstractConverter<Societe, SocieteDto> {


    public  SocieteConverter() {
        super(Societe.class, SocieteDto.class);
    }

    @Override
    public Societe toItem(SocieteDto dto) {
        if (dto == null) {
            return null;
        } else {
        Societe item = new Societe();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getIce()))
                item.setIce(dto.getIce());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());



        return item;
        }
    }

    @Override
    public SocieteDto toDto(Societe item) {
        if (item == null) {
            return null;
        } else {
            SocieteDto dto = new SocieteDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getIce()))
                dto.setIce(item.getIce());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
