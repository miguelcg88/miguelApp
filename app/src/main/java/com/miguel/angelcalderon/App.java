package com.miguel.angelcalderon;

import android.app.Application;
import android.content.Context;
import android.support.annotation.Nullable;
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


            /****************************RESTAURANTES*******************************/


            //Pollos Villa Chicken sabor Peruano
            Lugar lugarVilla = new Lugar();
            lugarVilla.icon = "villa_icon";
            lugarVilla.name = "Pollos Villa Chicken sabor Peruano";
            lugarVilla.icon_marker = "villa_marker";
            lugarVilla.address = "Av. America esquina Gabriel Rene Moreno";
            lugarVilla.Phone = "4443598";
            lugarVilla.facebook = "https://www.facebook.com/pg/pollosalabrasavillachicken";
            lugarVilla.web = "http://www.ponseventos.com";
            lugarVilla.schedule_day = "Lunes - Domingo";
            lugarVilla.schedule_hour = "11:30 - 22:00";
            lugarVilla.categoria = categoriaRestaurant;
            lugarVilla.latitud = (float) -17.3718301;
            lugarVilla.longitud = (float) -66.1743589 ;
            lugarVilla.save();

            //Kingdom Vilarroel
            Lugar lugarKingdomV = new Lugar();
            lugarKingdomV.icon = "kingdom_icon";
            lugarKingdomV.name = "Kingdom Villarroel";
            lugarKingdomV.icon_marker = "kingdom_marker";
            lugarKingdomV.address = "Av Gualberto Villarroel casi Aniceto Padilla";
            lugarKingdomV.Phone = "4200780";
            lugarKingdomV.facebook = "https://www.facebook.com/Chickens.Kingdom.OFFICIAL/";
            lugarKingdomV.web = "http://www.chickenskingdom.com.bo/";
            lugarKingdomV.schedule_day = "Lunes - Domingo";
            lugarKingdomV.schedule_hour = "11:00 - 22:00";
            lugarKingdomV.categoria = categoriaRestaurant;
            lugarKingdomV.latitud = (float) -17.3738368;
            lugarKingdomV.longitud = (float)-66.1581612;
            lugarKingdomV.save();

            //Kingdom San Martin
            Lugar lugarKingdomS = new Lugar();
            lugarKingdomS.icon = "kingdom_icon";
            lugarKingdomS.name = "Kingdom San Martin";
            lugarKingdomS.icon_marker = "kingdom_marker";
            lugarKingdomS.address = "Av.San Martin casi Colombia";
            lugarKingdomS.Phone = "4200780";
            lugarKingdomS.facebook = "https://www.facebook.com/Chickens.Kingdom.OFFICIAL/";
            lugarKingdomS.web = "http://www.chickenskingdom.com.bo/";
            lugarKingdomS.schedule_day = "Lunes - Domingo";
            lugarKingdomS.schedule_hour = "11:00 - 22:00";
            lugarKingdomS.categoria = categoriaRestaurant;
            lugarKingdomS.latitud = (float) -17.3794189;
            lugarKingdomS.longitud = (float)-66.1690665;
            lugarKingdomS.save();

            //What's Up
            Lugar lugarWhatsup = new Lugar();
            lugarWhatsup.icon = "whatsup_icon";
            lugarWhatsup.name = "What's Up";
            lugarWhatsup.icon_marker = "whatsup_marker";
            lugarWhatsup.address = "Av. America esquina Intiraymi";
            lugarWhatsup.Phone = "4422729";
            lugarWhatsup.facebook = "https://www.facebook.com/whatsupchickenwings/";
            lugarWhatsup.web = "http://www.whatsup.com.bo/";
            lugarWhatsup.schedule_day = "Lunes - Domingo";
            lugarWhatsup.schedule_hour = "11:00 - 23:00";
            lugarWhatsup.categoria = categoriaRestaurant;
            lugarWhatsup.latitud = (float) -17.3699683 ;
            lugarWhatsup.longitud = (float) -66.1756936 ;
            lugarWhatsup.save();

            //Palacio del Sillpancho
            Lugar lugarPalacio = new Lugar();
            lugarPalacio.icon = "palacio_icon";
            lugarPalacio.name = "Palacio del Sillpancho";
            lugarPalacio.icon_marker = "palacio_marker";
            lugarPalacio.address = "Av. America y Runasimi";
            lugarPalacio.Phone = "4420784";
            lugarPalacio.facebook = "https://www.facebook.com/ponseventos/";
            lugarPalacio.web = "http://www.ponseventos.com";
            lugarPalacio.schedule_day = "Lunes - Domingo";
            lugarPalacio.schedule_hour = "11:00 - 22:00";
            lugarPalacio.categoria = categoriaRestaurant;
            lugarPalacio.latitud = (float) -17.3715387;
            lugarPalacio.longitud = (float) -66.1748033 ;
            lugarPalacio.save();

            //Pollos Super Tasty
            Lugar lugarTasty = new Lugar();
            lugarTasty.icon = "tasty_icon";
            lugarTasty.name = "Pollos Super Tasty";
            lugarTasty.icon_marker = "tasty_marker";
            lugarTasty.address = "Av. America esquina Illapa";
            lugarTasty.Phone = "4432308";
            lugarTasty.facebook = "https://www.facebook.com/ponseventos/";
            lugarTasty.web =  "http://www.ponseventos.com";
            lugarTasty.schedule_day = "Lunes - Domingo";
            lugarTasty.schedule_hour = "11:00 - 22:00";
            lugarTasty.categoria = categoriaRestaurant;
            lugarTasty.latitud = (float) -17.3715864;
            lugarTasty.longitud = (float) -66.1742712 ;
            lugarTasty.save();

            //Pollos Lucho America
            Lugar lugarLucho = new Lugar();
            lugarLucho.icon = "lucho_icon";
            lugarLucho.name = "Pollos Lucho America";
            lugarLucho.icon_marker = "lucho_marker";
            lugarLucho.address = "Av. America casi Gabriel Rene Moreno";
            lugarLucho.Phone = "4281745";
            lugarLucho.facebook = "https://www.facebook.com/polloslucholachimba/";
            lugarLucho.web = "http://www.ponseventos.com";
            lugarLucho.schedule_day = "Lunes - Domingo";
            lugarLucho.schedule_hour = "11:00 - 22:00";
            lugarLucho.categoria = categoriaRestaurant;
            lugarLucho.latitud = (float) -17.3717073 ;
            lugarLucho.longitud = (float)-66.1738434 ;
            lugarLucho.save();

            //Castores Pando
            Lugar lugarCastoresPa = new Lugar();
            lugarCastoresPa.icon = "castores_icon";
            lugarCastoresPa.name = "Castores Pando";
            lugarCastoresPa.icon_marker = "castores_marker";
            lugarCastoresPa.address = "Av. America casi Portales";
            lugarCastoresPa.Phone = "4798010";
            lugarCastoresPa.facebook = "https://www.facebook.com/pg/loscastores";
            lugarCastoresPa.web = "http://www.los-castores.com/";
            lugarCastoresPa.schedule_day = "Lunes - Domingo";
            lugarCastoresPa.schedule_hour = "08:00 - 14:00";
            lugarCastoresPa.categoria = categoriaRestaurant;
            lugarCastoresPa.latitud = (float) -17.3757872;
            lugarCastoresPa.longitud = (float)-66.1527591 ;
            lugarCastoresPa.save();

            //Castores Prado
            Lugar lugarCastoresPra = new Lugar();
            lugarCastoresPra.icon = "castores_icon";
            lugarCastoresPra.name = "Castores Prado";
            lugarCastoresPra.icon_marker = "castores_marker";
            lugarCastoresPra.address = "Av.Ballivián esquina Oruro";
            lugarCastoresPra.Phone = "4259585";
            lugarCastoresPra.facebook = "https://www.facebook.com/pg/loscastores";
            lugarCastoresPra.web = "http://www.los-castores.com/";
            lugarCastoresPra.schedule_day = "Lunes - Domingo";
            lugarCastoresPra.schedule_hour = "08:00 - 14:00";
            lugarCastoresPra.categoria = categoriaRestaurant;
            lugarCastoresPra.latitud = (float) -17.3847359;
            lugarCastoresPra.longitud = (float) -66.1578259 ;
            lugarCastoresPra.save();

            //Wistupiku Melchor Pérez
            Lugar lugarWistuMelchor = new Lugar();
            lugarWistuMelchor.icon = "wistu_icon";
            lugarWistuMelchor.name = "Wistupiku Melchor Pérez";
            lugarWistuMelchor.icon_marker = "wistu_marker";
            lugarWistuMelchor.address = "Av. Melchor Perez de Olguin y Quilla";
            lugarWistuMelchor.Phone = "4141991";
            lugarWistuMelchor.facebook = "https://www.facebook.com/wistupiku/";
            lugarWistuMelchor.web = "http://www.wistupiku.com/";
            lugarWistuMelchor.schedule_day = "Lunes a Sabado";
            lugarWistuMelchor.schedule_hour = "08:00 - 19:00";
            lugarWistuMelchor.categoria = categoriaRestaurant;
            lugarWistuMelchor.latitud = (float) -17.3696858;
            lugarWistuMelchor.longitud = (float) -66.176159;
            lugarWistuMelchor.save();

            //Wistupiku Lanza
            Lugar lugarWistuLanza = new Lugar();
            lugarWistuLanza.icon = "wistu_icon";
            lugarWistuLanza.name = "Wistupiku Lanza";
            lugarWistuLanza.icon_marker = "wistu_marker";
            lugarWistuLanza.address = " Lanza #619 entre Uruguay y Ladislao Cabrera";
            lugarWistuLanza.Phone = "4257972";
            lugarWistuLanza.facebook = "https://www.facebook.com/wistupiku/";
            lugarWistuLanza.web = "http://www.wistupiku.com/";
            lugarWistuLanza.schedule_day = "Lunes a Sabado";
            lugarWistuLanza.schedule_hour = "08:00 - 19:00";
            lugarWistuLanza.categoria = categoriaRestaurant;
            lugarWistuLanza.latitud = (float) -17.397105;
            lugarWistuLanza.longitud = (float) -66.1697975;
            lugarWistuLanza.save();

            //Tu Yogur
            Lugar lugarTuYogur = new Lugar();
            lugarTuYogur.icon = "tuyogur_icon";
            lugarTuYogur.name = "Tu Yogur";
            lugarTuYogur.icon_marker = "tuyogur_marker";
            lugarTuYogur.address = "Av. Oquendo entre Heroinas y Colombia";
            lugarTuYogur.Phone = "n/a";
            lugarTuYogur.facebook = "https://www.facebook.com/Tuyogur/";
            lugarTuYogur.web = "http://www.ponseventos.com";
            lugarTuYogur.schedule_day = "Lunes - Sabado";
            lugarTuYogur.schedule_hour = "10:00 - 21:00";
            lugarTuYogur.categoria = categoriaRestaurant;
            lugarTuYogur.latitud = (float) -17.3903734;
            lugarTuYogur.longitud = (float) -66.150501;
            lugarTuYogur.save();

            //Panchita América
            Lugar lugarPanchitaAme = new Lugar();
            lugarPanchitaAme.icon = "panchita_icon";
            lugarPanchitaAme.name = "Panchita América";
            lugarPanchitaAme.icon_marker = "panchita_marker";
            lugarPanchitaAme.address = "Av. América  y  Villarroel #267";
            lugarPanchitaAme.Phone = "4454107";
            lugarPanchitaAme.facebook = "https://www.facebook.com/pollospanchita/";
            lugarPanchitaAme.web = "http://www.ponseventos.com";
            lugarPanchitaAme.schedule_day = "Lunes - Domingo";
            lugarPanchitaAme.schedule_hour = "11:00 - 22:00";
            lugarPanchitaAme.categoria = categoriaRestaurant;
            lugarPanchitaAme.latitud = (float) -17.3723908;
            lugarPanchitaAme.longitud = (float) -66.1640295;
            lugarPanchitaAme.save();

            //Panchita Heroinas
            Lugar lugarPanchitaHer = new Lugar();
            lugarPanchitaHer.icon = "panchita_icon";
            lugarPanchitaHer.name = "Panchita Heroinas";
            lugarPanchitaHer.icon_marker = "panchita_marker";
            lugarPanchitaHer.address = "Av.Heroinas casi Oquendo";
            lugarPanchitaHer.Phone = "4454107";
            lugarPanchitaHer.facebook = "https://www.facebook.com/pollospanchita/";
            lugarPanchitaHer.web = "http://www.ponseventos.com";
            lugarPanchitaHer.schedule_day = "Lunes - Domingo";
            lugarPanchitaHer.schedule_hour = "11:00 - 22:00";
            lugarPanchitaHer.categoria = categoriaRestaurant;
            lugarPanchitaHer.latitud = (float) -17.3921195;
            lugarPanchitaHer.longitud = (float) -66.1504111;
            lugarPanchitaHer.save();


            //Kansas
            Lugar lugarKansas = new Lugar();
            lugarKansas.icon = "kansas_icon";
            lugarKansas.name = "Kansas";
            lugarKansas.icon_marker = "kansas_marker";
            lugarKansas.address = "Calle Trinidad entre C. Pedro Blanco y C. Portales";
            lugarKansas.Phone = "4122727";
            lugarKansas.facebook = "https://www.facebook.com/KansasBolivia/";
            lugarKansas.web = "http://www.ponseventos.com";
            lugarKansas.schedule_day = "Lunes - Domingo";
            lugarKansas.schedule_hour = "12:00-00:00";
            lugarKansas.categoria = categoriaRestaurant;
            lugarKansas.latitud = (float) -17.3758613;
            lugarKansas.longitud = (float) -66.1601022;
            lugarKansas.save();


            //Carta Vieja Pizzeria
            Lugar lugarCartaVieja = new Lugar();
            lugarCartaVieja.icon = "cartavieja_icon";
            lugarCartaVieja.name = "Carta Vieja Pizzeria";
            lugarCartaVieja.icon_marker = "cartavieja_marker";
            lugarCartaVieja.address = "Av.Heroinas casi Oquendo";
            lugarCartaVieja.Phone = "75907680";
            lugarCartaVieja.facebook = "https://www.facebook.com/ponseventos/";
            lugarCartaVieja.web = "http://www.ponseventos.com";
            lugarCartaVieja.schedule_day = "Lunes - Sabado";
            lugarCartaVieja.schedule_hour = "08:30-21:00";
            lugarCartaVieja.categoria = categoriaRestaurant;
            lugarCartaVieja.latitud = (float) -17.3915871;
            lugarCartaVieja.longitud = (float) -66.1510977;
            lugarCartaVieja.save();

            //Donal Heroinas
            Lugar lugarDonalHer = new Lugar();
            lugarDonalHer.icon = "donal_icon";
            lugarDonalHer.name = "Donal Heroinas";
            lugarDonalHer.icon_marker = "donal_marker";
            lugarDonalHer.address = "Pasaje Fidelia Sanchez, Av. Heroínas entre 25 de Mayo y, España";
            lugarDonalHer.Phone = "4509477";
            lugarDonalHer.facebook = "https://www.facebook.com/Donal.FamilyCenter/";
            lugarDonalHer.web = "http://www.ponseventos.com";
            lugarDonalHer.schedule_day = "Lunes - Domingo";
            lugarDonalHer.schedule_hour = "11:00 - 22:00";
            lugarDonalHer.categoria = categoriaRestaurant;
            lugarDonalHer.latitud = (float) -17.3924308;
            lugarDonalHer.longitud = (float) -66.1582813;
            lugarDonalHer.save();

            //Bufalo's Rodizio
            Lugar lugarBufalo = new Lugar();
            lugarBufalo.icon = "rodizio_icon";
            lugarBufalo.name = "Bufalo's Rodizio";
            lugarBufalo.icon_marker = "rodizio_marker";
            lugarBufalo.address = "Torres Soffer, Av Oquendo";
            lugarBufalo.Phone = "4251597";
            lugarBufalo.facebook = "https://www.facebook.com/Bufalos-Rodizio-200994336598652/";
            lugarBufalo.web = "http://www.ponseventos.com";
            lugarBufalo.schedule_day = "Martes - Domingo";
            lugarBufalo.schedule_hour = "12:00-15:00   19:00-22:30";
            lugarBufalo.categoria = categoriaRestaurant;
            lugarBufalo.latitud = (float) -17.3845581;
            lugarBufalo.longitud = (float) -66.7112636;
            lugarBufalo.save();


            //La Playa Cevicheria
            Lugar lugarPlaya = new Lugar();
            lugarPlaya.icon = "laplaya_icon";
            lugarPlaya.name = "La Playa Cevicheria";
            lugarPlaya.icon_marker = "laplaya_marker";
            lugarPlaya.address = "Peru y Pzje Vicuna #1438";
            lugarPlaya.Phone = "4245189";
            lugarPlaya.facebook = "https://www.facebook.com/LaPlayaCevicheria";
            lugarPlaya.web = "http://www.ponseventos.com";
            lugarPlaya.schedule_day = "Lunes - Domingo";
            lugarPlaya.schedule_hour = "09:30-15:30";
            lugarPlaya.categoria = categoriaRestaurant;
            lugarPlaya.latitud = (float) -17.3889812;
            lugarPlaya.longitud = (float) -66.169157;
            lugarPlaya.save();




            // Chifa China
            Lugar lugarChifaChina = new Lugar();
            lugarChifaChina.icon = "chifa_pando_icon";
            lugarChifaChina.name = "Chifa China";
            lugarChifaChina.icon_marker = "chifa_pando_marker";
            lugarChifaChina.address = "Av Pando 1329";
            lugarChifaChina.Phone = "4487577";
            lugarChifaChina.facebook = "https://www.facebook.com/pages/Chifa-China";
            lugarChifaChina.web = "http://www.ponseventos.com";
            lugarChifaChina.schedule_day = "Lunes a Domingo";
            lugarChifaChina.schedule_hour = "15:00 - 23:00";
            lugarChifaChina.categoria = categoriaRestaurant;
            lugarChifaChina.latitud = (float) -17.3749522;
            lugarChifaChina.longitud = (float) -66.1513687;
            lugarChifaChina.save();


            // Pollos Chriss
            Lugar lugarPollosChriss = new Lugar();
            lugarPollosChriss.icon = "pollos_chriss_icon";
            lugarPollosChriss.name = "Pollos Chriss";
            lugarPollosChriss.icon_marker = "pollos_chriss_marker";
            lugarPollosChriss.address = "Av Pando";
            lugarPollosChriss.Phone = "77333060";
            lugarPollosChriss.facebook = "https://www.facebook.com/pg/pollochriss";
            lugarPollosChriss.web = "http://www.ponseventos.com";
            lugarPollosChriss.schedule_day = "Lunes a Domingo";
            lugarPollosChriss.schedule_hour = "11:00 - 22:30";
            lugarPollosChriss.categoria = categoriaRestaurant;
            lugarPollosChriss.latitud = (float) -17.3784496;
            lugarPollosChriss.longitud = (float) -66.150945;
            lugarPollosChriss.save();


            // Chifa Lai Lai Diamante
            Lugar lugarChifaLaiLaiDiamante = new Lugar();
            lugarChifaLaiLaiDiamante.icon = "chifa_lailai_icon";
            lugarChifaLaiLaiDiamante.name = "Chifa Lai Lai Diamante";
            lugarChifaLaiLaiDiamante.icon_marker = "chifa_lailai_marker";
            lugarChifaLaiLaiDiamante.address = "Boulevard de la Recoleta";
            lugarChifaLaiLaiDiamante.Phone = "4240469";
            lugarChifaLaiLaiDiamante.facebook = "https://www.facebook.com/chifalailaidiamante/";
            lugarChifaLaiLaiDiamante.web = "http://www.ponseventos.com";
            lugarChifaLaiLaiDiamante.schedule_day = "Lunes a Domingo";
            lugarChifaLaiLaiDiamante.schedule_hour = "11:00 - 15:00, 18:00 - 23:30";
            lugarChifaLaiLaiDiamante.categoria = categoriaRestaurant;
            lugarChifaLaiLaiDiamante.latitud = (float) -17.3784496;
            lugarChifaLaiLaiDiamante.longitud = (float) -66.1520261;
            lugarChifaLaiLaiDiamante.save();


            // Casa de Campo
            Lugar lugarCasaDeCampo = new Lugar();
            lugarCasaDeCampo.icon = "casadecampo_icon";
            lugarCasaDeCampo.name = "Casa de Campo";
            lugarCasaDeCampo.icon_marker = "casadecampo_marker";
            lugarCasaDeCampo.address = "Pasaje Boulevard #618";
            lugarCasaDeCampo.Phone = "4243937";
            lugarCasaDeCampo.facebook = "https://www.facebook.com/CasadeCampoBolivia/";
            lugarCasaDeCampo.web = "http://www.ponseventos.com";
            lugarCasaDeCampo.schedule_day = "Lunes a Domingo";
            lugarCasaDeCampo.schedule_hour = "12:00 - 00:00";
            lugarCasaDeCampo.categoria = categoriaRestaurant;
            lugarCasaDeCampo.latitud = (float) -17.3784825;
            lugarCasaDeCampo.longitud = (float) -66.1517878;
            lugarCasaDeCampo.save();


            // La Estancia
            Lugar lugarLaEstancia = new Lugar();
            lugarLaEstancia.icon = "la_estancia_icon";
            lugarLaEstancia.name = "La Estancia";
            lugarLaEstancia.icon_marker = "la_estancia_marker";
            lugarLaEstancia.address = "Av Uyuni";
            lugarLaEstancia.Phone = "4249262";
            lugarLaEstancia.facebook = "https://www.facebook.com/LaEstanciaBolivia/";
            lugarLaEstancia.web = "http://www.ponseventos.com";
            lugarLaEstancia.schedule_day = "Lunes a Domingo";
            lugarLaEstancia.schedule_hour = "12:00 - 15:30, 18:30 - 00";
            lugarLaEstancia.categoria = categoriaRestaurant;
            lugarLaEstancia.latitud = (float) -17.3784892;
            lugarLaEstancia.longitud = (float) -66.1520313;
            lugarLaEstancia.save();


            // Malcriada del buen gusto
            Lugar lugarMalcriada = new Lugar();
            lugarMalcriada.icon = "malcriada_icon";
            lugarMalcriada.name = "Malcriada del buen gusto";
            lugarMalcriada.icon_marker = "malcriada_marker";
            lugarMalcriada.address = "Av. Uyuni esqui. Melchor Urquidi";
            lugarMalcriada.Phone = "4297046";
            lugarMalcriada.facebook = "https://www.facebook.com/pizzamalcriadadelbuengusto/";
            lugarMalcriada.web = "http://www.ponseventos.com";
            lugarMalcriada.schedule_day = "Lunes a Domingo (excepto Martes)";
            lugarMalcriada.schedule_hour = "18:15 - 22:30";
            lugarMalcriada.categoria = categoriaRestaurant;
            lugarMalcriada.latitud = (float) -17.3783929;
            lugarMalcriada.longitud = (float) -66.1495624;
            lugarMalcriada.save();


            // Pollos Santa Lucía
            Lugar lugarSantaLucia = new Lugar();
            lugarSantaLucia.icon = "pollos_santalucia_icon";
            lugarSantaLucia.name = "Pollos Santa Lucía";
            lugarSantaLucia.icon_marker = "pollos_santalucia_marker";
            lugarSantaLucia.address = "Aniceto Padilla #360";
            lugarSantaLucia.Phone = "4798444";
            lugarSantaLucia.facebook = "https://www.facebook.com/PollosSantaLucia/";
            lugarSantaLucia.web = "http://www.ponseventos.com";
            lugarSantaLucia.schedule_day = "Lunes a Domingo";
            lugarSantaLucia.schedule_hour = "11:00 - 22:00";
            lugarSantaLucia.categoria = categoriaRestaurant;
            lugarSantaLucia.latitud = (float) -17.3782203;
            lugarSantaLucia.longitud = (float) -66.1568458;
            lugarSantaLucia.save();


            // Carniclub
            Lugar lugarCarniClub = new Lugar();
            lugarCarniClub.icon = "carniclub_icon";
            lugarCarniClub.name = "Carni Club";
            lugarCarniClub.icon_marker = "carniclub_marker";
            lugarCarniClub.address = "Aniceto Padilla #339";
            lugarCarniClub.Phone = "4036494";
            lugarCarniClub.facebook = "https://www.facebook.com/carniclub/";
            lugarCarniClub.web = "http://www.ponseventos.com";
            lugarCarniClub.schedule_day = "Lunes a Domingo";
            lugarCarniClub.schedule_hour = "17:00 - 22:30";
            lugarCarniClub.categoria = categoriaRestaurant;
            lugarCarniClub.latitud = (float) -17.3781037;
            lugarCarniClub.longitud = (float) -66.1583556;
            lugarCarniClub.save();


            // BROS
            Lugar lugarBros = new Lugar();
            lugarBros.icon = "bros_icon";
            lugarBros.name = "BROS";
            lugarBros.icon_marker = "bros_marker";
            lugarBros.address = "Av Santa Cruz #1142";
            lugarBros.Phone = "4424024";
            lugarBros.facebook = "https://www.facebook.com/broscluboficial/";
            lugarBros.web = "http://www.ponseventos.com";
            lugarBros.schedule_day = "Lunes a Domingo";
            lugarBros.schedule_hour = "12:00 - 23:30";
            lugarBros.categoria = categoriaRestaurant;
            lugarBros.latitud = (float) -17.3791719;
            lugarBros.longitud = (float) -66.1571165;
            lugarBros.save();


            // Miraflores Restaurant
            Lugar lugarMiraflores = new Lugar();
            lugarMiraflores.icon = "miraflores_icon";
            lugarMiraflores.name = "Miraflores Restaurant";
            lugarMiraflores.icon_marker = "miraflores_marker";
            lugarMiraflores.address = "Av. Tarija";
            lugarMiraflores.Phone = "4243708";
            lugarMiraflores.facebook = "https://www.facebook.com/mirafloresrestaurantoriginal/";
            lugarMiraflores.web = "http://www.ponseventos.com";
            lugarMiraflores.schedule_day = "Jueves a Domingo";
            lugarMiraflores.schedule_hour = "12:00 - 22:00";
            lugarMiraflores.categoria = categoriaRestaurant;
            lugarMiraflores.latitud = (float) -17.3764278;
            lugarMiraflores.longitud = (float) -66.1624916;
            lugarMiraflores.save();


            // Pollos El Choco Estadium
            Lugar lugarElChoco = new Lugar();
            lugarElChoco.icon = "choco_icon";
            lugarElChoco.name = "Pollos El Choco Estadium";
            lugarElChoco.icon_marker = "choco_marker";
            lugarElChoco.address = "Jose Quintin 1317";
            lugarElChoco.Phone = "4241522";
            lugarElChoco.facebook = "https://www.facebook.com/elchocoportales/";
            lugarElChoco.web = "http://www.ponseventos.com";
            lugarElChoco.schedule_day = "Lunes a Domingo";
            lugarElChoco.schedule_hour = "11:30 - 15:00, 18:00 - 23:00";
            lugarElChoco.categoria = categoriaRestaurant;
            lugarElChoco.latitud = (float) -17.3780604;
            lugarElChoco.longitud = (float) -66.1656743;
            lugarElChoco.save();


            // Pizzería Napoli's
            Lugar lugarNapolis = new Lugar();
            lugarNapolis.icon = "napolis_icon";
            lugarNapolis.name = "Pizzería Napoli's";
            lugarNapolis.icon_marker = "napolis_marker";
            lugarNapolis.address = "Heroinas N°630 Esquina Antezana";
            lugarNapolis.Phone = "4660230";
            lugarNapolis.facebook = "https://www.facebook.com/PizzeriaNapolis/";
            lugarNapolis.web = "http://www.ponseventos.com";
            lugarNapolis.schedule_day = "Lunes a Domingo";
            lugarNapolis.schedule_hour = "16:00 - 00:00";
            lugarNapolis.categoria = categoriaRestaurant;
            lugarNapolis.latitud = (float) -17.3914278;
            lugarNapolis.longitud = (float) -66.152955;
            lugarNapolis.save();


            // Bunker Grill & Bar
            Lugar lugarBunker = new Lugar();
            lugarBunker.icon = "bunker_icon";
            lugarBunker.name = "Bunker Grill & Bar";
            lugarBunker.icon_marker = "bunker_marker";
            lugarBunker.address = "Av Juan de La Rosa y Daniel Albornos #842";
            lugarBunker.Phone = "77980087";
            lugarBunker.facebook = "https://www.facebook.com/BunkerGrillBar/";
            lugarBunker.web = "http://www.ponseventos.com";
            lugarBunker.schedule_day = "Lunes a Domingo";
            lugarBunker.schedule_hour = "12:00 - 15:00, 19:00 - 0:00";
            lugarBunker.categoria = categoriaRestaurant;
            lugarBunker.latitud = (float) -17.3768398;
            lugarBunker.longitud = (float) -66.171638;
            lugarBunker.save();


            // La Chingada
            Lugar lugarChingada = new Lugar();
            lugarChingada.icon = "chingada_icon";
            lugarChingada.name = "La Chingada";
            lugarChingada.icon_marker = "chingada_marker";
            lugarChingada.address = "Calle José Quintin Mendoza #1489";
            lugarChingada.Phone = "4486086";
            lugarChingada.facebook = "https://www.facebook.com/LaChingadaBolivia/";
            lugarChingada.web = "https://lachingadatexmex.com/";
            lugarChingada.schedule_day = "Lunes a Domingo";
            lugarChingada.schedule_hour = "18:00 - 02:00";
            lugarChingada.categoria = categoriaRestaurant;
            lugarChingada.latitud = (float) -17.3759649;
            lugarChingada.longitud = (float) -66.165894;
            lugarChingada.save();


            // Vizzio's
            Lugar lugarVizzios = new Lugar();
            lugarVizzios.icon = "vizzios_icon";
            lugarVizzios.name = "Vizzio's";
            lugarVizzios.icon_marker = "vizzios_marker";
            lugarVizzios.address = "Mitayo";
            lugarVizzios.Phone = "4403989";
            lugarVizzios.facebook = "https://www.facebook.com/pollos.vizzios/";
            lugarVizzios.web = "http://www.ponseventos.com";
            lugarVizzios.schedule_day = "Lunes a Domingo";
            lugarVizzios.schedule_hour = "18:00 - 23:00";
            lugarVizzios.categoria = categoriaRestaurant;
            lugarVizzios.latitud = (float) -17.386328;
            lugarVizzios.longitud = (float) -66.1667955;
            lugarVizzios.save();


            // Factory Grill & Bar
            Lugar lugarFactory = new Lugar();
            lugarFactory.icon = "factory_icon";
            lugarFactory.name = "Factory Grill & Bar";
            lugarFactory.icon_marker = "factory_marker";
            lugarFactory.address = "Av. M. Urquidi #1274";
            lugarFactory.Phone = "4036256";
            lugarFactory.facebook = "https://www.facebook.com/factorybolivia/";
            lugarFactory.web = "http://www.ponseventos.com";
            lugarFactory.schedule_day = "Lunes a Domingo";
            lugarFactory.schedule_hour = "12:00 - 00:00";
            lugarFactory.categoria = categoriaRestaurant;
            lugarFactory.latitud = (float) -17.3740275;
            lugarFactory.longitud = (float) -66.1532471;
            lugarFactory.save();


            // Burger King
            Lugar lugarBK = new Lugar();
            lugarBK.icon = "bk_icon";
            lugarBK.name = "Burger King";
            lugarBK.icon_marker = "bk_marker";
            lugarBK.address = "Av José Ballivian";
            lugarBK.Phone = "4529296";
            lugarBK.facebook = "https://www.facebook.com/BurgerKingBolivia/";
            lugarBK.web = "http://www.ponseventos.com";
            lugarBK.schedule_day = "Lunes a Domingo";
            lugarBK.schedule_hour = "11:00 - 23:00";
            lugarBK.categoria = categoriaRestaurant;
            lugarBK.latitud = (float) -17.3831343;
            lugarBK.longitud = (float) -66.1598195;
            lugarBK.save();


            // Planet Chicken's
            Lugar lugarPlanetChicken = new Lugar();
            lugarPlanetChicken.icon = "planet_chicken_icon";
            lugarPlanetChicken.name = "Planet Chicken's";
            lugarPlanetChicken.icon_marker = "planet_chicken_marker";
            lugarPlanetChicken.address = "Avenida América # 955";
            lugarPlanetChicken.Phone = "4460896";
            lugarPlanetChicken.facebook = "https://www.facebook.com/planetchickens/";
            lugarPlanetChicken.web = "https://planetchicken.negocio.site/";
            lugarPlanetChicken.schedule_day = "Lunes a Domingo";
            lugarPlanetChicken.schedule_hour = "12:00 – 23:00";
            lugarPlanetChicken.categoria = categoriaRestaurant;
            lugarPlanetChicken.latitud = (float) -17.3731793;
            lugarPlanetChicken.longitud = (float) -66.1497713;
            lugarPlanetChicken.save();


            // Brasa Away
            Lugar lugarBrasaAway = new Lugar();
            lugarBrasaAway.icon = "brasa_away_icon";
            lugarBrasaAway.name = "Brasa Away";
            lugarBrasaAway.icon_marker = "brasa_away_marker";
            lugarBrasaAway.address = "Queru Queru Avenida America 914";
            lugarBrasaAway.Phone = "4580506";
            lugarBrasaAway.facebook = "https://www.facebook.com/brasawaycochabamba/";
            lugarBrasaAway.web = "http://www.brasaaway.com/";
            lugarBrasaAway.schedule_day = "Lunes a Domingo";
            lugarBrasaAway.schedule_hour = "12:00 - 22:30";
            lugarBrasaAway.categoria = categoriaRestaurant;
            lugarBrasaAway.latitud = (float) -17.3734916;
            lugarBrasaAway.longitud = (float) -66.1493475;
            lugarBrasaAway.save();


            //Candela
            Lugar lugarCandela = new Lugar();
            lugarCandela.icon = "candela_icon";
            lugarCandela.name = "Candela";
            lugarCandela.icon_marker = "candela_marker";
            lugarCandela.address = "Waldo Ballivian & Runasimi";
            lugarCandela.Phone = "70356219";
            lugarCandela.facebook = "https://www.facebook.com/CandelaChurrasqueria/";
            lugarCandela.web = "http://www.ponseventos.com";
            lugarCandela.schedule_day = "Lunes a Domingo";
            lugarCandela.schedule_hour = "19:00 - 22:30";
            lugarCandela.categoria = categoriaRestaurant;
            lugarCandela.latitud = (float) -17.367666;
            lugarCandela.longitud = (float) -66.1749972;
            lugarCandela.save();





        /*********************************BOLICHES*************************************************/
            // El Cortijo Pub
            Lugar lugarCortijo = new Lugar();
            lugarCortijo.icon = "cortijo_icon";
            lugarCortijo.icon_marker = "cortijo_marker";
            lugarCortijo.name = "El Cortijo Pub";
            lugarCortijo.address = "Av Pando";
            lugarCortijo.Phone = "75468801";
            lugarCortijo.facebook = "https://www.facebook.com/CortijoPub/";
            lugarCortijo.web = "http://www.ponseventos.com";
            lugarCortijo.schedule_day = "Lunes a Domingo";
            lugarCortijo.schedule_hour = "15:00 - 23:30";
            lugarCortijo.activity1 = "Música bailable en inglés y español, jardín amplio";
            lugarCortijo.activity2 = "Normalmente no se paga entrada (excepto cuando hay grupos)";
            lugarCortijo.activity3 = "Se vende cerveza y toda clase de bebidas";
            lugarCortijo.categoria = categoriaClub;
            lugarCortijo.latitud = (float) -17.3723356;
            lugarCortijo.longitud = (float) -66.1520346;
            lugarCortijo.save();


            // NOMA Lounge
            Lugar lugarNoma = new Lugar();
            lugarNoma.icon = "noma_icon";
            lugarNoma.icon_marker = "noma_marker";
            lugarNoma.name = "NOMA Lounge";
            lugarNoma.address = "Av Melchor Urquidi";
            lugarNoma.Phone = "72222433";
            lugarNoma.facebook = "https://www.facebook.com/NOMALounge/";
            lugarNoma.web = "http://www.ponseventos.com";
            lugarNoma.schedule_day = "Viernes y Sábado";
            lugarNoma.schedule_hour = "21:00 - 03:00";
            lugarNoma.activity1 = "Mayormente música pop en inglés y electrónica";
            lugarNoma.activity2 = "La entrada cuesta 40 Bs";
            lugarNoma.activity3 = "Bebidas desde 20 Bs";
            lugarNoma.categoria = categoriaClub;
            lugarNoma.latitud = (float) -17.3755877;
            lugarNoma.longitud = (float) -66.1501594;
            lugarNoma.save();


            // MOOD
            Lugar lugarMood = new Lugar();
            lugarMood.icon = "mood_icon";
            lugarMood.icon_marker = "mood_marker";
            lugarMood.name = "MOOD";
            lugarMood.address = "Av. América N°880";
            lugarMood.Phone = "70353733";
            lugarMood.facebook = "https://www.facebook.com/MOOD.SportBar/";
            lugarMood.web = "http://www.ponseventos.com";
            lugarMood.schedule_day = "Jueves a Sábado";
            lugarMood.schedule_hour = "19:00 - 03:00";
            lugarMood.activity1 = "Música bailable de todos los géneros";
            lugarMood.activity2 = "Normalmente no se paga entrada (excepto cuando hay grupos)";
            lugarMood.activity3 = "Bebidas e elección de todo precio";
            lugarMood.categoria = categoriaClub;
            lugarMood.latitud = (float) -17.3734217;
            lugarMood.longitud = (float) -66.1505595;
            lugarMood.save();


            // Dortmund Bierhaus
            Lugar lugarDortmound = new Lugar();
            lugarDortmound.icon = "dortmund_icon";
            lugarDortmound.icon_marker = "dortmund_marker";
            lugarDortmound.name = "Dortmund Bierhaus";
            lugarDortmound.address = "Av Ramón Rivero";
            lugarDortmound.Phone = "72725089";
            lugarDortmound.facebook = "https://www.facebook.com/DortmundBierhaus.bo/";
            lugarDortmound.web = "http://www.ponseventos.com";
            lugarDortmound.schedule_day = "Lunes a Domingo";
            lugarDortmound.schedule_hour = "19:00 - 03:00";
            lugarDortmound.activity1 = "Música en inglés, rock y pop";
            lugarDortmound.activity2 = "No se paga entrada";
            lugarDortmound.activity3 = "Cervezas artesanales y variedad de comida";
            lugarDortmound.categoria = categoriaClub;
            lugarDortmound.latitud = (float) -17.3809469;
            lugarDortmound.longitud = (float) -66.1514426;
            lugarDortmound.save();


            // Candelaria
            Lugar lugarCandelaria = new Lugar();
            lugarCandelaria.icon = "candelaria_icon";
            lugarCandelaria.icon_marker = "candelaria_marker";
            lugarCandelaria.name = "Candelaria";
            lugarCandelaria.address = "J. De Los Ríos";
            lugarCandelaria.Phone = "70350430";
            lugarCandelaria.facebook = "https://www.facebook.com/candelariabeergarden/";
            lugarCandelaria.web = "http://www.ponseventos.com";
            lugarCandelaria.schedule_day = "Jueves a Sábado";
            lugarCandelaria.schedule_hour = "18:30 - 02:00";
            lugarCandelaria.activity1 = "Música de todo tipo, buen ambiente";
            lugarCandelaria.activity2 = "No se paga entrada";
            lugarCandelaria.activity3 = "Cervezas artesanales desde 45 Bs";
            lugarCandelaria.categoria = categoriaClub;
            lugarCandelaria.latitud = (float) -17.3721057;
            lugarCandelaria.longitud = (float) -66.1406784;
            lugarCandelaria.save();


            // Mandarina Lounge
            Lugar lugarMandarina = new Lugar();
            lugarMandarina.icon = "mandarina_icon";
            lugarMandarina.icon_marker = "mandarina_marker";
            lugarMandarina.name = "Mandarina Lounge";
            lugarMandarina.address = "Av Portales";
            lugarMandarina.Phone = "4798613";
            lugarMandarina.facebook = "https://www.facebook.com/MandarinaLOUNGE/";
            lugarMandarina.web = "http://www.ponseventos.com";
            lugarMandarina.schedule_day = "Viernes y Sábado";
            lugarMandarina.schedule_hour = "21:30 - 03:00";
            lugarMandarina.activity1 = "Música blailable moderna y de todos los géneros";
            lugarMandarina.activity2 = "La entrada cuesta 50 Bs";
            lugarMandarina.activity3 = "Variedad de bebidas de todo precio";
            lugarMandarina.categoria = categoriaClub;
            lugarMandarina.latitud = (float) -17.3750007;
            lugarMandarina.longitud = (float) -66.1521382;
            lugarMandarina.save();


            // Hooligans
            Lugar lugarHooligans = new Lugar();
            lugarHooligans.icon = "hooligans_icon";
            lugarHooligans.icon_marker = "hooligans_marker";
            lugarHooligans.name = "Hooligans";
            lugarHooligans.address = "Pje. Pando";
            lugarHooligans.Phone = "67536575";
            lugarHooligans.facebook = "https://www.facebook.com/hooligans.bar.cbba/";
            lugarHooligans.web = "http://www.ponseventos.com";
            lugarHooligans.schedule_day = "Viernes y Sábado";
            lugarHooligans.schedule_hour = "21:30 - 03:00";
            lugarHooligans.activity1 = "Música bailable pop, reggaeton y cumbia";
            lugarHooligans.activity2 = "La entrada cuesta 40 Bs";
            lugarHooligans.activity3 = "Bebidas desde 20 Bs";
            lugarHooligans.categoria = categoriaClub;
            lugarHooligans.latitud = (float) -17.375244;
            lugarHooligans.longitud = (float) -66.1519727;
            lugarHooligans.save();


            // Music Hall
            Lugar lugarMusicHall = new Lugar();
            lugarMusicHall.icon = "music_hall_icon";
            lugarMusicHall.icon_marker = "music_hall_marker";
            lugarMusicHall.name = "Music Hall";
            lugarMusicHall.address = "Pasaje Ovidio";
            lugarMusicHall.Phone = "70731180";
            lugarMusicHall.facebook = "https://www.facebook.com/musichallcbba/";
            lugarMusicHall.web = "http://www.ponseventos.com";
            lugarMusicHall.schedule_day = "Lunes a Sábado";
            lugarMusicHall.schedule_hour = "21:00 - 03:00";
            lugarMusicHall.activity1 = "Música blailable de todos lo géneros";
            lugarMusicHall.activity2 = "La entrada cuesta 30 Bs";
            lugarMusicHall.activity3 = "Cervezas desde 20 Bs";
            lugarMusicHall.categoria = categoriaClub;
            lugarMusicHall.latitud = (float) -17.3753854;
            lugarMusicHall.longitud = (float) -66.1518373;
            lugarMusicHall.save();


            // Levoa
            Lugar lugarLevoa = new Lugar();
            lugarLevoa.icon = "levoa_icon";
            lugarLevoa.icon_marker = "levoa_marker";
            lugarLevoa.name = "Levoa";
            lugarLevoa.address = "Pasaje Boulevard";
            lugarLevoa.Phone = "4798820";
            lugarLevoa.facebook = "https://www.facebook.com/LevoaUrbanClub/";
            lugarLevoa.web = "http://www.ponseventos.com";
            lugarLevoa.schedule_day = "Viernes y Sábado";
            lugarLevoa.schedule_hour = "21:00 - 04:30";
            lugarLevoa.activity1 = "Música bailable clásica y nueva";
            lugarLevoa.activity2 = "Entrada 25 Bs";
            lugarLevoa.activity3 = "Cervezas desde 20 Bs";
            lugarLevoa.categoria = categoriaClub;
            lugarLevoa.latitud = (float) -17.378633;
            lugarLevoa.longitud = (float) -66.1515877;
            lugarLevoa.save();


            // Tren Urbano Bar
            Lugar lugarTren = new Lugar();
            lugarTren.icon = "tren_icon";
            lugarTren.icon_marker = "tren_marker";
            lugarTren.name = "Tren Urbano Bar";
            lugarTren.address = "Pasaje Boulevard de la Recoleta";
            lugarTren.Phone = "4798237";
            lugarTren.facebook = "https://www.facebook.com/TrenUrbanoBar/";
            lugarTren.web = "http://www.ponseventos.com";
            lugarTren.schedule_day = "Jueves a Sábado";
            lugarTren.schedule_hour = "19:00 - 02:00";
            lugarTren.activity1 = "Bar de ambiente agradable, música rock";
            lugarTren.activity2 = "No se paga entrada";
            lugarTren.activity3 = "Cerveza desde 20 Bs";
            lugarTren.categoria = categoriaClub;
            lugarTren.latitud = (float) -17.3784606;
            lugarTren.longitud = (float) -66.1513788;
            lugarTren.save();



            /*******************ITEMS DE MENUS*********************************/


            //Pollos Villa Chicken sabor Peruano
            Item itemVilla_1 = new Item();
            itemVilla_1.name = "1/8 Pollo";
            itemVilla_1.detail = "";
            itemVilla_1.price = 17;
            itemVilla_1.image = "villa_menu_1";
            itemVilla_1.lugar = lugarVilla;
            itemVilla_1.save();
            Item itemVilla_2 = new Item();
            itemVilla_2.name = "1/4 Pollo";
            itemVilla_2.detail = "";
            itemVilla_2.price = 25;
            itemVilla_2.image = "villa_menu_2";
            itemVilla_2.lugar = lugarVilla;
            itemVilla_2.save();
            Item itemVilla_3 = new Item();
            itemVilla_3.name = "Pollo entero";
            itemVilla_3.detail = "";
            itemVilla_3.price = 86;
            itemVilla_3.image = "villa_menu_3";
            itemVilla_3.lugar = lugarVilla;
            itemVilla_3.save();


            //Kingdom Vilarroel
            Item itemKingdomV_1 = new Item();
            itemKingdomV_1.name = "Cuarto pollo";
            itemKingdomV_1.detail = "";
            itemKingdomV_1.price = 20;
            itemKingdomV_1.image = "kingdom_menu_1";
            itemKingdomV_1.lugar = lugarKingdomV;
            itemKingdomV_1.save();
            Item itemKingdomV_2 = new Item();
            itemKingdomV_2.name = "Quen Menú";
            itemKingdomV_2.detail = "";
            itemKingdomV_2.price = 31;
            itemKingdomV_2.image = "kingdom_menu_2";
            itemKingdomV_2.lugar = lugarKingdomV;
            itemKingdomV_2.save();
            Item itemKingdomV_3 = new Item();
            itemKingdomV_3.name = "King Menú";
            itemKingdomV_3.detail = "";
            itemKingdomV_3.price = 49;
            itemKingdomV_3.image = "kingdom_menu_3";
            itemKingdomV_3.lugar = lugarKingdomV;
            itemKingdomV_3.save();


            //Kingdom San Martin
            Item itemKingdomS_1 = new Item();
            itemKingdomS_1.name = "Cuarto pollo";
            itemKingdomS_1.detail = "";
            itemKingdomS_1.price = 20;
            itemKingdomS_1.image = "kingdom_menu_1";
            itemKingdomS_1.lugar = lugarKingdomS;
            itemKingdomS_1.save();
            Item itemKingdomS_2 = new Item();
            itemKingdomS_2.name = "Quen Menú";
            itemKingdomS_2.detail = "";
            itemKingdomS_2.price = 31;
            itemKingdomS_2.image = "kingdom_menu_2";
            itemKingdomS_2.lugar = lugarKingdomS;
            itemKingdomS_2.save();
            Item itemKingdomS_3 = new Item();
            itemKingdomS_3.name = "King Menú";
            itemKingdomS_3.detail = "";
            itemKingdomS_3.price = 49;
            itemKingdomS_3.image = "kingdom_menu_3";
            itemKingdomS_3.lugar = lugarKingdomS;
            itemKingdomS_3.save();


            //What's Up
            Item itemWhatsup_1 = new Item();
            itemWhatsup_1.name = "6 alitas, papa y refresco";
            itemWhatsup_1.detail = "";
            itemWhatsup_1.price = 37;
            itemWhatsup_1.image = "whatsup_menu_1";
            itemWhatsup_1.lugar = lugarWhatsup;
            itemWhatsup_1.save();
            Item itemWhatsup_2 = new Item();
            itemWhatsup_2.name = "12 nuggets, papa y refresco";
            itemWhatsup_2.detail = "";
            itemWhatsup_2.price = 53;
            itemWhatsup_2.image = "whatsup_menu_2";
            itemWhatsup_2.lugar = lugarWhatsup;
            itemWhatsup_2.save();
            Item itemWhatsup_3 = new Item();
            itemWhatsup_3.name = "Almuerzo Especial";
            itemWhatsup_3.detail = "";
            itemWhatsup_3.price = 30;
            itemWhatsup_3.image = "whatsup_menu_3";
            itemWhatsup_3.lugar = lugarWhatsup;
            itemWhatsup_3.save();


            //Palacio del Sillpancho
            Item itemPalacio_1 = new Item();
            itemPalacio_1.name = "Trancapecho";
            itemPalacio_1.detail = "";
            itemPalacio_1.price = 13;
            itemPalacio_1.image = "palacio_menu_1";
            itemPalacio_1.lugar = lugarPalacio;
            itemPalacio_1.save();
            Item itemPalacio_2 = new Item();
            itemPalacio_2.name = "Sillpancho de pollo";
            itemPalacio_2.detail = "";
            itemPalacio_2.price = 18;
            itemPalacio_2.image = "palacio_menu_2";
            itemPalacio_2.lugar = lugarPalacio;
            itemPalacio_2.save();
            Item itemPalacio_3 = new Item();
            itemPalacio_3.name = "Sillpancho de res";
            itemPalacio_3.detail = "";
            itemPalacio_3.price = 18;
            itemPalacio_3.image = "palacio_menu_3";
            itemPalacio_3.lugar = lugarPalacio;
            itemPalacio_3.save();


            //Pollos Super Tasty
            Item itemTasty_1 = new Item();
            itemTasty_1.name = "Broaster personal";
            itemTasty_1.detail = "";
            itemTasty_1.price = 16;
            itemTasty_1.image = "tasty_menu_1";
            itemTasty_1.lugar = lugarTasty;
            itemTasty_1.save();
            Item itemTasty_2 = new Item();
            itemTasty_2.name = "Spiedo cuarto";
            itemTasty_2.detail = "";
            itemTasty_2.price = 20;
            itemTasty_2.image = "tasty_menu_2";
            itemTasty_2.lugar = lugarTasty;
            itemTasty_2.save();
            Item itemTasty_3 = new Item();
            itemTasty_3.name = "Popular Broaster";
            itemTasty_3.detail = "";
            itemTasty_3.price = 20;
            itemTasty_3.image = "tasty_menu_3";
            itemTasty_3.lugar = lugarTasty;
            itemTasty_3.save();


            //Pollos Lucho America
            Item itemLucho_1 = new Item();
            itemLucho_1.name = "Pollo económico";
            itemLucho_1.detail = "";
            itemLucho_1.price = 17;
            itemLucho_1.image = "lucho_menu_1";
            itemLucho_1.lugar = lugarLucho;
            itemLucho_1.save();
            Item itemLucho_2 = new Item();
            itemLucho_2.name = "1/4 Pollo";
            itemLucho_2.detail = "";
            itemLucho_2.price = 23;
            itemLucho_2.image = "lucho_menu_2";
            itemLucho_2.lugar = lugarLucho;
            itemLucho_2.save();
            Item itemLucho_3 = new Item();
            itemLucho_3.name = "Pollo entero con guarnición";
            itemLucho_3.detail = "";
            itemLucho_3.price = 90;
            itemLucho_3.image = "lucho_menu_3";
            itemLucho_3.lugar = lugarLucho;
            itemLucho_3.save();

            //Castores Pando
            Item itemCastoresPa_1 = new Item();
            itemCastoresPa_1.name = "Salteña dulce de res";
            itemCastoresPa_1.detail = "";
            itemCastoresPa_1.price = 8;
            itemCastoresPa_1.image = "castores_menu_1";
            itemCastoresPa_1.lugar = lugarCastoresPa;
            itemCastoresPa_1.save();
            Item itemCastoresPa_2 = new Item();
            itemCastoresPa_2.name = "Salteña mixta";
            itemCastoresPa_2.detail = "";
            itemCastoresPa_2.price = 9;
            itemCastoresPa_2.image = "castores_menu_2";
            itemCastoresPa_2.lugar = lugarCastoresPa;
            itemCastoresPa_2.save();
            Item itemCastoresPa_3 = new Item();
            itemCastoresPa_3.name = "Salteña picante";
            itemCastoresPa_3.detail = "";
            itemCastoresPa_3.price = 9;
            itemCastoresPa_3.image = "castores_menu_3";
            itemCastoresPa_3.lugar = lugarCastoresPa;
            itemCastoresPa_3.save();


            //Castores Prado
            Item itemCastoresPra_1 = new Item();
            itemCastoresPra_1.name = "Salteña dulce de res";
            itemCastoresPra_1.detail = "";
            itemCastoresPra_1.price = 8;
            itemCastoresPra_1.image = "castores_menu_1";
            itemCastoresPra_1.lugar = lugarCastoresPra;
            itemCastoresPra_1.save();
            Item itemCastoresPra_2 = new Item();
            itemCastoresPra_2.name = "Salteña mixta";
            itemCastoresPra_2.detail = "";
            itemCastoresPra_2.price = 9;
            itemCastoresPra_2.image = "castores_menu_2";
            itemCastoresPra_2.lugar = lugarCastoresPra;
            itemCastoresPra_2.save();
            Item itemCastoresPra_3 = new Item();
            itemCastoresPra_3.name = "Salteña picante";
            itemCastoresPra_3.detail = "";
            itemCastoresPra_3.price = 9;
            itemCastoresPra_3.image = "castores_menu_3";
            itemCastoresPra_3.lugar = lugarCastoresPra;
            itemCastoresPra_3.save();


            //Wistupiku Melchor Pérez
            Item itemWistuMel_1 = new Item();
            itemWistuMel_1.name = "Empanada blanca";
            itemWistuMel_1.detail = "";
            itemWistuMel_1.price = 6;
            itemWistuMel_1.image = "wistu_menu_1";
            itemWistuMel_1.lugar = lugarWistuMelchor;
            itemWistuMel_1.save();
            Item itemWistuMel_2 = new Item();
            itemWistuMel_2.name = "Empanada charque";
            itemWistuMel_2.detail = "";
            itemWistuMel_2.price = 7;
            itemWistuMel_2.image = "wistu_menu_2";
            itemWistuMel_2.lugar = lugarWistuMelchor;
            itemWistuMel_2.save();
            Item itemWistuMel_3 = new Item();
            itemWistuMel_3.name = "Empanada frita de pollo";
            itemWistuMel_3.detail = "";
            itemWistuMel_3.price = 7;
            itemWistuMel_3.image = "wistu_menu_3";
            itemWistuMel_3.lugar = lugarWistuMelchor;
            itemWistuMel_3.save();

            //Wistupiku Lanza
            Item itemWistuLan_1 = new Item();
            itemWistuLan_1.name = "Empanada blanca";
            itemWistuLan_1.detail = "";
            itemWistuLan_1.price = 6;
            itemWistuLan_1.image = "wistu_menu_1";
            itemWistuLan_1.lugar = lugarWistuLanza;
            itemWistuLan_1.save();
            Item itemWistuLan_2 = new Item();
            itemWistuLan_2.name = "Empanada charque";
            itemWistuLan_2.detail = "";
            itemWistuLan_2.price = 7;
            itemWistuLan_2.image = "wistu_menu_2";
            itemWistuLan_2.lugar = lugarWistuLanza;
            itemWistuLan_2.save();
            Item itemWistuLan_3 = new Item();
            itemWistuLan_3.name = "Empanada frita de pollo";
            itemWistuLan_3.detail = "";
            itemWistuLan_3.price = 7;
            itemWistuLan_3.image = "wistu_menu_3";
            itemWistuLan_3.lugar = lugarWistuLanza;
            itemWistuLan_3.save();


            //Tu Yogur
            Item itemTuYogur_1 = new Item();
            itemTuYogur_1.name = "Cono simple";
            itemTuYogur_1.detail = "";
            itemTuYogur_1.price = 5;
            itemTuYogur_1.image = "tuyogur_menu_1";
            itemTuYogur_1.lugar = lugarTuYogur;
            itemTuYogur_1.save();
            Item itemTuYogur_2 = new Item();
            itemTuYogur_2.name = "Smothie";
            itemTuYogur_2.detail = "";
            itemTuYogur_2.price = 14;
            itemTuYogur_2.image = "tuyogur_menu_2";
            itemTuYogur_2.lugar = lugarTuYogur;
            itemTuYogur_2.save();
            Item itemTuYogur_3 = new Item();
            itemTuYogur_3.name = "Frappuccino";
            itemTuYogur_3.detail = "";
            itemTuYogur_3.price = 15;
            itemTuYogur_3.image = "tuyogur_menu_3";
            itemTuYogur_3.lugar = lugarTuYogur;
            itemTuYogur_3.save();


            //Panchita América
            Item itemPanchitaAme_1 = new Item();
            itemPanchitaAme_1.name = "Pollo Chikitin";
            itemPanchitaAme_1.detail = "";
            itemPanchitaAme_1.price = 17;
            itemPanchitaAme_1.image = "panchita_menu_1";
            itemPanchitaAme_1.lugar = lugarPanchitaAme;
            itemPanchitaAme_1.save();
            Item itemPanchitaAme_2 = new Item();
            itemPanchitaAme_2.name = "Panchicono";
            itemPanchitaAme_2.detail = "";
            itemPanchitaAme_2.price = 20;
            itemPanchitaAme_2.image = "panchita_menu_2";
            itemPanchitaAme_2.lugar = lugarPanchitaAme;
            itemPanchitaAme_2.save();
            Item itemPanchitaAme_3 = new Item();
            itemPanchitaAme_3.name = "Panchita";
            itemPanchitaAme_3.detail = "";
            itemPanchitaAme_3.price = 33;
            itemPanchitaAme_3.image = "panchita_menu_3";
            itemPanchitaAme_3.lugar = lugarPanchitaAme;
            itemPanchitaAme_3.save();


            //Panchita Heroinas
            Item itemPanchitaHer_1 = new Item();
            itemPanchitaHer_1.name = "Pollo Chikitin";
            itemPanchitaHer_1.detail = "";
            itemPanchitaHer_1.price = 17;
            itemPanchitaHer_1.image = "panchita_menu_1";
            itemPanchitaHer_1.lugar = lugarPanchitaHer;
            itemPanchitaHer_1.save();
            Item itemPanchitaHer_2 = new Item();
            itemPanchitaHer_2.name = "Panchicono";
            itemPanchitaHer_2.detail = "";
            itemPanchitaHer_2.price = 20;
            itemPanchitaHer_2.image = "panchita_menu_2";
            itemPanchitaHer_2.lugar = lugarPanchitaHer;
            itemPanchitaHer_2.save();
            Item itemPanchitaHer_3 = new Item();
            itemPanchitaHer_3.name = "Panchita";
            itemPanchitaHer_3.detail = "";
            itemPanchitaHer_3.price = 33;
            itemPanchitaHer_3.image = "panchita_menu_3";
            itemPanchitaHer_3.lugar = lugarPanchitaHer;
            itemPanchitaHer_3.save();


            //Kansas
            Item itemKansas_1 = new Item();
            itemKansas_1.name = "Hamburguesa";
            itemKansas_1.detail = "";
            itemKansas_1.price = 54;
            itemKansas_1.image = "kansas_menu_1";
            itemKansas_1.lugar = lugarKansas;
            itemKansas_1.save();
            Item itemKansas_2 = new Item();
            itemKansas_2.name = "Kansas Burger";
            itemKansas_2.detail = "";
            itemKansas_2.price = 65;
            itemKansas_2.image = "kansas_menu_2";
            itemKansas_2.lugar = lugarKansas;
            itemKansas_2.save();
            Item itemKansas_3 = new Item();
            itemKansas_3.name = "Salmón  a la plancha";
            itemKansas_3.detail = "";
            itemKansas_3.price = 135;
            itemKansas_3.image = "kansas_menu_3";
            itemKansas_3.lugar = lugarKansas;
            itemKansas_3.save();



            //Carta Vieja Pizzeria
            Item itemCartaVieja_1 = new Item();
            itemCartaVieja_1.name = "Pizza personal Margarita";
            itemCartaVieja_1.detail = "";
            itemCartaVieja_1.price = 10;
            itemCartaVieja_1.image = "cartavieja_menu_1";
            itemCartaVieja_1.lugar = lugarCartaVieja;
            itemCartaVieja_1.save();
            Item itemCartaVieja_2 = new Item();
            itemCartaVieja_2.name = "Pizza mediana Hawaiana";
            itemCartaVieja_2.detail = "";
            itemCartaVieja_2.price = 35;
            itemCartaVieja_2.image = "cartavieja_menu_2";
            itemCartaVieja_2.lugar = lugarCartaVieja;
            itemCartaVieja_2.save();
            Item itemCartaVieja_3 = new Item();
            itemCartaVieja_3.name = "Fugazzeta rellena";
            itemCartaVieja_3.detail = "";
            itemCartaVieja_3.price = 150;
            itemCartaVieja_3.image = "cartavieja_menu_3";
            itemCartaVieja_3.lugar = lugarCartaVieja;
            itemCartaVieja_3.save();


            //Donal Heroinas
            Item itemDonal_1 = new Item();
            itemDonal_1.name = "Helado Tropical";
            itemDonal_1.detail = "";
            itemDonal_1.price = 32;
            itemDonal_1.image = "donal_menu_1";
            itemDonal_1.lugar = lugarDonalHer;
            itemDonal_1.save();
            Item itemDonal_2 = new Item();
            itemDonal_2.name = "Alitas picantes";
            itemDonal_2.detail = "";
            itemDonal_2.price = 37;
            itemDonal_2.image = "donal_menu_2";
            itemDonal_2.lugar = lugarDonalHer;
            itemDonal_2.save();
            Item itemDonal_3 = new Item();
            itemDonal_3.name = "Pique macho";
            itemDonal_3.detail = "";
            itemDonal_3.price = 95;
            itemDonal_3.image = "donal_menu_3";
            itemDonal_3.lugar = lugarDonalHer;
            itemDonal_3.save();



            //Bufalo's Rodizio
            Item itemRodizio_1 = new Item();
            itemRodizio_1.name = "Cubierto adultos";
            itemRodizio_1.detail = "";
            itemRodizio_1.price = 85;
            itemRodizio_1.image = "rodizio_menu_1";
            itemRodizio_1.lugar = lugarBufalo;
            itemRodizio_1.save();
            Item itemRodizio_2 = new Item();
            itemRodizio_2.name = "El cubierto incluye menu buffet";
            itemRodizio_2.detail = "";
            itemRodizio_2.price = 85;
            itemRodizio_2.image = "rodizio_menu_2";
            itemRodizio_2.lugar = lugarBufalo;
            itemRodizio_2.save();
            Item itemRodizio_3 = new Item();
            itemRodizio_3.name = "Rodizio de carnes";
            itemRodizio_3.detail = "";
            itemRodizio_3.price = 85;
            itemRodizio_3.image = "rodizio_menu_3";
            itemRodizio_3.lugar = lugarBufalo;
            itemRodizio_3.save();


            //La Playa
            Item itemPlaya_1 = new Item();
            itemPlaya_1.name = "Ceviche pequeño";
            itemPlaya_1.detail = "";
            itemPlaya_1.price = 20;
            itemPlaya_1.image = "laplaya_menu_1";
            itemPlaya_1.lugar = lugarPlaya;
            itemPlaya_1.save();
            Item itemPlaya_2 = new Item();
            itemPlaya_2.name = "Cabañitas";
            itemPlaya_2.detail = "";
            itemPlaya_2.price = 30;
            itemPlaya_2.image = "laplaya_menu_2";
            itemPlaya_2.lugar = lugarPlaya;
            itemPlaya_2.save();
            Item itemPlaya_3 = new Item();
            itemPlaya_3.name = "Ceviche cola de lagarto";
            itemPlaya_3.detail = "";
            itemPlaya_3.price = 45;
            itemPlaya_3.image = "laplaya_menu_3";
            itemPlaya_3.lugar = lugarPlaya;
            itemPlaya_3.save();

            // Chifa China
            Item itemChifaChina_1 = new Item();
            itemChifaChina_1.name = "Pollo agridulce";
            itemChifaChina_1.detail = " ";
            itemChifaChina_1.price = 55;
            itemChifaChina_1.image = "chifa_pando_menu_1";
            itemChifaChina_1.lugar = lugarChifaChina;
            itemChifaChina_1.save();
            Item itemChifaChina_2 = new Item();
            itemChifaChina_2.name = "Pollo a la piña";
            itemChifaChina_2.detail = " ";
            itemChifaChina_2.price = 55;
            itemChifaChina_2.image = "chifa_pando_menu_2";
            itemChifaChina_2.lugar = lugarChifaChina;
            itemChifaChina_2.save();
            Item itemChifaChina_3 = new Item();
            itemChifaChina_3.name = "Pescado agridulce";
            itemChifaChina_3.detail = " ";
            itemChifaChina_3.price = 65;
            itemChifaChina_3.image = "chifa_pando_menu_3";
            itemChifaChina_3.lugar = lugarChifaChina;
            itemChifaChina_3.save();


            // Pollos Chriss
            Item itemPollosChriss_1 = new Item();
            itemPollosChriss_1.name = "Crunchy";
            itemPollosChriss_1.detail = " ";
            itemPollosChriss_1.price = 22;
            itemPollosChriss_1.image = "pollos_chriss_menu_1";
            itemPollosChriss_1.lugar = lugarPollosChriss;
            itemPollosChriss_1.save();
            Item itemPollosChriss_2 = new Item();
            itemPollosChriss_2.name = "Pipoks";
            itemPollosChriss_2.detail = " ";
            itemPollosChriss_2.price = 27;
            itemPollosChriss_2.image = "pollos_chriss_menu_2";
            itemPollosChriss_2.lugar = lugarPollosChriss;
            itemPollosChriss_2.save();
            Item itemPollosChriss_3 = new Item();
            itemPollosChriss_3.name = "Costillitas de cerdo";
            itemPollosChriss_3.detail = " ";
            itemPollosChriss_3.price = 35;
            itemPollosChriss_3.image = "pollos_chriss_menu_3";
            itemPollosChriss_3.lugar = lugarPollosChriss;
            itemPollosChriss_3.save();


            // Chifa Lai Lai Diamante
            Item itemChifaLaiLaiDiamante_1 = new Item();
            itemChifaLaiLaiDiamante_1.name = "Chicharrón de pollo";
            itemChifaLaiLaiDiamante_1.detail = " ";
            itemChifaLaiLaiDiamante_1.price = 55;
            itemChifaLaiLaiDiamante_1.image = "chifa_lailai_menu_1";
            itemChifaLaiLaiDiamante_1.lugar = lugarChifaLaiLaiDiamante;
            itemChifaLaiLaiDiamante_1.save();
            Item itemChifaLaiLaiDiamante_2 = new Item();
            itemChifaLaiLaiDiamante_2.name = "Costillas de cerdo agridulce";
            itemChifaLaiLaiDiamante_2.detail = " ";
            itemChifaLaiLaiDiamante_2.price = 55;
            itemChifaLaiLaiDiamante_2.image = "chifa_lailai_menu_2";
            itemChifaLaiLaiDiamante_2.lugar = lugarChifaLaiLaiDiamante;
            itemChifaLaiLaiDiamante_2.save();
            Item itemChifaLaiLaiDiamante_3 = new Item();
            itemChifaLaiLaiDiamante_3.name = "Camarones agridulces";
            itemChifaLaiLaiDiamante_3.detail = " ";
            itemChifaLaiLaiDiamante_3.price = 80;
            itemChifaLaiLaiDiamante_3.image = "chifa_lailai_menu_3";
            itemChifaLaiLaiDiamante_3.lugar = lugarChifaLaiLaiDiamante;
            itemChifaLaiLaiDiamante_3.save();


            // Casa de Campo
            Item itemCasaDeCampo_1 = new Item();
            itemCasaDeCampo_1.name = "Pique lobo";
            itemCasaDeCampo_1.detail = " ";
            itemCasaDeCampo_1.price = 60;
            itemCasaDeCampo_1.image = "casadecampo_menu_1";
            itemCasaDeCampo_1.lugar = lugarCasaDeCampo;
            itemCasaDeCampo_1.save();
            Item itemCasaDeCampo_2 = new Item();
            itemCasaDeCampo_2.name = "Planchita";
            itemCasaDeCampo_2.detail = " ";
            itemCasaDeCampo_2.price = 100;
            itemCasaDeCampo_2.image = "casadecampo_menu_2";
            itemCasaDeCampo_2.lugar = lugarCasaDeCampo;
            itemCasaDeCampo_2.save();
            Item itemCasaDeCampo_3 = new Item();
            itemCasaDeCampo_3.name = "Silpancho";
            itemCasaDeCampo_3.detail = " ";
            itemCasaDeCampo_3.price = 50;
            itemCasaDeCampo_3.image = "casadecampo_menu_3";
            itemCasaDeCampo_3.lugar = lugarCasaDeCampo;
            itemCasaDeCampo_3.save();


            // La Estancia
            Item itemLaEstancia_1 = new Item();
            itemLaEstancia_1.name = "Giba a la parrilla";
            itemLaEstancia_1.detail = " ";
            itemLaEstancia_1.price = 60;
            itemLaEstancia_1.image = "la_estancia_menu_1";
            itemLaEstancia_1.lugar = lugarLaEstancia;
            itemLaEstancia_1.save();
            Item itemLaEstancia_2 = new Item();
            itemLaEstancia_2.name = "Matambre de cerdo";
            itemLaEstancia_2.detail = " ";
            itemLaEstancia_2.price = 70;
            itemLaEstancia_2.image = "la_estancia_menu_2";
            itemLaEstancia_2.lugar = lugarLaEstancia;
            itemLaEstancia_2.save();
            Item itemLaEstancia_3 = new Item();
            itemLaEstancia_3.name = "Filete de trucha a la Alcaparra";
            itemLaEstancia_3.detail = " ";
            itemLaEstancia_3.price = 85;
            itemLaEstancia_3.image = "la_estancia_menu_3";
            itemLaEstancia_3.lugar = lugarLaEstancia;
            itemLaEstancia_3.save();


            // Malcriada del buen gusto
            Item itemMalcriada_1 = new Item();
            itemMalcriada_1.name = "Napolitana";
            itemMalcriada_1.detail = " ";
            itemMalcriada_1.price = 60;
            itemMalcriada_1.image = "malcriada_menu_1";
            itemMalcriada_1.lugar = lugarMalcriada;
            itemMalcriada_1.save();
            Item itemMalcriada_2 = new Item();
            itemMalcriada_2.name = "Italiana";
            itemMalcriada_2.detail = " ";
            itemMalcriada_2.price = 50;
            itemMalcriada_2.image = "malcriada_menu_2";
            itemMalcriada_2.lugar = lugarMalcriada;
            itemMalcriada_2.save();
            Item itemMalcriada_3 = new Item();
            itemMalcriada_3.name = "Hawaiana";
            itemMalcriada_3.detail = " ";
            itemMalcriada_3.price = 55;
            itemMalcriada_3.image = "malcriada_menu_3";
            itemMalcriada_3.lugar = lugarMalcriada;
            itemMalcriada_3.save();


            // Pollos Santa Lucía
            Item itemSantaLucia_1 = new Item();
            itemSantaLucia_1.name = "Chicken Tenders";
            itemSantaLucia_1.detail = " ";
            itemSantaLucia_1.price = 29;
            itemSantaLucia_1.image = "pollos_santalucia_menu_1";
            itemSantaLucia_1.lugar = lugarSantaLucia;
            itemSantaLucia_1.save();
            Item itemSantaLucia_2 = new Item();
            itemSantaLucia_2.name = "Costillas de cerdo";
            itemSantaLucia_2.detail = " ";
            itemSantaLucia_2.price = 49;
            itemSantaLucia_2.image = "pollos_santalucia_menu_2";
            itemSantaLucia_2.lugar = lugarSantaLucia;
            itemSantaLucia_2.save();
            Item itemSantaLucia_3 = new Item();
            itemSantaLucia_3.name = "Mix Familiar";
            itemSantaLucia_3.detail = " ";
            itemSantaLucia_3.price = 75;
            itemSantaLucia_3.image = "pollos_santalucia_menu_3";
            itemSantaLucia_3.lugar = lugarSantaLucia;
            itemSantaLucia_3.save();


            // Carniclub
            Item itemCarniclub_1 = new Item();
            itemCarniclub_1.name = "H2";
            itemCarniclub_1.detail = " ";
            itemCarniclub_1.price = 20;
            itemCarniclub_1.image = "carniclub_menu_1";
            itemCarniclub_1.lugar = lugarCarniClub;
            itemCarniclub_1.save();
            Item itemCarniclub_2 = new Item();
            itemCarniclub_2.name = "Hamburguesa";
            itemCarniclub_2.detail = " ";
            itemCarniclub_2.price = 15;
            itemCarniclub_2.image = "carniclub_menu_2";
            itemCarniclub_2.lugar = lugarCarniClub;
            itemCarniclub_2.save();
            Item itemCarniclub_3 = new Item();
            itemCarniclub_3.name = "Lomito";
            itemCarniclub_3.detail = " ";
            itemCarniclub_3.price = 15;
            itemCarniclub_3.image = "carniclub_menu_3";
            itemCarniclub_3.lugar = lugarCarniClub;
            itemCarniclub_3.save();


            // BROS
            Item itemBros_1 = new Item();
            itemBros_1.name = "Económico";
            itemBros_1.detail = " ";
            itemBros_1.price = 20;
            itemBros_1.image = "bros_menu_1";
            itemBros_1.lugar = lugarBros;
            itemBros_1.save();
            Item itemBros_2 = new Item();
            itemBros_2.name = "Mister Boteco";
            itemBros_2.detail = " ";
            itemBros_2.price = 33;
            itemBros_2.image = "bros_menu_2";
            itemBros_2.lugar = lugarBros;
            itemBros_2.save();
            Item itemBros_3 = new Item();
            itemBros_3.name = "Entero";
            itemBros_3.detail = " ";
            itemBros_3.price = 88;
            itemBros_3.image = "bros_menu_3";
            itemBros_3.lugar = lugarBros;
            itemBros_3.save();


            // Miraflores Restaurant
            Item itemMiraflores_1 = new Item();
            itemMiraflores_1.name = "Chuleta de cerdo";
            itemMiraflores_1.detail = " ";
            itemMiraflores_1.price = 58;
            itemMiraflores_1.image = "miraflores_menu_1";
            itemMiraflores_1.lugar = lugarMiraflores;
            itemMiraflores_1.save();
            Item itemMiraflores_2 = new Item();
            itemMiraflores_2.name = "Pique a lo macho";
            itemMiraflores_2.detail = " ";
            itemMiraflores_2.price = 70;
            itemMiraflores_2.image = "miraflores_menu_2";
            itemMiraflores_2.lugar = lugarMiraflores;
            itemMiraflores_2.save();
            Item itemMiraflores_3 = new Item();
            itemMiraflores_3.name = "Pique de lomo";
            itemMiraflores_3.detail = " ";
            itemMiraflores_3.price = 80;
            itemMiraflores_3.image = "miraflores_menu_3";
            itemMiraflores_3.lugar = lugarMiraflores;
            itemMiraflores_3.save();


            // Pollos El Choco Estadium
            Item itemElChoco_1 = new Item();
            itemElChoco_1.name = "1/2 Porción completa ala";
            itemElChoco_1.detail = " ";
            itemElChoco_1.price = 24;
            itemElChoco_1.image = "choco_menu_1";
            itemElChoco_1.lugar = lugarElChoco;
            itemElChoco_1.save();
            Item itemElChoco_2 = new Item();
            itemElChoco_2.name = "1/2 Porción completa pierna";
            itemElChoco_2.detail = " ";
            itemElChoco_2.price = 13;
            itemElChoco_2.image = "choco_menu_2";
            itemElChoco_2.lugar = lugarElChoco;
            itemElChoco_2.save();
            Item itemElChoco_3 = new Item();
            itemElChoco_3.name = "1/2 Porción completa entrepierna";
            itemElChoco_3.detail = " ";
            itemElChoco_3.price = 24;
            itemElChoco_3.image = "choco_menu_3";
            itemElChoco_3.lugar = lugarElChoco;
            itemElChoco_3.save();


            // Pizzería Napoli's
            Item itemNapolis_1 = new Item();
            itemNapolis_1.name = "Napoli Personal";
            itemNapolis_1.detail = " ";
            itemNapolis_1.price = 30;
            itemNapolis_1.image = "napolis_menu_1";
            itemNapolis_1.lugar = lugarNapolis;
            itemNapolis_1.save();
            Item itemNapolis_2 = new Item();
            itemNapolis_2.name = "Hawaiana 4 Porciones";
            itemNapolis_2.detail = " ";
            itemNapolis_2.price = 50;
            itemNapolis_2.image = "napolis_menu_2";
            itemNapolis_2.lugar = lugarNapolis;
            itemNapolis_2.save();
            Item itemNapolis_3 = new Item();
            itemNapolis_3.name = "Calabresa 6 Porciones";
            itemNapolis_3.detail = " ";
            itemNapolis_3.price = 65;
            itemNapolis_3.image = "napolis_menu_3";
            itemNapolis_3.lugar = lugarNapolis;
            itemNapolis_3.save();


            // Bunker Grill & Bar
            Item itemBunker_1 = new Item();
            itemBunker_1.name = "Convoy de costilla de res";
            itemBunker_1.detail = " ";
            itemBunker_1.price = 150;
            itemBunker_1.image = "bunker_menu_1";
            itemBunker_1.lugar = lugarBunker;
            itemBunker_1.save();
            Item itemBunker_2 = new Item();
            itemBunker_2.name = "Convoy de pollo";
            itemBunker_2.detail = " ";
            itemBunker_2.price = 100;
            itemBunker_2.image = "bunker_menu_2";
            itemBunker_2.lugar = lugarBunker;
            itemBunker_2.save();
            Item itemBunker_3 = new Item();
            itemBunker_3.name = "Convoy de medallones de lomo";
            itemBunker_3.detail = " ";
            itemBunker_3.price = 170;
            itemBunker_3.image = "bunker_menu_3";
            itemBunker_3.lugar = lugarBunker;
            itemBunker_3.save();


            // La Chingada
            Item itemChingada_1 = new Item();
            itemChingada_1.name = "Nachos";
            itemChingada_1.detail = " ";
            itemChingada_1.price = 25;
            itemChingada_1.image = "chingada_menu_1";
            itemChingada_1.lugar = lugarChingada;
            itemChingada_1.save();
            Item itemChingada_2 = new Item();
            itemChingada_2.name = "Picada Mexicana";
            itemChingada_2.detail = " ";
            itemChingada_2.price = 40;
            itemChingada_2.image = "chingada_menu_2";
            itemChingada_2.lugar = lugarChingada;
            itemChingada_2.save();
            Item itemChingada_3 = new Item();
            itemChingada_3.name = "Tacos";
            itemChingada_3.detail = " ";
            itemChingada_3.price = 45;
            itemChingada_3.image = "chingada_menu_3";
            itemChingada_3.lugar = lugarChingada;
            itemChingada_3.save();


            // Vizzio's
            Item itemVizzios_1 = new Item();
            itemVizzios_1.name = "Alitas";
            itemVizzios_1.detail = " ";
            itemVizzios_1.price = 28;
            itemVizzios_1.image = "vizzios_menu_1";
            itemVizzios_1.lugar = lugarVizzios;
            itemVizzios_1.save();
            Item itemVizzios_2 = new Item();
            itemVizzios_2.name = "Entrepierna";
            itemVizzios_2.detail = " ";
            itemVizzios_2.price = 20;
            itemVizzios_2.image = "vizzios_menu_2";
            itemVizzios_2.lugar = lugarVizzios;
            itemVizzios_2.save();
            Item itemVizzios_3 = new Item();
            itemVizzios_3.name = "Pecho";
            itemVizzios_3.detail = " ";
            itemVizzios_3.price = 20;
            itemVizzios_3.image = "vizzios_menu_3";
            itemVizzios_3.lugar = lugarVizzios;
            itemVizzios_3.save();


            // Factory Grill & Bar
            Item itemFactory_1 = new Item();
            itemFactory_1.name = "Balde de alitas";
            itemFactory_1.detail = " ";
            itemFactory_1.price = 65;
            itemFactory_1.image = "factory_menu_1";
            itemFactory_1.lugar = lugarFactory;
            itemFactory_1.save();
            Item itemFactory_2 = new Item();
            itemFactory_2.name = "Hamburguesa";
            itemFactory_2.detail = " ";
            itemFactory_2.price = 65;
            itemFactory_2.image = "factory_menu_2";
            itemFactory_2.lugar = lugarFactory;
            itemFactory_2.save();
            Item itemFactory_3 = new Item();
            itemFactory_3.name = "Costillas de cerdo";
            itemFactory_3.detail = " ";
            itemFactory_3.price = 85;
            itemFactory_3.image = "factory_menu_3";
            itemFactory_3.lugar = lugarFactory;
            itemFactory_3.save();


            // Burger King
            Item itemBK_1 = new Item();
            itemBK_1.name = "Whopper";
            itemBK_1.detail = " ";
            itemBK_1.price = 19;
            itemBK_1.image = "bk_menu_1";
            itemBK_1.lugar = lugarBK;
            itemBK_1.save();
            Item itemBK_2 = new Item();
            itemBK_2.name = "Steak";
            itemBK_2.detail = " ";
            itemBK_2.price = 18;
            itemBK_2.image = "bk_menu_2";
            itemBK_2.lugar = lugarBK;
            itemBK_2.save();
            Item itemBK_3 = new Item();
            itemBK_3.name = "Nuggets";
            itemBK_3.detail = " ";
            itemBK_3.price = 8;
            itemBK_3.image = "bk_menu_3";
            itemBK_3.lugar = lugarBK;
            itemBK_3.save();


            // Planet Chicken's
            Item itemPlanetChicken_1 = new Item();
            itemPlanetChicken_1.name = "Combo Alitas 1";
            itemPlanetChicken_1.detail = " ";
            itemPlanetChicken_1.price = 35;
            itemPlanetChicken_1.image = "planet_chicken_menu_1";
            itemPlanetChicken_1.lugar = lugarPlanetChicken;
            itemPlanetChicken_1.save();
            Item itemPlanetChicken_2 = new Item();
            itemPlanetChicken_2.name = "Combo Chicken 2";
            itemPlanetChicken_2.detail = " ";
            itemPlanetChicken_2.price = 33;
            itemPlanetChicken_2.image = "planet_chicken_menu_2";
            itemPlanetChicken_2.lugar = lugarPlanetChicken;
            itemPlanetChicken_2.save();
            Item itemPlanetChicken_3 = new Item();
            itemPlanetChicken_3.name = "Combo Chicken 3";
            itemPlanetChicken_3.detail = " ";
            itemPlanetChicken_3.price = 40;
            itemPlanetChicken_3.image = "planet_chicken_menu_3";
            itemPlanetChicken_3.lugar = lugarPlanetChicken;
            itemPlanetChicken_3.save();


            // Brasa Away
            Item itemBrasaAway_1 = new Item();
            itemBrasaAway_1.name = "Filete de pollo";
            itemBrasaAway_1.detail = " ";
            itemBrasaAway_1.price = 30;
            itemBrasaAway_1.image = "brasa_away_menu_1";
            itemBrasaAway_1.lugar = lugarBrasaAway;
            itemBrasaAway_1.save();
            Item itemBrasaAway_2 = new Item();
            itemBrasaAway_2.name = "Filete de cerdo";
            itemBrasaAway_2.detail = " ";
            itemBrasaAway_2.price = 37;
            itemBrasaAway_2.image = "brasa_away_menu_2";
            itemBrasaAway_2.lugar = lugarBrasaAway;
            itemBrasaAway_2.save();
            Item itemBrasaAway_3 = new Item();
            itemBrasaAway_3.name = "Churrasco al carbón";
            itemBrasaAway_3.detail = " ";
            itemBrasaAway_3.price = 40;
            itemBrasaAway_3.image = "brasa_away_menu_3";
            itemBrasaAway_3.lugar = lugarBrasaAway;
            itemBrasaAway_3.save();


            // Candela
            Item itemCandela_1 = new Item();
            itemCandela_1.name = "Bife chorizo";
            itemCandela_1.detail = " ";
            itemCandela_1.price = 75;
            itemCandela_1.image = "candela_menu_1";
            itemCandela_1.lugar = lugarCandela;
            itemCandela_1.save();
            Item itemCandela_2 = new Item();
            itemCandela_2.name = "Asado de tira";
            itemCandela_2.detail = " ";
            itemCandela_2.price = 90;
            itemCandela_2.image = "candela_menu_2";
            itemCandela_2.lugar = lugarCandela;
            itemCandela_2.save();
            Item itemCandela_3 = new Item();
            itemCandela_3.name = "Picaña";
            itemCandela_3.detail = " ";
            itemCandela_3.price = 160;
            itemCandela_3.image = "candela_menu_3";
            itemCandela_3.lugar = lugarCandela;
            itemCandela_3.save();



        /******************************ITEMS BOLICHES**********************************************/
            // Cortijo
            Item itemCortijo_1 = new Item();
            itemCortijo_1.name = "";
            itemCortijo_1.detail = " ";
            itemCortijo_1.price = 1;
            itemCortijo_1.image = "cortijo_ac_1";
            itemCortijo_1.lugar = lugarCortijo;
            itemCortijo_1.save();
            Item itemCortijo_2 = new Item();
            itemCortijo_2.name = "";
            itemCortijo_2.detail = " ";
            itemCortijo_2.price = 2;
            itemCortijo_2.image = "cortijo_ac_2";
            itemCortijo_2.lugar = lugarCortijo;
            itemCortijo_2.save();
            Item itemCortijo_3 = new Item();
            itemCortijo_3.name = "";
            itemCortijo_3.detail = " ";
            itemCortijo_3.price = 3;
            itemCortijo_3.image = "cortijo_ac_3";
            itemCortijo_3.lugar = lugarCortijo;
            itemCortijo_3.save();

            // Noma
            Item itemNoma_1 = new Item();
            itemNoma_1.name = "";
            itemNoma_1.detail = " ";
            itemNoma_1.price = 1;
            itemNoma_1.image = "noma_ac_1";
            itemNoma_1.lugar = lugarNoma;
            itemNoma_1.save();
            Item itemNoma_2 = new Item();
            itemNoma_2.name = "";
            itemNoma_2.detail = " ";
            itemNoma_2.price = 2;
            itemNoma_2.image = "noma_ac_2";
            itemNoma_2.lugar = lugarNoma;
            itemNoma_2.save();
            Item itemNoma_3 = new Item();
            itemNoma_3.name = "";
            itemNoma_3.detail = " ";
            itemNoma_3.price = 3;
            itemNoma_3.image = "noma_ac_3";
            itemNoma_3.lugar = lugarNoma;
            itemNoma_3.save();


            //Mood


            // Cortijo
            Item itemMood_1 = new Item();
            itemMood_1.name = "";
            itemMood_1.detail = " ";
            itemMood_1.price = 1;
            itemMood_1.image = "mood_ac_1";
            itemMood_1.lugar = lugarMood;
            itemMood_1.save();
            Item itemMood_2 = new Item();
            itemMood_2.name = "";
            itemMood_2.detail = " ";
            itemMood_2.price = 2;
            itemMood_2.image = "mood_ac_2";
            itemMood_2.lugar = lugarMood;
            itemMood_2.save();
            Item itemMood_3 = new Item();
            itemMood_3.name = "";
            itemMood_3.detail = " ";
            itemMood_3.price = 3;
            itemMood_3.image = "mood_ac_3";
            itemMood_3.lugar = lugarMood;
            itemMood_3.save();

            //Dortmund Bierhaus
            Item itemDortmund_1 = new Item();
            itemDortmund_1.name = "";
            itemDortmund_1.detail = " ";
            itemDortmund_1.price = 1;
            itemDortmund_1.image = "dortmund_ac_1";
            itemDortmund_1.lugar = lugarDortmound;
            itemDortmund_1.save();
            Item itemDortmund_2 = new Item();
            itemDortmund_2.name = "";
            itemDortmund_2.detail = " ";
            itemDortmund_2.price = 2;
            itemDortmund_2.image = "dortmund_ac_2";
            itemDortmund_2.lugar = lugarDortmound;
            itemDortmund_2.save();
            Item itemDortmund_3 = new Item();
            itemDortmund_3.name = "";
            itemDortmund_3.detail = " ";
            itemDortmund_3.price = 3;
            itemDortmund_3.image = "dortmund_ac_3";
            itemDortmund_3.lugar = lugarDortmound;
            itemDortmund_3.save();

            //CAndelaria
            Item itemCandelaria_1 = new Item();
            itemCandelaria_1.name = "";
            itemCandelaria_1.detail = " ";
            itemCandelaria_1.price = 1;
            itemCandelaria_1.image = "candelaria_ac_1";
            itemCandelaria_1.lugar = lugarCandelaria;
            itemCandelaria_1.save();
            Item itemCandelaria_2 = new Item();
            itemCandelaria_2.name = "";
            itemCandelaria_2.detail = " ";
            itemCandelaria_2.price = 2;
            itemCandelaria_2.image = "candelaria_ac_2";
            itemCandelaria_2.lugar = lugarCandelaria;
            itemCandelaria_2.save();
            Item itemCandelaria_3 = new Item();
            itemCandelaria_3.name = "";
            itemCandelaria_3.detail = " ";
            itemCandelaria_3.price = 3;
            itemCandelaria_3.image = "candelaria_ac_3";
            itemCandelaria_3.lugar = lugarCandelaria;
            itemCandelaria_3.save();

            //Mandarina
            Item itemMandarina_1 = new Item();
            itemMandarina_1.name = "";
            itemMandarina_1.detail = " ";
            itemMandarina_1.price = 1;
            itemMandarina_1.image = "mandarina_ac_1";
            itemMandarina_1.lugar = lugarMandarina;
            itemMandarina_1.save();
            Item itemMandarina_2 = new Item();
            itemMandarina_2.name = "";
            itemMandarina_2.detail = " ";
            itemMandarina_2.price = 2;
            itemMandarina_2.image = "mandarina_ac_2";
            itemMandarina_2.lugar = lugarMandarina;
            itemMandarina_2.save();
            Item itemMandarina_3 = new Item();
            itemMandarina_3.name = "";
            itemMandarina_3.detail = " ";
            itemMandarina_3.price = 3;
            itemMandarina_3.image = "mandarina_ac_3";
            itemMandarina_3.lugar = lugarMandarina;
            itemMandarina_3.save();


            //Hooligans
            Item itemHooligans_1 = new Item();
            itemHooligans_1.name = "";
            itemHooligans_1.detail = " ";
            itemHooligans_1.price = 1;
            itemHooligans_1.image = "hooligans_ac_1";
            itemHooligans_1.lugar = lugarHooligans;
            itemHooligans_1.save();
            Item itemHooligans_2 = new Item();
            itemHooligans_2.name = "";
            itemHooligans_2.detail = " ";
            itemHooligans_2.price = 2;
            itemHooligans_2.image = "hooligans_ac_2";
            itemHooligans_2.lugar = lugarHooligans;
            itemHooligans_2.save();
            Item itemHooligans_3 = new Item();
            itemHooligans_3.name = "";
            itemHooligans_3.detail = " ";
            itemHooligans_3.price = 3;
            itemHooligans_3.image = "hooligans_ac_3";
            itemHooligans_3.lugar = lugarHooligans;
            itemHooligans_3.save();


            //Music Hall
            Item itemMusicHall_1 = new Item();
            itemMusicHall_1.name = "";
            itemMusicHall_1.detail = " ";
            itemMusicHall_1.price = 1;
            itemMusicHall_1.image = "music_hall_ac_1";
            itemMusicHall_1.lugar = lugarMusicHall;
            itemMusicHall_1.save();
            Item itemMusicHall_2 = new Item();
            itemMusicHall_2.name = "";
            itemMusicHall_2.detail = " ";
            itemMusicHall_2.price = 2;
            itemMusicHall_2.image = "music_hall_ac_2";
            itemMusicHall_2.lugar = lugarMusicHall;
            itemMusicHall_2.save();
            Item itemMusicHall_3 = new Item();
            itemMusicHall_3.name = "";
            itemMusicHall_3.detail = " ";
            itemMusicHall_3.price = 3;
            itemMusicHall_3.image = "music_hall_ac_3";
            itemMusicHall_3.lugar = lugarMusicHall;
            itemMusicHall_3.save();


            //Levoa
            Item itemLevoa_1 = new Item();
            itemLevoa_1.name = "";
            itemLevoa_1.detail = " ";
            itemLevoa_1.price = 1;
            itemLevoa_1.image = "levoa_ac_1";
            itemLevoa_1.lugar = lugarLevoa;
            itemLevoa_1.save();
            Item itemLevoa_2 = new Item();
            itemLevoa_2.name = "";
            itemLevoa_2.detail = " ";
            itemLevoa_2.price = 2;
            itemLevoa_2.image = "levoa_ac_2";
            itemLevoa_2.lugar = lugarLevoa;
            itemLevoa_2.save();
            Item itemLevoa_3 = new Item();
            itemLevoa_3.name = "";
            itemLevoa_3.detail = " ";
            itemLevoa_3.price = 3;
            itemLevoa_3.image = "levoa_ac_3";
            itemLevoa_3.lugar = lugarLevoa;
            itemLevoa_3.save();


            //Tren
            Item itemTren_1 = new Item();
            itemTren_1.name = "";
            itemTren_1.detail = " ";
            itemTren_1.price = 1;
            itemTren_1.image = "tren_ac_1";
            itemTren_1.lugar = lugarTren;
            itemTren_1.save();
            Item itemTren_2 = new Item();
            itemTren_2.name = "";
            itemTren_2.detail = " ";
            itemTren_2.price = 2;
            itemTren_2.image = "tren_ac_2";
            itemTren_2.lugar = lugarTren;
            itemTren_2.save();
            Item itemTren_3 = new Item();
            itemTren_3.name = "";
            itemTren_3.detail = " ";
            itemTren_3.price = 3;
            itemTren_3.image = "tren_ac_3";
            itemTren_3.lugar = lugarTren;
            itemTren_3.save();


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
