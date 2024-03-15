import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {PaiementIrDetailAdminService} from 'src/app/controller/service/admin/commun/PaiementIrDetailAdmin.service';
import {PaiementIrDetailDto} from 'src/app/controller/model/commun/PaiementIrDetail.model';
import {PaiementIrDetailCriteria} from 'src/app/controller/criteria/commun/PaiementIrDetailCriteria.model';

import {PaiementIrDto} from 'src/app/controller/model/commun/PaiementIr.model';
import {PaiementIrAdminService} from 'src/app/controller/service/admin/commun/PaiementIrAdmin.service';
import {TauxIrDto} from 'src/app/controller/model/commun/TauxIr.model';
import {TauxIrAdminService} from 'src/app/controller/service/admin/commun/TauxIrAdmin.service';
@Component({
  selector: 'app-paiement-ir-detail-view-admin',
  templateUrl: './paiement-ir-detail-view-admin.component.html'
})
export class PaiementIrDetailViewAdminComponent extends AbstractViewController<PaiementIrDetailDto, PaiementIrDetailCriteria, PaiementIrDetailAdminService> implements OnInit {


    constructor(private paiementIrDetailService: PaiementIrDetailAdminService, private paiementIrService: PaiementIrAdminService, private tauxIrService: TauxIrAdminService){
        super(paiementIrDetailService);
    }

    ngOnInit(): void {
    }


    get paiementIr(): PaiementIrDto {
       return this.paiementIrService.item;
    }
    set paiementIr(value: PaiementIrDto) {
        this.paiementIrService.item = value;
    }
    get paiementIrs(): Array<PaiementIrDto> {
       return this.paiementIrService.items;
    }
    set paiementIrs(value: Array<PaiementIrDto>) {
        this.paiementIrService.items = value;
    }
    get tauxIr(): TauxIrDto {
       return this.tauxIrService.item;
    }
    set tauxIr(value: TauxIrDto) {
        this.tauxIrService.item = value;
    }
    get tauxIrs(): Array<TauxIrDto> {
       return this.tauxIrService.items;
    }
    set tauxIrs(value: Array<TauxIrDto>) {
        this.tauxIrService.items = value;
    }


}
