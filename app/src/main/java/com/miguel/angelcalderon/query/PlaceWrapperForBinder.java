package com.miguel.angelcalderon.query;

import android.os.Binder;

import com.miguel.angelcalderon.model.Place;

/**
 * Created by gonzalopro on 12/4/16.
 */

public class PlaceWrapperForBinder extends Binder {

    private final Place place;

    public PlaceWrapperForBinder(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }
}
