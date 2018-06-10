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
public class TravelFragment extends Fragment {


    public TravelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // create list of travel option locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getActivity().getString(R.string.wyorks_playhouse), getActivity().getString(R.string.wyorks_playhouse_address), getActivity().getString(R.string.wyorks_playhouse_description)));
        //TODO add in locations

        // creates a LocationAdapter
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
