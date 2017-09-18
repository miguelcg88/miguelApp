package com.miguel.angelcalderon.query;

import com.activeandroid.query.Select;
import com.miguel.angelcalderon.model.Categoria;
import com.miguel.angelcalderon.model.Item;
import com.miguel.angelcalderon.model.Lugar;

import java.util.List;

public class Query {

    public List<Lugar> getAllPlace(Categoria categoria) {
        return new Select()
                .from(Lugar.class)
                .where("Categories = ?", categoria.getId())
                .orderBy("RANDOM()")
                .execute();
    }

    public List<Lugar> getAllPlace() {
        return new Select()
                .from(Lugar.class)
                .orderBy("RANDOM()")
                .execute();
    }

    public List<Categoria> getCategory(String name) {
        return new Select()
                .from(Categoria.class)
                .where("Name = ?", name)
                .execute();
    }

    public List<Item> getAllPlaceByAmount(String amount) {
        return new Select()
                .from(Item.class)
                .where("Price <=?", amount)
                .groupBy("Places")
                .execute();
    }

    public List<Item> getAllPlaceByAmountUp(String amount) {
        return new Select()
                .from(Item.class)
                .where("Price >=?", amount)
                .groupBy("Places")
                .execute();
    }

    public List<Item> getAllItemByPlace(Lugar lugar) {
        return new Select()
                .from(Item.class)
                .where("Places =?", lugar.getId())
                .execute();
    }

    public Lugar getPlaceRandom() {
        return new Select()
                .from(Lugar.class)
                .orderBy("RANDOM()")
                .executeSingle();
    }
}
