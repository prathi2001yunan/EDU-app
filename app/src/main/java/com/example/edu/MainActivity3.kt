package com.example.edu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edu.databinding.ActivityMain2Binding
import com.example.edu.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private var binding2: ActivityMain3Binding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2= ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding2?.root)
        binding2?.imageButton3?.setOnClickListener {
            onBackPressed()
        }
        val list5 = Recycle1(Kotlin11().list1)
        binding2?.recycle?.adapter = list5
        list5.itemClick= {

            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra("kotlin",it)
            startActivity(intent)



        }



    }
}