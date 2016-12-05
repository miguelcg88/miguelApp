package com.miguel.angelcalderon;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;

import com.activeandroid.ActiveAndroid;
import com.miguel.angelcalderon.model.Category;
import com.miguel.angelcalderon.model.Item;
import com.miguel.angelcalderon.model.Place;
import com.miguel.angelcalderon.query.DefaultData;

public class App extends Application {

    String STATIC_CLUB = "Boliche";
    String STATIC_RESTAURANT = "Restaurante";

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);

        DefaultData defaultData = new DefaultData();
        System.out.println(defaultData.defaultDatas().size());
        if (defaultData.defaultDatas().size() == 0) {

            /****** Categories: ******/
            Category categoryRestaurant = new Category();
            categoryRestaurant.name = STATIC_RESTAURANT;
            categoryRestaurant.description = "Rostiserias, Snack, ..";
            categoryRestaurant.save();

            Category categoryClub = new Category();
            categoryClub.name = STATIC_CLUB;
            categoryClub.description= "Cafes, Bars, Peñas, ...";
            categoryClub.save();

            /****** Places: ******/

            // Planchita
            Place placePanchita = new Place();
            placePanchita.icon = "panchita_icon";
            placePanchita.name = "Panchita";
            placePanchita.address = "Av. America";
            placePanchita.Phone = "4411223";
            placePanchita.facebook = "https://www.facebook.com/";
            placePanchita.web = "https://www.panchita.com.bo";
            placePanchita.schedule_day = "Lunes - Domingo";
            placePanchita.schedule_hour = "8:30 - 21:30";
            placePanchita.category = categoryRestaurant;
            placePanchita.save();

            // Mi llajta
            Place placeMiLlajta = new Place();
            placeMiLlajta.icon = "millajta_icon";
            placeMiLlajta.name = "Mi Llajta";
            placeMiLlajta.address = "av. Juan de la Rosa entre c. Picaso y c. Belez";
            placeMiLlajta.Phone = "4456532";
            placeMiLlajta.facebook = "https://www.facebook.com/";
            placeMiLlajta.web = "https://www.millajta.com.bo";
            placeMiLlajta.schedule_day = "Lunes - Domingo";
            placeMiLlajta.schedule_hour = "9:00 - 23:00";
            placeMiLlajta.category = categoryRestaurant;
            placeMiLlajta.save();

            // Orange
            Place placeOrange = new Place();
            placeOrange.icon = "sachawasi_icon";
            placeOrange.name = "Sachawasi";
            placeOrange.address = "av. Prado entre c. Oruro y c. La Paz";
            placeOrange.Phone = "4323212";
            placeOrange.facebook = "https://www.facebook.com/";
            placeOrange.web = "https://www.sachawasi.com.bo";
            placeOrange.schedule_day = "Viernes - Sabados - Domingos";
            placeOrange.schedule_hour = "19:00 - 23:00 pm";
            placeOrange.category = categoryClub;
            placeOrange.save();

            /****** Items: ******/

            // Panchita
            Item itemPanchita_1 = new Item();
            itemPanchita_1.name = "Cabañitas";
            itemPanchita_1.detail = "Filetes de pollo..";
            itemPanchita_1.price = "40";
            itemPanchita_1.image = "panchita_cabiñitas";
            itemPanchita_1.place = placePanchita;
            itemPanchita_1.save();
            Item itemPanchita_2 = new Item();
            itemPanchita_2.name = "Burguer Snak";
            itemPanchita_2.detail = "Tomate, lechuga..";
            itemPanchita_2.price = "15";
            itemPanchita_2.image = "panchita_burguer";
            itemPanchita_2.place = placePanchita;
            itemPanchita_2.save();
            Item itemPanchita_3 = new Item();
            itemPanchita_3.name = "Piernitas";
            itemPanchita_3.detail = "Arroz, Tomate..";
            itemPanchita_3.price = "25";
            itemPanchita_3.image = "panchita_piernas";
            itemPanchita_3.place = placePanchita;
            itemPanchita_3.save();

            // Mi Llajta
            Item itemMiLlajta_1 =  new Item();
            itemMiLlajta_1.name = "Polensa";
            itemMiLlajta_1.detail = "Pescados a la plancha";
            itemMiLlajta_1.price = "35";
            itemMiLlajta_1.image = "millajta_ensalada";
            itemMiLlajta_1.place = placeMiLlajta;
            itemMiLlajta_1.save();
            Item itemMiLlajta_2 =  new Item();
            itemMiLlajta_2.name = "Fideos Yayan";
            itemMiLlajta_2.detail = "Fideo con tomates";
            itemMiLlajta_2.price = "25";
            itemMiLlajta_2.image = "millajta_fideos";
            itemMiLlajta_2.place = placeMiLlajta;
            itemMiLlajta_2.save();
            Item itemMiLlajta_3 =  new Item();
            itemMiLlajta_3.name = "Pejerrey";
            itemMiLlajta_3.detail = "Pescado con ensalada";
            itemMiLlajta_3.price = "45";
            itemMiLlajta_3.image = "millajta_pescado";
            itemMiLlajta_3.place = placeMiLlajta;
            itemMiLlajta_3.save();

            // Orange
            Item itemOrange_1 = new Item();
            itemOrange_1.name = "Maldito";
            itemOrange_1.detail = "Super Maldito";
            itemOrange_1.price = "17";
            itemOrange_1.image = "sachawasi_burguer";
            itemOrange_1.place = placeOrange;
            itemOrange_1.save();
            Item itemOrange_2 = new Item();
            itemOrange_2.name = "Churrasco mayor";
            itemOrange_2.detail = "Pacumuto completo";
            itemOrange_2.price = "50";
            itemOrange_2.image = "sachawasi_carne";
            itemOrange_2.place = placeOrange;
            itemOrange_2.save();
            Item itemOrange_3 = new Item();
            itemOrange_3.name = "Plancha";
            itemOrange_3.detail = "Plancha por pareja";
            itemOrange_3.price = "75";
            itemOrange_3.image = "sachawasi_planchita";
            itemOrange_3.place = placeOrange;
            itemOrange_3.save();


            /*Query query = new Query();
            System.out.println(query.getAllPlace(categoryRestaurant));

            ArrayList<Place> placeArrayList = new ArrayList<>();
            placeArrayList = (ArrayList<Place>) query.getAllPlace(categoryRestaurant);
            for (Place place: placeArrayList){
                System.out.println(place.name);
            }
            System.out.println(placeArrayList.size());*/

            defaultData.defaultData = "true";
            defaultData.save();
            Log.d("App"," Save !");
        }

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
