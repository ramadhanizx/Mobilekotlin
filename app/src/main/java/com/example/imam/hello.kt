package com.example.imam

fun main(args: Array<String>) {
    showBiodata("imam", 20)
    showHobby("renang", "renang")
}

fun showBiodata(name: String, age: Int) {
    println("=====================")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("=====================")
}

fun showHobby(nama: String, desc: String) {
    println("Saya punya hobi $nama")
    println("Hobi tersebut adalah $desc")
}
