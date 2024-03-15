import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import {environment} from 'src/environments/environment';

import {TauxIrDto} from 'src/app/controller/model/commun/TauxIr.model';
import {TauxIrCriteria} from 'src/app/controller/criteria/commun/TauxIrCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class TauxIrAdminService extends AbstractService<TauxIrDto, TauxIrCriteria> {
     constructor(private http: HttpClient) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/tauxIr/');
    }

    public constrcutDto(): TauxIrDto {
        return new TauxIrDto();
    }

    public constrcutCriteria(): TauxIrCriteria {
        return new TauxIrCriteria();
    }
}
