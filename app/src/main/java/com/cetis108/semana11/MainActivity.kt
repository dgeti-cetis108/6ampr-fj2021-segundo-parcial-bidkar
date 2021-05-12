package com.cetis108.semana11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {
            R.id.itemMenuMainSms -> {
                val intent = Intent(this, SmsActivity::class.java)
                startActivity(intent)
            }
            R.id.itemMenuMainEdad -> {
                val intent = Intent(this, AgeActivity::class.java)
                startActivity(intent)
            }
            R.id.itemMenuMainTelefonia -> {
                TODO("Not implemented yet")
            }
            R.id.itemMenuMainCamara -> {
                TODO("Not implemented yet")
            }
            R.id.itemMenuMainRegistro -> {
                TODO("Not implemented yet")
            }
        }
        return super.onOptionsItemSelected(item)
    }
}