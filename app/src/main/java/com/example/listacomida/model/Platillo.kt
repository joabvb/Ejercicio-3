package com.example.listacomida.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Data class que representa un platillo
data class Platillo(
    val nombre: String,
    val precio: Double,
    val oferta: String,
    @DrawableRes val drawableResId: Int,
    @StringRes val stringResourceId:Int

)
