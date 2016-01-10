package com.miguel.angelcalderon.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "InfoClubs")
public class InfoClub extends Model {

    @Column(name = "Music")
    public String music;

    @Column(name = "Drink")
    public String drink;

    @Column(name = "Price")
    public String price;

    @Column(name = "Place")
    public String place;
}
