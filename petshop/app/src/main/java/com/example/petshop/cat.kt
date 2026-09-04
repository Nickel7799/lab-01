package com.example.petshop

class Cat (name: String, age: Int) : Pet(name, age), Pettable{ // child class of pet
    override fun speak(): String {
        return "Nya"
    }

    override fun pet() {
        println("this is a pettable cat $name")
    }

}