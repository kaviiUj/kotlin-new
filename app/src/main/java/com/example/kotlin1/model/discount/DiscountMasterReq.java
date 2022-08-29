package com.example.kotlin1.model.discount;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DiscountMasterReq {

    private static DiscountMasterReq mInstance = null;

    public DiscountMasterReq() {
    }

    public static synchronized DiscountMasterReq getInstance(){
        if (null == mInstance){
            mInstance = new DiscountMasterReq();
        }
        return mInstance;
    }

    @SerializedName("OutletCode")
    @Expose
    private String outletCode;
    @SerializedName("PropertyID")
    @Expose
    private String propertyID;
    @SerializedName("appVersion")
    @Expose
    private String appVersion;
    @SerializedName("deviceID")
    @Expose
    private String deviceID;
    @SerializedName("deviceType")
    @Expose
    private String deviceType;
    @SerializedName("product")
    @Expose
    private String product;

    public String getOutletCode() {
        return outletCode;
    }

    public void setOutletCode(String outletCode) {
        this.outletCode = outletCode;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
