package org.example.chapter02;

public class KoreaHouseAddress implements HouseAddress{
    private String postCode;
    private String address;
    private String detailAddress;

    public KoreaHouseAddress(String postCode, String address, String detailAddress) {
        this.postCode = postCode;
        this.address = address;
        this.detailAddress = detailAddress;
    }

    @Override
    public String getPostCode() {
        return postCode;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getDetailAddress() {
        return detailAddress;
    }

    @Override
    public String getCountryCode() {
        return HouseAddress.super.getCountryCode();
    }

    public static void main(String[] args) {
        KoreaHouseAddress address = new KoreaHouseAddress("06164", "서울특별시 강남구 영동대로 517", "아셈타워 12층");
        System.out.println(address.getCountryCode());
    }
}
