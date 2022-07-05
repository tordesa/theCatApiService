package com.example.catagentprofile.api

import com.example.catagentprofile.data.ImageResultData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheCatApiService {
    @GET("Images/search")
     fun searchImages(
        @Query("limit") limit:Int,
        @Query("size") format: String
    ) : Call<List<ImageResultData>>
}