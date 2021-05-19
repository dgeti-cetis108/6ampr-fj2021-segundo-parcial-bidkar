package com.cetis108.semana11

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class PhoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    fun callPhone(view: View) {
        val editTextPhone = findViewById<EditText>(R.id.editTextPhoneNumber).text.toString()
        if (editTextPhone.isNullOrEmpty()) {
            Toast.makeText(this, "Ingresa el número telefónico", Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent().apply {
                action = Intent.ACTION_DIAL
                data = Uri.parse("tel:$editTextPhone")
            }

            try {
                startActivity(intent)
            } catch (ex: Exception) {
                ex.printStackTrace()
                Toast.makeText(this, "Error: ${ex.toString()}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}