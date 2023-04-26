package com.example.edu

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edu.databinding.ActivityMain2Binding
import com.example.edu.databinding.CustomdialogBinding

class MainActivity2 : AppCompatActivity() {
    private var binding: ActivityMain2Binding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.button?.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }
        binding?.fram1?.setOnClickListener {
            onBackPressed()
        }
    }
    private fun custom(){
        val bindindingcus : CustomdialogBinding?=null
        val custom = Dialog(this)
        val dialo = CustomdialogBinding.inflate(layoutInflater)
        custom.setContentView(dialo.root)
        custom.setCanceledOnTouchOutside(false)
        dialo.button3.setOnClickListener {
            this@MainActivity2.finish()

            custom.dismiss()
        }
        dialo.button4.setOnClickListener {

            custom.dismiss()
        }
        custom.show()


    }

    override fun onBackPressed() {
        custom()
    }
}
