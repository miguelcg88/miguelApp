package com.miguel.angelcalderon.query;

import com.activeandroid.query.Select;
import com.miguel.angelcalderon.model.Category;
import com.miguel.angelcalderon.model.Image;
import com.miguel.angelcalderon.model.InfoRestaurant;
import com.miguel.angelcalderon.model.Place;

import java.util.List;

public class Query {

    public List<Place> getAllPlace(Category category) {
        return new Select()
                .from(Place.class)
                .where("Category = ?", category.getId())
                .orderBy("RANDOM()")
                .execute();
    }

    public List<Category> getCategory(String name) {
        return new Select()
                .from(Category.class)
                .where("Name = ?", name)
                .execute();
    }

    public List<Place> getPlace(String name) {
        return new Select()
                .from(Place.class)
                .where("Name =?", name)
                .execute();
    }

    public List<Image> getAllImage(String name) {
        return new Select()
                .from(Image.class)
                .where("Place =?", name)
                .execute();
    }

    public List<Place> getAllPlaceSort() {
        return new Select()
                .from(Place.class)
                .orderBy("RANDOM()")
                .limit(3)
                .execute();
    }

    public List<InfoRestaurant> getAllPlaceTwenty(String twenty) {
        return new Select()
                .from(InfoRestaurant.class)
                .where("Price <=?", twenty)
                .execute();
    }
}
