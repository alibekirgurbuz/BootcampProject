package com.example.bootcampproject.nesne_tabanli_programlama

class Fonksiyonlar {
    // void - sadece işlem yapan
    fun selamla(){
        val sonuc = "Merhaba ahmet"
        println(sonuc)
    }
    // return - hem işlem yapan hem veri transferi yapan
    fun selamla2(): String{
        val sonuc = "Merhaba ahmet"
        return sonuc
    }

    //Parametre
    fun selamla3(isim:String): String{
        val sonuc = "Merhaba $isim"
        return sonuc
    }
    //Overloading
    //Bir sınıf içerisinde aynı isimde fonksiyonları tekrar kullanmak
    fun topla(sayi1:Int,sayi2:Int){
        println("Toplama: ${sayi1+sayi2}")
    }
    fun topla(sayi1:Int,sayi2:Int, isim:String){
        println("Toplam: ${sayi1+sayi2}-İşlem Yapan: $isim" +
                "")
    }

}