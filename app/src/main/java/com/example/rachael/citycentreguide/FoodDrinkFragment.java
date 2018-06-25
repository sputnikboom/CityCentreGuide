package com.example.rachael.citycentreguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodDrinkFragment extends Fragment {


    public FoodDrinkFragment() {
        // Required empty public constructor
    }

    // TODO - create item class
    // TODO - create custom adapter

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // create list of restaurant/bar locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getActivity().getString(R.string.headrow_house), getActivity().getString(R.string.headrow_house_address), R.drawable.headrow_house));
        locations.add(new Location(getActivity().getString(R.string.cielo_blanco), getActivity().getString(R.string.cielo_blanco_address), R.drawable.cielo_blanco));
        locations.add(new Location(getActivity().getString(R.string.brunswick), getActivity().getString(R.string.brunswick_address), R.drawable.brunswick));
        locations.add(new Location(getActivity().getString(R.string.trinity_kitchen), getActivity().getString(R.string.trinity_kitchen_address), R.drawable.trinity_kitchens));
        locations.add(new Location(getActivity().getString(R.string.stew_oyster), getActivity().getString(R.string.stew_oycter_address), R.drawable.stew_and_oyster));
        locations.add(new Location(getActivity().getString(R.string.belgrave), getActivity().getString(R.string.belgrave_address), R.drawable.belgrave));

        // creates a LocationAdapter
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
