package com.example.dorphan.Models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.Gson;

public class AddCourseResponse implements Parcelable {

    private String status;

    protected AddCourseResponse(Parcel in) {
        status = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(status);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AddCourseResponse> CREATOR = new Creator<AddCourseResponse>() {
        @Override
        public AddCourseResponse createFromParcel(Parcel in) {
            return new AddCourseResponse(in);
        }

        @Override
        public AddCourseResponse[] newArray(int size) {
            return new AddCourseResponse[size];
        }
    };

    public static AddCourseResponse objectFromData(String str) {

        return new Gson().fromJson(str, AddCourseResponse.class);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
