import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeattenteComponent } from './listeattente.component';

describe('ListeattenteComponent', () => {
  let component: ListeattenteComponent;
  let fixture: ComponentFixture<ListeattenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeattenteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeattenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
