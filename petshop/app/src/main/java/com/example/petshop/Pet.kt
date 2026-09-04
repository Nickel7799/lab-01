package com.example.petshop

//open class Pet(val name: String, var age: Int)
abstract class Pet(val name: String, var age: Int){ // abstract class - can't have objects
    abstract fun speak(): String // abstract functions are not implemented in their bodies (they are implemented in the child classes)
}

// val - non changable pointer (read only pointer)
// open - making class parent class
// instantiate === init
