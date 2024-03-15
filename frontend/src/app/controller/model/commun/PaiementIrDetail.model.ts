import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PaiementIrDto} from './PaiementIr.model';
import {TauxIrDto} from './TauxIr.model';

export class PaiementIrDetailDto extends BaseDto{

    public employe: string;

    public salaireBrute: null | number;

    public cotisationpatronel: null | number;

    public cotoisationsalarial: null | number;

    public salaireNet: null | number;

    public paiementIr: PaiementIrDto ;
    public tauxIr: TauxIrDto ;
    

    constructor() {
        super();

        this.employe = '';
        this.salaireBrute = null;
        this.cotisationpatronel = null;
        this.cotoisationsalarial = null;
        this.salaireNet = null;
        this.paiementIr = new PaiementIrDto() ;
        this.tauxIr = new TauxIrDto() ;

        }

}
