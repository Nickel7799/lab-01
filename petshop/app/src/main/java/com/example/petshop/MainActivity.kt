package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetshopTheme

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //val pet = Pet(name = "pet", age = 5) // can't create obj for an abstract class
        val cat = Cat(name = "barbie", age = 4)
        val dog = Dog(name = "Buddy", age = 2)
        val scorpion = Scorpion("Stinger", 32)

        val pets = mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)

        // ===
        // val pets = mutableListOf<Pet>(cat, dog, scorpion)

        val pattablePets = mutableListOf<Pettable>() // can't add scorpion since its not Pettable
        pattablePets.add(cat)
        pattablePets.add(dog)
        //pattablePets.add(scorpion) //raises error

        val todaysMood = Happy("today")
    }

}