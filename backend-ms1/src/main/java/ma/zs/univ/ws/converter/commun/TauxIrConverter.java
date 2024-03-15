package  ma.zs.univ.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.commun.TauxIr;
import ma.zs.univ.ws.dto.commun.TauxIrDto;

@Component
public class TauxIrConverter extends AbstractConverter<TauxIr, TauxIrDto> {


    public  TauxIrConverter() {
        super(TauxIr.class, TauxIrDto.class);
    }

    @Override
    public TauxIr toItem(TauxIrDto dto) {
        if (dto == null) {
            return null;
        } else {
        TauxIr item = new TauxIr();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getSalaireMin()))
                item.setSalaireMin(dto.getSalaireMin());
            if(StringUtil.isNotEmpty(dto.getSalaireMax()))
                item.setSalaireMax(dto.getSalaireMax());
            if(StringUtil.isNotEmpty(dto.getPourcentage()))
                item.setPourcentage(dto.getPourcentage());
            if(StringUtil.isNotEmpty(dto.getDateMin()))
                item.setDateMin(DateUtil.stringEnToDate(dto.getDateMin()));
            if(StringUtil.isNotEmpty(dto.getDateMax()))
                item.setDateMax(DateUtil.stringEnToDate(dto.getDateMax()));
            if(StringUtil.isNotEmpty(dto.getCotisationPatronal()))
                item.setCotisationPatronal(dto.getCotisationPatronal());
            if(StringUtil.isNotEmpty(dto.getCotisationSalarial()))
                item.setCotisationSalarial(dto.getCotisationSalarial());



        return item;
        }
    }

    @Override
    public TauxIrDto toDto(TauxIr item) {
        if (item == null) {
            return null;
        } else {
            TauxIrDto dto = new TauxIrDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getSalaireMin()))
                dto.setSalaireMin(item.getSalaireMin());
            if(StringUtil.isNotEmpty(item.getSalaireMax()))
                dto.setSalaireMax(item.getSalaireMax());
            if(StringUtil.isNotEmpty(item.getPourcentage()))
                dto.setPourcentage(item.getPourcentage());
            if(item.getDateMin()!=null)
                dto.setDateMin(DateUtil.dateTimeToString(item.getDateMin()));
            if(item.getDateMax()!=null)
                dto.setDateMax(DateUtil.dateTimeToString(item.getDateMax()));
            if(StringUtil.isNotEmpty(item.getCotisationPatronal()))
                dto.setCotisationPatronal(item.getCotisationPatronal());
            if(StringUtil.isNotEmpty(item.getCotisationSalarial()))
                dto.setCotisationSalarial(item.getCotisationSalarial());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
