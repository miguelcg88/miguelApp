package com.miguel.angelcalderon.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.io.Serializable;

@Table(name = "Categories")
public class Categoria extends Model implements Serializable{

    @Column(name = "Name")
    public String name;

    @Column(name = "Description")
    public String description;

}
