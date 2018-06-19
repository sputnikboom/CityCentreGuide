package com.example.rachael.citycentreguide;

public class Location {

    // text- and image view data for the location item
    private String mLocationName;
    private String mLocationAddress;

    //private int mImageResourceId;

    // constructor for all fragments
    public Location(String locationName, String locationAddress) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
    }

    // Gets the location's name
    public String getLocationName() {
        return mLocationName;
    }

    // Gets the location's address
    public String getLocationAddress() {
        return mLocationAddress;
    }


// TODO add images to item

}
