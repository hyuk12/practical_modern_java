package org.example.chapter03.method;

import org.example.chapter03.travel.TravelInfo;

import java.util.ArrayList;
import java.util.List;

public class FunctionSearchingTravel {
    private List<TravelInfo> travelInfos = new ArrayList<>();

    public FunctionSearchingTravel() {}

    public static boolean isVietnam(TravelInfo travelInfo) {
        if(travelInfo.getCountry().equals("vietnam")) {
            return true;
        } else {
            return false;
        }
    }

}
