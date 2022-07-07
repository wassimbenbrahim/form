import { Component, OnInit } from '@angular/core';
import { Inscription } from 'app/models/Inscription';
import { InscriptionService } from 'app/services/inscription.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-etudientaccepte',
  templateUrl: './etudientaccepte.component.html',
  styleUrls: ['./etudientaccepte.component.scss']
})
export class EtudientaccepteComponent implements OnInit {
  listetud: Inscription[];
  term: any;
  constructor(private router: Router, private _service: InscriptionService ) { }

  ngOnInit(): void {
    this._service.findacceptedstudent().subscribe(res => {
      console.log(res);
      this.listetud = res;
    });
  }

}
