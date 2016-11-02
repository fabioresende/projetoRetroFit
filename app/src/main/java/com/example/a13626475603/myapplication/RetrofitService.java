package com.example.a13626475603.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by 13626475603 on 01/11/2016.
 */
public interface RetrofitService {

    @Headers("X-Mashape-Key: AuuyclCPjcmshv2iOPq190OpzLrMp1FJWwejsnJrdfwOUr4h44")

    @GET("posts/(id)")
    Call<RespostaServidor> converterUnidade(@Path("id") Integer id);

}
