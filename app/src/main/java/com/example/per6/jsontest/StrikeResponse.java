package com.example.per6.jsontest;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by per6 on 1/29/18.
 */

public class StrikeResponse {
    String status;
    List<Strike> strike;

    public StrikeResponse(){
        status="empty";
        strike = new ArrayList<Strike>();
        Log.d("strike", "StrikeResponse: strikeresponse");
    }

    @Override
    public String toString() {
        return "StrikeResponse{" +
                "status='" + status + '\'' +
                ", strike=" + strike +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        Log.d("strike", "setStrike: "+status);

        this.status = status;
    }

    public List<Strike> getStrike() {

        return strike;
    }

    public void setStrike(List<Strike> strike) {
        Log.d("strike", "setStrike: "+ strike.toString());
        this.strike = strike;
    }
}
