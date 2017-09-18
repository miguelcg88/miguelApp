package com.miguel.angelcalderon;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.activeandroid.ActiveAndroid;
import com.miguel.angelcalderon.model.Categoria;
import com.miguel.angelcalderon.model.Item;
import com.miguel.angelcalderon.model.Lugar;
import com.miguel.angelcalderon.query.DefaultData;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {

    public static final String STATIC_CLUB = "Boliche";
    public static final String STATIC_RESTAURANT = "Restaurante";
    private List<Lugar> listLugars = new ArrayList<>();
    private Lugar lugarToShow;

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
        

        DefaultData defaultData = new DefaultData();
        System.out.println(defaultData.defaultDatas().size());
        if (defaultData.defaultDatas().size() == 0) {

            /****** Categories: ******/
            Categoria categoriaRestaurant = new Categoria();
            categoriaRestaurant.name = STATIC_RESTAURANT;
            categoriaRestaurant.description = "Rostiserias, Snack, ..";
            categoriaRestaurant.save();

            Categoria categoriaClub = new Categoria();
            categoriaClub.name = STATIC_CLUB;
            categoriaClub.description= "Cafes, Bars, Peñas, ...";
            categoriaClub.save();

            /****** Places: ******/

            // Planchita
            Lugar lugarPanchita = new Lugar();
            lugarPanchita.icon = "panchita_icon";
            lugarPanchita.name = "Panchita";
            lugarPanchita.icon_marker = "panchita_marker";
            lugarPanchita.address = "Av.America y Melchor Urquidi.";
            lugarPanchita.Phone = "4456734";
            lugarPanchita.facebook = "https://www.facebook.com/pollospanchita/";
            lugarPanchita.web = "http://www.panchita.bo";
            lugarPanchita.schedule_day = "Lunes - Domingo";
            lugarPanchita.schedule_hour = "11:00 - 22:00";
            lugarPanchita.categoria = categoriaRestaurant;
            lugarPanchita.latitud = (float) -17.3731327;
            lugarPanchita.longitud = (float) -66.2193803;
            lugarPanchita.save();

            // Burger King
            Lugar pBurgerKing = new Lugar();
            pBurgerKing.icon = "burger_icon";
            pBurgerKing.icon_marker = "cozzolizi_marker";
            pBurgerKing.name = "Burger King";
            pBurgerKing.address = "Av. Ballivián esq. Tte. Arévalo.";
            pBurgerKing.Phone = "4529296";
            pBurgerKing.facebook = "https://www.facebook.com/pg/BurgerKingBolivia/";
            pBurgerKing.web = "http://www.bk.com/international";
            pBurgerKing.schedule_day = "Lunes - Domingo";
            pBurgerKing.schedule_hour = "11:00 - 23:00";
            pBurgerKing.categoria = categoriaRestaurant;
            pBurgerKing.latitud = (float) -17.3834226;
            pBurgerKing.longitud = (float) -66.159746;
            pBurgerKing.save();

            // Yogen Fruz
            Lugar pYogenFruz = new Lugar();
            pYogenFruz.icon = "yogen_icon";
            pYogenFruz.icon_marker = "yogen_marker";
            pYogenFruz.name = "Yogen Fruz";
            pYogenFruz.address = "Av. América esquina Miguel Aguirre.";
            pYogenFruz.Phone = "78302716";
            pYogenFruz.facebook = "https://www.facebook.com/YogenFruzBolivia/";
            pYogenFruz.web = "http://www.yogenfruz.com/";
            pYogenFruz.schedule_day = "Lunes - Domingo";
            pYogenFruz.schedule_hour = "09:00 - 22:00";
            pYogenFruz.categoria = categoriaRestaurant;
            pYogenFruz.latitud = (float) -17.3886089;
            pYogenFruz.longitud = (float) -66.1567601;
            pYogenFruz.save();

            // Dumbo
            Lugar pDumbo= new Lugar();
            pDumbo.icon = "dumbo_icon";
            pDumbo.icon_marker = "dumbo_marker";
            pDumbo.name = "Dumbo";
            pDumbo.address = "Av Heroinas 354";
            pDumbo.Phone = "4501300";
            pDumbo.facebook = "https://www.facebook.com/pages/Heladería-Dumbo/";
            pDumbo.web = "http://www.heladraiadumbo.com";
            pDumbo.schedule_day = "Lunes - Domingo";
            pDumbo.schedule_hour = "07:30 - 23:30";
            pDumbo.categoria = categoriaRestaurant;
            pDumbo.latitud = (float) -17.3922401;
            pDumbo.longitud = (float) -66.1559732;
            pDumbo.save();

            // Globos
            Lugar pGlobos = new Lugar();
            pGlobos.icon = "globos_icon";
            pGlobos.icon_marker = "globos_marker";
            pGlobos.name = "Globos";
            pGlobos.address = "Av José Ballivian (El Prado)";
            pGlobos.Phone = "4520606";
            pGlobos.facebook = "https://www.facebook.com/heladeriaglobos/";
            pGlobos.web = "http://www.heladeriaglobos.com";
            pGlobos.schedule_day = "Lunes - Domingo";
            pGlobos.schedule_hour = "10:00 - 00:00";
            pGlobos.categoria = categoriaRestaurant;
            pGlobos.latitud = (float) -17.3875703;
            pGlobos.longitud = (float) -66.1555943;
            pGlobos.save();

            // Bufalo's Rodizio
            Lugar pBufalo= new Lugar();
            pBufalo.icon = "bufalo_icon";
            pBufalo.icon_marker = "bufalo_marker";
            pBufalo.name = "Bufalo's Rodizio";
            pBufalo.address = "Av Oquendo";
            pBufalo.Phone = "4251597";
            pBufalo.facebook = "https://www.facebook.com/Bufalos-Rodizio-200994336598652/";
            pBufalo.web = "http://www.bufalosrodizio.bo";
            pBufalo.schedule_day = "Lunes - Domingo";
            pBufalo.schedule_hour = "11:00 - 17:00";
            pBufalo.categoria = categoriaRestaurant;
            pBufalo.latitud = (float) -17.3845288;
            pBufalo.longitud = (float) -66.1510388;
            pBufalo.save();

            // Donal
            Lugar pDonal= new Lugar();
            pDonal.icon = "donal_icon";
            pDonal.icon_marker = "donal_marker";
            pDonal.name = "Donal";
            pDonal.address = "Av.Heroinas entre 25 de Mayo y España";
            pDonal.Phone = "4509477";
            pDonal.facebook = "https://www.facebook.com/Donal.FamilyCenter/";
            pDonal.web = "http://www.heladeriadonal.com";
            pDonal.schedule_day = "Lunes - Domingo";
            pDonal.schedule_hour = "10:00 - 23:00";
            pDonal.categoria = categoriaRestaurant;
            pDonal.latitud = (float) -17.3924308;
            pDonal.longitud = (float) -66.1582759;
            pDonal.save();

            // Kingdom
            Lugar pKingdom= new Lugar();
            pKingdom.icon = "kingdom_icon";
            pKingdom.icon_marker = "marker_kingdom";
            pKingdom.name = "Kingdom";
            pKingdom.address = "Av. San Martin, Cochabamba";
            pKingdom.Phone = "4504083";
            pKingdom.facebook = "https://www.facebook.com/Chickens.Kingdom.OFFICIAL/";
            pKingdom.web = "http://www.chickenskingdom.com.bo";
            pKingdom.schedule_day = "Lunes - Domingo";
            pKingdom.schedule_hour = "10:00 - 23:45";
            pKingdom.categoria = categoriaRestaurant;
            pKingdom.latitud = (float) -17.3924308;
            pKingdom.longitud = (float) -66.1573886;
            pKingdom.save();

            // Vizzio
            Lugar pVizzio = new Lugar();
            pVizzio.icon = "vizzio_icon";
            pVizzio.icon_marker = "vizzio_marker";
            pVizzio.name = "Vizzio";
            pVizzio.address = "Av. Tadeo Ahenke esquina pasaje del Mitayo";
            pVizzio.Phone = "4403989";
            pVizzio.facebook = "https://www.facebook.com/pollos.vizzios/";
            pVizzio.web = "http://www.pollosvizzios.bo";
            pVizzio.schedule_day = "Lunes - Sabados";
            pVizzio.schedule_hour = "18:00 - 23:00";
            pVizzio.categoria = categoriaRestaurant;
            pVizzio.latitud = (float) -17.3883543;
            pVizzio.longitud = (float) -66.171899;
            pVizzio.save();

            // Big Joy
            Lugar pBigJoy = new Lugar();
            pBigJoy.icon = "big_icon";
            pBigJoy.icon_marker = "big_marker";
            pBigJoy.name = "Big Joy";
            pBigJoy.address = "Av. Beni 508";
            pBigJoy.Phone = "4799799";
            pBigJoy.facebook = "https://www.facebook.com/Wingsfriescolas/";
            pBigJoy.web = "http://www.bigjoy.com.bo";
            pBigJoy.schedule_day = "Martes - Domingo";
            pBigJoy.schedule_hour = "17:30 - 23:00";
            pBigJoy.categoria = categoriaRestaurant;
            pBigJoy.latitud = (float) -17.3772808;
            pBigJoy.longitud = (float) -66.1544178;
            pBigJoy.save();

            // Tropical Chiken
            Lugar pTropicalChiken = new Lugar();
            pTropicalChiken.icon = "tropical_icon";
            pTropicalChiken.icon_marker = "tropical_marker";
            pTropicalChiken.name = "Tropical Chiken";
            pTropicalChiken.address = "Av. Juan de la Rosa esq. Gabriel René Moreno";
            pTropicalChiken.Phone = "4047000";
            pTropicalChiken.facebook = "https://www.facebook.com/tropicalchicken.BOLIVIA/";
            pTropicalChiken.web = "http://www.tropicalchiken.bo";
            pTropicalChiken.schedule_day = "Lunes - Domingo";
            pTropicalChiken.schedule_hour = "17:30 - 23:00";
            pTropicalChiken.categoria = categoriaRestaurant;
            pTropicalChiken.latitud = (float) -17.3766232;
            pTropicalChiken.longitud = (float) -66.172942;
            pTropicalChiken.save();

            // Wist'upiku
            Lugar pWistupiku = new Lugar();
            pWistupiku.icon = "wistus_icon";
            pWistupiku.icon_marker = "wistus_marker";
            pWistupiku.name = "Wist'upiku";
            pWistupiku.address = "Calle Lanza Nº 619 entre Uruguay y acera este.";
            pWistupiku.Phone = "4257972";
            pWistupiku.facebook = "https://www.facebook.com/wistupiku/";
            pWistupiku.web = "http://www.wistupiku.com";
            pWistupiku.schedule_day = "Lunes - Domingo";
            pWistupiku.schedule_hour = "07:00 - 22:00";
            pWistupiku.categoria = categoriaRestaurant;
            pWistupiku.latitud = (float) -17.397105;
            pWistupiku.longitud = (float) -66.1544767;
            pWistupiku.save();


            /*
            Lugar  = new Lugar();
            lugarPanchita.icon = "panchita_icon";
            lugarPanchita.name = "";
            lugarPanchita.address = "";
            lugarPanchita.Phone = "";
            lugarPanchita.facebook = "";
            lugarPanchita.web = "";
            lugarPanchita.schedule_day = "Lunes - Domingo";
            lugarPanchita.schedule_hour = "";
            lugarPanchita.categoria = categoriaRestaurant;
            lugarPanchita.latitud = (float) -17.;
            lugarPanchita.longitud = (float) -66.;
            lugarPanchita.save();
*/
            // Mi llajta
            Lugar lugarMiLlajta = new Lugar();
            lugarMiLlajta.icon = "millajta_icon";
            lugarMiLlajta.icon_marker = "cozzolizi_marker";
            lugarMiLlajta.name = "Mi Llajta";
            lugarMiLlajta.address = "av. Juan de la Rosa entre c. Picaso y c. Belez";
            lugarMiLlajta.Phone = "4456532";
            lugarMiLlajta.facebook = "https://www.facebook.com/";
            lugarMiLlajta.web = "https://www.millajta.com.bo";
            lugarMiLlajta.schedule_day = "Lunes - Domingo";
            lugarMiLlajta.schedule_hour = "9:00 - 23:00";
            lugarMiLlajta.categoria = categoriaRestaurant;
            lugarMiLlajta.latitud = (float) -17.392623;
            lugarMiLlajta.longitud = (float) -66.158352;
            lugarMiLlajta.save();

            // Orange
            Lugar lugarOrange = new Lugar();
            lugarOrange.icon = "sachawasi_icon";
            lugarOrange.icon_marker = "cozzolizi_marker";
            lugarOrange.name = "Sachawasi";
            lugarOrange.address = "av. Prado entre c. Oruro y c. La Paz";
            lugarOrange.Phone = "4323212";
            lugarOrange.facebook = "https://www.facebook.com/";
            lugarOrange.web = "https://www.sachawasi.com.bo";
            lugarOrange.schedule_day = "Viernes - Sabados - Domingos";
            lugarOrange.schedule_hour = "19:00 - 23:00 pm";
            lugarOrange.activity1 = "Clasicos de los 80s";
            lugarOrange.activity2 = "Cover 50 Bs";
            lugarOrange.activity3 = "Mojitos 2x1 a 30 Bs";
            lugarOrange.categoria = categoriaClub;
            lugarOrange.latitud = (float) -17.392523;
            lugarOrange.longitud = (float) -66.158852;
            lugarOrange.save();

            /****** Items: ******/

            // Panchita
            Item itemPanchita_1 = new Item();
            itemPanchita_1.name = "Panchita";
            itemPanchita_1.detail = "Filetes de pollo..";
            itemPanchita_1.price = 27;
            itemPanchita_1.image = "panchita1";
            itemPanchita_1.lugar = lugarPanchita;
            itemPanchita_1.save();
            Item itemPanchita_2 = new Item();
            itemPanchita_2.name = "Chipollo";
            itemPanchita_2.detail = "Tomate, lechuga..";
            itemPanchita_2.price = 20;
            itemPanchita_2.image = "panchita2";
            itemPanchita_2.lugar = lugarPanchita;
            itemPanchita_2.save();
            Item itemPanchita_3 = new Item();
            itemPanchita_3.name = "Silpancho";
            itemPanchita_3.detail = "Arroz, Tomate..";
            itemPanchita_3.price = 20;
            itemPanchita_3.image = "panchita3";
            itemPanchita_3.lugar = lugarPanchita;
            itemPanchita_3.save();

            // Burger King
            Item itemBurger1 = new Item();
            itemBurger1.name = "Whopper";
            itemBurger1.detail = "Filetes de pollo..";
            itemBurger1.price = 15;
            itemBurger1.image = "bk1";
            itemBurger1.lugar = pBurgerKing;
            itemBurger1.save();
            Item itemBurger2 = new Item();
            itemBurger2.name = "Big King";
            itemBurger2.detail = "Tomate, lechuga..";
            itemBurger2.price = 23;
            itemBurger2.image = "bk2";
            itemBurger2.lugar = pBurgerKing;
            itemBurger2.save();
            Item itemBurger3 = new Item();
            itemBurger3.name = "Nuggets";
            itemBurger3.detail = "Arroz, Tomate..";
            itemBurger3.price = 17;
            itemBurger3.image = "bk3";
            itemBurger3.lugar = pBurgerKing;
            itemBurger3.save();

            // Yogen Fruz
            Item itemYogen1 = new Item();
            itemYogen1.name = "Smoothies";
            itemYogen1.detail = "Filetes de pollo..";
            itemYogen1.price = 13;
            itemYogen1.image = "yf1";
            itemYogen1.lugar = pYogenFruz;
            itemYogen1.save();
            Item itemYogen2 = new Item();
            itemYogen2.name = "Nu Mix";
            itemYogen2.detail = "Tomate, lechuga..";
            itemYogen2.price = 11;
            itemYogen2.image = "yf2";
            itemYogen2.lugar = pYogenFruz;
            itemYogen2.save();
            Item itemYogen3 = new Item();
            itemYogen3.name = "Helado y fruta";
            itemYogen3.detail = "Arroz, Tomate..";
            itemYogen3.price = 11;
            itemYogen3.image = "yf3";
            itemYogen3.lugar = pYogenFruz;
            itemYogen3.save();

            // Dumbo
            Item itemDumbo1 = new Item();
            itemDumbo1.name = "Pique";
            itemDumbo1.detail = "Filetes de pollo..";
            itemDumbo1.price = 120;
            itemDumbo1.image = "dumbo1";
            itemDumbo1.lugar = pDumbo;
            itemDumbo1.save();
            Item itemDumbo2 = new Item();
            itemDumbo2.name = "Lomo Salteado";
            itemDumbo2.detail = "Tomate, lechuga..";
            itemDumbo2.price = 80;
            itemDumbo2.image = "dumbo2";
            itemDumbo2.lugar = pDumbo;
            itemDumbo2.save();
            Item itemDumbo3 = new Item();
            itemDumbo3.name = "Hamburguesa";
            itemDumbo3.detail = "Arroz, Tomate..";
            itemDumbo3.price = 21;
            itemDumbo3.image = "dumbo3";
            itemDumbo3.lugar = pDumbo;
            itemDumbo3.save();

            //Globos
            Item itemGlobos1 = new Item();
            itemGlobos1.name = "Pollo a la canasta";
            itemGlobos1.detail = "Filetes de pollo..";
            itemGlobos1.price = 32;
            itemGlobos1.image = "globos1";
            itemGlobos1.lugar = pGlobos;
            itemGlobos1.save();
            Item itemGlobos2 = new Item();
            itemGlobos2.name = "Silpancho";
            itemGlobos2.detail = "Tomate, lechuga..";
            itemGlobos2.price = 47;
            itemGlobos2.image = "globos2";
            itemGlobos2.lugar = pGlobos;
            itemGlobos2.save();
            Item itemGlobos3 = new Item();
            itemGlobos3.name = "Pique macho";
            itemGlobos3.detail = "Arroz, Tomate..";
            itemGlobos3.price = 107;
            itemGlobos3.image = "globos3";
            itemGlobos3.lugar = pGlobos;
            itemGlobos3.save();

            //Bufalo´s Rodizio
            Item itemBufalo1 = new Item();
            itemBufalo1.name = "Bife Chorizo";
            itemBufalo1.detail = "Filetes de pollo..";
            itemBufalo1.price = 68;
            itemBufalo1.image = "br1";
            itemBufalo1.lugar = pBufalo;
            itemBufalo1.save();
            Item itemBufalo2 = new Item();
            itemBufalo2.name = "Churrasco";
            itemBufalo2.detail = "Tomate, lechuga..";
            itemBufalo2.price = 68;
            itemBufalo2.image = "br2";
            itemBufalo2.lugar = pBufalo;
            itemBufalo2.save();
            Item itemBufalo3 = new Item();
            itemBufalo3.name = "Trucha";
            itemBufalo3.detail = "Arroz, Tomate..";
            itemBufalo3.price = 68;
            itemBufalo3.image = "br3";
            itemBufalo3.lugar = pBufalo;
            itemBufalo3.save();

            // Donal
            Item itemDonal1 = new Item();
            itemDonal1.name = "Pique";
            itemDonal1.detail = "Filetes de pollo..";
            itemDonal1.price = 110;
            itemDonal1.image = "donal1";
            itemDonal1.lugar = pDonal;
            itemDonal1.save();
            Item itemDonal2 = new Item();
            itemDonal2.name = "Hamburguesa";
            itemDonal2.detail = "Tomate, lechuga..";
            itemDonal2.price = 19;
            itemDonal2.image = "donal2";
            itemDonal2.lugar = pDonal;
            itemDonal2.save();
            Item itemDonal3 = new Item();
            itemDonal3.name = "Silpancho";
            itemDonal3.detail = "Arroz, Tomate..";
            itemDonal3.price = 45;
            itemDonal3.image = "donal3";
            itemDonal3.lugar = pDonal;
            itemDonal3.save();

            // Kimgdom
            Item itemKingdom1 = new Item();
            itemKingdom1.name = "King Menu";
            itemKingdom1.detail = "Filetes de pollo..";
            itemKingdom1.price = 48;
            itemKingdom1.image = "kingdom1";
            itemKingdom1.lugar = pKingdom;
            itemKingdom1.save();
            Item itemkingdom2 = new Item();
            itemkingdom2.name = "Qeen Menu";
            itemkingdom2.detail = "Tomate, lechuga..";
            itemkingdom2.price = 30;
            itemkingdom2.image = "kingdom2";
            itemkingdom2.lugar = pKingdom;
            itemkingdom2.save();
            Item itemKingdom3 = new Item();
            itemKingdom3.name = "Solo Medio";
            itemKingdom3.detail = "Arroz, Tomate..";
            itemKingdom3.price = 38;
            itemKingdom3.image = "kingdom3";
            itemKingdom3.lugar = pKingdom;
            itemKingdom3.save();

            // Vizzio
            Item itemVizzio1 = new Item();
            itemVizzio1.name = "Pollo a la canasta";
            itemVizzio1.detail = "Filetes de pollo..";
            itemVizzio1.price = 15;
            itemVizzio1.image = "vizzio1";
            itemVizzio1.lugar = pVizzio;
            itemVizzio1.save();
            Item itemVizzio2 = new Item();
            itemVizzio2.name = "Pollo a la canasta";
            itemVizzio2.detail = "Tomate, lechuga..";
            itemVizzio2.price = 20;
            itemVizzio2.image = "vizzio2";
            itemVizzio2.lugar = pVizzio;
            itemVizzio2.save();
            Item itemVizzio3 = new Item();
            itemVizzio3.name = "Pollo a la canasta";
            itemVizzio3.detail = "Arroz, Tomate..";
            itemVizzio3.price = 25;
            itemVizzio3.image = "vizzio3";
            itemVizzio3.lugar = pVizzio;
            itemVizzio3.save();

            // Big Joy
            Item itemBig1 = new Item();
            itemBig1.name = "Buffalo Wings Combo";
            itemBig1.detail = "Filetes de pollo..";
            itemBig1.price = 37;
            itemBig1.image = "bj1";
            itemBig1.lugar = pBigJoy;
            itemBig1.save();
            Item itemBig2 = new Item();
            itemBig2.name = "Lousiana Chicken Combo";
            itemBig2.detail = "Tomate, lechuga..";
            itemBig2.price = 32;
            itemBig2.image = "bj2";
            itemBig2.lugar = pBigJoy;
            itemBig2.save();
            Item itemBig3 = new Item();
            itemBig3.name = "Bufalo Wings Box";
            itemBig3.detail = "Arroz, Tomate..";
            itemBig3.price = 89;
            itemBig3.image = "bj3";
            itemBig3.lugar = pBigJoy;
            itemBig3.save();

            // Tropical Chicken
            Item itemTropical1 = new Item();
            itemTropical1.name = "Mega Combo ";
            itemTropical1.detail = "Filetes de pollo..";
            itemTropical1.price = 42;
            itemTropical1.image = "tc1";
            itemTropical1.lugar = pTropicalChiken;
            itemTropical1.save();
            Item itemTropical2 = new Item();
            itemTropical2.name = "Mega Combo 2";
            itemTropical2.detail = "Tomate, lechuga..";
            itemTropical2.price = 97;
            itemTropical2.image = "tc2";
            itemTropical2.lugar = pTropicalChiken;
            itemTropical2.save();
            Item itemTropical3 = new Item();
            itemTropical3.name = "Mega Combo 3";
            itemTropical3.detail = "Arroz, Tomate..";
            itemTropical3.price = 91;
            itemTropical3.image = "tc3";
            itemTropical3.lugar = pTropicalChiken;
            itemTropical3.save();

            //Wistupiku
            Item itemWistu1 = new Item();
            itemWistu1.name = "Wistus";
            itemWistu1.detail = "Filetes de pollo..";
            itemWistu1.price = 6;
            itemWistu1.image = "wistu1";
            itemWistu1.lugar = pWistupiku;
            itemWistu1.save();
            Item itemWistu2 = new Item();
            itemWistu2.name = "Tukumanas";
            itemWistu2.detail = "Tomate, lechuga..";
            itemWistu2.price = 6;
            itemWistu2.image = "wistu2";
            itemWistu2.lugar = pWistupiku;
            itemWistu2.save();
            Item itemWistu3 = new Item();
            itemWistu3.name = "Huminta";
            itemWistu3.detail = "Arroz, Tomate..";
            itemWistu3.price = 8;
            itemWistu3.image = "wistu3";
            itemWistu3.lugar = pWistupiku;
            itemWistu3.save();

            /*Item  = new Item();
            itemPanchita_1.name = "";
            itemPanchita_1.detail = "Filetes de pollo..";
            itemPanchita_1.price = "";
            itemPanchita_1.image = "panchita_cabiñitas";
            itemPanchita_1.lugar = ;
            itemPanchita_1.save();
            Item  = new Item();
            itemPanchita_2.name = "";
            itemPanchita_2.detail = "Tomate, lechuga..";
            itemPanchita_2.price = "";
            itemPanchita_2.image = "panchita_burguer";
            itemPanchita_2.lugar = ;
            itemPanchita_2.save();
            Item  = new Item();
            itemPanchita_3.name = "";
            itemPanchita_3.detail = "Arroz, Tomate..";
            itemPanchita_3.price = "";
            itemPanchita_3.image = "panchita_piernas";
            itemPanchita_3.lugar = ;
            itemPanchita_3.save();*/

            // Mi Llajta
            Item itemMiLlajta_1 =  new Item();
            itemMiLlajta_1.name = "Polensa";
            itemMiLlajta_1.detail = "Pescados a la plancha";
            itemMiLlajta_1.price = 35;
            itemMiLlajta_1.image = "millajta_ensalada";
            itemMiLlajta_1.lugar = lugarMiLlajta;
            itemMiLlajta_1.save();
            Item itemMiLlajta_2 =  new Item();
            itemMiLlajta_2.name = "Fideos Yayan";
            itemMiLlajta_2.detail = "Fideo con tomates";
            itemMiLlajta_2.price = 25;
            itemMiLlajta_2.image = "millajta_fideos";
            itemMiLlajta_2.lugar = lugarMiLlajta;
            itemMiLlajta_2.save();
            Item itemMiLlajta_3 =  new Item();
            itemMiLlajta_3.name = "Pejerrey";
            itemMiLlajta_3.detail = "Pescado con ensalada";
            itemMiLlajta_3.price = 45;
            itemMiLlajta_3.image = "millajta_pescado";
            itemMiLlajta_3.lugar = lugarMiLlajta;
            itemMiLlajta_3.save();

            // Orange
            Item itemOrange_1 = new Item();
            itemOrange_1.name = "Maldito";
            itemOrange_1.detail = "Super Maldito";
            itemOrange_1.price = 17;
            itemOrange_1.image = "sachawasi_burguer";
            itemOrange_1.lugar = lugarOrange;
            itemOrange_1.save();
            Item itemOrange_2 = new Item();
            itemOrange_2.name = "Churrasco mayor";
            itemOrange_2.detail = "Pacumuto completo";
            itemOrange_2.price = 50;
            itemOrange_2.image = "sachawasi_carne";
            itemOrange_2.lugar = lugarOrange;
            itemOrange_2.save();
            Item itemOrange_3 = new Item();
            itemOrange_3.name = "Plancha";
            itemOrange_3.detail = "Plancha por pareja";
            itemOrange_3.price = 75;
            itemOrange_3.image = "sachawasi_planchita";
            itemOrange_3.lugar = lugarOrange;
            itemOrange_3.save();


            /*Query query = new Query();
            System.out.println(query.getAllPlace(categoriaRestaurant));

            ArrayList<Lugar> lugarArrayList = new ArrayList<>();
            lugarArrayList = (ArrayList<Lugar>) query.getAllPlace(categoriaRestaurant);
            for (Lugar lugar: lugarArrayList){
                System.out.println(lugar.name);
            }
            System.out.println(lugarArrayList.size());*/

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

    public List<Lugar> getListLugars() {
        return listLugars;
    }

    public void setListLugars(List<Lugar> listLugars) {
        this.listLugars = listLugars;
    }

    public Lugar getLugarToShow() {
        return lugarToShow;
    }

    public void setLugarToShow(Lugar lugarToShow) {
        this.lugarToShow = lugarToShow;
    }
}
