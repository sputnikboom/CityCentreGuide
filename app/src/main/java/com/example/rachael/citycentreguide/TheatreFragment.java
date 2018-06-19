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
public class TheatreFragment extends Fragment {


    public TheatreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // create list of theatre locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getActivity().getString(R.string.wyorks_playhouse), getActivity().getString(R.string.wyorks_playhouse_address)));
        locations.add(new Location(getActivity().getString(R.string.lab), getActivity().getString(R.string.lab_address)));
        locations.add(new Location(getActivity().getString(R.string.holbeck_ballroom), getActivity().getString(R.string.holbeck_ballroom_address)));
        locations.add(new Location(getActivity().getString(R.string.northern_ballet), getActivity().getString(R.string.northern_ballet_address)));
        locations.add(new Location(getActivity().getString(R.string.carriageworks), getActivity().getString(R.string.carriageworks_address)));
        locations.add(new Location(getActivity().getString(R.string.grand_theatre), getActivity().getString(R.string.grand_theatre_address)));
        // TODO add images

        // creates a LocationAdapter
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
