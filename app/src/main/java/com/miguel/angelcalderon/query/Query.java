package com.miguel.angelcalderon.query;

import com.activeandroid.query.Select;
import com.miguel.angelcalderon.model.Category;
import com.miguel.angelcalderon.model.Item;
import com.miguel.angelcalderon.model.Place;

import java.util.List;

public class Query {

    public List<Place> getAllPlace(Category category) {
        return new Select()
                .from(Place.class)
                .where("Categories = ?", category.getId())
                .orderBy("RANDOM()")
                .execute();
    }

    public List<Place> getAllPlace() {
        return new Select()
                .from(Place.class)
                .orderBy("RANDOM()")
                .execute();
    }


    public List<Category> getCategory(String name) {
        return new Select()
                .from(Category.class)
                .where("Name = ?", name)
                .execute();
    }

    public List<Place> getAllPlaceSort() {
        return new Select()
                .from(Place.class)
                .orderBy("RANDOM()")
                .limit(3)
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

    public List<Item> getAllItemByPlace(Place place) {
        return new Select()
                .from(Item.class)
                .where("Places =?", place.getId())
                .execute();
    }

    public Place getPlaceRandom() {
        return new Select()
                .from(Place.class)
                .orderBy("RANDOM()")
                .executeSingle();
    }

}
