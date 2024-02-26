package dev.joseluisgs.dev.joseluisgs

import dev.joseluisgs.Persona

data class Vehiculo(
    val marca: String,
    val modelo: String,
    var persona: Persona?
)