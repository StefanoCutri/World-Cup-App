package com.example.worldcupapp

class CountryModel{
    var name: String = ""
    var cupsWon: String = ""
    var image: Int = 0

    constructor(name: String, cupsWon: String, image: Int){
        this.name = name
        this.cupsWon = cupsWon
        this.image = image
    }
}