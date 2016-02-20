package com.example.fsmanji.retrofit.Application;

import android.app.Application;
import android.util.Log;

import com.example.fsmanji.retrofit.models.User;
import com.example.fsmanji.retrofit.services.GithubAPI;

import retrofit.GsonConverterFactory;
import retrofit.HttpException;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by fsmanji on 2/19/16.
 */
public class DemoApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        GithubAPI githubAPI = createGithubAPI();
        Observable<User> userObservable = githubAPI.getGithubUser("g2southpark");
        userObservable.subscribeOn(Schedulers.immediate())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<User>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        // cast to retrofit.HttpException to get the response code

                        if (e instanceof HttpException) {
                            HttpException response = (HttpException)e;
                            Log.d("xxx", response.message());
                        }
                    }

                    @Override
                    public void onNext(User user) {
                        Log.d("xxx", user.getName());
                    }
                });
    }

    public static GithubAPI createGithubAPI () {
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com/")
                .build();

        GithubAPI api = retrofit.create(GithubAPI.class);
        return api;
    }
}
