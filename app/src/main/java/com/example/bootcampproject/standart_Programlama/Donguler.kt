package com.example.bootcampproject.standart_Programlama
fun main() {
//    for (i in 1..5) {
//        println("Sayı: $i")
//    }
//    var sayac = 1
//    while(sayac < 4){
//        println("$sayac")
//        sayac +=1
//    }
    //koşul gerekiyorsa while döngüsü kullanılır.

    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        println("i = $i")
    }
}



