package com.example.tablero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var startPoint = 0
    var endPoint = 0
    var startPoint1 = 0
    var endPoint1 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1=findViewById<Button>(R.id.boton1)
        boton1.setOnClickListener {
            val intento1 = Intent(this, SecondActivity::class.java)
            startActivity(intento1)
        }
        val barraSeek = findViewById<SeekBar>(R.id.seekBar1)
        val texto =  findViewById<TextView>(R.id.numerocolores)
        val barraSeekcu = findViewById<SeekBar>(R.id.seekBar2)
        val textocu =  findViewById<TextView>(R.id.numerocuadros)

        barraSeek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(barraSeek: SeekBar?, progress: Int, fromUser: Boolean) {
                texto.text = progress.toString()


            }

            override fun onStartTrackingTouch(barraSeek: SeekBar?) {
                if (barraSeek != null){
                    startPoint =barraSeek.progress

                }
            }

            override fun onStopTrackingTouch(barraSeek: SeekBar?) {
                if (barraSeek != null){
                    endPoint =barraSeek.progress

                }

            }
        })
        barraSeekcu.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(barraSeek: SeekBar?, progress: Int, fromUser: Boolean) {
                textocu.text = progress.toString()


            }

            override fun onStartTrackingTouch(barraSeekcu: SeekBar?) {
                if (barraSeekcu != null){
                    startPoint1 =barraSeekcu.progress

                }
            }

            override fun onStopTrackingTouch(barraSeekcu: SeekBar?) {
                if (barraSeekcu != null){
                    endPoint1 =barraSeekcu.progress

                }

            }
        })

    }
}