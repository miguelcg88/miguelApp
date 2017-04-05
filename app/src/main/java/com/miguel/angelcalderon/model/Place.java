package com.miguel.angelcalderon.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import org.mapsforge.core.graphics.Bitmap;

import java.io.Serializable;

@Table(name = "Places")
public class Place extends Model implements Serializable {

    @Column(name = "Icon")
    public String icon;

    @Column(name = "Name")
    public String name;

    @Column(name = "Address")
    public String address;

    @Column(name = "Phone")
    public String Phone;

    @Column(name = "Facebook")
    public String facebook;

    @Column(name = "Web")
    public String web;

    @Column(name = "ScheduleDay")
    public String schedule_day;

    @Column(name = "ScheduleHour")
    public String schedule_hour;

    @Column(name = "Categories")
    public Category category;

    @Column(name = "Activity1")
    public String activity1;

    @Column(name = "Activity2")
    public String activity2;

    @Column(name = "Activity3")
    public String activity3;

    @Column(name = "Latitud")
    public float latitud;

    @Column(name = "Longitud")
    public float longitud;

    @Column(name = "icon_marker")
    public String icon_marker;

    public Place() {}
}
