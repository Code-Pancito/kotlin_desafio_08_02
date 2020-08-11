package com.example.desafio_08_02_biblioteca

class LibroEscolar {

    var nombre : String
    var codigoISBN : String
    var anyoPublicacion : Int
    var editorial : String
    var cantidadPaginas : Int
    var precio : Double
    var autor : String
    var tipo : Char

    constructor(
        nombre: String,
        codigoISBN: String,
        anyoPublicacion: Int,
        editorial: String,
        cantidadPaginas: Int,
        precio: Double,
        autor: String,
        tipo: Char
    ) {
        this.nombre = nombre
        this.codigoISBN = codigoISBN
        this.anyoPublicacion = anyoPublicacion
        this.editorial = editorial
        this.cantidadPaginas = cantidadPaginas
        this.precio = precio
        this.autor = autor
        this.tipo = tipo
    }


}