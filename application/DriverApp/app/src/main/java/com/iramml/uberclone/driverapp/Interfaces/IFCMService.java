package com.iramml.uberclone.driverapp.Interfaces;

import com.iramml.uberclone.driverapp.Model.FCMResponse;
import com.iramml.uberclone.driverapp.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
        "Authorization:key=AAAAYErQOj4:APA91bHRqmjvhI7-bFU1Q8vHdosyH5xmu0jL7mXG32cgwvluIjTR67I8GEKp15al25O9pbvO4F-p92-McWzM_8dJ42wyYaaUNwHSWG96gkw9lXrZ9Z-BA5gIEAGA_uD1rquqthoMVLKf"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
