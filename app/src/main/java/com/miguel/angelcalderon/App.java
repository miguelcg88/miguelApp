package com.miguel.angelcalderon;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;

import com.activeandroid.ActiveAndroid;
import com.miguel.angelcalderon.model.Category;
import com.miguel.angelcalderon.model.Image;
import com.miguel.angelcalderon.model.InfoClub;
import com.miguel.angelcalderon.model.InfoRestaurant;
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

            /*Categories:  */
            Category categoryRestaurant = new Category();
            categoryRestaurant.name = STATIC_RESTAURANT;
            categoryRestaurant.description = "Rostiserias, Snack, ..";
            categoryRestaurant.save();

            Category categoryClub = new Category();
            categoryClub.name = STATIC_CLUB;
            categoryClub.description= "Cafes, Bars, Peñas, ...";
            categoryClub.save();

            /*Restaurants

             Restaurant Panchita*/
            InfoRestaurant infoRestaurantPanchita_1 = new InfoRestaurant();
            infoRestaurantPanchita_1.name = "Cabañitas";
            infoRestaurantPanchita_1.price = "40";
            infoRestaurantPanchita_1.place = "Panchita";
            infoRestaurantPanchita_1.save();
            InfoRestaurant infoRestaurantPanchita_2 = new InfoRestaurant();
            infoRestaurantPanchita_2.name = "Burguer";
            infoRestaurantPanchita_2.price = "20";
            infoRestaurantPanchita_2.place = "Panchita";
            infoRestaurantPanchita_2.save();
            InfoRestaurant infoRestaurantPanchita_3 = new InfoRestaurant();
            infoRestaurantPanchita_3.name = "Piernitas";
            infoRestaurantPanchita_3.price = "30";
            infoRestaurantPanchita_3.place = "Panchita";
            infoRestaurantPanchita_3.save();
            Image imagePanchita_1 = new Image();
            imagePanchita_1.name = "panchita_cabiñitas";
            imagePanchita_1.detail = "Cabañita 40 Bs";
            imagePanchita_1.place = "Panchita";
            imagePanchita_1.save();
            Image imagePanchita_2 = new Image();
            imagePanchita_2.name = "panchita_burguer";
            imagePanchita_2.detail = "Burguer 15 Bs";
            imagePanchita_2.place = "Panchita";
            imagePanchita_2.save();
            Image imagePanchita_3 = new Image();
            imagePanchita_3.name = "panchita_piernas";
            imagePanchita_3.detail = "Piernitas 25 Bs";
            imagePanchita_3.place = "Panchita";
            imagePanchita_3.save();
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
            placePanchita.infoRestaurant = infoRestaurantPanchita_1;
            placePanchita.infoRestaurant = infoRestaurantPanchita_2;
            placePanchita.infoRestaurant = infoRestaurantPanchita_3;
            placePanchita.image = imagePanchita_1;
            placePanchita.image = imagePanchita_2;
            placePanchita.image = imagePanchita_3;
            placePanchita.save();

            /*Mi Llajta*/
            InfoRestaurant infoRestaurantMiLlajta_1 = new InfoRestaurant();
            infoRestaurantMiLlajta_1.name = "Ensalada";
            infoRestaurantMiLlajta_1.price = "15";
            infoRestaurantMiLlajta_1.place = "Mi Llajta";
            infoRestaurantMiLlajta_1.save();
            InfoRestaurant infoRestaurantMiLlajta_2 = new InfoRestaurant();
            infoRestaurantMiLlajta_2.name = "Fideos";
            infoRestaurantMiLlajta_2.price = "7";
            infoRestaurantMiLlajta_2.place = "Mi Llajta";
            infoRestaurantMiLlajta_2.save();
            InfoRestaurant infoRestaurantMiLlajta_3 = new InfoRestaurant();
            infoRestaurantMiLlajta_3.name = "Pescado ";
            infoRestaurantMiLlajta_3.price = "25";
            infoRestaurantMiLlajta_3.place = "Mi Llajta";
            infoRestaurantMiLlajta_3.save();
            Image imageMiLlajta_1 =  new Image();
            imageMiLlajta_1.name = "millajta_ensalada";
            imageMiLlajta_1.detail = "Polensa 35 Bs";
            imageMiLlajta_1.place = "Mi Llajta";
            imageMiLlajta_1.save();
            Image imageMiLlajta_2 =  new Image();
            imageMiLlajta_2.name = "millajta_fideos";
            imageMiLlajta_2.detail = "Fideo 25 Bs";
            imageMiLlajta_2.place = "Mi Llajta";
            imageMiLlajta_2.save();
            Image imageMiLlajta_3 =  new Image();
            imageMiLlajta_3.name = "millajta_pescado";
            imageMiLlajta_3.detail = "Pescado 35 Bs";
            imageMiLlajta_3.place = "Mi Llajta";
            imageMiLlajta_3.save();
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
            placeMiLlajta.infoRestaurant = infoRestaurantMiLlajta_1;
            placeMiLlajta.infoRestaurant = infoRestaurantMiLlajta_2;
            placeMiLlajta.infoRestaurant = infoRestaurantMiLlajta_3;
            placeMiLlajta.image = imageMiLlajta_1;
            placeMiLlajta.image = imageMiLlajta_2;
            placeMiLlajta.image = imageMiLlajta_3;
            placeMiLlajta.save();

            /*Clubs :

            Club Orange*/
            InfoClub infoClubOrange = new InfoClub();
            infoClubOrange.music = "Etiqueta negra, Jarana";
            infoClubOrange.drink = "Paceña, Huari, Taquiña";
            infoClubOrange.price = "20 Bs";
            infoClubOrange.place = "Sachawasi";
            infoClubOrange.save();
            Image imageOrange_1 = new Image();
            imageOrange_1.name = "sachawasi_burguer";
            imageOrange_1.detail = "Maldito 20 Bs";
            imageOrange_1.place = "Sachawasi";
            imageOrange_1.save();
            Image imageOrange_2 = new Image();
            imageOrange_2.name = "sachawasi_carne";
            imageOrange_2.detail = "Pacumuto 35 Bs";
            imageOrange_2.place = "Sachawasi";
            imageOrange_2.save();
            Image imageOrange_3 = new Image();
            imageOrange_3.name = "sachawasi_planchita";
            imageOrange_3.detail = "Plancha 70 Bs";
            imageOrange_3.place = "Sachawasi";
            imageOrange_3.save();
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
            placeOrange.infoClub = infoClubOrange;
            placeOrange.image = imageOrange_1;
            placeOrange.image = imageOrange_2;
            placeOrange.image = imageOrange_3;
            placeOrange.save();

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
