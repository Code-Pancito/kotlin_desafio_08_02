package com.example.desafio_08_02_biblioteca

fun main() {

    // Declaración de Libros

    var libro1 = LibroEscolar(
        "El Honor del Samurai",
        "1111",
        2006,
        "Bushido",
        486,
        15.8,
        "Takashi Matsuoka",
        'D')

    var libro2 = LibroEscolar(
        "Sueño de una Noche de Verano",
        "2222",
        2014,
        "Okama",
        984,
        19.3,
        "Bon Clay",
        'I')

    var libro3 = LibroEscolar(
        "Protege tu Tesoro",
        "3333",
        1999,
        "Bau",
        150,
        8.4,
        "ShuShu",
        'D')

    val libro4 = LibroEscolar(
        "Golpe al Plexo",
        "4444",
        1985,
        "Gero",
        460,
        14.6,
        "Hammah Nao",
        'I')

    // Imprimir datos libros

    libro1.imprimir()
    libro2.imprimir()
    libro3.imprimir()
    libro4.imprimir()
}