package com.example.listacomida.data

import com.example.listacomida.model.Platillo
import com.example.listacomida.R

// Clase que proporciona datos de ejemplo
object DataSource {
    fun getPlatillos(): List<Platillo> {
        return listOf(
            Platillo("Barbacoa", 80.0, "15% de descuento", R.drawable.barbacoa, R.string.barbacoa),
        Platillo("Enchiladas", 60.0, "", R.drawable.enchiladas, R.string.enchiladas),
        Platillo("Cochinita Pibil", 75.0, "2x1", R.drawable.cochinita_pibil, R.string.cochinita_pibil),
        Platillo("Guacamole", 50.0, "10% de descuento", R.drawable.guacamole, R.string.guacamole),
        Platillo("Burritos", 65.0, "", R.drawable.burritos, R.string.burritos),
        Platillo("Chiles en Nogada", 120.0, "20% de descuento", R.drawable.chiles_en_nogada, R.string.chiles_en_nogada),
        Platillo("Tamales", 40.0, "3x2", R.drawable.tamales, R.string.tamales),
        Platillo("Mole", 90.0, "", R.drawable.mole, R.string.mole),
        Platillo("Chilaquiles", 55.0, "Café gratis", R.drawable.chilaquiles, R.string.chilaquiles),
        Platillo("Ensalada César", 70.0, "10% de descuento", R.drawable.ensalada_cesar, R.string.ensalada_cesar),
        Platillo("Aguachile", 110.0, "15% de descuento", R.drawable.aguachile, R.string.aguachile),
        Platillo("Tlayudas", 85.0, "", R.drawable.tlayudas, R.string.tlayudas),
        Platillo("Chiles Rellenos", 95.0, "20% de descuento", R.drawable.chile_relleno, R.string.chiles_rellenos),
        Platillo("Pozole", 100.0, "2x1", R.drawable.pozole, R.string.pozole),
        Platillo("Tortas", 50.0, "", R.drawable.tortas, R.string.tortas),
        Platillo("Ceviche", 105.0, "15% de descuento", R.drawable.ceviche, R.string.ceviche),
        Platillo("Sopa Azteca", 60.0, "10% de descuento", R.drawable.sopa_azteca, R.string.sopa_azteca),
        Platillo("Mixiote", 115.0, "", R.drawable.mixiote, R.string.mixiote),
        Platillo("Quesadillas", 45.0, "Bebida gratis", R.drawable.quesadillas, R.string.quesadillas),
        Platillo("Tacos al Pastor", 50.0, "10% de descuento", R.drawable.tacos_al_pastor, R.string.tacos_al_pastor),
        Platillo("Machaca", 95.0, "2x1", R.drawable.machaca, R.string.machaca),
        Platillo("Buñuelos", 35.0, "", R.drawable.bunuelos, R.string.bunuelo),

        )
    }
}