package com.miguel.angelcalderon.model;


import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Images")
public class Image extends Model {

    @Column(name = "Name")
    public String name;

    @Column(name = "Detail")
    public String detail;

    @Column(name = "Place")
    public String place;
}
