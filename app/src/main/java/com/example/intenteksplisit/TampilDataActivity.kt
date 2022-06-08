package com.example.intentek splisit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TampilDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampil_data)

        val tvData = findViewById<TextView>(R.id.tvData)

        val nim = intent.getStringExtra("Nim")
        val nama = intent.getStringExtra("Nama")

        tvData.text = """
            Data yang dimasukan:
            Nim: $nim
            Nama: $nama
         """.trimIndent()
    }
}