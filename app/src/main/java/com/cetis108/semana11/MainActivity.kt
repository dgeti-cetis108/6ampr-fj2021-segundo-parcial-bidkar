package com.cetis108.semana11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

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
                val intent = Intent(this, PhoneActivity::class.java)
                startActivity(intent)
            }
            R.id.itemMenuMainCamara -> {
                val intent = Intent("android.media.action.IMAGE_CAPTURE")

                try {
                    startActivity(intent)
                } catch (ex: Exception) {
                    ex.printStackTrace()
                    Toast.makeText(this, "Error: ${ex.toString()}", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.itemMenuMainRegistro -> {
                val intent = Intent(this, Contact1Activity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}