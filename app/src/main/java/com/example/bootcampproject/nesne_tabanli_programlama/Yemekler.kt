package com.example.bootcampproject.nesne_tabanli_programlama

data class Yemekler(var id: Int, var ad: String, var fiyat: Int ) {
    // Constructor - init metodu
    init {
        println("Nesne oluştu")
    }
    fun bilgiAl(){
        println("Id: ${id}, Ad: ${ad}, Fiyat: ${fiyat}")
    }
}