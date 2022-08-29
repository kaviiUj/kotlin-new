package com.example.kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1.model.discount.DiscountMasterDetailsListResPonse
import com.example.kotlin1.model.discount.DiscountMasterReq
import com.example.kotlin1.model.imagelist.Data
import com.example.kotlin1.network.APIClient
import com.example.kotlin1.network.ApiService
import com.example.kotlin1.viewmodel.MainActivityViewmodel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.testBtn)


        button.setOnClickListener {

//            retroAPI();
            mvvmAPI()
        }

    }

    private fun retroAPI() {
        DiscountMasterReq.getInstance().setOutletCode("93293");
        DiscountMasterReq.getInstance().setPropertyID("40529");
        DiscountMasterReq.getInstance().setAppVersion("V1.1");
        DiscountMasterReq.getInstance().setDeviceID("7dfbf92be328a2de");
        DiscountMasterReq.getInstance().setDeviceType("POS");
        DiscountMasterReq.getInstance().setProduct("POS");


        val newApiClass = APIClient.getInstance().create(ApiService::class.java)
        val call: Call<DiscountMasterDetailsListResPonse> =
            newApiClass.getLogData(DiscountMasterReq.getInstance())
        Log.i(
            "Retrofit",
            "\n\n\n******************************************************************************\n"
        )
        Log.i("Retrofit", "\nRequestUrl::\n" + call.request().url().toString())
        Log.i(
            "Retrofit",
            "\n\nJsonObjectRequest::\n" + DiscountMasterReq.getInstance().toString()
        )
        call.enqueue(object : Callback<DiscountMasterDetailsListResPonse> {
            override fun onResponse(
                call: Call<DiscountMasterDetailsListResPonse>,
                response: Response<DiscountMasterDetailsListResPonse>
            ) {
                Log.i("Retrofit", "\n\nResponseCode::\n" + response.code())
                Log.i("Retrofit", "\n\nResponse::\n" + response.body().toString())


            }

            override fun onFailure(
                call: Call<DiscountMasterDetailsListResPonse>,
                t: Throwable
            ) {
                TODO("Not yet implemented")
                Log.i("Retrofit", "\nErr::\n" + t.toString())
                Log.e("Retrofit", "\nErr::\n" + t.toString())
            }

        })
    }
    private fun mvvmAPI(){
        val viewModel: MainActivityViewmodel = ViewModelProvider(this).get(MainActivityViewmodel::class.java)
        viewModel.getMemeLiveDataObserver().observe(this, Observer {
            if (it != null){
                Log.i("Retrofit", "\nResult::\n" + it.toString())
                Log.i("viewValues", "\nSuccess::\n" + it.success)
                Log.i("viewValues", "\nMemes::\n" + it.data.memes.toString())

                for (x in it.data.memes){
                    Log.i("viewValues", "\nURL::\n" + x.url)
                }


            }else{
                Log.i("Retrofit","\n\nNo Data is available\n\n")
            }
        })
        viewModel.getMemeList()
    }
}