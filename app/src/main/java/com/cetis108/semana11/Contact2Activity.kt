package com.cetis108.semana11

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class Contact2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact2)


        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val contacto = intent.getSerializableExtra("contacto") as Contact
        mostrarMensaje(contacto.getDetails())
    }

    fun mostrarMensaje(mensaje: String) {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setMessage(mensaje)
            .setCancelable(false)
            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id ->
                this.finish()
            })
        val alert = dialogBuilder.create()
        alert.show()
    }
}