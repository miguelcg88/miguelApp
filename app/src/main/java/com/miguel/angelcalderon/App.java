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

import java.util.ArrayList;
import java.util.List;

public class App extends Application {

    public static final String STATIC_CLUB = "Boliche";
    public static final String STATIC_RESTAURANT = "Restaurante";
    private List<Place> ListPlaces = new ArrayList<>();
    private Place placeToShow;

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
            placePanchita.icon_marker = "panchita_marker";
            placePanchita.address = "Av.America y Melchor Urquidi.";
            placePanchita.Phone = "4456734";
            placePanchita.facebook = "https://www.facebook.com/pollospanchita/";
            placePanchita.web = "http://www.panchita.bo";
            placePanchita.schedule_day = "Lunes - Domingo";
            placePanchita.schedule_hour = "11:00 - 22:00";
            placePanchita.category = categoryRestaurant;
            placePanchita.latitud = (float) -17.3731327;
            placePanchita.longitud = (float) -66.2193803;
            placePanchita.save();

            // Burger King
            Place pBurgerKing = new Place();
            pBurgerKing.icon = "burger_icon";
            pBurgerKing.icon_marker = "cozzolizi_marker";
            pBurgerKing.name = "Burger King";
            pBurgerKing.address = "Av. Ballivián esq. Tte. Arévalo.";
            pBurgerKing.Phone = "4529296";
            pBurgerKing.facebook = "https://www.facebook.com/pg/BurgerKingBolivia/";
            pBurgerKing.web = "http://www.bk.com/international";
            pBurgerKing.schedule_day = "Lunes - Domingo";
            pBurgerKing.schedule_hour = "11:00 - 23:00";
            pBurgerKing.category = categoryRestaurant;
            pBurgerKing.latitud = (float) -17.3834226;
            pBurgerKing.longitud = (float) -66.159746;
            pBurgerKing.save();

            // Yogen Fruz
            Place pYogenFruz = new Place();
            pYogenFruz.icon = "yogen_icon";
            pYogenFruz.icon_marker = "yogen_marker";
            pYogenFruz.name = "Yogen Fruz";
            pYogenFruz.address = "Av. América esquina Miguel Aguirre.";
            pYogenFruz.Phone = "78302716";
            pYogenFruz.facebook = "https://www.facebook.com/YogenFruzBolivia/";
            pYogenFruz.web = "http://www.yogenfruz.com/";
            pYogenFruz.schedule_day = "Lunes - Domingo";
            pYogenFruz.schedule_hour = "09:00 - 22:00";
            pYogenFruz.category = categoryRestaurant;
            pYogenFruz.latitud = (float) -17.3886089;
            pYogenFruz.longitud = (float) -66.1567601;
            pYogenFruz.save();

            // Dumbo
            Place pDumbo= new Place();
            pDumbo.icon = "dumbo_icon";
            pDumbo.icon_marker = "dumbo_marker";
            pDumbo.name = "Dumbo";
            pDumbo.address = "Av Heroinas 354";
            pDumbo.Phone = "4501300";
            pDumbo.facebook = "https://www.facebook.com/pages/Heladería-Dumbo/";
            pDumbo.web = "http://www.heladraiadumbo.com";
            pDumbo.schedule_day = "Lunes - Domingo";
            pDumbo.schedule_hour = "07:30 - 23:30";
            pDumbo.category = categoryRestaurant;
            pDumbo.latitud = (float) -17.3922401;
            pDumbo.longitud = (float) -66.1559732;
            pDumbo.save();

            // Globos
            Place pGlobos = new Place();
            pGlobos.icon = "globos_icon";
            pGlobos.icon_marker = "globos_marker";
            pGlobos.name = "Globos";
            pGlobos.address = "Av José Ballivian (El Prado)";
            pGlobos.Phone = "4520606";
            pGlobos.facebook = "https://www.facebook.com/heladeriaglobos/";
            pGlobos.web = "http://www.heladeriaglobos.com";
            pGlobos.schedule_day = "Lunes - Domingo";
            pGlobos.schedule_hour = "10:00 - 00:00";
            pGlobos.category = categoryRestaurant;
            pGlobos.latitud = (float) -17.3875703;
            pGlobos.longitud = (float) -66.1555943;
            pGlobos.save();

            // Bufalo's Rodizio
            Place pBufalo= new Place();
            pBufalo.icon = "bufalo_icon";
            pBufalo.icon_marker = "bufalo_marker";
            pBufalo.name = "Bufalo's Rodizio";
            pBufalo.address = "Av Oquendo";
            pBufalo.Phone = "4251597";
            pBufalo.facebook = "https://www.facebook.com/Bufalos-Rodizio-200994336598652/";
            pBufalo.web = "http://www.bufalosrodizio.bo";
            pBufalo.schedule_day = "Lunes - Domingo";
            pBufalo.schedule_hour = "11:00 - 17:00";
            pBufalo.category = categoryRestaurant;
            pBufalo.latitud = (float) -17.3845288;
            pBufalo.longitud = (float) -66.1510388;
            pBufalo.save();

            // Donal
            Place pDonal= new Place();
            pDonal.icon = "donal_icon";
            pDonal.icon_marker = "donal_marker";
            pDonal.name = "Donal";
            pDonal.address = "Av.Heroinas entre 25 de Mayo y España";
            pDonal.Phone = "4509477";
            pDonal.facebook = "https://www.facebook.com/Donal.FamilyCenter/";
            pDonal.web = "http://www.heladeriadonal.com";
            pDonal.schedule_day = "Lunes - Domingo";
            pDonal.schedule_hour = "10:00 - 23:00";
            pDonal.category = categoryRestaurant;
            pDonal.latitud = (float) -17.3924308;
            pDonal.longitud = (float) -66.1582759;
            pDonal.save();

            // Kingdom
            Place pKingdom= new Place();
            pKingdom.icon = "kingdom_icon";
            pKingdom.icon_marker = "marker_kingdom";
            pKingdom.name = "Kingdom";
            pKingdom.address = "Av. San Martin, Cochabamba";
            pKingdom.Phone = "4504083";
            pKingdom.facebook = "https://www.facebook.com/Chickens.Kingdom.OFFICIAL/";
            pKingdom.web = "http://www.chickenskingdom.com.bo";
            pKingdom.schedule_day = "Lunes - Domingo";
            pKingdom.schedule_hour = "10:00 - 23:45";
            pKingdom.category = categoryRestaurant;
            pKingdom.latitud = (float) -17.3924308;
            pKingdom.longitud = (float) -66.1573886;
            pKingdom.save();

            // Vizzio
            Place pVizzio = new Place();
            pVizzio.icon = "vizzio_icon";
            pVizzio.icon_marker = "vizzio_marker";
            pVizzio.name = "Vizzio";
            pVizzio.address = "Av. Tadeo Ahenke esquina pasaje del Mitayo";
            pVizzio.Phone = "4403989";
            pVizzio.facebook = "https://www.facebook.com/pollos.vizzios/";
            pVizzio.web = "http://www.pollosvizzios.bo";
            pVizzio.schedule_day = "Lunes - Sabados";
            pVizzio.schedule_hour = "18:00 - 23:00";
            pVizzio.category = categoryRestaurant;
            pVizzio.latitud = (float) -17.3883543;
            pVizzio.longitud = (float) -66.171899;
            pVizzio.save();

            // Big Joy
            Place pBigJoy = new Place();
            pBigJoy.icon = "big_icon";
            pBigJoy.icon_marker = "big_marker";
            pBigJoy.name = "Big Joy";
            pBigJoy.address = "Av. Beni 508";
            pBigJoy.Phone = "4799799";
            pBigJoy.facebook = "https://www.facebook.com/Wingsfriescolas/";
            pBigJoy.web = "http://www.bigjoy.com.bo";
            pBigJoy.schedule_day = "Martes - Domingo";
            pBigJoy.schedule_hour = "17:30 - 23:00";
            pBigJoy.category = categoryRestaurant;
            pBigJoy.latitud = (float) -17.3772808;
            pBigJoy.longitud = (float) -66.1544178;
            pBigJoy.save();

            // Tropical Chiken
            Place pTropicalChiken = new Place();
            pTropicalChiken.icon = "tropical_icon";
            pTropicalChiken.icon_marker = "tropical_marker";
            pTropicalChiken.name = "Tropical Chiken";
            pTropicalChiken.address = "Av. Juan de la Rosa esq. Gabriel René Moreno";
            pTropicalChiken.Phone = "4047000";
            pTropicalChiken.facebook = "https://www.facebook.com/tropicalchicken.BOLIVIA/";
            pTropicalChiken.web = "http://www.tropicalchiken.bo";
            pTropicalChiken.schedule_day = "Lunes - Domingo";
            pTropicalChiken.schedule_hour = "17:30 - 23:00";
            pTropicalChiken.category = categoryRestaurant;
            pTropicalChiken.latitud = (float) -17.3766232;
            pTropicalChiken.longitud = (float) -66.172942;
            pTropicalChiken.save();

            // Wist'upiku
            Place pWistupiku = new Place();
            pWistupiku.icon = "wistus_icon";
            pWistupiku.icon_marker = "wistus_marker";
            pWistupiku.name = "Wist'upiku";
            pWistupiku.address = "Calle Lanza Nº 619 entre Uruguay y acera este.";
            pWistupiku.Phone = "4257972";
            pWistupiku.facebook = "https://www.facebook.com/wistupiku/";
            pWistupiku.web = "http://www.wistupiku.com";
            pWistupiku.schedule_day = "Lunes - Domingo";
            pWistupiku.schedule_hour = "07:00 - 22:00";
            pWistupiku.category = categoryRestaurant;
            pWistupiku.latitud = (float) -17.397105;
            pWistupiku.longitud = (float) -66.1544767;
            pWistupiku.save();


            /*
            Place  = new Place();
            placePanchita.icon = "panchita_icon";
            placePanchita.name = "";
            placePanchita.address = "";
            placePanchita.Phone = "";
            placePanchita.facebook = "";
            placePanchita.web = "";
            placePanchita.schedule_day = "Lunes - Domingo";
            placePanchita.schedule_hour = "";
            placePanchita.category = categoryRestaurant;
            placePanchita.latitud = (float) -17.;
            placePanchita.longitud = (float) -66.;
            placePanchita.save();
*/
            // Mi llajta
            Place placeMiLlajta = new Place();
            placeMiLlajta.icon = "millajta_icon";
            placeMiLlajta.icon_marker = "cozzolizi_marker";
            placeMiLlajta.name = "Mi Llajta";
            placeMiLlajta.address = "av. Juan de la Rosa entre c. Picaso y c. Belez";
            placeMiLlajta.Phone = "4456532";
            placeMiLlajta.facebook = "https://www.facebook.com/";
            placeMiLlajta.web = "https://www.millajta.com.bo";
            placeMiLlajta.schedule_day = "Lunes - Domingo";
            placeMiLlajta.schedule_hour = "9:00 - 23:00";
            placeMiLlajta.category = categoryRestaurant;
            placeMiLlajta.latitud = (float) -17.392623;
            placeMiLlajta.longitud = (float) -66.158352;
            placeMiLlajta.save();

            // Orange
            Place placeOrange = new Place();
            placeOrange.icon = "sachawasi_icon";
            placeOrange.icon_marker = "cozzolizi_marker";
            placeOrange.name = "Sachawasi";
            placeOrange.address = "av. Prado entre c. Oruro y c. La Paz";
            placeOrange.Phone = "4323212";
            placeOrange.facebook = "https://www.facebook.com/";
            placeOrange.web = "https://www.sachawasi.com.bo";
            placeOrange.schedule_day = "Viernes - Sabados - Domingos";
            placeOrange.schedule_hour = "19:00 - 23:00 pm";
            placeOrange.activity1 = "Clasicos de los 80s";
            placeOrange.activity2 = "Cover 50 Bs";
            placeOrange.activity3 = "Mojitos 2x1 a 30 Bs";
            placeOrange.category = categoryClub;
            placeOrange.latitud = (float) -17.392523;
            placeOrange.longitud = (float) -66.158852;
            placeOrange.save();

            /****** Items: ******/

            // Panchita
            Item itemPanchita_1 = new Item();
            itemPanchita_1.name = "Panchita";
            itemPanchita_1.detail = "Filetes de pollo..";
            itemPanchita_1.price = 27;
            itemPanchita_1.image = "panchita1";
            itemPanchita_1.place = placePanchita;
            itemPanchita_1.save();
            Item itemPanchita_2 = new Item();
            itemPanchita_2.name = "Chipollo";
            itemPanchita_2.detail = "Tomate, lechuga..";
            itemPanchita_2.price = 20;
            itemPanchita_2.image = "panchita2";
            itemPanchita_2.place = placePanchita;
            itemPanchita_2.save();
            Item itemPanchita_3 = new Item();
            itemPanchita_3.name = "Silpancho";
            itemPanchita_3.detail = "Arroz, Tomate..";
            itemPanchita_3.price = 20;
            itemPanchita_3.image = "panchita3";
            itemPanchita_3.place = placePanchita;
            itemPanchita_3.save();

            // Burger King
            Item itemBurger1 = new Item();
            itemBurger1.name = "Whopper";
            itemBurger1.detail = "Filetes de pollo..";
            itemBurger1.price = 15;
            itemBurger1.image = "bk1";
            itemBurger1.place = pBurgerKing;
            itemBurger1.save();
            Item itemBurger2 = new Item();
            itemBurger2.name = "Big King";
            itemBurger2.detail = "Tomate, lechuga..";
            itemBurger2.price = 23;
            itemBurger2.image = "bk2";
            itemBurger2.place = pBurgerKing;
            itemBurger2.save();
            Item itemBurger3 = new Item();
            itemBurger3.name = "Nuggets";
            itemBurger3.detail = "Arroz, Tomate..";
            itemBurger3.price = 17;
            itemBurger3.image = "bk3";
            itemBurger3.place = pBurgerKing;
            itemBurger3.save();

            // Yogen Fruz
            Item itemYogen1 = new Item();
            itemYogen1.name = "Smoothies";
            itemYogen1.detail = "Filetes de pollo..";
            itemYogen1.price = 13;
            itemYogen1.image = "yf1";
            itemYogen1.place = pYogenFruz;
            itemYogen1.save();
            Item itemYogen2 = new Item();
            itemYogen2.name = "Nu Mix";
            itemYogen2.detail = "Tomate, lechuga..";
            itemYogen2.price = 11;
            itemYogen2.image = "yf2";
            itemYogen2.place = pYogenFruz;
            itemYogen2.save();
            Item itemYogen3 = new Item();
            itemYogen3.name = "Helado y fruta";
            itemYogen3.detail = "Arroz, Tomate..";
            itemYogen3.price = 11;
            itemYogen3.image = "yf3";
            itemYogen3.place = pYogenFruz;
            itemYogen3.save();

            // Dumbo
            Item itemDumbo1 = new Item();
            itemDumbo1.name = "Pique";
            itemDumbo1.detail = "Filetes de pollo..";
            itemDumbo1.price = 120;
            itemDumbo1.image = "dumbo1";
            itemDumbo1.place = pDumbo;
            itemDumbo1.save();
            Item itemDumbo2 = new Item();
            itemDumbo2.name = "Lomo Salteado";
            itemDumbo2.detail = "Tomate, lechuga..";
            itemDumbo2.price = 80;
            itemDumbo2.image = "dumbo2";
            itemDumbo2.place = pDumbo;
            itemDumbo2.save();
            Item itemDumbo3 = new Item();
            itemDumbo3.name = "Hamburguesa";
            itemDumbo3.detail = "Arroz, Tomate..";
            itemDumbo3.price = 21;
            itemDumbo3.image = "dumbo3";
            itemDumbo3.place = pDumbo;
            itemDumbo3.save();

            //Globos
            Item itemGlobos1 = new Item();
            itemGlobos1.name = "Pollo a la canasta";
            itemGlobos1.detail = "Filetes de pollo..";
            itemGlobos1.price = 32;
            itemGlobos1.image = "globos1";
            itemGlobos1.place = pGlobos;
            itemGlobos1.save();
            Item itemGlobos2 = new Item();
            itemGlobos2.name = "Silpancho";
            itemGlobos2.detail = "Tomate, lechuga..";
            itemGlobos2.price = 47;
            itemGlobos2.image = "globos2";
            itemGlobos2.place = pGlobos;
            itemGlobos2.save();
            Item itemGlobos3 = new Item();
            itemGlobos3.name = "Pique macho";
            itemGlobos3.detail = "Arroz, Tomate..";
            itemGlobos3.price = 107;
            itemGlobos3.image = "globos3";
            itemGlobos3.place = pGlobos;
            itemGlobos3.save();

            //Bufalo´s Rodizio
            Item itemBufalo1 = new Item();
            itemBufalo1.name = "Bife Chorizo";
            itemBufalo1.detail = "Filetes de pollo..";
            itemBufalo1.price = 68;
            itemBufalo1.image = "br1";
            itemBufalo1.place = pBufalo;
            itemBufalo1.save();
            Item itemBufalo2 = new Item();
            itemBufalo2.name = "Churrasco";
            itemBufalo2.detail = "Tomate, lechuga..";
            itemBufalo2.price = 68;
            itemBufalo2.image = "br2";
            itemBufalo2.place = pBufalo;
            itemBufalo2.save();
            Item itemBufalo3 = new Item();
            itemBufalo3.name = "Trucha";
            itemBufalo3.detail = "Arroz, Tomate..";
            itemBufalo3.price = 68;
            itemBufalo3.image = "br3";
            itemBufalo3.place = pBufalo;
            itemBufalo3.save();

            // Donal
            Item itemDonal1 = new Item();
            itemDonal1.name = "Pique";
            itemDonal1.detail = "Filetes de pollo..";
            itemDonal1.price = 110;
            itemDonal1.image = "donal1";
            itemDonal1.place = pDonal;
            itemDonal1.save();
            Item itemDonal2 = new Item();
            itemDonal2.name = "Hamburguesa";
            itemDonal2.detail = "Tomate, lechuga..";
            itemDonal2.price = 19;
            itemDonal2.image = "donal2";
            itemDonal2.place = pDonal;
            itemDonal2.save();
            Item itemDonal3 = new Item();
            itemDonal3.name = "Silpancho";
            itemDonal3.detail = "Arroz, Tomate..";
            itemDonal3.price = 45;
            itemDonal3.image = "donal3";
            itemDonal3.place = pDonal;
            itemDonal3.save();

            // Kimgdom
            Item itemKingdom1 = new Item();
            itemKingdom1.name = "King Menu";
            itemKingdom1.detail = "Filetes de pollo..";
            itemKingdom1.price = 48;
            itemKingdom1.image = "kingdom1";
            itemKingdom1.place = pKingdom;
            itemKingdom1.save();
            Item itemkingdom2 = new Item();
            itemkingdom2.name = "Qeen Menu";
            itemkingdom2.detail = "Tomate, lechuga..";
            itemkingdom2.price = 30;
            itemkingdom2.image = "kingdom2";
            itemkingdom2.place = pKingdom;
            itemkingdom2.save();
            Item itemKingdom3 = new Item();
            itemKingdom3.name = "Solo Medio";
            itemKingdom3.detail = "Arroz, Tomate..";
            itemKingdom3.price = 38;
            itemKingdom3.image = "kingdom3";
            itemKingdom3.place = pKingdom;
            itemKingdom3.save();

            // Vizzio
            Item itemVizzio1 = new Item();
            itemVizzio1.name = "Pollo a la canasta";
            itemVizzio1.detail = "Filetes de pollo..";
            itemVizzio1.price = 15;
            itemVizzio1.image = "vizzio1";
            itemVizzio1.place = pVizzio;
            itemVizzio1.save();
            Item itemVizzio2 = new Item();
            itemVizzio2.name = "Pollo a la canasta";
            itemVizzio2.detail = "Tomate, lechuga..";
            itemVizzio2.price = 20;
            itemVizzio2.image = "vizzio2";
            itemVizzio2.place = pVizzio;
            itemVizzio2.save();
            Item itemVizzio3 = new Item();
            itemVizzio3.name = "Pollo a la canasta";
            itemVizzio3.detail = "Arroz, Tomate..";
            itemVizzio3.price = 25;
            itemVizzio3.image = "vizzio3";
            itemVizzio3.place = pVizzio;
            itemVizzio3.save();

            // Big Joy
            Item itemBig1 = new Item();
            itemBig1.name = "Buffalo Wings Combo";
            itemBig1.detail = "Filetes de pollo..";
            itemBig1.price = 37;
            itemBig1.image = "bj1";
            itemBig1.place = pBigJoy;
            itemBig1.save();
            Item itemBig2 = new Item();
            itemBig2.name = "Lousiana Chicken Combo";
            itemBig2.detail = "Tomate, lechuga..";
            itemBig2.price = 32;
            itemBig2.image = "bj2";
            itemBig2.place = pBigJoy;
            itemBig2.save();
            Item itemBig3 = new Item();
            itemBig3.name = "Bufalo Wings Box";
            itemBig3.detail = "Arroz, Tomate..";
            itemBig3.price = 89;
            itemBig3.image = "bj3";
            itemBig3.place = pBigJoy;
            itemBig3.save();

            // Tropical Chicken
            Item itemTropical1 = new Item();
            itemTropical1.name = "Mega Combo ";
            itemTropical1.detail = "Filetes de pollo..";
            itemTropical1.price = 42;
            itemTropical1.image = "tc1";
            itemTropical1.place = pTropicalChiken;
            itemTropical1.save();
            Item itemTropical2 = new Item();
            itemTropical2.name = "Mega Combo 2";
            itemTropical2.detail = "Tomate, lechuga..";
            itemTropical2.price = 97;
            itemTropical2.image = "tc2";
            itemTropical2.place = pTropicalChiken;
            itemTropical2.save();
            Item itemTropical3 = new Item();
            itemTropical3.name = "Mega Combo 3";
            itemTropical3.detail = "Arroz, Tomate..";
            itemTropical3.price = 91;
            itemTropical3.image = "tc3";
            itemTropical3.place = pTropicalChiken;
            itemTropical3.save();

            //Wistupiku
            Item itemWistu1 = new Item();
            itemWistu1.name = "Wistus";
            itemWistu1.detail = "Filetes de pollo..";
            itemWistu1.price = 6;
            itemWistu1.image = "wistu1";
            itemWistu1.place = pWistupiku;
            itemWistu1.save();
            Item itemWistu2 = new Item();
            itemWistu2.name = "Tukumanas";
            itemWistu2.detail = "Tomate, lechuga..";
            itemWistu2.price = 6;
            itemWistu2.image = "wistu2";
            itemWistu2.place = pWistupiku;
            itemWistu2.save();
            Item itemWistu3 = new Item();
            itemWistu3.name = "Huminta";
            itemWistu3.detail = "Arroz, Tomate..";
            itemWistu3.price = 8;
            itemWistu3.image = "wistu3";
            itemWistu3.place = pWistupiku;
            itemWistu3.save();

            /*Item  = new Item();
            itemPanchita_1.name = "";
            itemPanchita_1.detail = "Filetes de pollo..";
            itemPanchita_1.price = "";
            itemPanchita_1.image = "panchita_cabiñitas";
            itemPanchita_1.place = ;
            itemPanchita_1.save();
            Item  = new Item();
            itemPanchita_2.name = "";
            itemPanchita_2.detail = "Tomate, lechuga..";
            itemPanchita_2.price = "";
            itemPanchita_2.image = "panchita_burguer";
            itemPanchita_2.place = ;
            itemPanchita_2.save();
            Item  = new Item();
            itemPanchita_3.name = "";
            itemPanchita_3.detail = "Arroz, Tomate..";
            itemPanchita_3.price = "";
            itemPanchita_3.image = "panchita_piernas";
            itemPanchita_3.place = ;
            itemPanchita_3.save();*/

            // Mi Llajta
            Item itemMiLlajta_1 =  new Item();
            itemMiLlajta_1.name = "Polensa";
            itemMiLlajta_1.detail = "Pescados a la plancha";
            itemMiLlajta_1.price = 35;
            itemMiLlajta_1.image = "millajta_ensalada";
            itemMiLlajta_1.place = placeMiLlajta;
            itemMiLlajta_1.save();
            Item itemMiLlajta_2 =  new Item();
            itemMiLlajta_2.name = "Fideos Yayan";
            itemMiLlajta_2.detail = "Fideo con tomates";
            itemMiLlajta_2.price = 25;
            itemMiLlajta_2.image = "millajta_fideos";
            itemMiLlajta_2.place = placeMiLlajta;
            itemMiLlajta_2.save();
            Item itemMiLlajta_3 =  new Item();
            itemMiLlajta_3.name = "Pejerrey";
            itemMiLlajta_3.detail = "Pescado con ensalada";
            itemMiLlajta_3.price = 45;
            itemMiLlajta_3.image = "millajta_pescado";
            itemMiLlajta_3.place = placeMiLlajta;
            itemMiLlajta_3.save();

            // Orange
            Item itemOrange_1 = new Item();
            itemOrange_1.name = "Maldito";
            itemOrange_1.detail = "Super Maldito";
            itemOrange_1.price = 17;
            itemOrange_1.image = "sachawasi_burguer";
            itemOrange_1.place = placeOrange;
            itemOrange_1.save();
            Item itemOrange_2 = new Item();
            itemOrange_2.name = "Churrasco mayor";
            itemOrange_2.detail = "Pacumuto completo";
            itemOrange_2.price = 50;
            itemOrange_2.image = "sachawasi_carne";
            itemOrange_2.place = placeOrange;
            itemOrange_2.save();
            Item itemOrange_3 = new Item();
            itemOrange_3.name = "Plancha";
            itemOrange_3.detail = "Plancha por pareja";
            itemOrange_3.price = 75;
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
       // MultiDex.install(this);
    }

    public List<Place> getListPlaces() {
        return ListPlaces;
    }

    public void setListPlaces(List<Place> listPlaces) {
        ListPlaces = listPlaces;
    }

    public Place getPlaceToShow() {
        return placeToShow;
    }

    public void setPlaceToShow(Place placeToShow) {
        this.placeToShow = placeToShow;
    }
}
