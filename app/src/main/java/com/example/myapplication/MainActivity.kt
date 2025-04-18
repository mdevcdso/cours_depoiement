package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivityCentralTextView: TextView
    private lateinit var mainActivityUpTextView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //findViewById interdit ici

        // Initialisation de la vue
        setContentView(R.layout.activity_main) // créer une reference avec le fichier activity_main

        this.mainActivityCentralTextView = findViewById(R.id.main_activity_central_text_tv) //Crash
        this.mainActivityCentralTextView.text = "New text !" //Crash

        this.mainActivityUpTextView = findViewById(R.id.hello_up_text)
        this.mainActivityUpTextView.text = "Android Studio"
    }
}