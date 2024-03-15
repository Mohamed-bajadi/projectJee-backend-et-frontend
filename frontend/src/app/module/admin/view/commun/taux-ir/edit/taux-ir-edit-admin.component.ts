import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {TauxIrAdminService} from 'src/app/controller/service/admin/commun/TauxIrAdmin.service';
import {TauxIrDto} from 'src/app/controller/model/commun/TauxIr.model';
import {TauxIrCriteria} from 'src/app/controller/criteria/commun/TauxIrCriteria.model';



@Component({
  selector: 'app-taux-ir-edit-admin',
  templateUrl: './taux-ir-edit-admin.component.html'
})
export class TauxIrEditAdminComponent extends AbstractEditController<TauxIrDto, TauxIrCriteria, TauxIrAdminService>   implements OnInit {






    constructor( private tauxIrService: TauxIrAdminService ) {
        super(tauxIrService);
    }

    ngOnInit(): void {
    }
    public override prepareEdit() {
        this.item.dateMin = this.tauxIrService.format(this.item.dateMin);
        this.item.dateMax = this.tauxIrService.format(this.item.dateMax);
    }



    public override setValidation(value: boolean){
        }
    public override validateForm(): void{
        this.errorMessages = new Array<string>();
    }







}
