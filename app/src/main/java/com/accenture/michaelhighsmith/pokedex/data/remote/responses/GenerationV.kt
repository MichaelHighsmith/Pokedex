package com.accenture.michaelhighsmith.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationV(

    @SerializedName("black-white")
    val black_white: BlackWhite

)