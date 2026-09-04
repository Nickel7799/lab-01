package com.example.petshop

class Dog (name: String, age: Int) : Pet(name, age), Pettable{ // child class of pet
    override fun speak(): String {
        return "Wan"
    }

    override fun pet() {
        println("this is a pettable dog $name")
    }

}