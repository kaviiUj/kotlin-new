package com.example.kotlin1.model.discount;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DiscountMasterDetailsListResPonse {
    @SerializedName("discountMasterDetailsList")
    @Expose
    private List<DiscountMasterDetails> discountMasterDetailsList = null;
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private String message;

    public List<DiscountMasterDetails> getDiscountMasterDetailsList() {
        return discountMasterDetailsList;
    }

    public void setDiscountMasterDetailsList(List<DiscountMasterDetails> discountMasterDetailsList) {
        this.discountMasterDetailsList = discountMasterDetailsList;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
