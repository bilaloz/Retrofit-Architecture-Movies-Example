package com.example.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("list_movies.json?sort_by=date_added")
    Call<MovieResponse> getLastMovies();
}
