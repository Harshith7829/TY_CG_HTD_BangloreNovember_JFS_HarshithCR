import { Component, OnInit } from '@angular/core';
import { AddPostService } from '../add-post.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {

  message:string;
  error:string;
  posts:Post[];
  constructor(private service:AddPostService,
    private router:Router) {
    this.getAllPosts();
   }

  ngOnInit() {
  }

  getAllPosts() {
    this.service.getAllPosts().subscribe(response => {
      console.log(response);
      
        this.posts = response;
        setTimeout(() => {
          this.message = null;
        }, 2000)
      })}
    //   else {
    //     this.error = response.description;
    //     console.log('post Details are not  founded');
    //     setTimeout(() => {
    //       this.error = null;
    //     }, 3000);
    //   }
    // })
  

  // deletePosts(post :Post){
  //   this.service.deletePost(post).subscribe(data =>{
  //     console.log(data);
  //       this.posts.splice(this.posts.indexOf(post),1);
  //   })
  // }
  deletePosts(post:Post){
    this.posts.splice(this.posts.indexOf(post),1);
  }
}
