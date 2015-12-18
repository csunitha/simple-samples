package com.simple.json;

/**
 * Created by SG0210531 on 12/16/2015.
 */
public class Forecast {

    int highestPredictedFare;
    int lowestPredictedFare;
    String currencyCode;

    public int getHighestPredictedFare() {
        return highestPredictedFare;
    }

    public void setHighestPredictedFare(int highestPredictedFare) {
        this.highestPredictedFare = highestPredictedFare;
    }

    public int getLowestPredictedFare() {
        return lowestPredictedFare;
    }

    public void setLowestPredictedFare(int lowestPredictedFare) {
        this.lowestPredictedFare = lowestPredictedFare;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }


}
