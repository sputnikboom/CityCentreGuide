package com.example.rachael.citycentreguide;

public class Location {

    // text- and image view data for the location item
    private String mLocationName;
    private String mLocationAddress;
    private int mLocationImage;

    // constructor for all fragments
    public Location(String locationName, String locationAddress, int locationImage) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationImage = locationImage;
    }

    // Gets the location's name
    public String getLocationName() {
        return mLocationName;
    }

    // Gets the location's address
    public String getLocationAddress() {
        return mLocationAddress;
    }

    // Gets the location's image
    public int getLocationImage() {
        return mLocationImage;
    }


// TODO add images to item

}
