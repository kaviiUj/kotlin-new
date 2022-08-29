package com.example.kotlin1.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlin1.model.discount.DiscountMasterReq
import com.example.kotlin1.model.imagelist.Main
import com.example.kotlin1.network.APIClient
import com.example.kotlin1.network.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityViewmodel: ViewModel() {
    // when we have some UI with activity, we need to add activity name with view model

    lateinit var memeList: MutableLiveData<Main>

    init {
        memeList = MutableLiveData();

    }

    fun getMemeLiveDataObserver(): MutableLiveData<Main>{
        return memeList;
    }

    fun getMemeList(){
        val apiClient = APIClient.getInstance_new().create(ApiService::class.java)
        val call: Call<Main> = apiClient.getImges()

        Log.i(
            "Retrofit",
            "\n\n\n******************************************************************************\n"
        )
        Log.i("Retrofit", "\nRequestUrl::\n" + call.request().url().toString())

        call.enqueue(object: Callback<Main>{
            override fun onResponse(call: Call<Main>, response: Response<Main>) {

                Log.i("Retrofit", "\n\nResponseCode::\n" + response.code())
                Log.i("Retrofit", "\n\nResponse::\n" + response.body().toString())
                memeList.postValue(response.body())

            }

            override fun onFailure(call: Call<Main>, t: Throwable) {

                Log.i("Retrofit", "\nErr::\n" + t.toString())
                Log.e("Retrofit", "\nErr::\n" + t.toString())
            }

        })
    }

}