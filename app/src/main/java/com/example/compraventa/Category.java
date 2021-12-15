package com.example.compraventa;



import android.content.Context;
import android.graphics.Color;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

import Model.Categoria;

public class Category{
    List<Categoria> categorias=new ArrayList<Categoria>();


    public List<Categoria> cargarCategoria(Context context) {
        List<Categoria> c = new ArrayList<Categoria>();

        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA5725");
                            cat.setNombreCategoria("Accesorios para Vehículos");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_amber_50));
                            cat.setIcon(R.drawable.outline_sports_motorsports_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1512");
                            cat.setNombreCategoria("Agro");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.purple_200));
                            cat.setIcon(R.drawable.outline_agriculture_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1403");
                            cat.setNombreCategoria("Alimentos y Bebidas");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_red_50));
                            cat.setIcon(R.drawable.outline_restaurant_menu_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1071");
                            cat.setNombreCategoria("Animales y Mascotas");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_red_100));
                            cat.setIcon(R.drawable.outline_pets_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1367");
                            cat.setNombreCategoria("Antigüedades y Colecciones");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_pink_50));
                            cat.setIcon(R.drawable.outline_collections_bookmark_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1368");
                            cat.setNombreCategoria("Arte, Librería y Mercería");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_pink_600));
                            cat.setIcon(R.drawable.outline_palette_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1743");
                            cat.setNombreCategoria("Autos, Motos y Otros");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_purple_300));
                            cat.setIcon(R.drawable.baseline_local_taxi_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1384");
                            cat.setNombreCategoria("Bebés");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_purple_900));
                            cat.setIcon(R.drawable.outline_sports_motorsports_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1246");
                            cat.setNombreCategoria("Belleza y Cuidado Personal");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_purple_500));
                            cat.setIcon(R.drawable.outline_stroller_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1039");
                            cat.setNombreCategoria("Cámaras y Accesorios");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_indigo_300));
                            cat.setIcon(R.drawable.outline_hot_tub_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1051");
                            cat.setNombreCategoria("Celulares y Teléfonos");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_indigo_500));
                            cat.setIcon(R.drawable.outline_local_see_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1648");
                            cat.setNombreCategoria("Computación");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_indigo_500_25));
                            cat.setIcon(R.drawable.outline_stay_primary_portrait_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1144");
                            cat.setNombreCategoria("Consolas y Videojuegos");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_indigo_900));
                            cat.setIcon(R.drawable.outline_computer_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1500");
                            cat.setNombreCategoria("Construcción");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_indigo_A200));
                            cat.setIcon(R.drawable.baseline_sports_esports_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1276");
                            cat.setNombreCategoria("Deportes y Fitness");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_indigo_A700));
                            cat.setIcon(R.drawable.outline_engineering_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA5726");
                            cat.setNombreCategoria("Electrodomésticos y Aires Ac.");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_red_900));
                            cat.setIcon(R.drawable.baseline_sports_volleyball_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1000");
                            cat.setNombreCategoria("Electrónica, Audio y Video");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_cyan_200));
                            cat.setIcon(R.drawable.outline_kitchen_24);
                        }
                )
        );


        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA2547");
                            cat.setNombreCategoria("Entradas para Eventos");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_cyan_300));
                            cat.setIcon(R.drawable.outline_headset_mic_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId( "MLA407134");
                            cat.setNombreCategoria("Herramientas");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_cyan_500));
                            cat.setIcon(R.drawable.outline_local_activity_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1574");
                            cat.setNombreCategoria("Hogar, Muebles y Jardín");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_cyan_600));
                            cat.setIcon(R.drawable.outline_construction_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1499");
                            cat.setNombreCategoria("Industrias y Oficinas");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.teal_200));
                            cat.setIcon(R.drawable.baseline_filter_vintage_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1459");
                            cat.setNombreCategoria("Inmuebles");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_blue_grey_500));
                            cat.setIcon(R.drawable.outline_apartment_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1459");
                            cat.setNombreCategoria("Instrumentos Musicales");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_yellow_500_75));
                            cat.setIcon(R.drawable.outline_piano_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA3937");
                            cat.setNombreCategoria("Joyas y Relojes");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.teal_200));
                            cat.setIcon(R.drawable.outline_watch_later_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1132");
                            cat.setNombreCategoria("Juegos y Juguetes");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_teal_500));
                            cat.setIcon(R.drawable.outline_border_color_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA3025");
                            cat.setNombreCategoria("Libros, Revistas y Comics");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_teal_400));
                            cat.setIcon(R.drawable.outline_import_contacts_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1168");
                            cat.setNombreCategoria("Música, Películas y Series");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_amber_900));
                            cat.setIcon(R.drawable.outline_audiotrack_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1430");
                            cat.setNombreCategoria("Ropa y Accesorios");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_amber_500));
                            cat.setIcon(R.drawable.outline_shopping_cart_24);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA409431");
                            cat.setNombreCategoria("Salud y Equipamiento Médico");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_deep_orange_500));
                            cat.setIcon(R.drawable.outline_health_and_safety_24);
                        }
                )
        );

        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1540");
                            cat.setNombreCategoria("Servicios");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_lime_500));
                            cat.setIcon(R.drawable.outline_electrical_services_20);
                        }
                )
        );

        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA9304");
                            cat.setNombreCategoria("Souvenirs, Cotillón y Fiestas");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_yellow_500));
                            cat.setIcon(R.drawable.outline_celebration_20);
                        }
                )
        );
        c.add(new Categoria(
                        cat -> {
                            cat.setId("MLA1953");
                            cat.setNombreCategoria("Otras categorías");
                            cat.setColor(ContextCompat.getColor((Context) context,R.color.md_light_green_A700));
                            cat.setIcon(R.drawable.outline_miscellaneous_services_20);
                        }
                )
        );
    return c;
    }



}

