package dev.joseluisgs.dev.joseluisgs

import dev.joseluisgs.Persona
import java.util.*

data class Venta(
    val id: UUID = UUID.randomUUID(),
    val fecha: String,
    val cliente: Persona,
    val lineas: MutableList<LineaVenta> = mutableListOf()
) {

    val total: Double get() = lineas.sumOf { it.cantidad * it.precio }

    fun agregarLinea(producto: Producto, cantidad: Int) {
        lineas.add(LineaVenta(producto, cantidad, producto.precio))
    }


    override fun toString(): String {
        return "Venta(id=$id, fecha='$fecha', cliente=$cliente, lineas=$lineas, total=$total)"
    }


    data class LineaVenta(
        val producto: Producto,
        val cantidad: Int,
        val precio: Double
    )
}

