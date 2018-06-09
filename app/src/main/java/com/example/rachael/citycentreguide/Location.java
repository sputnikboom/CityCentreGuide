package com.example.rachael.citycentreguide;

public class Location {

    // text- and image view data for the location item
    private String mLocationName;
    private String mLocationAddress;
    private String mLocationDescription;
    //private int mImageResourceId;

    // constructor for all fragments
    public Location(String locationName, String locationAddress, String locationDescription) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationDescription = locationDescription;
    }

    // Gets the location's name
    public String getLocationName() {
        return mLocationName;
    }

    // Gets the location's address
    public String getLocationAddress() {
        return mLocationAddress;
    }

    // Gets the location's description
    public String getLocationDescription() {
        return mLocationDescription;
    }

// TODO add images to item

}
