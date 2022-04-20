package com.example.androidassignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceHolder {
    @GET("users")
    Call<List<data>> getdata();
}
