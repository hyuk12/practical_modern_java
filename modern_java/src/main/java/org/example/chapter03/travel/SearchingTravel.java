package org.example.chapter03.travel;

import java.util.ArrayList;
import java.util.List;

public class SearchingTravel {
    public static final String COUNTRY_VIETNAM = "vietnam";
    public static final String COUNTRY_PHILIPPINE = "philippine";
    public static final String COUNTRY_THAILAND = "thailand";

    // 여행 상품 저장
    private List<TravelInfo> travelInfoList = new ArrayList<>();

    public SearchingTravel() {
        initializeProduct();
    }

    // 데이터를 초기화하여 외부에서 호출하지 못하도록 private 선언
    private void initializeProduct() {
        TravelInfo cebu = new TravelInfo();
        cebu.setName("Cebu Travel");
        cebu.setCountry(COUNTRY_PHILIPPINE);
        cebu.setCity("Cebu");
        cebu.setDays(5);
        cebu.setNights(3);
        travelInfoList.add(cebu);

        TravelInfo boracay = new TravelInfo();
        boracay.setName("Boracay Travel");
        boracay.setCountry(COUNTRY_PHILIPPINE);
        boracay.setCity("Boracay");
        boracay.setDays(5);
        boracay.setNights(3);
        travelInfoList.add(boracay);

        TravelInfo hanoi = new TravelInfo();
        hanoi.setName("Hanoi Travel");
        hanoi.setCountry(COUNTRY_VIETNAM);
        hanoi.setCity("Hanoi");
        hanoi.setDays(5);
        hanoi.setNights(3);
        travelInfoList.add(hanoi);

        TravelInfo bangkok = new TravelInfo();
        bangkok.setName("Bangkok Travel");
        bangkok.setCountry(COUNTRY_THAILAND);
        bangkok.setCity("Bangkok");
        bangkok.setDays(5);
        bangkok.setNights(3);
        travelInfoList.add(bangkok);
    }

//    public List<TravelInfo> searchTravelInfo(String country) {
//        List<TravelInfo> returnValue = new ArrayList<>();
//
//        for (TravelInfo travelInfo : travelInfoList) {
//            if(country.equals(travelInfo.getCountry())) {
//                returnValue.add(travelInfo);
//            }
//        }
//        return returnValue;
//    }

        public List<TravelInfo> searchTravelInfo(TravelInfoFilter searchCondition) {
            List<TravelInfo> returnValue = new ArrayList<>();

            for (TravelInfo travelInfo : travelInfoList) {
                if(searchCondition.isMatched(travelInfo)) {
                    returnValue.add(travelInfo);
                }
            }
            return returnValue;
    }

    public static void main(String[] args) {
        SearchingTravel travelSearch = new SearchingTravel();
        List<TravelInfo> searchList = travelSearch.searchTravelInfo(
                (TravelInfo travelInfo) -> travelInfo.getCountry().equals("vietnam"));
//        List<TravelInfo> searchList = travelSearch.searchTravelInfo(new TravelInfoFilter() {
//            @Override
//            public boolean isMatched(TravelInfo travelInfo) {
//                if (travelInfo.getCountry().equals(COUNTRY_VIETNAM)) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        });

        for (TravelInfo travelInfo : searchList) {
            System.out.println(travelInfo);
        }
    }
}
