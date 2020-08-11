package com.example.desafio_08_02_biblioteca

fun LibroEscolar.precioFormateado() : String{
    return "$${this.precio}"
}

fun LibroEscolar.imprimir() {
    println("Nombre: ${this.nombre}\n" +
            "ISBN: ${this.codigoISBN}\n" +
            "Año Publicación: ${this.anyoPublicacion}\n" +
            "Editorial: ${this.editorial}\n" +
            "Páginas: ${this.cantidadPaginas}\n" +
            "Precio: ${this.precioFormateado()}\n" +
            "Autor: ${this.autor}\n" +
            "Tipo: ${this.tipo}\n")
}