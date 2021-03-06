package com.miguel.angelcalderon.model;


import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Item")
public class Item extends Model {

    @Column(name = "Name")
    public String name;

    @Column(name = "Detail")
    public String detail;

    @Column(name = "Price")
    public String price;

    @Column(name = "Image")
    public String image;

    @Column(name = "Places")
    public Place place;
}
