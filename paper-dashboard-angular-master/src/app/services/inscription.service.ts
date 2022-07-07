import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Inscription} from '../models/Inscription';
const httpOptions = {
  headers: new HttpHeaders( {'Content-Type': 'application/json'} )};
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

  updateComplaint(id :number) : Observable<Inscription[]>{
    return this._http.put<Inscription[]>('http://localhost:8089/api/etudientById/' + id, httpOptions);
  }

  findacceptedstudent(): Observable<Inscription[]> {
    return this._http.get<Inscription[]>('http://localhost:8089/api/accepted');
  }

  listeattente(): Observable<Inscription[]> {
    return this._http.get<Inscription[]>('http://localhost:8089/api/attente');
  }
}
