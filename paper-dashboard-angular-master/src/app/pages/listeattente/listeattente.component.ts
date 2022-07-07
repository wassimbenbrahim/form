import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { InscriptionService } from 'app/services/inscription.service';
import {Inscription} from '../../models/Inscription';

@Component({
  selector: 'app-listeattente',
  templateUrl: './listeattente.component.html',
  styleUrls: ['./listeattente.component.scss']
})
export class ListeattenteComponent implements OnInit {
  listetud: Inscription[];
  term: any;
  constructor(private router: Router, private _service: InscriptionService ) { }

  ngOnInit(): void {
    this._service.listeattente().subscribe(res => {
      console.log(res);
      this.listetud = res;
    });
  }

}
