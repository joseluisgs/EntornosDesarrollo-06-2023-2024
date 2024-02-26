package dev.joseluisgs.dev.joseluisgs

import java.util.*

data class Producto(
    val id: UUID = UUID.randomUUID(),
    val nombre: String,
    val precio: Double
)
