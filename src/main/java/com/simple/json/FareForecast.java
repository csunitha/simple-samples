package com.simple.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FareForecast {
    String originLocation;
    String destinationLocation;
    Date departureDateTime;
    Date returnDateTime;
    Forecast forecast;
    List<String> listOfAirlines;
    String recommendation;
    int lowestFare;
    String currencyCode;

    public String getOriginLocation() {
        return originLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    public Date getReturnDateTime() {
        return returnDateTime;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public List<String> getListOfAirlines() {
        return listOfAirlines;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public int getLowestFare() {
        return lowestFare;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public FareForecast(String origin, String destination, Date departureDate, Date returnDate, String recommendation, Forecast forecast, List<String> listOfAirlines, int lowestFare, String currencyCode) {
        this.originLocation = origin;
        this.destinationLocation = destination;
        this.departureDateTime = departureDate;
        this.returnDateTime = returnDate;
        this.forecast = forecast;
        this.recommendation = recommendation;
        this.listOfAirlines = listOfAirlines;
        this.lowestFare = lowestFare;
        this.currencyCode = currencyCode;
    }

    public void setOriginLocation(String originLocation) {
        this.originLocation = originLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public void setReturnDateTime(Date returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public void setListOfAirlines(ArrayList<String> listOfAirlines) {
        this.listOfAirlines = listOfAirlines;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public void setLowestFare(int lowestFare) {
        this.lowestFare = lowestFare;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

}
