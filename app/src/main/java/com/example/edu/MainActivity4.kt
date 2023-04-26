package com.example.edu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import android.app.Dialog

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.edu.R.drawable.listening1
import com.example.edu.databinding.ActivityMain4Binding
import com.example.edu.databinding.CustomdialogBinding

class MainActivity4 : AppCompatActivity() {
    private var binding4: ActivityMain4Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding4= ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding4?.root)
        val int1 = intent.getParcelableExtra<Kotlin1>("kotlin")
        binding4?.textView?.text = int1?.text1
        binding4?.textView4?.text=int1?.text2
        binding4?.textView5?.text="GENERAL EXERCISE ${int1?.text1}"
        binding4?.imageButton?.setOnClickListener {
            onBackPressed()
        }
        val list1 = listOf<Kotlin1>(
            Kotlin1("Chapter 1 :", "Introduction"),
            Kotlin1("Chapter 2 :" , "School"),
            Kotlin1("Chapter 3 :", "Job"),
            Kotlin1("Chapter 4 :", "Job Interview"),
            Kotlin1("Chapter 5 :", "Conclusion")


        )
        binding4?.recyclerView2?.adapter=Recycle2(list1)
        val list2 = listOf<Kotlin111>(
            Kotlin111(listening1,"Listening"),
            Kotlin111(R.drawable.writing,"Writting"),
            Kotlin111(R.drawable.grammer,"Grammer"),




            )

        binding4?.recycle3?.layoutManager=
            LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding4?.recycle3?.adapter=Recycle3(list2)






    }
    private fun custom(){
        val bindindingcus :CustomdialogBinding?=null
        val custom = Dialog(this)
        val dialo = CustomdialogBinding.inflate(layoutInflater)
        custom.setContentView(dialo.root)
        custom.setCanceledOnTouchOutside(false)
        dialo.button3.setOnClickListener {
            this@MainActivity4.finish()
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