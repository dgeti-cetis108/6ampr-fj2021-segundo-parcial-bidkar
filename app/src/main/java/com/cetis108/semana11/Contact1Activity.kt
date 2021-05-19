package com.cetis108.semana11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Contact1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact1)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    fun sendData(view: View) {
        val nombres = findViewById<EditText>(R.id.editTextContact1Firstname).text.toString()
        val apellidos = findViewById<EditText>(R.id.editTextContact1Lastname).text.toString()
        val telefono = findViewById<EditText>(R.id.editTextContact1Phone).text.toString()
        val correo = findViewById<EditText>(R.id.editTextContact1Email).text.toString()

        if (nombres.isNullOrEmpty() || apellidos.isNullOrEmpty() || telefono.isNullOrEmpty() || correo.isNullOrEmpty()) {
            Toast.makeText(this, "Debes ingresar todos los datos", Toast.LENGTH_SHORT).show()
        } else {
            val contacto = Contact().apply {
                Firstname = nombres
                Lastname = apellidos
                PhoneNumber = telefono
                Email = correo
            }

            val intent = Intent(this, Contact2Activity::class.java)
            intent.putExtra("contacto", contacto)

            try {
                startActivity(intent)
            } catch (ex: Exception) {
                ex.printStackTrace()
                Toast.makeText(this, "Error: ${ex.toString()}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}