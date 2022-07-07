import { Component, OnInit } from '@angular/core';


export interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}

export const ROUTES: RouteInfo[] = [
    
  
  { path: '/inscription',       title: 'inscription',    icon:'nc-tile-56',  class: ''},
  { path: '/etudientaccepte',       title: 'etudientaccepte',    icon:'nc-tile-56',  class: ''},
  { path: '/listeattente',       title: 'listeattente',    icon:'nc-tile-56',  class: ''},

];

@Component({
    moduleId: module.id,
    selector: 'sidebar-cmp',
    templateUrl: 'sidebar.component.html',
})

export class SidebarComponent implements OnInit {
    public menuItems: any[];
    ngOnInit() {
        this.menuItems = ROUTES.filter(menuItem => menuItem);
    }
}
