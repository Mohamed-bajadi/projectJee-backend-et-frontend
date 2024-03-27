import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Employe} from "../../../model/commun/employe.model";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class EmployeService {
    private _item !:Employe;
    private _items !:Array<Employe>;
    private  url = "http://localhost:/api/employe";

    public  save():Observable<Employe>{
        return this.http.post<Employe>(this.url,this._item);
    }
  constructor(private http:HttpClient) { }


    get item(): Employe {
        if (this._item == null) {
            // @ts-ignore
            this._item = new Employe();
        }
        return this._item;

    }

    set item(value: Employe) {
        this._item = value;
    }

    get items(): Array<Employe> {
        if (this._items==null) {
            this._items = new Array<Employe>();
        }
        return this._items;
    }

    set items(value: Array<Employe>) {
        this._items = value;
    }
}
