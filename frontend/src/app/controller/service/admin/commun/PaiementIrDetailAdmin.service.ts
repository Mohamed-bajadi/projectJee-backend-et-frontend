import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import {environment} from 'src/environments/environment';

import {PaiementIrDetailDto} from 'src/app/controller/model/commun/PaiementIrDetail.model';
import {PaiementIrDetailCriteria} from 'src/app/controller/criteria/commun/PaiementIrDetailCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class PaiementIrDetailAdminService extends AbstractService<PaiementIrDetailDto, PaiementIrDetailCriteria> {
     constructor(private http: HttpClient) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/paiementIrDetail/');
    }

    public constrcutDto(): PaiementIrDetailDto {
        return new PaiementIrDetailDto();
    }

    public constrcutCriteria(): PaiementIrDetailCriteria {
        return new PaiementIrDetailCriteria();
    }
}
