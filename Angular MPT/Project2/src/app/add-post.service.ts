import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddPostService {

  api ="https://jsonplaceholder.typicode.com";
  constructor(private http: HttpClient) { }
  addPost(addProduct): Observable<any> {
    return this.http.post<any>(`${this.api}/add-post`, addProduct);
  }
  getAllPosts():  Observable<any> {
    return this.http.get<any>(`${this.api}/posts`);
  }
  deletePost(posts: Post):  Observable<any> {
    return this.http.delete<any>(`${this.api}/delete-post/${posts.id}`);
  }
}
