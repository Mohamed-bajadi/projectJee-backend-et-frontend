import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';
import {PaiementIrCriteria} from './PaiementIrCriteria.model';
import {TauxIrCriteria} from './TauxIrCriteria.model';

export class PaiementIrDetailCriteria  extends BaseCriteria  {

    public id: number;
    public employe: string;
    public employeLike: string;
     public salaireBrute: number;
     public salaireBruteMin: number;
     public salaireBruteMax: number;
     public cotisationpatronel: number;
     public cotisationpatronelMin: number;
     public cotisationpatronelMax: number;
     public cotoisationsalarial: number;
     public cotoisationsalarialMin: number;
     public cotoisationsalarialMax: number;
     public salaireNet: number;
     public salaireNetMin: number;
     public salaireNetMax: number;
  public paiementIr: PaiementIrCriteria ;
  public paiementIrs: Array<PaiementIrCriteria> ;
  public tauxIr: TauxIrCriteria ;
  public tauxIrs: Array<TauxIrCriteria> ;

}
