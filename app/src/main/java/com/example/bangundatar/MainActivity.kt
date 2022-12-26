package com.example.bangundatar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtAlas = findViewById<EditText>(R.id.txtalas)
        val txtTINGGI = findViewById<EditText>(R.id.txt_tinggi)

        val btnHITUNG = findViewById<Button>(R.id.btn_hitung)
        val txtHASIL = findViewById<TextView>(R.id.txt_tinggi)

        btnHITUNG.setOnClickListener {
            val alas = txtAlas.text.toString().trim()
            val tinggi = txtTINGGI.text.toString().trim()

            var isEmptyFields = false
            when {
                alas.isEmpty () -> {
                    isEmptyFields = true
                    txtAlas.error = "Alas Tidak Boleh Kosong!!"
                }
                tinggi.isEmpty() -> {
                    isEmptyFields = true
                    txtTINGGI.error = "tinggi tidak boleh kosong!!"
                }
            }
            if (!isEmptyFields) {
                val hasil = 0.5 * alas.toDouble() * tinggi.toDouble()
                txtHASIL.text = hasil.toString()

            }
        }

    }
}