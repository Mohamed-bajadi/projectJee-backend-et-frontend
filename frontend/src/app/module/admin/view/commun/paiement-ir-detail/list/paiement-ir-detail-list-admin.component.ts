import {Component, OnInit} from '@angular/core';
import {PaiementIrDetailAdminService} from 'src/app/controller/service/admin/commun/PaiementIrDetailAdmin.service';
import {PaiementIrDetailDto} from 'src/app/controller/model/commun/PaiementIrDetail.model';
import {PaiementIrDetailCriteria} from 'src/app/controller/criteria/commun/PaiementIrDetailCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import {PaiementIrDto} from 'src/app/controller/model/commun/PaiementIr.model';
import {PaiementIrAdminService} from 'src/app/controller/service/admin/commun/PaiementIrAdmin.service';
import {TauxIrDto} from 'src/app/controller/model/commun/TauxIr.model';
import {TauxIrAdminService} from 'src/app/controller/service/admin/commun/TauxIrAdmin.service';


@Component({
  selector: 'app-paiement-ir-detail-list-admin',
  templateUrl: './paiement-ir-detail-list-admin.component.html'
})
export class PaiementIrDetailListAdminComponent extends AbstractListController<PaiementIrDetailDto, PaiementIrDetailCriteria, PaiementIrDetailAdminService>  implements OnInit {

    override fileName = 'PaiementIrDetail';


    paiementIrs: Array<PaiementIrDto>;
    tauxIrs: Array<TauxIrDto>;


    constructor( private paiementIrDetailService: PaiementIrDetailAdminService  , private paiementIrService: PaiementIrAdminService, private tauxIrService: TauxIrAdminService) {
        super(paiementIrDetailService);
    }

    ngOnInit(): void {
        this.activateSecurityConstraint('PaiementIrDetail').subscribe(() => {
            if (true || this.listActionIsValid){
                this.findPaginatedByCriteria();
                this.initExport();
                this.initCol();
                this.loadPaiementIr();
                this.loadTauxIr();
            }
        });
    }


    public override  initCol() {
        this.cols = [
            {field: 'paiementIr?.id', header: 'Paiement ir'},
            {field: 'tauxIr?.id', header: 'Taux ir'},
            {field: 'employe', header: 'Employe'},
            {field: 'salaireBrute', header: 'Salaire brute'},
            {field: 'cotisationpatronel', header: 'Cotisationpatronel'},
            {field: 'cotoisationsalarial', header: 'Cotoisationsalarial'},
            {field: 'salaireNet', header: 'Salaire net'},
        ];
    }


    public async loadPaiementIr(){
       this.paiementIrService.findAll().subscribe(paiementIrs => this.paiementIrs = paiementIrs, error => console.log(error))
    }
    public async loadTauxIr(){
       this.tauxIrService.findAll().subscribe(tauxIrs => this.tauxIrs = tauxIrs, error => console.log(error))
    }



   public  override prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                'Paiement ir': e.paiementIr?.id ,
                'Taux ir': e.tauxIr?.id ,
                 'Employe': e.employe ,
                 'Salaire brute': e.salaireBrute ,
                 'Cotisationpatronel': e.cotisationpatronel ,
                 'Cotoisationsalarial': e.cotoisationsalarial ,
                 'Salaire net': e.salaireNet ,
            }
        });

        this.criteriaData = [{
        //'Paiement ir': this.criteria.paiementIr?.id ? this.criteria.paiementIr?.id : environment.emptyForExport ,
        //'Taux ir': this.criteria.tauxIr?.id ? this.criteria.tauxIr?.id : environment.emptyForExport ,
            'Employe': this.criteria.employe ? this.criteria.employe : environment.emptyForExport ,
            'Salaire brute Min': this.criteria.salaireBruteMin ? this.criteria.salaireBruteMin : environment.emptyForExport ,
            'Salaire brute Max': this.criteria.salaireBruteMax ? this.criteria.salaireBruteMax : environment.emptyForExport ,
            'Cotisationpatronel Min': this.criteria.cotisationpatronelMin ? this.criteria.cotisationpatronelMin : environment.emptyForExport ,
            'Cotisationpatronel Max': this.criteria.cotisationpatronelMax ? this.criteria.cotisationpatronelMax : environment.emptyForExport ,
            'Cotoisationsalarial Min': this.criteria.cotoisationsalarialMin ? this.criteria.cotoisationsalarialMin : environment.emptyForExport ,
            'Cotoisationsalarial Max': this.criteria.cotoisationsalarialMax ? this.criteria.cotoisationsalarialMax : environment.emptyForExport ,
            'Salaire net Min': this.criteria.salaireNetMin ? this.criteria.salaireNetMin : environment.emptyForExport ,
            'Salaire net Max': this.criteria.salaireNetMax ? this.criteria.salaireNetMax : environment.emptyForExport ,
        }];
      }
}
