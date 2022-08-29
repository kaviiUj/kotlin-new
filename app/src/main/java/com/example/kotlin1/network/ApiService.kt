package com.example.kotlin1.network

import com.example.kotlin1.model.discount.DiscountMasterDetailsListResPonse
import com.example.kotlin1.model.discount.DiscountMasterReq
import com.example.kotlin1.model.imagelist.Main
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST("DiscountMaster/V1/DiscountMasterItemData")
    fun getLogData(@Body discount: DiscountMasterReq): Call<DiscountMasterDetailsListResPonse>

    @GET("get_memes")
    fun getImges(): Call<Main>
}