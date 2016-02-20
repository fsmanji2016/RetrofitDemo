package com.example.fsmanji.retrofit.services;

import com.example.fsmanji.retrofit.models.User;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by fsmanji on 2/19/16.
 */
public interface GithubAPI {

    @GET("users/{username}")
    Observable<User> getGithubUser(@Path("username") String userName);

}
