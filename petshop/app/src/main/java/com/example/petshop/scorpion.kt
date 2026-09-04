package com.example.petshop

class Scorpion (name: String, age: Int) : Pet(name, age){ // child class of pet
    override fun speak(): String {
        return "hiss"
    }

}