package com.example.bootcampproject.nesne_tabanli_programlama

fun main(){
    val f = Fonksiyonlar()

    f.selamla()

    val gelensonuc = f.selamla2()
    println("Gelen Sonuc: $gelensonuc")

    //parametre
    f.selamla3("Zeyn")

    f.topla(5,6)
}