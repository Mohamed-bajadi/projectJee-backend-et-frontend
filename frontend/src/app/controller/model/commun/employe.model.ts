
import {SocieteDto} from "../avancement/Societe.model";
import {BaseDto} from "../../../zynerator/dto/BaseDto.model";


export class Employe extends BaseDto{
    code!:string;
    firstname!:string;
    lastname!:string;
    societe!:SocieteDto;


    constructor(code: string, firstname: string, lastname: string, societe: SocieteDto) {
        super();
        this.code = code;
        this.firstname = firstname;
        this.lastname = lastname;
        this.societe = societe;
    }
}
