package com.example.kotlin1.model.discount;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DiscountMasterDetails implements Parcelable {
    @SerializedName("discountMasterID")
    @Expose
    private int discountMasterID;
    @SerializedName("discountMasterDetailID")
    @Expose
    private int discountMasterDetailID;
    @SerializedName("discountMasterLinkOutLetID")
    @Expose
    private int discountMasterLinkOutLetID;
    @SerializedName("propertyID")
    @Expose
    private int propertyID;
    @SerializedName("outletCode")
    @Expose
    private String outletCode;
    @SerializedName("discountCode")
    @Expose
    private String discountCode;
    @SerializedName("activation")
    @Expose
    private String activation;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("value")
    @Expose
    private float value;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("startTime")
    @Expose
    private String startTime;
    @SerializedName("endTime")
    @Expose
    private String endTime;
    @SerializedName("isMon")
    @Expose
    private boolean isMon;
    @SerializedName("isTue")
    @Expose
    private boolean isTue;
    @SerializedName("isWed")
    @Expose
    private boolean isWed;
    @SerializedName("isThu")
    @Expose
    private boolean isThu;
    @SerializedName("isFri")
    @Expose
    private boolean isFri;
    @SerializedName("isSat")
    @Expose
    private boolean isSat;
    @SerializedName("isSun")
    @Expose
    private boolean isSun;
    @SerializedName("itemType")
    @Expose
    private String itemType;
    @SerializedName("modifyDate")
    @Expose
    private String modifyDate;
    @SerializedName("userID")
    @Expose
    private String userID;
    @SerializedName("itemDetails")
    @Expose
    private ArrayList<ItemDetail> itemDetails = null;

    public DiscountMasterDetails(){}

    protected DiscountMasterDetails(Parcel in) {
        discountMasterID = in.readInt();
        discountMasterDetailID = in.readInt();
        discountMasterLinkOutLetID = in.readInt();
        propertyID = in.readInt();
        outletCode = in.readString();
        discountCode = in.readString();
        activation = in.readString();
        type = in.readString();
        value = in.readFloat();
        startDate = in.readString();
        endDate = in.readString();
        startTime = in.readString();
        endTime = in.readString();
        isMon = in.readByte() != 0;
        isTue = in.readByte() != 0;
        isWed = in.readByte() != 0;
        isThu = in.readByte() != 0;
        isFri = in.readByte() != 0;
        isSat = in.readByte() != 0;
        isSun = in.readByte() != 0;
        itemType = in.readString();
        modifyDate = in.readString();
        userID = in.readString();
        itemDetails = in.createTypedArrayList(ItemDetail.CREATOR);
    }

    public static final Creator<DiscountMasterDetails> CREATOR = new Creator<DiscountMasterDetails>() {
        @Override
        public DiscountMasterDetails createFromParcel(Parcel in) {
            return new DiscountMasterDetails(in);
        }

        @Override
        public DiscountMasterDetails[] newArray(int size) {
            return new DiscountMasterDetails[size];
        }
    };

    public int getDiscountMasterID() {
        return discountMasterID;
    }

    public void setDiscountMasterID(int discountMasterID) {
        this.discountMasterID = discountMasterID;
    }

    public int getDiscountMasterDetailID() {
        return discountMasterDetailID;
    }

    public void setDiscountMasterDetailID(int discountMasterDetailID) {
        this.discountMasterDetailID = discountMasterDetailID;
    }

    public int getDiscountMasterLinkOutLetID() {
        return discountMasterLinkOutLetID;
    }

    public void setDiscountMasterLinkOutLetID(int discountMasterLinkOutLetID) {
        this.discountMasterLinkOutLetID = discountMasterLinkOutLetID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getOutletCode() {
        return outletCode;
    }

    public void setOutletCode(String outletCode) {
        this.outletCode = outletCode;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public boolean isIsMon() {
        return isMon;
    }

    public void setIsMon(boolean isMon) {
        this.isMon = isMon;
    }

    public boolean isIsTue() {
        return isTue;
    }

    public void setIsTue(boolean isTue) {
        this.isTue = isTue;
    }

    public boolean isIsWed() {
        return isWed;
    }

    public void setIsWed(boolean isWed) {
        this.isWed = isWed;
    }

    public boolean isIsThu() {
        return isThu;
    }

    public void setIsThu(boolean isThu) {
        this.isThu = isThu;
    }

    public boolean isIsFri() {
        return isFri;
    }

    public void setIsFri(boolean isFri) {
        this.isFri = isFri;
    }

    public boolean isIsSat() {
        return isSat;
    }

    public void setIsSat(boolean isSat) {
        this.isSat = isSat;
    }

    public boolean isIsSun() {
        return isSun;
    }

    public void setIsSun(boolean isSun) {
        this.isSun = isSun;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public ArrayList<ItemDetail> getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ArrayList<ItemDetail> itemDetails) {
        this.itemDetails = itemDetails;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(discountMasterID);
        parcel.writeInt(discountMasterDetailID);
        parcel.writeInt(discountMasterLinkOutLetID);
        parcel.writeInt(propertyID);
        parcel.writeString(outletCode);
        parcel.writeString(discountCode);
        parcel.writeString(activation);
        parcel.writeString(type);
        parcel.writeFloat(value);
        parcel.writeString(startDate);
        parcel.writeString(endDate);
        parcel.writeString(startTime);
        parcel.writeString(endTime);
        parcel.writeByte((byte) (isMon ? 1 : 0));
        parcel.writeByte((byte) (isTue ? 1 : 0));
        parcel.writeByte((byte) (isWed ? 1 : 0));
        parcel.writeByte((byte) (isThu ? 1 : 0));
        parcel.writeByte((byte) (isFri ? 1 : 0));
        parcel.writeByte((byte) (isSat ? 1 : 0));
        parcel.writeByte((byte) (isSun ? 1 : 0));
        parcel.writeString(itemType);
        parcel.writeString(modifyDate);
        parcel.writeString(userID);
        parcel.writeTypedList(itemDetails);
    }
}
