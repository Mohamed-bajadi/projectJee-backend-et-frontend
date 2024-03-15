import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {PaiementIrDetailAdminService} from 'src/app/controller/service/admin/commun/PaiementIrDetailAdmin.service';
import {PaiementIrDetailDto} from 'src/app/controller/model/commun/PaiementIrDetail.model';
import {PaiementIrDetailCriteria} from 'src/app/controller/criteria/commun/PaiementIrDetailCriteria.model';
import {PaiementIrDto} from 'src/app/controller/model/commun/PaiementIr.model';
import {PaiementIrAdminService} from 'src/app/controller/service/admin/commun/PaiementIrAdmin.service';
import {TauxIrDto} from 'src/app/controller/model/commun/TauxIr.model';
import {TauxIrAdminService} from 'src/app/controller/service/admin/commun/TauxIrAdmin.service';
@Component({
  selector: 'app-paiement-ir-detail-create-admin',
  templateUrl: './paiement-ir-detail-create-admin.component.html'
})
export class PaiementIrDetailCreateAdminComponent extends AbstractCreateController<PaiementIrDetailDto, PaiementIrDetailCriteria, PaiementIrDetailAdminService>  implements OnInit {




    constructor( private paiementIrDetailService: PaiementIrDetailAdminService , private paiementIrService: PaiementIrAdminService, private tauxIrService: TauxIrAdminService) {
        super(paiementIrDetailService);
    }

    ngOnInit(): void {
        this.paiementIr = new PaiementIrDto();
        this.paiementIrService.findAll().subscribe((data) => this.paiementIrs = data);
        this.tauxIr = new TauxIrDto();
        this.tauxIrService.findAll().subscribe((data) => this.tauxIrs = data);
    }





    public override setValidation(value: boolean){
    }



    public override validateForm(): void{
        this.errorMessages = new Array<string>();
    }



    public async openCreatePaiementIr(paiementIr: string) {
    const isPermistted = await this.roleService.isPermitted('PaiementIr', 'add');
    if(isPermistted) {
         this.paiementIr = new PaiementIrDto();
         this.createPaiementIrDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }
    public async openCreateTauxIr(tauxIr: string) {
    const isPermistted = await this.roleService.isPermitted('TauxIr', 'add');
    if(isPermistted) {
         this.tauxIr = new TauxIrDto();
         this.createTauxIrDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
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
    get createPaiementIrDialog(): boolean {
       return this.paiementIrService.createDialog;
    }
    set createPaiementIrDialog(value: boolean) {
        this.paiementIrService.createDialog= value;
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
    get createTauxIrDialog(): boolean {
       return this.tauxIrService.createDialog;
    }
    set createTauxIrDialog(value: boolean) {
        this.tauxIrService.createDialog= value;
    }






}
