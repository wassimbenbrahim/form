import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EtudientaccepteComponent } from './etudientaccepte.component';

describe('EtudientaccepteComponent', () => {
  let component: EtudientaccepteComponent;
  let fixture: ComponentFixture<EtudientaccepteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EtudientaccepteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EtudientaccepteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
