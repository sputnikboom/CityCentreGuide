package com.example.rachael.citycentreguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // create list of art/gallery locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getActivity().getString(R.string.leeds_art_gallery), getActivity().getString(R.string.leeds_art_gallery_address), R.drawable.leeds_art_gallery));
        locations.add(new Location(getActivity().getString(R.string.henry_moore), getActivity().getString(R.string.henry_moore_address), R.drawable.henry_moore_institute));
        locations.add(new Location(getActivity().getString(R.string.tetley), getActivity().getString(R.string.tetley_address), R.drawable.the_tetley));
        locations.add(new Location(getActivity().getString(R.string.galley_164), getActivity().getString(R.string.gallry_164_address), R.drawable.gallery_164));

        // creates a LocationAdapter
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);


        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
