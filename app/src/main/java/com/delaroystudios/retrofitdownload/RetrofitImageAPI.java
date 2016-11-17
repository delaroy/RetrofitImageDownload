package com.delaroystudios.retrofitdownload;

import com.squareup.okhttp.ResponseBody;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by navneet on 17/6/16.
 */
public interface RetrofitImageAPI {
    @GET("retrofit/images/uploads/android.jpg")
    Call<ResponseBody> getImageDetails();
}
