import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {SocieteAdminService} from 'src/app/controller/service/admin/avancement/SocieteAdmin.service';
import {SocieteDto} from 'src/app/controller/model/avancement/Societe.model';
import {SocieteCriteria} from 'src/app/controller/criteria/avancement/SocieteCriteria.model';

@Component({
  selector: 'app-societe-view-admin',
  templateUrl: './societe-view-admin.component.html'
})
export class SocieteViewAdminComponent extends AbstractViewController<SocieteDto, SocieteCriteria, SocieteAdminService> implements OnInit {


    constructor(private societeService: SocieteAdminService){
        super(societeService);
    }

    ngOnInit(): void {
    }




}
