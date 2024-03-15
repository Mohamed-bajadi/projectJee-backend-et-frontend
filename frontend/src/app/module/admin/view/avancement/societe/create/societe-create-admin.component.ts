import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {SocieteAdminService} from 'src/app/controller/service/admin/avancement/SocieteAdmin.service';
import {SocieteDto} from 'src/app/controller/model/avancement/Societe.model';
import {SocieteCriteria} from 'src/app/controller/criteria/avancement/SocieteCriteria.model';
@Component({
  selector: 'app-societe-create-admin',
  templateUrl: './societe-create-admin.component.html'
})
export class SocieteCreateAdminComponent extends AbstractCreateController<SocieteDto, SocieteCriteria, SocieteAdminService>  implements OnInit {



   private _validSocieteIce = true;
   private _validSocieteLibelle = true;

    constructor( private societeService: SocieteAdminService ) {
        super(societeService);
    }

    ngOnInit(): void {
    }





    public override setValidation(value: boolean){
        this.validSocieteIce = value;
        this.validSocieteLibelle = value;
    }



    public override validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateSocieteIce();
        this.validateSocieteLibelle();
    }

    public validateSocieteIce(){
        if (this.stringUtilService.isEmpty(this.item.ice)) {
        this.errorMessages.push('Ice non valide');
        this.validSocieteIce = false;
        } else {
            this.validSocieteIce = true;
        }
    }
    public validateSocieteLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validSocieteLibelle = false;
        } else {
            this.validSocieteLibelle = true;
        }
    }






    get validSocieteIce(): boolean {
        return this._validSocieteIce;
    }

    set validSocieteIce(value: boolean) {
         this._validSocieteIce = value;
    }
    get validSocieteLibelle(): boolean {
        return this._validSocieteLibelle;
    }

    set validSocieteLibelle(value: boolean) {
         this._validSocieteLibelle = value;
    }



}
