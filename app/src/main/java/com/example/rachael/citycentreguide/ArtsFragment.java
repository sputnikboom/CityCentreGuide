package com.example.rachael.citycentreguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArtsFragment extends Fragment {

    public ArtsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container,false);

            // create list of art/gallery locations
            final ArrayList<Location> locations = new ArrayList<>();
            locations.add(new Location("West Yorkshire Playhouse", "Quarry Hill", "WYHP Description"));
            locations.add(new Location("West Yorkshire Playhouse", "Quarry Hill", "WYHP Description"));
            locations.add(new Location("West Yorkshire Playhouse", "Quarry Hill", "WYHP Description"));
            // TODO more locations

            // creates a LocationAdapter
            LocationAdapter adapter =  new LocationAdapter(getActivity(), locations);
            ListView listView = rootView.findViewById(R.id.list);
            listView.setAdapter(adapter);

        return rootView;
    }
}
