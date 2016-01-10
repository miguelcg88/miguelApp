package com.miguel.angelcalderon.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "InfoRestaurants")
public class InfoRestaurant extends Model {

    @Column(name = "Name")
    public String name;

    @Column(name = "Price")
    public String price;

    @Column(name = "Place")
    public String place;

}
