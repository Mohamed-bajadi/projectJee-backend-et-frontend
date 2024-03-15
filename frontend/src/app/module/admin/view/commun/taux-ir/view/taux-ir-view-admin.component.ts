import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {TauxIrAdminService} from 'src/app/controller/service/admin/commun/TauxIrAdmin.service';
import {TauxIrDto} from 'src/app/controller/model/commun/TauxIr.model';
import {TauxIrCriteria} from 'src/app/controller/criteria/commun/TauxIrCriteria.model';

@Component({
  selector: 'app-taux-ir-view-admin',
  templateUrl: './taux-ir-view-admin.component.html'
})
export class TauxIrViewAdminComponent extends AbstractViewController<TauxIrDto, TauxIrCriteria, TauxIrAdminService> implements OnInit {


    constructor(private tauxIrService: TauxIrAdminService){
        super(tauxIrService);
    }

    ngOnInit(): void {
    }




}
