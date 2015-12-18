package com.simple.json;

import flexjson.JSONSerializer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PojoToJson {

    public static void main( String[] args ){
        System.out.println( "Sample app to convert complex java object to Json" );

        JSONSerializer serializer = new JSONSerializer();

        System.out.println("serialize method does not serialize list.");

        System.out.println("Output of Serializing using serialize Method. You will not see the list of Airlines ");
        String jsonString = serializer.serialize(createFareForecast());
        System.out.println(jsonString);


        System.out.println("Output of Serializing using deserialize Method. See the list of Airlines");
        jsonString = serializer.deepSerialize(createFareForecast());
        System.out.println(jsonString);
    }

    private static FareForecast createFareForecast() {
        return new FareForecast("DFW",
                    "ORD",
                    new Date(2016,1,10),
                    new Date(2016,1,15),
                    "buy",
                    createForecast(),
                    createListOfAirlines(),
                    100,
                    "USD");
    }

    private static Forecast createForecast() {
        Forecast forecast = new Forecast();
        forecast.setCurrencyCode("USD");
        forecast.setHighestPredictedFare(200);
        forecast.setLowestPredictedFare(50);
        return forecast;
    }

    private static List<String> createListOfAirlines() {
        List<String> listOfAirlines = new ArrayList<String>();
        listOfAirlines.add("SouthWest");
        listOfAirlines.add("JetBlue");
        return listOfAirlines;
    }
}
