package com.example.petshop

abstract class Mood(val date: String){ // abstract class - can't have objects
    abstract fun textMood(): String // abstract functions are not implemented in their bodies (they are implemented in the child classes)
}