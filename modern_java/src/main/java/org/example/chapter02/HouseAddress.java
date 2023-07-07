package org.example.chapter02;

public interface HouseAddress {
    public static final String DefaultCountry = "Korea";
    // 우편번호를 리턴
    public String getPostCode();

    // 주소정보를 리턴
    public String getAddress();

    // 상세정보를 리턴한다.
    public String getDetailAddress();

    // 국가코드를 리턴한다.
    default public String getCountryCode() {
        return HouseAddress.DefaultCountry;
    };

    private String getDefaultCountryCode() {
        return HouseAddress.DefaultCountry;
    }
}
