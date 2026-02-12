package com.example.listycity;

/**
 * This is a class that defines a City
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * City Object representation
     * @param city
     * @param province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;

    }

    /**
     * Get city name of the city
     * @return
     */
    public String getCityName() {
        return city;
    }

    public String getProvinceName() {
        return province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}
