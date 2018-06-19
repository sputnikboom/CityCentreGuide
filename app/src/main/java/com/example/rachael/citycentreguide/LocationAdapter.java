package com.example.rachael.citycentreguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // checks if the existing view is being reused, otherwise inflates the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_item, parent, false);
        }

            // gets the location at this position
            Location currentLocation = getItem(position);

            // finds the text view w/id location_name in the location_item layout
            TextView locationNameTextView = listItemView.findViewById(R.id.location_name);
            // gets the location name from the location object, sets this to the textView
            locationNameTextView.setText(currentLocation.getLocationName());

            // as above for location address
            TextView locationAddressTextView = listItemView.findViewById(R.id.location_address);
            locationAddressTextView.setText(currentLocation.getLocationAddress());

            // as above, but for the location's image
            ImageView locationImageView = listItemView.findViewById(R.id.location_image);
            locationImageView.setImageResource(currentLocation.getLocationImage());

            // returns the whole list item (2 text views and 1 image view) so it's shown in the list layout
            return listItemView;
        }
    }
