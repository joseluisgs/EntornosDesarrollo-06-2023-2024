package dev.joseluisgs

import dev.joseluisgs.dev.joseluisgs.Producto
import dev.joseluisgs.dev.joseluisgs.Vehiculo
import dev.joseluisgs.dev.joseluisgs.Venta

fun main() {
    val persona = Persona("Pepe")
    val vehiculo = Vehiculo("coche", "Mi:Modelo", persona)

    println(persona)
    println(vehiculo)

    val p1 = Producto(nombre = "Coche", precio = 1000.0)
    val p2 = Producto(nombre = "Carro", precio = 2000.0)

    val venta = Venta(
        fecha = "2020-01-01",
        cliente = persona,
    )
    venta.agregarLinea(producto = p1, cantidad = 1)
    venta.agregarLinea(producto = p2, cantidad = 2)
    
    println(venta)
}