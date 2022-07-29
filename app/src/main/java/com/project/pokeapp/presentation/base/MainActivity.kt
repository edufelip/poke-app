package com.project.pokeapp.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.pokeapp.R

class MainActivity : AppCompatActivity() {
    lateinit var fragmentFactory: MainFragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_PokeApp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.fragmentFactory = fragmentFactory
        supportFragmentManager.beginTransaction().commit()
    }
}