package com.example.bai6adnc;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapFragment extends SupportMapFragment implements OnMapReadyCallback {
    private GoogleMap googleMap;

    public MapFragment()  {
        getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap gmap) {
        this.googleMap = gmap;

        // Set default position
        // Add a marker in Sydney and move the camera
        LatLng FPolyHN = new LatLng(21.038089, 105.746699); // 14.0583° N, 108.2772° E
        this.googleMap.addMarker(new MarkerOptions().position(FPolyHN).title("FPOLY Ha Noi"));
        CameraPosition cp = new CameraPosition.Builder().target(FPolyHN).zoom(20).build();
        this.googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cp));



    }
}
