package org.example.chapter03.travel;

public class TravelInfo {
    private String name;
    private String country;
    private String city;
    private int days;
    private int nights;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getDays() {
        return days;
    }

    public int getNights() {
        return nights;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    @Override
    public String toString() {
        return "TravelInfo{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", days=" + days +
                ", nights=" + nights +
                '}';
    }
}
