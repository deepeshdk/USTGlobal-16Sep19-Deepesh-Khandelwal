import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StudentService } from '../student.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-lib-get-all-book',
  templateUrl: './lib-get-all-book.component.html',
  styleUrls: ['./lib-get-all-book.component.css']
})
export class LibGetAllBookComponent implements OnInit {

  getBookByIdValue;
  getAllBook;

  constructor(private http: HttpClient, private service: StudentService, private router: Router, private cd: ChangeDetectorRef) {
    this.getAllBooks();
  }

  ngOnInit() {
  }

  getAllBooks() {
    this.service.getUsers().subscribe(response => {
      if (response !== null) {
        this.getAllBook = response;
        this.cd.markForCheck();
      } else {
        alert('~~~~ Book Not Available ~~~~');
      }
    });
  }

  // getAllBooks() {
  //   this.http.get(`${this.service.lmsURL}/get-all-book`).subscribe(response => {
  //     if (response !== null) {
  //       this.getAllBook = response;
  //       this.cd.detectChanges();
  //       this.cd.markForCheck();
  //     } else {
  //       alert('Book Not Available');
  //     }
  //   });
  // }

  getBookById(bid) {
    this.http.get(`${this.service.lmsURL}/get-book-by-id/${bid}`).subscribe(response => {
      console.log(response);
      if (response !== null) {
        this.getBookByIdValue = Array.of(response);
      } else {
        alert('~~~~ Something Went Wrong ~~~~ ');
      }
    });
  }

  updateBookData(form: NgForm) {
    console.log(form.value);
    this.http.put(`${this.service.lmsURL}/update-book`, form.value).subscribe(response => {
      if (response === true) {
        this.getAllBooks();
        alert('~~~~ Book Successfully Updated ~~~~');
        this.router.navigate(['/lib-get-all-book']);
      } else {
        alert('~~~~ Something Went Wrong ~~~~ ');
      }
    });
  }

}
