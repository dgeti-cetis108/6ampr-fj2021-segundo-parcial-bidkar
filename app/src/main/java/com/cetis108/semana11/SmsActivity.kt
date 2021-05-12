package com.cetis108.semana11

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class SmsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    fun sendSms(view: View) {
        val phoneNumber = findViewById<EditText>(R.id.editTextSmsPhone).text.toString()
        val message = findViewById<EditText>(R.id.editTextSmsMessage).text.toString()

        if (phoneNumber.isNullOrEmpty() || message.isNullOrEmpty()) {
            Toast.makeText(this, "Debes ingresar número y mensaje", Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent().apply {
                action = Intent.ACTION_VIEW
                data = Uri.parse("sms:$phoneNumber")
                putExtra("sms_body", message)
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