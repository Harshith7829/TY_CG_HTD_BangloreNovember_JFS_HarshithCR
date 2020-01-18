import { Component, OnInit } from '@angular/core';
import { AddPostService } from '../add-post.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-post',
  templateUrl: './add-post.component.html',
  styleUrls: ['./add-post.component.css']
})
export class AddPostComponent implements OnInit {

  message:string;
  error:string;
  constructor(private service:AddPostService) { }

  ngOnInit() {
  }
  addPostForms(form: NgForm) {
    this.service.addPost(form.value).subscribe(data => {
      console.log(data);
      this.message = data.message;
      setInterval(() => {
        this.message = null;
      }, 3000);
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.message;
    });
  }

}
