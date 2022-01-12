import { Component, OnInit } from '@angular/core';
import { User1 } from '../user1'
import { User1Service } from '../user1.service';


@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  users ! : User1[];

  constructor(private User1Service: User1Service) { }

  ngOnInit(): void {

    this.users = [
      {
          "userId": 1,
          "userFirstName": "Smruti",
          "surName": "Mohanty",
          "dob": "1984-07-18",
          "dateOfJoining": "2021-12-13",
          "pinCode": "700135"
      },
      {
          "userId": 2,
          "userFirstName": "Madhusmita",
          "surName": "Mohapatra ",
          "dob": "1984-07-02",
          "dateOfJoining": "2021-12-19",
          "pinCode": "768017"
      },
      {
          "userId": 3,
          "userFirstName": "Amaresh",
          "surName": "Das",
          "dob": "1983-09-10",
          "dateOfJoining": "2014-09-10",
          "pinCode": "820421"
      },
      {
          "userId": 4,
          "userFirstName": "Hemant",
          "surName": "Samal",
          "dob": "1987-09-03",
          "dateOfJoining": "2011-08-09",
          "pinCode": "123321"
      }
  ]
      

  }
  private getUsers(){
    this.User1Service.getUser1List().subscribe(data => {
      this.users = data;

    });
  }

}
