package com.novikartiko.novikartiko

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindahActivityExplisit.setOnClickListener{
            startActivity(Intent(this, ExplisiteActivity::class.java))
        }
        btnPindahActivityImplisit.setOnClickListener{
            startActivity(Intent(this, ImplisiteActivity::class.java))
        }
        btnPindahActivityIntentBundle.setOnClickListener {
            val intent: Intent = Intent(this, BundleActivity::class.java)
            intent.putExtra("NAMA", "Novikartiko H.P.H")
            intent.putExtra("ALAMAT", "Jepara")
            intent.putExtra("HOBI", "Bercanda")
            intent.putExtra("CITA-CITA", "Jadi Orang Sukses")
            intent.putExtra("EMAIL", "novikartiko27@gmail.com")
            startActivity(intent)
        }

    }
}
