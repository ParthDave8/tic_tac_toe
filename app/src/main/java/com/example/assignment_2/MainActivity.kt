package com.example.assignment_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.example.assignment_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.play.setOnClickListener{
            create()

        }
    }
    fun create(){
        GameData.saveGameModel(
            GameModel(
                gamestatus = GameStatus.JOINED
            )
        )
        start()

    }

    fun start(){
        startActivity(Intent(this,GameActivity::class.java))

    }


}