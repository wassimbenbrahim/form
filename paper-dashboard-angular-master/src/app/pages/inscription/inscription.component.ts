import { Component, OnInit } from '@angular/core';
import {InscriptionService} from '../../services/inscription.service';
import {Router} from '@angular/router';
import {Inscription} from '../../models/Inscription';

@Component({
  selector: 'app-inscription',
  templateUrl: './inscription.component.html',
  styleUrls: ['./inscription.component.scss']
})
export class InscriptionComponent implements OnInit {
  listetud: Inscription[];
  term: any;
  
  constructor(private router: Router, private _service: InscriptionService ) { }

  ngOnInit(): void {
    this._service.getetud().subscribe(res => {
      console.log(res);
      this.listetud = res;
    });
  }
  delete(id: number) {
    this._service.deleteetudById(id).subscribe(data => { console.log(data); });
  }

  sendinvit(id: number) {
    this._service.sendinvit(id).subscribe(data => { console.log(data); });
  }


  
}
