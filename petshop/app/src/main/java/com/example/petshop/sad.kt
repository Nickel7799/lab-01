package com.example.petshop

class Sad ( date: String) : Mood(date){ // child class of pet
    override fun textMood(): String {
        return "sad"
    }
}