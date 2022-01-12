import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { User1 } from './user1';

@Injectable({
  providedIn: 'root'
})
export class User1Service {
  private baseURL = "http://localhost:8084/api/users" ;

  constructor(private httpClient: HttpClient) { }

  getUser1List(): Observable<User1[]>{
    return this.httpClient.get<User1[]>(`${this.baseURL}`);
  }
}
