import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {PaiementIrAdminService} from 'src/app/controller/service/admin/commun/PaiementIrAdmin.service';
import {PaiementIrDto} from 'src/app/controller/model/commun/PaiementIr.model';
import {PaiementIrCriteria} from 'src/app/controller/criteria/commun/PaiementIrCriteria.model';

import {SocieteDto} from 'src/app/controller/model/avancement/Societe.model';
import {SocieteAdminService} from 'src/app/controller/service/admin/avancement/SocieteAdmin.service';
import {TauxIrDto} from 'src/app/controller/model/commun/TauxIr.model';
import {TauxIrAdminService} from 'src/app/controller/service/admin/commun/TauxIrAdmin.service';
import {PaiementIrDetailDto} from 'src/app/controller/model/commun/PaiementIrDetail.model';
import {PaiementIrDetailAdminService} from 'src/app/controller/service/admin/commun/PaiementIrDetailAdmin.service';
@Component({
  selector: 'app-paiement-ir-view-admin',
  templateUrl: './paiement-ir-view-admin.component.html'
})
export class PaiementIrViewAdminComponent extends AbstractViewController<PaiementIrDto, PaiementIrCriteria, PaiementIrAdminService> implements OnInit {

    paiementIrDetails = new PaiementIrDetailDto();
    paiementIrDetailss: Array<PaiementIrDetailDto> = [];

    constructor(private paiementIrService: PaiementIrAdminService, private societeService: SocieteAdminService, private tauxIrService: TauxIrAdminService, private paiementIrDetailService: PaiementIrDetailAdminService){
        super(paiementIrService);
    }

    ngOnInit(): void {
    }


    get societe(): SocieteDto {
       return this.societeService.item;
    }
    set societe(value: SocieteDto) {
        this.societeService.item = value;
    }
    get societes(): Array<SocieteDto> {
       return this.societeService.items;
    }
    set societes(value: Array<SocieteDto>) {
        this.societeService.items = value;
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
