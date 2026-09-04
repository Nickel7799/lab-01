package com.example.petshop

class Happy ( date: String) : Mood(date){ // child class of pet
    override fun textMood(): String {
        return "happy"
    }
}