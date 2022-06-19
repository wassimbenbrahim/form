import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Inscription} from '../models/Inscription';
@Injectable({
  providedIn: 'root'
})
export class InscriptionService {

  constructor(private _http: HttpClient){ }

  getetud(): Observable<Inscription[]> {
    return this._http.get<Inscription[]>('http://localhost:8089/api/inscriptionn');
  }

  deleteetudById(id: number) {
    return this._http.delete('http://localhost:8089/api/deleteetud/'+ id);
  }

  addetud(Inscription: Inscription) {
    return this._http.post<Inscription>('http://localhost:8089/api/inscription', Inscription);
  }

  sendinvit(id: number) {
    return this._http.get<Inscription>('http://localhost:8089/api/sendmail/' + id);
  }
}
